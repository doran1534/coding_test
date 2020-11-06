package programmers.level2;

/**
 * ��ȭ��ȣ�ο� ���� ��ȭ��ȣ ��, �� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 �ִ��� Ȯ���Ϸ� �մϴ�.
 * ��ȭ��ȣ�� ������ ���� ���, ������ ��ȭ��ȣ�� �������� ��ȭ��ȣ�� ���λ��Դϴ�.
 * ������ : 119
 * ���ؿ� : 97 674 223
 * ������ : 11 9552 4421
 * ��ȭ��ȣ�ο� ���� ��ȭ��ȣ�� ���� �迭 phone_book �� solution �Լ��� �Ű������� �־��� ��, 
 * � ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 ������ false�� �׷��� ������ true�� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 * @author kim
 */
public class Lessons42577 {
	
	public Lessons42577() {
	}
	
	public boolean solution(String[] phone) {
		
		for(int i=0; i<phone.length; i++) {
			for(int j=i+1; j<phone.length; j++) {
				if(phone[j].contains(phone[i])) {
				//if(phone_book[j].indexOf(phone_book[i])==0){//���ξ���
					//if(phone_book[j].startWith(phone_book[i])){//���ξ���
					System.out.println(phone[i]+"|"+phone[j]);
					return false;
				}//end if
			}
		}//end for
		
		return true;
	}
	
    public boolean solution2(String[] phone_book) {
		
        for(int i=0; i<phone_book.length-1; ++i) {
            for(int j=i+1; j<phone_book.length; ++j) {
                if(phone_book[i].startsWith(phone_book[j])) {return false;}
                if(phone_book[j].startsWith(phone_book[i])) {return false;}
            }
        }
        return true;
        
    }
	
	public static void main(String[] args) {
		Lessons42577 lesson = new Lessons42577();
		String[] phone = {"119", "97674223", "1195524421"};
		boolean result = lesson.solution(phone);
		System.out.println(result);
	}

}
