package cos.test1;

/**
 * @author kim
 *#문제3
 *체스에서 나이트(knight)는 아래 그림과 같이 동그라미로 표시된 8개의 방향중 한 곳으로 한 번에 이동이 가능합니다.
 *![image](https://s3.ap-northeast-2.amazonaws.com/grepp-cloudfront/programmers_imgs/challengeable-imgs/20180315_knight.png)
 *단, 나이트는 체스판 밖으로는 이동할 수 없습니다.
 *체스판의 각 칸의 위치는 다음과 같이 표기합니다.
 *![image](https://s3.ap-northeast-2.amazonaws.com/grepp-cloudfront/programmers_imgs/challengeable-imgs/20180315_knight2.png)
 *예를 들어, A번줄과 1번줄이 겹치는 부분은 'A1'이라고 합니다.
 *나이트의 위치 pos가 매개변수로 주어질 때, 나이트를 한 번 움직여서 이동할 수 있는 칸은 몇개인지 return 하도록 solution 메소드를 완성해주세요.
 *---
 *#####매개변수 설명
 *나이트의 위치 pos가 solution 메소드의 매개변수로 주어집니다.
 *pos는 A부터 H까지의 대문자 알파벳 하나와 1 이상 8이하의 정수 하나로 이루어진 두 글자 문자열입니다.
 *잘못된 위치가 주어지는 경우는 없습니다.
 *---
 *#####return 값 설명
 *나이트를 한 번 움직여서 이동할 수 있는 칸의 개수를 return 해주세요.
 */
public class print3 {
	
	public print3() {
		
	}
	
	public int solution1(String pos) {
		int result = 0;
		int temp = 0;
		
		int x = (int)pos.charAt(0)-64;
		int y = (int)pos.charAt(1)-48;
		
		System.out.println("x 좌표 : "+x);
		System.out.println("y 좌표 : "+y);
		
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
