package programmers.level1;

public class Lessons12903 {
	public Lessons12903() {
	}
	
	public String solution(String parameter) {
		String result = "";
		int two = 2;
		int startNum = 0;
		if(parameter.length() % 2 == 0 ) {
			//¦���� ���
			//4���� 2,3��°
			//6���� 3,4��°
			startNum = parameter.length() / two - 1;
			result = parameter.substring(startNum, startNum+2);
		} else {
			//Ȧ���� ���
			//3���� 2��°
			//5���� 3����
			//7���� 4��°
			//���� / 2 + 1
			startNum = parameter.length() / two;
			result = String.valueOf(parameter.charAt(startNum));
			
		}//end else
		
		return result;
	}
	
	public static void main(String[] args) {
		String parameter = "abcdef";
		String answer = "";
		Lessons12903 lesson = new Lessons12903();
		answer = lesson.solution(parameter);
		System.out.println(answer);
		
	}
}
