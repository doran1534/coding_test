package programmers.level2;

public class Lessons42746 {

	public String solution(int[] numbers) {
		String result = "";
		//배열의 크기를 정하기
		int temp = 1;
		int cnt = 1;
		//numbers를 문자열로 저장할 배열
		String[] num = new String[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			temp = temp * cnt;
			cnt++;
			num[i] = String.valueOf(numbers[i]);
		}//end for
		//나올 수 있는 숫자들을 담을 배열
		String[] arr = new String[temp];
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=num.length-1; j>-1; j--) {
				
				
			}
		}
		for(int j=num.length-1; j>-1; j--) {
			
			
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		String answer = "";
		Lessons42746 lesson = new Lessons42746();
		int[] numbers = {1,2,3};
		answer = lesson.solution(numbers);
		System.out.println(answer);
	}
}
