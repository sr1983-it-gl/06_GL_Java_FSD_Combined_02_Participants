package final_class_usage;

final public class EncryptionAlgorithm {
//
//	void someStep2() {
//		
//	}
//	
//	protected void someStep() {
//		
//	}
//	
//	private void verify(char aChar) {
//		
//	}
	
	public String encrypt(String message) {
		
		StringBuilder encryptedMessage = new StringBuilder();
				
		for (int index = 0; index < message.length(); index ++) {
			
			char aChar = message.charAt(index);

			int randomNo = (int)(Math.random() * 12345);
			
//			verify(aChar);
			
			char newChar = (char)((int)aChar + randomNo);
			
			encryptedMessage.append(newChar);
		}
				
		return encryptedMessage.toString();
	}
	
	public void decrypt(String message) {
		
		
	}
}
