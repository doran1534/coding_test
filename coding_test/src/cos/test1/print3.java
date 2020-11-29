package cos.test1;

/**
 * @author kim
 *#����3
 *ü������ ����Ʈ(knight)�� �Ʒ� �׸��� ���� ���׶�̷� ǥ�õ� 8���� ������ �� ������ �� ���� �̵��� �����մϴ�.
 *![image](https://s3.ap-northeast-2.amazonaws.com/grepp-cloudfront/programmers_imgs/challengeable-imgs/20180315_knight.png)
 *��, ����Ʈ�� ü���� �����δ� �̵��� �� �����ϴ�.
 *ü������ �� ĭ�� ��ġ�� ������ ���� ǥ���մϴ�.
 *![image](https://s3.ap-northeast-2.amazonaws.com/grepp-cloudfront/programmers_imgs/challengeable-imgs/20180315_knight2.png)
 *���� ���, A���ٰ� 1������ ��ġ�� �κ��� 'A1'�̶�� �մϴ�.
 *����Ʈ�� ��ġ pos�� �Ű������� �־��� ��, ����Ʈ�� �� �� �������� �̵��� �� �ִ� ĭ�� ����� return �ϵ��� solution �޼ҵ带 �ϼ����ּ���.
 *---
 *#####�Ű����� ����
 *����Ʈ�� ��ġ pos�� solution �޼ҵ��� �Ű������� �־����ϴ�.
 *pos�� A���� H������ �빮�� ���ĺ� �ϳ��� 1 �̻� 8������ ���� �ϳ��� �̷���� �� ���� ���ڿ��Դϴ�.
 *�߸��� ��ġ�� �־����� ���� �����ϴ�.
 *---
 *#####return �� ����
 *����Ʈ�� �� �� �������� �̵��� �� �ִ� ĭ�� ������ return ���ּ���.
 */
public class print3 {
	
	public print3() {
		
	}
	
	public int solution1(String pos) {
		int result = 0;
		int temp = 0;
		
		int x = (int)pos.charAt(0)-64;
		int y = (int)pos.charAt(1)-48;
		
		System.out.println("x ��ǥ : "+x);
		System.out.println("y ��ǥ : "+y);
		
		result = top(x,y) + bottom(x,y) + right(x,y) + left(x,y);
		
		
		return result;
	}//solution1
	
	public int top(int x, int y) {
		int answer = 0;
		
		if( y + 2 <= 8 ) {
			if( x + 1 <= 8) {
				answer++;
			}//end if
			if( x - 1 > 0 ) {
				answer++;
			}//end if
			
		}//end if
		
		return answer;
	}//top
	
	public int bottom(int x, int y) {
		int answer = 0;
		
		if( y - 2 > 0 ) {
			if( x + 1 <= 8) {
				answer++;
			}//end if
			if( x - 1 > 0 ) {
				answer++;
			}//end if
			
		}//end if
		
		return answer;
	}//bottom
	
	public int right(int x, int y) {
		int answer = 0;
		
		if( x + 2 <= 8 ) {
			if( y + 1 <= 8) {
				answer++;
			}//end if
			if( y - 1 > 0 ) {
				answer++;
			}//end if
			
		}//end if
		
		return answer;
	}//right
	
	public int left(int x, int y) {
		int answer = 0;
		
		if( x - 2 > 0 ) {
			if( y + 1 <= 8) {
				answer++;
			}//end if
			if( y - 1 > 0 ) {
				answer++;
			}//end if
			
		}//end if
		
		return answer;
	}//left
	
	public int solution2(String pos) {
		int dx[] = {1,1,-1,-1,2,2,-2,-2};
    	int dy[] = {2,-2,-2,2,1,-1,-1,1};
    	int cx = pos.charAt(0) - 'A';
    	int cy = pos.charAt(1) - '0' - 1;
    	int ans = 0;
    	for (int i = 0; i < 8; ++i) {
    		int nx = cx + dx[i];
    		int ny = cy + dy[i];
    		if (nx >= 0 && nx < 8 && ny >= 0 && ny < 8)
    			ans++;
    	}
    	return ans;
	}//solution2
	
	public static void main(String[] args) {
		print3 example = new print3();
		String pos = "H1";
		
		int ret = example.solution2(pos);
		
		System.out.println("Soltuion : "+ret);
		
	}//main
	
}//class
