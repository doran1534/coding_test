package algorism.test1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kim
 * String name, no(�̸��� �й�)
 * 
 * �л����� ArrayList�� ����
 * �˻��� �ϰڴ���? y -> �ݺ�
 * �����ϰ� ������ n -> ���α׷� ����
 * 
 * �л� �̸��� �ִ� ��� �� �л��� �й��� ���
 * �л� �̸��� ���� ���, ���� �л� �̸��̶� ���
 */
public class basic1 {
	
	
	public static void main(String[] args) {
		basic1VO st1 = new basic1VO("�տ���", 1682);
		basic1VO st2 = new basic1VO("���Ȱ�", 1772);
		basic1VO st3 = new basic1VO("�����", 1813);
		
		ArrayList<basic1VO> list = new ArrayList<basic1VO>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		for(basic1VO student : list) {
			System.out.print("�̸� : "+student.getName());
			System.out.println(", �й� : "+student.getNo());
		}//end for
		
		Scanner scan = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("��� �˻��� �ϰ� �����ø� y, �����Ͻð� �����ø� n");
			String input = scan.next();
			
			if(input.equals("y")) {
				System.out.println("�˻��� �����մϴ�.");
				String name = scan.next();
				boolean flag = false;
				
				for(basic1VO stu : list ) {
					if(stu.getName().equals(name)) {
						System.out.println("�ش��ϴ� �л��� �й��� : "+stu.getNo());
						flag = true;
						break;
					}//end if
				}//end for
				
				if(!flag) {
					System.out.println(name+"�� �ش��ϴ� �л��� �������� �ʽ��ϴ�.");
				}
				
			} else if(input.equals("n")) {
				break;
			} else {
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
			}//end else
			
		}//end while
		
		System.out.println("����Ǿ����ϴ�.");
		
	}//main

}//class
