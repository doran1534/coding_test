package cos.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author kim
 *#문제7
 *지난 연속된 n일 동안의 주식 가격이 순서대로 들어있는 배열이 있습니다. 이때, 다음 규칙에 따라 주식을 사고 팔았을 때의 최대 수익을 구하려 합니다.
 *n일 동안 주식을 단 한 번 살 수 있습니다.
 *n일 동안 주식을 단 한 번 팔 수 있습니다.
 *주식을 산 날에 바로 팔 수는 없으며, 최소 하루가 지나야 팔 수 있습니다.
 *적어도 한 번은 주식을 사야하며, 한 번은 팔아야 합니다.
 *주식을 팔 때는 반드시 이전에 주식을 샀어야 하며, 최대 수익은 양수가 아닐 수도 있습니다.
 *연속된 n 일 동안의 주식 가격이 순서대로 들어있는 배열 prices가 매개변수로 주어질 때, 
 *주식을 규칙에 맞게 한 번만 사고팔았을 때 얻을 수 있는 최대 수익을 return 하도록 solution 메소드를 작성했습니다. 
 *그러나, 코드 일부분이 잘못되어있기 때문에, 코드가 올바르게 동작하지 않습니다. 주어진 코드에서 _**한 줄**_만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정해주세요.
 *---
 *#####매개변수 설명
 *연속된 n 일 동안의 주식 가격이 순서대로 들어있는 배열 prices가 solution 메소드의 매개변수로 주어집니다.
 *prices의 길이는 2 이상 1,000,000 이하입니다.
 *prices의 각 원소는 1 이상 1,000 이하의 자연수입니다.
 *---
 *#####return 값 설명
 *주식을 규칙에 맞게 한 번만 사고팔았을 때 얻을 수 있는 최대 수익을 return 해주세요.
 */
public class Print7 {
	public Print7() {
	}
	
    public int solution1(int[] prices){
        
    	int comparePrice = prices[0];
    	
    	List<Integer> list = new ArrayList<Integer>();
    	
    	int cnt = 0;
    	
    	
    	for(int i=1; i<prices.length; i++) {
    		cnt = i;
    		
    		while(cnt < prices.length) {
    			if( comparePrice > prices[cnt] ) {
    				list.add(comparePrice - prices[cnt]);
    				System.out.println(comparePrice+"-"+prices[cnt]+" = "+(comparePrice - prices[cnt] ));
    			} else if( comparePrice < prices[cnt] ) {
    				list.add(prices[cnt] - comparePrice);
    				System.out.println(prices[cnt]+"-"+comparePrice+" = "+(prices[cnt] - comparePrice));
    			} else {
    				list.add(0);
    			}//end else
    			cnt++;
    		}//end while
    		
    		comparePrice = prices[i];
    	}//end for
    	
    	System.out.println(list.toString());
    	
    	Collections.sort(list);
    	
    	System.out.println(list.toString());
    	
    	return list.get(list.size()-1);
    	
    }//solution1
    
    int solution2(int[] prices){
        int inf = 1000000001;
        int mn = inf;
        int ans = -inf;
        for(int price : prices){
            if(mn != inf) {System.out.println("ans : "+ans+", "+(price-mn)); ans = Math.max(ans, price - mn); }
            mn = Math.min(mn, price); System.out.println("mn : "+mn+", price: "+price);
        }
        return ans;
    }

    public static void main(String[] args) {
        Print7 example = new Print7();
        int[] prices1 = {1, 2, 3};
        int ret1 = example.solution1(prices1);
        
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        int[] prices2 = {-5, 1, -2};
        int ret2 = example.solution1(prices2);
        
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
}
