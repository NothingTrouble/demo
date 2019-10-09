package org.lq.demo.biz;

/**
 * 单例模式
 * @author qiong.liu
 *
 */
public class Singleton {
	
	private volatile static Singleton singleton=null;
	
	private Singleton(){
		System.out.println("我是无参构造方法");
	}
	
	{
		System.out.println("我是代码块啊啊啊啊啊");
	}
	
	static{
		
		System.out.println("我是静态代码块啊啊啊啊啊");
	}
	
	/**
	 * 饿汉式单例
	 * @param singleton
	 * @return
	 */
	public static Singleton getInstance(){
		if(null == singleton){
			synchronized (Singleton.class) {
				System.out.println("当前线程:"+Thread.currentThread().getId()+"开始");

				if(null == singleton){
					System.out.println("我是单例为空");

					singleton=new Singleton();
					
				}
				System.out.println("当前线程:"+Thread.currentThread().getId()+"结束");

			}
			
		}
		
		return singleton;
	}

}
