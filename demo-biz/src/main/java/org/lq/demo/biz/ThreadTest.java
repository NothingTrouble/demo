package org.lq.demo.biz;

public class ThreadTest implements Runnable {

	private static boolean flag = true;

	
	public void run() {
		if (flag) {
			flag = false;
			testSyncMethod();
		} else {
			flag = true;
			testSyncBlock();
		}

	}

	private void testSyncMethod() {
		synchronized (this) {
			System.out.println("testSyncMethod this:" + this);
			for (int i = 0; i < 100; i++) {
				System.out.println("testSyncMethod:" + i);
			}
		}
	}

	private void testSyncBlock() {
		synchronized (ThreadTest.class) {
			System.out.println("testSyncBlock ThreadTest.class:" + ThreadTest.class);

			for (int i = 0; i < 100; i++) {
				System.out.println("testSyncBlock:" + i);
			}
		}
	}

}
