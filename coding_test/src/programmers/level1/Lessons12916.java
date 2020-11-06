package programmers.level1;

import java.util.regex.Pattern;

/**
 * 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. 
 * s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 
 * 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 
 * 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
 * @author kim
 */
public class Lessons12916 {
	
	public Lessons12916() {
	}
	
	public boolean solution(String s) {
		boolean result = false;
		
		//받은 문자를 모두 소문자로 변경
		s = s.toLowerCase();
		
		//y와 p가 존재하는지 검사하기 위한 변수
		boolean flagY = s.contains("y");
		boolean flagP = s.contains("p");
		//p, y 모두 하나도 없는 경우는 항상 True
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

