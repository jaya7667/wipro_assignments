package Thread;

public class Test_synch extends Thread{
	int count=0;
	synchronized void count()
	{
		count++;
	}
	public static void main(String[] args) {
		Test_synch t1=new Test_synch();
		t1.count();
		Test_synch t2=new Test_synch();
		t2.count();
 
		
	}

}
