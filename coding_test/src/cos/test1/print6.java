package cos.test1;

/**
 * @author kim
 *#문제6
 *두 학생 A와 B는 계단 게임을 하였습니다. 계단 게임의 규칙은 아래와 같습니다.
 *~~~
 *1. 계단 제일 아래에서 게임을 시작합니다. (0번째 칸)
 *2. 가위바위보를 합니다.
 *3. 이기면 계단 세 칸을 올라가고, 지면 한 칸을 내려가고, 비기면 제자리에 있습니다.
 *4. 계단 제일 아래에서 지면 제자리에 있습니다.
 *5. 2~4 과정을 열 번 반복합니다.
 *~~~
 *A와 B가 계단 게임을 완료한 후에, A가 계단 위 몇 번째 칸에 있는지 파악하려고 합니다.
 *A와 B가 낸 가위바위보 기록이 순서대로 들어있는 배열 recordA와 recordB가 매개변수로 주어질 때, 
 *게임을 마친 후의 A의 위치를 return 하도록 solution 메소드를 작성했습니다. 
 *그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 
 *주어진 코드에서 _**한 줄**_만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.
 *---
 *#####매개변수 설명
 *A와 B가 낸 가위바위보 기록이 순서대로 들어있는 배열 recordA와 recordB가 매개변수로 주어집니다.
 *recordA와 recordB의 원소는 0, 1, 2중 하나이고 순서대로 가위, 바위, 보를 의미합니다.
 *recordA와 recordB의 길이는 10입니다.
 *---
 *#####return 값 설명
 *solution 메소드는 계단 게임을 마친 후에 A가 계단 위 몇 번째 칸에 위치하는지를 return 합니다.
 *계단 제일 아래 칸은 0번째 칸입니다.
 */
public class print6 {
	public print6() {
	}
	
	public int compareResult(int a, int b) {
		//비긴 경우
		if(a == b) {
			return 0;
		}//end if
		//이긴 경우
		if((a==0&&b==2) || (a==1&&b==0) || (a==2&&b==1)) {
			return 3;
		}else {
			return -1;
		}//end else
		
	}//compareResult
	
	public int processResult(int answer, int temp) {
		//win: +3, lose: -1, draw: 0
		if(answer == 0 && temp == -1 ) {
			return answer;
		}
		return answer + temp;
	}//processResult
	
    public int solution1(int[] recordA, int[] recordB){
    	int answer = 0;
    	int temp = 0;
    	
    	for(int i=0; i<recordA.length; i++) {
    		temp = compareResult(recordA[i], recordB[i]);
    		System.out.print("승부 결과 : "+temp);
    		answer = processResult(answer, temp);
    		System.out.println(", 현재 위치 : "+answer);
    	}//end for
    	
    	
    	return answer;
    }//solution1
    
    public int func(int record){
        if(record == 0) return 1;
        else if(record == 1) return 2;
        return 0;
    }

    public int solution2(int[] recordA, int[] recordB){
        int cnt = 0;
        for(int i = 0; i < recordA.length; i++){
            if(recordA[i] == recordB[i]) continue;
            else if(recordA[i] == func(recordB[i])) cnt += 3;
            else cnt = Math.max(0, cnt - 1);
        }
        return cnt;
    }
	
    public static void main(String[] args) {
        print6 example = new print6();
        int[] recordA = {2,0,0,0,0,0,1,1,0,0};
        int[] recordB = {0,0,0,0,2,2,0,2,2,2};
        int ret = example.solution2(recordA, recordB);

        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}//class
