package practice;

public class Fibonacci {
	
	public long fibonacci(int num) {
		long result = 0;
		long previous = 0;
		long current = 1;
		long next = 0;
		//전값, 현재값, 다음값 변수 존재해야됨
		//0	전
		//1	현재	전			1
		//1	다음	현재	전		2
		//2		다음	현재	전	3
		//3			다음	현재	4
		//5				다음	5
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
