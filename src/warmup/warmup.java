package warmup;

public class warmup {

	public static void main(String[] args) {
		
		String word ="AFGJLJEYEIOEPWLAKAUIEOEK12345JJDURAA321";
		StringBuilder sb =new StringBuilder();
		
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i)>='A' && word.charAt(i)<='C') {
				sb.append(word.charAt(i));
			}
			
		}
		System.out.println(sb.toString());
		sb.replace(4, 7,"ZZZ");
		System.out.println(sb);

	}

}
