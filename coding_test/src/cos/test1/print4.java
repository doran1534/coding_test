package cos.test1;

import java.util.Arrays;

/**
 * @author kim
 *#����4
 *������������ ���ĵǾ��ִ� �� �迭 arrA, arrB�� �ϳ��� �迭�� ��ġ�� �մϴ�. ��, ��ģ ���� �迭�� ������������ ���ĵǾ� �־�� �մϴ�.
 *���� ��� arrA = [-2, 3, 5, 9], arrB = [0, 1, 5]�� ��� �� �迭�� ������������ ���ĵ� �ϳ��� �迭�� ��ġ�� [-2, 0, 1, 3, 5, 5, 9]�� �˴ϴ�.
 *������������ ���ĵ� �� �迭 arrA�� arrB�� �־����� ��, �� �迭�� ������������ ���ĵ� �ϳ��� �迭�� ���ļ� return �ϵ��� solution �޼ҵ带 �ۼ��Ϸ� �մϴ�. ��ĭ�� ä�� ��ü �ڵ带 �ϼ����ּ���.
 *---
 *##### �Ű����� ����
 *������������ ���ĵ� �� �迭 arrA�� arrB�� solution �޼ҵ��� �Ű������� �־����ϴ�.
 *
 *arrA�� ���̴� 1 �̻� 200,000 �����Դϴ�.
 *arrA�� ���Ҵ� -1,000,000 �̻� 1,000,000 ������ �����Դϴ�.
 *arrB�� ���̴� 1 �̻� 200,000 �����Դϴ�.
 *arrB�� ���Ҵ� -1,000,000 �̻� 1,000,000 ������ �����Դϴ�.
 *---
 *##### return �� ����
 *�� �迭 arrA, arrB�� ������������ ���ĵ� �ϳ��� �迭�� ���ļ� return ���ּ���.
 *
 *---
 *##### ����
 *
 *| arrA          | arrB      | return                 |
 *|---------------|-----------|------------------------|
 *| [-2, 3, 5, 9] | [0, 1, 5] | [-2, 0, 1, 3, 5, 5, 9] |
 */
public class print4 {
	public print4() {
	}
	
    public int[] solution1(int[] arrA, int[] arrB) {
        int arrA_idx = 0, arrB_idx = 0;
        int arrA_len = arrA.length;
        int arrB_len = arrB.length;
        int answer[] = new int[arrA_len + arrB_len];
        int answer_idx = 0;
        
        for(int i=0; i<answer.length; i++) {
        	if( i<arrA_len ) {
        		answer[i] = arrA[i];
        	} else {
        		answer[i] = arrB[i-arrA_len];
        	}//end else
        }//end for
        
        Arrays.sort(answer);
        
        return answer;
    }
    
    public int[] solution2(int[] arrA, int[] arrB) {
        int arrA_idx = 0, arrB_idx = 0;
        int arrA_len = arrA.length;
        int arrB_len = arrB.length;
        int answer[] = new int[arrA_len + arrB_len];
        int answer_idx = 0;
        while(arrA_idx < arrA_len && arrB_idx < arrB_len){
            if(arrA[arrA_idx] < arrB[arrB_idx])
                answer[answer_idx++] = arrA[arrA_idx++];
            else
                answer[answer_idx++] = arrB[arrB_idx++];
        }
        while(arrA_idx < arrA_len)
            answer[answer_idx++] = arrA[arrA_idx++];
        while(arrB_idx < arrB_len)
            answer[answer_idx++] = arrB[arrB_idx++];
        
        return answer;
    }
    
    public static void main(String[] args) {
        print4 example = new print4();
        int[] arrA = {-2, 3, 5, 9};
        int[] arrB = {0, 1, 5};
        int[] ret = example.solution1(arrA, arrB);
 
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret) + " .");
    }
}//class
