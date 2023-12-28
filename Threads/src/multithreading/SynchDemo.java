package multithreading;

 class First {

	synchronized void call(String str) {
		System.out.println("["+str);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			System.out.println("interrupted");
			
		}
		System.out.println("]");
	
		
		
	}
}

class Second implements Runnable{
	String str;
	First f;
	
	Thread t;
	public Second(First fir,String s) {
		f=fir;
		str=s;
		t=new Thread(this);
		t.start();
		
				
				
	}
	

	

	@Override
	public void run() {
      f.call(str);
      
	}
	
}

 class SynchDemo{
	public static void main(String[] args) {
		First f=new  First();
		
		Second s1=new Second(f, "kir");
		Second s11=new   Second(f, "kiran");
		Second s2=new Second(f, "ant");
		Second s111=new   Second(f, "hima");

		Second s3=new Second(f, "hik");
		try {
			s1.t.join();
			s111.t.join();
			s2.t.join();
			s3.t.join();
			
		}
		catch (InterruptedException e) {
          System.out.println("interrupted");	
          }

	}
				
				
	}

