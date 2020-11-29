package cos.test1;

/**
 * @author kim
 * #문제2
 * 다음과 같이 n x n 크기의 격자에 1부터 n x n까지의 수가 하나씩 있습니다.
 * ![image](http://res.cloudinary.com/sgc109/image/upload/c_scale,w_300/v1517462270/%EA%B7%B8%EB%A6%BC1_qysbr6.png)
 * 이때 수가 다음과 같은 순서로 배치되어있다면 이것을 n-소용돌이 수라고 부릅니다.
 * ![image](http://res.cloudinary.com/sgc109/image/upload/c_scale,w_300/v1517462270/%EA%B7%B8%EB%A6%BC2_ol8snc.png)
 * 소용돌이 수에서 1행 1열부터 n 행 n 열까지 대각선상에 존재하는 수들의 합을 구해야 합니다.
 * ![image](http://res.cloudinary.com/sgc109/image/upload/c_scale,w_300/v1517462270/%EA%B7%B8%EB%A6%BC3_cbcdg3.png)
 * 위의 예에서 대각선상에 존재하는 수의 합은 15입니다.
 * 격자의 크기 n이 주어질 때 n-소용돌이 수의 대각선상에 존재하는 수들의 합을 return 하도록 solution 메소드를 완성해주세요.
 * 
 * * n은 1 이상 100 이하의 자연수입니다.
 * 
 * n-소용돌이 수의 대각선상에 존재하는 수들의 합을 return 해주세요.
 */
public class print2 {
	public print2() {
		int n1 = 3;
        int ret1 = solution(n1);
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
	}//print2
	
	int[][] pane;
	
    public int solution(int n) {
    	//배열 초기화
    	pane = new int[n][n];
    	
    	int breakPoint = (n - 1) * 2;
    	boolean flag = false;
    	
    	while(breakPoint > 0 ) {
    		
    		breakPoint--;
    	}
    	
    	
    	
    	int anwser = 0;
    	return anwser;
    	
    }//solution

    // The following is main method to output testcase.
    public static void main(String[] args) {
    	new print2();
    }//main
}//class
