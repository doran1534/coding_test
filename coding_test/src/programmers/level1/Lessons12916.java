package programmers.level1;

import java.util.regex.Pattern;

/**
 * �빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. 
 * s�� 'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ��� False�� return �ϴ� solution�� �ϼ��ϼ���. 
 * 'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�. 
 * ��, ������ ���� �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.
 * @author kim
 */
public class Lessons12916 {
	
	public Lessons12916() {
	}
	
	public boolean solution(String s) {
		boolean result = false;
		
		//���� ���ڸ� ��� �ҹ��ڷ� ����
		s = s.toLowerCase();
		
		//y�� p�� �����ϴ��� �˻��ϱ� ���� ����
		boolean flagY = s.contains("y");
		boolean flagP = s.contains("p");
		//p, y ��� �ϳ��� ���� ���� �׻� True
		if( !flagY && !flagP) {
			return true;
		}
		
		
		int y = s.replaceAll("[^y]","").length();
		int p = s.replaceAll("[^p]","").length();
		result = y == p ? true : false;
		return result;
	}
	
	public static void main(String[] args) {
		Lessons12916 lesson = new Lessons12916();
		String s = "aabbccddyyyypppp";
		boolean result = lesson.solution(s);
		
		System.out.println(result);
	}//main
}

