package org.lq.demo.application.ari;



/**
 * 输入：[3,1,2,4]
输出：[2,4,3,1]
输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。

A[left] & 1) == 1 是奇数 ==0 为偶数
 *
 */
public class demo3 {
	//
	
	public static void main(String[] args) {
		int[] A={3,2,4,5,1};
		int  left = 0;
		int right = A.length - 1;
        int tem;
	          
	        //左、右指针初始化
			 while(left < right){
	            //左指针对应奇数值，右指针对应偶数值，进行交换
	            if((A[left] & 1) == 1 && (A[right] & 1) == 0){
	                tem = A[left];
	                A[left] = A[right];
	                A[right] = tem;
	            }else if((A[left] & 1) == 0){
	                //左指针对应的是偶数值，符合题意，继续向右移动
	                left++;
	            }
	            else if((A[right] & 1) == 1){
	                //右指针对应的是奇数值，符合题意，继续向左移动
	                right--;
	            }
	        }
		 
		 for(int i=0;i<A.length;i++){
			 System.out.println("dfdf"+A[i]);
		 }
		
	
		
		
		
		
		
	}

}
