package org.lq.demo.application.ari;

import java.util.Comparator;
import java.util.Date;
import java.util.Set;
import java.util.TreeMap;


public class demo2 {
	
	public static void main(String[] args) {
		
		//这一周股市价格为[2,6,1,4,8]，求哪一天买入哪一天卖出，可获得最大收益，最大收益为多少 
	    int[] array={2,6,1,4,8};
	    
	    TreeMap<Integer, Date> treeMap=new TreeMap<Integer, Date>(new Comparator<Integer>() {
	    	
	    	public int compare(Integer o1, Integer o2) {
	    		return  o1.compareTo(o2);
	    	};
	    	
		});
	    
	  
	    
	    for(int i=0;i<array.length;i++){
	    	
	    	treeMap.put(array[i], new Date());
	    }
	    
	   Set<Integer> keySet = treeMap.keySet();
	   Object[] array2 = keySet.toArray();
	    
	   Integer max=(Integer)array2[array2.length-1];
	   Integer min=(Integer)array2[0];
	   
	   System.out.println("最大值"+max+"最小值"+min);
	   
	   
	}

}
