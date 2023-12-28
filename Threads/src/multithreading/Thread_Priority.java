package multithreading;

public class Thread_Priority  extends Thread{

	
		public void run() {
			
			for (int i = 1; i < 20; i++) {
				
				String str= Thread.currentThread().getName();
				System.out.println(str+":"+i);
			}
			
		}
		public static void main(String[] args) {
			Thread_Priority t1=new Thread_Priority();
			Thread_Priority t2=new Thread_Priority();
			Thread_Priority t3=new Thread_Priority();
			t1.setName("first thread");
			t2.setName("second thread");
			t3.setName("third thread");
			
			t1.setPriority(NORM_PRIORITY);
			t2.setPriority(MAX_PRIORITY);
			t3.setPriority(MIN_PRIORITY);
			t1.start();
			t2.start();
			t3.start();
			System.out.println("priority of 1st thread:"+t1.getPriority());
			System.out.println("priority of 2nd thread:"+t2.getPriority());
			System.out.println("priority of 3rd thread:"+t3.getPriority());
		}
	}

