package practise;

import java.security.KeyPair;
import javax.xml.bind.DatatypeConverter;
import practise.RSA_Algorithm;
public class Main {
	public static void main(String[] args) throws Exception {

		KeyPair keypair = RSA_Algorithm.generateRSAKeyPair();
		String Plaintext = "This is the plaintext we are going to encrypt";
		System.out.println(Plaintext);
		byte[] ciphertext = RSA_Algorithm.performRSAEncyption(Plaintext, keypair.getPublic());
		assert !ciphertext.equals(null);
		System.out.println(DatatypeConverter.printHexBinary(ciphertext));
		String decryptedtext = RSA_Algorithm.performRSADecryption(ciphertext, keypair.getPrivate());
		System.out.println(decryptedtext);
		assert Plaintext.equals(decryptedtext);

	}
}
