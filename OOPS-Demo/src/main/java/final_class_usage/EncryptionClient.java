package final_class_usage;

public class EncryptionClient {

	public static void main(String[] args) {
		
		EncryptionAlgorithm encryption = new EncryptionAlgorithm();
		String encryptedMessage = encryption.encrypt("bankAccountNo=1234589");	
		System.out.println(encryptedMessage);
		
		
		EncryptionAlgorithmv2 encryptionv2 = new EncryptionAlgorithmv2();
		String encryptedMessage2 = encryptionv2.encrypt("bankAccountNo=1234589");	
		System.out.println(encryptedMessage2);
	}
}
