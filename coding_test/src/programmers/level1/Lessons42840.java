package programmers.level1;

public class Lessons42840 {
	
	public Lessons42840() {
		
	}
	
	public int[] solution(int[] answers) {
		int[] answer = {};
		//�л��� ��� ������ ���� �迭
		int[] student1 = {1,2,3,4,5};
		int[] student2 = {2,1,2,3,2,4,2,5};
		int[] student3 = {3,3,1,1,2,2,4,4,5,5};
		//���� ������ŭ �迭�� ��� ������� �� �ֱ�
		int[] answer1 = new int[answers.length+1];
		int[] answer2 = new int[answers.length+1];
		int[] answer3 = new int[answers.length+1];
		
		int controll1 = 0;
		int controll2 = 0;
		int controll3 = 0;
		for(int i=0; i<answers.length; i++) {
			controll1 = i%5;
			controll2 = i%8;
			controll3 = i%10;
			
			answer1[i] = student1[controll1];
			answer2[i] = student2[controll2];
			answer3[i] = student3[controll3];
		}//end for
		
		//�л��� ���� ���� ���
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		for(int i=0; i<answers.length; i++) {
			if(answer1[i] == answers[i]) {
				cnt1++;
			}//end if
			if(answer2[i] == answers[i]) {
				cnt2++;
			}//end if
			if(answer3[i] == answers[i]) {
				cnt3++;
			}//end if
		}//end for
		
		//�л��� ���� ������ ���ϱ�
		//cnt1�� ũ�� cnt1�� ����, cnt2�� ũ�� cnt2�� ����
		int result = cnt1 > cnt2 ? cnt1 : cnt2;
		String student = cnt1 > cnt2 ? "1��" : "2��";
		result = result > cnt3 ? result : cnt3;
		student = result > cnt3 ? student : "3��";
		
		
		
		System.out.println("1�� : "+cnt1);
		System.out.println("2�� : "+cnt2);
		System.out.println("3�� : "+cnt3);
		System.out.println("----------------");
		System.out.println(student+" : "+result);
		return answer;
	}//soulution
	
	public static void main(String[] args) {
		int[] answers = {2,2,1,1,3,3,4,4};
		Lessons42840 lesson = new Lessons42840();
		lesson.solution(answers);
	}

}
