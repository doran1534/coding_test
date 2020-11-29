package cos.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author kim
 *#����7
 *���� ���ӵ� n�� ������ �ֽ� ������ ������� ����ִ� �迭�� �ֽ��ϴ�. �̶�, ���� ��Ģ�� ���� �ֽ��� ��� �Ⱦ��� ���� �ִ� ������ ���Ϸ� �մϴ�.
 *n�� ���� �ֽ��� �� �� �� �� �� �ֽ��ϴ�.
 *n�� ���� �ֽ��� �� �� �� �� �� �ֽ��ϴ�.
 *�ֽ��� �� ���� �ٷ� �� ���� ������, �ּ� �Ϸ簡 ������ �� �� �ֽ��ϴ�.
 *��� �� ���� �ֽ��� ����ϸ�, �� ���� �Ⱦƾ� �մϴ�.
 *�ֽ��� �� ���� �ݵ�� ������ �ֽ��� ���� �ϸ�, �ִ� ������ ����� �ƴ� ���� �ֽ��ϴ�.
 *���ӵ� n �� ������ �ֽ� ������ ������� ����ִ� �迭 prices�� �Ű������� �־��� ��, 
 *�ֽ��� ��Ģ�� �°� �� ���� ����Ⱦ��� �� ���� �� �ִ� �ִ� ������ return �ϵ��� solution �޼ҵ带 �ۼ��߽��ϴ�. 
 *�׷���, �ڵ� �Ϻκ��� �߸��Ǿ��ֱ� ������, �ڵ尡 �ùٸ��� �������� �ʽ��ϴ�. �־��� �ڵ忡�� _**�� ��**_�� �����ؼ� ��� �Է¿� ���� �ùٸ��� �����ϵ��� �������ּ���.
 *---
 *#####�Ű����� ����
 *���ӵ� n �� ������ �ֽ� ������ ������� ����ִ� �迭 prices�� solution �޼ҵ��� �Ű������� �־����ϴ�.
 *prices�� ���̴� 2 �̻� 1,000,000 �����Դϴ�.
 *prices�� �� ���Ҵ� 1 �̻� 1,000 ������ �ڿ����Դϴ�.
 *---
 *#####return �� ����
 *�ֽ��� ��Ģ�� �°� �� ���� ����Ⱦ��� �� ���� �� �ִ� �ִ� ������ return ���ּ���.
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
