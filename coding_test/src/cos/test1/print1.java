package cos.test1;

/**
 * @author kim
 * ��� �������� Ÿ�Ӹӽ��� Ÿ�� ���ŷ� ���� ���� 0�� ���� �� ü�踦 �����߽��ϴ�. 
 * ���簡 �ٲ�� ���� ������� �ǽ� �ӿ� 0�̶� ���ڰ� ��������ϴ�. ����, ������ �� ü��� 1, 2, 3, ..., 8, 9, 11, 12, ...�� ���� 0�� ���� �ٲ�����ϴ�.
 * 0�� �������� ���� �ڿ��� num�� �Ű������� �־��� ��, �� ���� 1�� ���� ���� return �ϵ��� solution �޼ҵ带 �ϼ����ּ���.
 */
public class print1 {
	public print1() {
		long num = 9949999;
		long ret = solution(num);
		System.out.println("Solution: return value of the method is " + ret + " .");
	}
	
    public long solution(long num) {
    	num++;
        long digit = 1;
        while (num / digit % 10 == 0) {
            num += digit;
            digit *= 10;
        }
        return num;
    }//solution
    
    public long solution2(long num) {
    	num++;
    	
    	String temp = String.valueOf(num);
    	int size = 0;
    	while( temp.contains("0") ) {
    		size = temp.length();
    		temp.indexOf("0");
    	}
    	
    	
    	long answer = num;
    	
    	return answer;
    }//solution2

    // The following is main method to output testcase.
    public static void main(String[] args) {
        new print1();
    }
}
