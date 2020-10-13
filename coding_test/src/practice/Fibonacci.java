package practice;

public class Fibonacci {
	
	public long fibonacci(int num) {
		long result = 0;
		long previous = 0;
		long current = 1;
		long next = 0;
		//����, ���簪, ������ ���� �����ؾߵ�
		//0	��
		//1	����	��			1
		//1	����	����	��		2
		//2		����	����	��	3
		//3			����	����	4
		//5				����	5
		for(int i = 0 ; i < num ; i++ ) {
			next = previous + current;
			previous = current;
			current = next;
		}
		result = previous;
		
		return result;
	}
	
	
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		int num = 5;
		long result = f.fibonacci(num);
		System.out.println(result);
	}
}
