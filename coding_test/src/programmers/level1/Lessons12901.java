package programmers.level1;

import java.util.Calendar;

/**
 * 2016�� 1�� 1���� �ݿ����Դϴ�. 
 * 2016�� a�� b���� ���� �����ϱ��? 
 * �� �� a ,b�� �Է¹޾� 2016�� a�� b���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
 * ������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ���� SUN,MON,TUE,WED,THU,FRI,SAT�Դϴ�. 
 * ���� ��� a=5, b=24��� 5�� 24���� ȭ�����̹Ƿ� ���ڿ� TUE�� ��ȯ�ϼ���.
 * @author kim
 *
 */
public class Lessons12901 {
	
	public String solution(int a, int b) {
		String result = "";
		Calendar cal = Calendar.getInstance();
		cal.set(2016, a, b);
		String[] arr = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		return arr[cal.get(Calendar.DAY_OF_WEEK)-1];
	}
	
	public static void main(String[] args) {
		int a = 4;
		int b = 24;
		String answer = "";
		Lessons12901 lesson = new Lessons12901();
		answer = lesson.solution(a, b);
		System.out.println(answer);
	}

}
