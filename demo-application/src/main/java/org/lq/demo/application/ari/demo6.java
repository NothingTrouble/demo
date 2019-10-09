package org.lq.demo.application.ari;


/**
 * 输入: J = "aA", S = "aAAbbbb"
输出: 3
 * @author qiong.liu
 *
 */
public class demo6 {
	//
	
	public static void main(String[] args) {
		String J="aA";
		String S="aAAbbbb";
		for(int i=0;i<S.length();i++){
			for(int j=0;j<J.length();j++){
				char charAt = S.charAt(i);
				if(charAt==J.charAt(j)){
					System.out.println(charAt);
				}
				
			}
		}
		
		
		
		
		
		
	}

}
