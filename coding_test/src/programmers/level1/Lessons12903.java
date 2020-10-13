package programmers.level1;

public class Lessons12903 {
	public Lessons12903() {
	}
	
	public String solution(String parameter) {
		String result = "";
		int two = 2;
		int startNum = 0;
		if(parameter.length() % 2 == 0 ) {
			//짝수인 경우
			//4글자 2,3번째
			//6글자 3,4번째
			startNum = parameter.length() / two - 1;
			result = parameter.substring(startNum, startNum+2);
		} else {
			//홀수인 경우
			//3글자 2번째
			//5글자 3번쨰
			//7글자 4번째
			//글자 / 2 + 1
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
