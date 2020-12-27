package practice;

public class StringMethod {

	public StringMethod() {
		test();
	}//StringMethod
	
	public void test() {
		String test = "test";
		System.out.println( test.startsWith("t") );
		System.out.println( test.endsWith("st") );
		System.out.println( test.equals("test") );
		System.out.println( test.indexOf("qasd") );
		System.out.println( test.lastIndexOf("t") );
		System.out.println( test.length() );
		System.out.println( test.replace("q", "1") );
		System.out.println( test.replace("te", "1") );
		//System.out.println( test.replaceAll(regex, replacement) );
		//System.out.println( test.split("t") );
		System.out.println( test.substring(1,2) );
		System.out.println( test.toLowerCase() );
		System.out.println( test.toUpperCase() );
		System.out.println( test.toString() );
		System.out.println( test.trim() );
		System.out.println( String.valueOf(1) );
		System.out.println( test.compareTo("a") );
		System.out.println( test.contains("te") );
		System.out.println( test.charAt(1) );
		System.out.println( test.concat("1") );
		System.out.println(  );
		System.out.println(  );
		System.out.println(  );
		System.out.println(  );
		System.out.println(  );
		System.out.println(  );
		
		String test1 = "recruit qna notice";
		test1 = test1.replaceAll("qna", "");
		System.out.println(test1);
		
		
	}//test
	
	
	public static void main(String[] args) {
		new StringMethod();
	}//main
}//class
