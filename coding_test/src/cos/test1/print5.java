package cos.test1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kim
 *
 *#����5
 *1������ N������ �ĺ��� ���ؼ� ��ǥ�� �����߽��ϴ�. ���� ��� ��ǥ ����� [1, 5, 4, 3, 2, 5, 2, 5, 5, 4]��� ������� [1��, 5��, 4��, 3��, 2��, 5��, 2��, 5��, 5��, 4��] �ĺ��� ��ǥ������ ��Ÿ���ϴ�. 
 *�̶�, ���� ���� ǥ�� ���� �ĺ��� ��ȣ�� ���Ϸ��� �մϴ�.
 *�־��� solution �޼ҵ�� �ĺ��� �� N�� ��ǥ�� ������ ����� ��� �迭 votes�� �Ű������� �־����� ��, 
 *���� ���� ǥ�� ���� �ĺ��� ��ȣ�� return �ϴ� �޼ҵ��Դϴ�. �׷���, �ڵ� �Ϻκ��� �߸��Ǿ��ֱ� ������, ��� �Է¿� ���ؼ��� �ùٸ��� �������� �ʽ��ϴ�. 
 *�־��� �ڵ忡�� _**�� ��**_�� �����ؼ� ��� �Է¿� ���� �ùٸ��� �����ϵ��� �����ϼ���.
 *---
 *#####�Ű����� ����
 *�ĺ��� �� N�� ��ǥ ����� ����ִ� �迭 votes�� solution �޼ҵ��� �Ű������� �־����ϴ�.
 *N�� 1 �̻� 10 ������ �ڿ����Դϴ�.
 *votes�� ���̴� 1 �̻� 100 �����Դϴ�.
 *votes�� ���Ҵ� 1 �̻� N������ �ڿ����Դϴ�.
 *---
 *#####return �� ����
 *���� ���� ǥ�� ���� �ĺ��� ��ȣ�� �迭�� ��� return ���ּ���
 *���� ���� ���� ǥ�� ���� �ĺ��� 2�� �̻��̶��, �� �ĺ����� ��ȣ�� ��� �迭�� ��� �������� �����Ͽ� return ���ּ���.
 *---
 *#####����
 *| N | votes                 | return |
 *|---|-----------------------|--------|
 *| 5 | [1,5,4,3,2,5,2,5,5,4] | [5]    |
 *| 4 | [1,3,2,3,2]           | [2,3]  |
 *#####���� ����
 *���� #1
 *1������ 5������ 5���� �ĺ��� ������, ��ǥ ����� [1, 5, 4, 3, 2, 5, 2, 5, 5, 4]�Դϴ�. �� �ĺ��� ��ǥ���� ������ �����ϴ�.
 *1�� �ĺ��� 1ǥ
 *2�� �ĺ��� 2ǥ
 *3�� �ĺ��� 1ǥ
 *4�� �ĺ��� 2ǥ
 *5�� �ĺ��� 4ǥ
 *�� ��� 5�� �ĺ��� 4ǥ�� ���� ���� ǥ�� ������ϴ�.
 */
public class print5 {
	
	public print5() {
	}
	
    public int[] solution1(int N, int[] votes) {
    	
    	int[] compareVar = new int[N+1];
    	int temp = 0;
    	
    	//�ش� ��ȣ�� ���� ��ǥ�� : compareVar[]
    	for( int i=0; i<votes.length; i++ ) {
    		temp = votes[i];
    		compareVar[temp]++;
    	}//end for
    	
    	int maxValue = compareVar[0];
    	List<Integer> maxIndex = new ArrayList<Integer>();
    	
    	//���� ū ���� ��� ���� �ݺ��� : maxValue
    	for(int i = 1; i<compareVar.length; i++) {
    		if(compareVar[i]>maxValue) {
    			maxValue = compareVar[i];
    		}//end if
    	}//end for
    	
    	//�ִ� ��ǥ���� ���� ������� ���� list
    	for(int i = 0; i<compareVar.length; i++) {
    		if(compareVar[i] == maxValue) {
    			maxIndex.add(i);
    		}//end if
    	}//end for
    	
    	//�ִ� ��ǥ���� ���� ����� ���� �迭�� �����.
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
