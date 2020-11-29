package cos.test1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kim
 *
 *#문제5
 *1번부터 N번까지 후보에 대해서 투표를 진행했습니다. 예를 들어 투표 결과가 [1, 5, 4, 3, 2, 5, 2, 5, 5, 4]라면 순서대로 [1번, 5번, 4번, 3번, 2번, 5번, 2번, 5번, 5번, 4번] 후보에 투표했음을 나타냅니다. 
 *이때, 가장 많은 표를 받은 후보의 번호를 구하려고 합니다.
 *주어진 solution 메소드는 후보의 수 N과 투표를 진행한 결과가 담긴 배열 votes가 매개변수로 주어졌을 때, 
 *가장 많은 표를 받은 후보의 번호를 return 하는 메소드입니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 
 *주어진 코드에서 _**한 줄**_만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.
 *---
 *#####매개변수 설명
 *후보의 수 N과 투표 결과가 들어있는 배열 votes가 solution 메소드의 매개변수로 주어집니다.
 *N은 1 이상 10 이하의 자연수입니다.
 *votes의 길이는 1 이상 100 이하입니다.
 *votes의 원소는 1 이상 N이하의 자연수입니다.
 *---
 *#####return 값 설명
 *가장 많은 표를 받은 후보의 번호를 배열에 담아 return 해주세요
 *만약 가장 많은 표를 받은 후보가 2개 이상이라면, 그 후보들의 번호를 모두 배열에 담아 오름차순 정렬하여 return 해주세요.
 *---
 *#####예시
 *| N | votes                 | return |
 *|---|-----------------------|--------|
 *| 5 | [1,5,4,3,2,5,2,5,5,4] | [5]    |
 *| 4 | [1,3,2,3,2]           | [2,3]  |
 *#####예시 설명
 *예시 #1
 *1번부터 5번까지 5개의 후보가 있으며, 투표 결과는 [1, 5, 4, 3, 2, 5, 2, 5, 5, 4]입니다. 각 후보의 득표수는 다음과 같습니다.
 *1번 후보가 1표
 *2번 후보가 2표
 *3번 후보가 1표
 *4번 후보가 2표
 *5번 후보가 4표
 *이 경우 5번 후보가 4표로 가장 많은 표를 얻었습니다.
 */
public class print5 {
	
	public print5() {
	}
	
    public int[] solution1(int N, int[] votes) {
    	
    	int[] compareVar = new int[N+1];
    	int temp = 0;
    	
    	//해당 번호에 따른 투표수 : compareVar[]
    	for( int i=0; i<votes.length; i++ ) {
    		temp = votes[i];
    		compareVar[temp]++;
    	}//end for
    	
    	int maxValue = compareVar[0];
    	List<Integer> maxIndex = new ArrayList<Integer>();
    	
    	//가장 큰 값을 얻기 위한 반복문 : maxValue
    	for(int i = 1; i<compareVar.length; i++) {
    		if(compareVar[i]>maxValue) {
    			maxValue = compareVar[i];
    		}//end if
    	}//end for
    	
    	//최다 득표수를 받은 사람들을 담은 list
    	for(int i = 0; i<compareVar.length; i++) {
    		if(compareVar[i] == maxValue) {
    			maxIndex.add(i);
    		}//end if
    	}//end for
    	
    	//최다 득표수를 받은 사람의 수인 배열을 만든다.
    	int[] result = new int[maxIndex.size()];
    	
    	for(int i = 0; i<result.length; i++) {
    		result[i] = maxIndex.get(i);
    	}//end for
    	
        return result;
    }//solution1
    
    public int[] solution2(int N, int[] votes) {
        int vote_counter[] = new int[11];
        for (int i = 0; i < votes.length; ++i) {
            vote_counter[votes[i]] += 1;
        }
        int max_val = 0;
        int cnt = 0;
        for (int i = 1; i <= N; ++i) {
            if (max_val < vote_counter[i]) {
                max_val = vote_counter[i];
                cnt = 1;
            }
            else if(max_val == vote_counter[i]){
                cnt += 1;
            }
        }
        int answer[] = new int[cnt];
        for (int i = 1, idx = 0; i <= N; ++i){
            if (vote_counter[i] == max_val) {
                answer[idx] = i;
                idx += 1;
            }
        }
        return answer;
    }//solution2
    
    public static void main(String[] args) {
        print5 example = new print5();
        int N1 = 5;
        int[] votes1 = {1,5,4,3,2,5,2,5,5,4};
        int[] ret1 = example.solution1(N1, votes1);
 
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret1) + " .");
        
        
        int N2 = 4;
        int[] votes2 = {1, 3, 2, 3, 2};
        int[] ret2 = example.solution1(N2, votes2);
 
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret2) + " .");
        
    }//main
	
}//class
