package cos.test1;

/**
 * @author kim
 *#����6
 *�� �л� A�� B�� ��� ������ �Ͽ����ϴ�. ��� ������ ��Ģ�� �Ʒ��� �����ϴ�.
 *~~~
 *1. ��� ���� �Ʒ����� ������ �����մϴ�. (0��° ĭ)
 *2. ������������ �մϴ�.
 *3. �̱�� ��� �� ĭ�� �ö󰡰�, ���� �� ĭ�� ��������, ���� ���ڸ��� �ֽ��ϴ�.
 *4. ��� ���� �Ʒ����� ���� ���ڸ��� �ֽ��ϴ�.
 *5. 2~4 ������ �� �� �ݺ��մϴ�.
 *~~~
 *A�� B�� ��� ������ �Ϸ��� �Ŀ�, A�� ��� �� �� ��° ĭ�� �ִ��� �ľ��Ϸ��� �մϴ�.
 *A�� B�� �� ���������� ����� ������� ����ִ� �迭 recordA�� recordB�� �Ű������� �־��� ��, 
 *������ ��ģ ���� A�� ��ġ�� return �ϵ��� solution �޼ҵ带 �ۼ��߽��ϴ�. 
 *�׷���, �ڵ� �Ϻκ��� �߸��Ǿ��ֱ� ������, ��� �Է¿� ���ؼ��� �ùٸ��� �������� �ʽ��ϴ�. 
 *�־��� �ڵ忡�� _**�� ��**_�� �����ؼ� ��� �Է¿� ���� �ùٸ��� �����ϵ��� �����ϼ���.
 *---
 *#####�Ű����� ����
 *A�� B�� �� ���������� ����� ������� ����ִ� �迭 recordA�� recordB�� �Ű������� �־����ϴ�.
 *recordA�� recordB�� ���Ҵ� 0, 1, 2�� �ϳ��̰� ������� ����, ����, ���� �ǹ��մϴ�.
 *recordA�� recordB�� ���̴� 10�Դϴ�.
 *---
 *#####return �� ����
 *solution �޼ҵ�� ��� ������ ��ģ �Ŀ� A�� ��� �� �� ��° ĭ�� ��ġ�ϴ����� return �մϴ�.
 *��� ���� �Ʒ� ĭ�� 0��° ĭ�Դϴ�.
 */
public class print6 {
	public print6() {
	}
	
	public int compareResult(int a, int b) {
		//��� ���
		if(a == b) {
			return 0;
		}//end if
		//�̱� ���
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
    		System.out.print("�º� ��� : "+temp);
    		answer = processResult(answer, temp);
    		System.out.println(", ���� ��ġ : "+answer);
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
