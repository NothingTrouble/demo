package org.lq.demo.application.ari;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class demo1 {
	
	public static void main(String[] args) {
		
		//[1,1,2,2,3,4,4,5,5,5]  找出不重复的元素（黄包车）
	    int[] array={1,1,2,2,3,3,3,4,4,5,5,5,6,7,7,8};
	    
	    //存放不重复的元素
	    List<Integer> arrayList = new ArrayList<Integer>();
	    
	    HashMap<Integer, Integer> hashMap = new HashMap<Integer,Integer>();
	    for(int i=0;i<array.length;i++){
	    	
	    	int key=array[i];
	    	if(hashMap.containsKey(key)){
	    		hashMap.put(key, hashMap.get(key)+1);
	    		continue ;
	    	}
	    	hashMap.put(key, 1);
	    	
	    }
	    
	    for(Integer key:hashMap.keySet()){
	    	if(hashMap.get(key)==1){
	    		arrayList.add(key);
	    	}
	    	
	    }
	    
	   for(Integer v:arrayList){
    		System.out.println("不重复的元素为："+v);

	    }
	}

}
