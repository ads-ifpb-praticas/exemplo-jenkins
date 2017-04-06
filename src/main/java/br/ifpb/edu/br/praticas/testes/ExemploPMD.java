package br.ifpb.edu.br.praticas.testes;

/**
 * Created by diogomoreira on 05/04/17.
 */
public class ExemploPMD {
	
	public static void main(String[] args) {
		int num = 0;
		if(true) {
			while(num < 15) {
				int n = 1;
				n++;
				num = n+1;
				String s1 = createString();
				s1 = "string";
				s1.indexOf('s');
				if(s1.isEmpty()) {
					System.out.println(s1);
				} else {
					System.out.println("string");
					System.out.println("vazio");
				}
			}
			
		}
	}
	
	private static String createString() {
		return new String();
	}
}
