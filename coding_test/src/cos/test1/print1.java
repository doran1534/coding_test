package cos.test1;

/**
 * @author kim
 * 어느 누군가가 타임머신을 타고 과거로 가서 숫자 0이 없는 수 체계를 전파했습니다. 
 * 역사가 바뀌어 이제 사람들의 의식 속엔 0이란 숫자가 사라졌습니다. 따라서, 현재의 수 체계는 1, 2, 3, ..., 8, 9, 11, 12, ...와 같이 0이 없게 바뀌었습니다.
 * 0을 포함하지 않은 자연수 num이 매개변수로 주어질 때, 이 수에 1을 더한 수를 return 하도록 solution 메소드를 완성해주세요.
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
