package practice;

public class Gugudan {
	public Gugudan() {
		solution2();
	}
	
	public void solution() {
		
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}//end for
			System.out.println("");
		}//end for
		
	}//solution
	
	public void solution2() {
		
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(i+" * "+j+" = "+i*j);
				System.out.print("\t");
			}//end for
			System.out.println("");
		}//end for
		
	}//solution2
	
	
	public static void main(String[] args) {
		Gugudan gugudan = new Gugudan();
	}//main
}
