package algorism.test1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kim
 * String name, no(이름과 학번)
 * 
 * 학생들을 ArrayList에 저장
 * 검색을 하겠느냐? y -> 반복
 * 종료하고 싶으면 n -> 프로그램 종료
 * 
 * 학생 이름이 있는 경우 그 학생의 학번을 출력
 * 학생 이름이 없는 경우, 없는 학생 이름이락 출력
 */
public class basic1 {
	
	
	public static void main(String[] args) {
		basic1VO st1 = new basic1VO("손오공", 1682);
		basic1VO st2 = new basic1VO("저팔계", 1772);
		basic1VO st3 = new basic1VO("사오정", 1813);
		
		ArrayList<basic1VO> list = new ArrayList<basic1VO>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		for(basic1VO student : list) {
			System.out.print("이름 : "+student.getName());
			System.out.println(", 학번 : "+student.getNo());
		}//end for
		
		Scanner scan = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("계속 검색을 하고 싶으시면 y, 종료하시고 싶으시면 n");
			String input = scan.next();
			
			if(input.equals("y")) {
				System.out.println("검색을 시작합니다.");
				String name = scan.next();
				boolean flag = false;
				
				for(basic1VO stu : list ) {
					if(stu.getName().equals(name)) {
						System.out.println("해당하는 학생의 학번은 : "+stu.getNo());
						flag = true;
						break;
					}//end if
				}//end for
				
				if(!flag) {
					System.out.println(name+"에 해당하는 학생은 존재하지 않습니다.");
				}
				
			} else if(input.equals("n")) {
				break;
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}//end else
			
		}//end while
		
		System.out.println("종료되었습니다.");
		
	}//main

}//class
