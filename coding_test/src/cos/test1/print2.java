package cos.test1;

/**
 * @author kim
 * #����2
 * ������ ���� n x n ũ���� ���ڿ� 1���� n x n������ ���� �ϳ��� �ֽ��ϴ�.
 * ![image](http://res.cloudinary.com/sgc109/image/upload/c_scale,w_300/v1517462270/%EA%B7%B8%EB%A6%BC1_qysbr6.png)
 * �̶� ���� ������ ���� ������ ��ġ�Ǿ��ִٸ� �̰��� n-�ҿ뵹�� ����� �θ��ϴ�.
 * ![image](http://res.cloudinary.com/sgc109/image/upload/c_scale,w_300/v1517462270/%EA%B7%B8%EB%A6%BC2_ol8snc.png)
 * �ҿ뵹�� ������ 1�� 1������ n �� n ������ �밢���� �����ϴ� ������ ���� ���ؾ� �մϴ�.
 * ![image](http://res.cloudinary.com/sgc109/image/upload/c_scale,w_300/v1517462270/%EA%B7%B8%EB%A6%BC3_cbcdg3.png)
 * ���� ������ �밢���� �����ϴ� ���� ���� 15�Դϴ�.
 * ������ ũ�� n�� �־��� �� n-�ҿ뵹�� ���� �밢���� �����ϴ� ������ ���� return �ϵ��� solution �޼ҵ带 �ϼ����ּ���.
 * 
 * * n�� 1 �̻� 100 ������ �ڿ����Դϴ�.
 * 
 * n-�ҿ뵹�� ���� �밢���� �����ϴ� ������ ���� return ���ּ���.
 */
public class print2 {
	public print2() {
		int n1 = 3;
        int ret1 = solution(n1);
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
	}//print2
	
	int[][] pane;
	
    public int solution(int n) {
    	//�迭 �ʱ�ȭ
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
