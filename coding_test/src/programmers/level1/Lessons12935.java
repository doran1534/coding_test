package programmers.level1;

import java.util.Arrays;

public class Lessons12935 {
	
	public Lessons12935() {
	}
	
	public int[] solution(int[] arr) {
		
		int[] arr2 = new int[arr.length];
		for(int i=0; i<arr2.length; i++ ) {
			arr2[i] = arr[i];
		}

		int j = 0;
		if( arr.length == 1 ){
			int[] result = { -1 };
			return result;
		} else {
			Arrays.sort(arr);
			int[] result = new int[arr.length-1];
			
			for(int i = 0; i<result.length; i++) {
				if(arr2[j] != arr[0]) {
					result[i] = arr2[j];
				} else {
					result[i] = arr2[++j];
				}
				
				j++;
			}//end for

			return result;
		}//end else
		
	}
	
	public int[] solution2(int[] arr) {
	      if (arr.length <= 1) return new int[]{ -1 };
	      int min = Arrays.stream(arr).min().getAsInt();
	      return Arrays.stream(arr).filter(i -> i != min).toArray();
	}
	
	public static void main(String[] args) {
		Lessons12935 lesson = new Lessons12935();
		int[] arr = {6,4,2,8,1};
		int[] result = lesson.solution(arr);
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
