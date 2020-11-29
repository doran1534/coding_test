package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareTo {
	
	public CompareTo() {
		solution5();
	}//CompareTo
	
	public void solution1() {
		
		String a1 = "갛";
		String a2 = "갊";
		String b1 = "b";
		
		System.out.println( a1.compareTo(a2) );
		
	}//solution1
	
	public void solution2() {
		
		String[] arr = {"다", "나","라", "가"};
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		System.out.println();
		
		Arrays.sort(arr, Collections.reverseOrder());
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		
	}//solution2
	
	public void solution3() {
		
		Comparator<String> ascending = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		};
		Comparator<String> decending = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		
		List<String> list = new ArrayList<String>();
		list.add("다");
		list.add("가");
		list.add("나");
		list.add("라");
		Collections.sort( list, ascending );
		for(int i = 0; i<list.size(); i++) {
			System.out.println( list.get(i) );
		}
		
		
	}//solution3
	
	public void solution4() {
		int[] arr = new int[45];
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}//end for
		
		for(int i=0; i<100; i++) {
			int random = (int)(Math.random()*45);
			
			int temp = arr[0];
			arr[0] = arr[random];
			arr[random] = temp;
		}//end for
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=(i+1); j<arr.length; j++) {
				if( arr[i]>arr[j] ) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}//end if
			}//end for
		}//end for
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}//solution4
	
	public void solution5() {
		List<String> list = new ArrayList<String>();
		list.add("가");
		list.add("나");
		list.add("다");
		list.add("라");
		list.add("마");
		list.add("바");
		list.add("사");
		list.add("아");
		list.add("자");
		list.add("차");
		list.add("카");
		list.add("타");
		list.add("파");
		list.add("하");
		
		for(int i = 0; i<list.size(); i++ ) {
			System.out.print(list.get(i)+"\t");
		}//end for
		System.out.println();
		
		for(int i = 0; i<100; i++ ) {
			int random = (int)(Math.random()*14);
			
			String temp = list.get(random);
			list.set(random, list.get(0));
			list.set(0, temp);
		}//end for
		
		for(int i = 0; i<list.size(); i++ ) {
			System.out.print(list.get(i)+"\t");
		}//end for
		
		boolean flag = false;
		for(int i = 0; i<list.size()-1; i++ ) {
			for(int j = i+1; j<list.size(); j++ ) {
				if( flag = list.get(i).compareTo(list.get(j))>0 ? true: false ) {
					String temp = list.get(i);
					list.set(i, list.get(j) );
					list.set(j, temp);
				}//end if
			}//end for
		}//end for
		System.out.println();
		
		for(int i = 0; i<list.size(); i++ ) {
			System.out.print(list.get(i)+"\t");
		}//end for
		System.out.println();
		
		for(int i = 0; i<list.size()-1; i++ ) {
			for(int j = i+1; j<list.size(); j++ ) {
				if( flag = list.get(i).compareTo(list.get(j))<0 ? true: false ) {
					String temp = list.get(i);
					list.set(i, list.get(j) );
					list.set(j, temp);
				}//end if
			}//end for
		}//end for
		
		for(int i = 0; i<list.size(); i++ ) {
			System.out.print(list.get(i)+"\t");
		}//end for
		System.out.println();
		
	}//solution6
	
	
	

	public static void main(String[] args) {
		CompareTo ct = new CompareTo();
		
		


	}//main

}//class
