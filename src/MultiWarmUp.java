
public class MultiWarmUp {

	public static void main(String[] args) {
		
		String[] names =new String[] {"Adam","John","Dave","Dan","Diana"};
		
		LABEL1:
		for (int i = 0; i < names.length; i++) {
			
			char[]allChar=names[i].toCharArray();
		
		LABEL2:
			for (int j = 0; j < allChar.length; j++) {
				
				if(allChar[j]=='h') {
					System.out.println();
					continue LABEL1;
				}
			System.out.print(allChar[j]+" ");	
			}
			System.out.println();
			
		}
	
	}
}
