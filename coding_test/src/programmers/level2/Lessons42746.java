package programmers.level2;

public class Lessons42746 {

	public String solution(int[] numbers) {
		String result = "";
		//�迭�� ũ�⸦ ���ϱ�
		int temp = 1;
		int cnt = 1;
		//numbers�� ���ڿ��� ������ �迭
		String[] num = new String[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			temp = temp * cnt;
			cnt++;
			num[i] = String.valueOf(numbers[i]);
		}//end for
		//���� �� �ִ� ���ڵ��� ���� �迭
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
