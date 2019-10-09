package org.lq.demo.biz;

/**
 * 单例模式
 * @author qiong.liu
 *
 */
public class Singleton02 {
	
	
	
	private Singleton02(){
		System.out.println("Singleton02我是无参构造方法");
	}
	
	
	
	public static Singleton02 getInstance(){
		return SingletonHolder.singleton02;
	}
	
	/**
	 * 饿汉式单例
	 * @param singleton
	 * @return
	 */
	public static class SingletonHolder {
		
		private SingletonHolder(){
			System.out.println("SingletonHolder我是无参构造方法");
		}
		
		private static Singleton02 singleton02=new Singleton02();
		
	}
	
	public class SingletonHolder01{
		private SingletonHolder01(){
			System.out.println("SingletonHolder01我是无参构造方法");
		}
		
		private void test01(){
		}
	}

}
