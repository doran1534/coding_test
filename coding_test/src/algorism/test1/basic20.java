package algorism.test1;

public class basic20 {
	
	public basic20() {
		
	}//basic20
	
	public void solution1() {
		
		String var = "";
		
		for(int i=1; i<101; i++) {
			
			var = String.valueOf(i);
			
			if( var.contains("3")||var.contains("6")||var.contains("9") ) {
				if( var.indexOf("3") == 0 || var.indexOf("6") == 0 || var.indexOf("9") == 0 ) {
					System.out.print("¦");
				}
				if( var.lastIndexOf("3") == 1 || var.lastIndexOf("6") == 1 || var.lastIndexOf("9") == 1 ) {
					System.out.print("¦");
				}
				System.out.println();
				
			} else {
				System.out.println(var);
			}//end else
			
		}//end for
		
	}//solution1
	
	public static int getNum(int i) {
		int j = 0;
		
		while( i>0 ) {
			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9 )
				j++;
			i /= 10;
		}
		
		
		return j;
	}
	
	public void solution2() {
		int n = 100;
		
		for(int i = 1; i <= n; i++) {
			int cnt = getNum(i);
			
			if( cnt == 0 ) {
				System.out.println(i);
			} else {
				for(int l = 0; l<cnt; l++) {
					System.out.print("¦");
				}//end for
				System.out.println();
			}//end else
			
		}//end for
		
	}//solution2
	
	public static void main(String[] args) {
		basic20 problem = new basic20();
		problem.solution2();
		
		
	}//main
	
}//class
