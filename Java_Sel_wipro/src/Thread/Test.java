package Thread;

public class Test extends Thread {
	public void run()
	{
		for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName()+"= " + i);
            Thread.yield();
        }
	}

	public static void main(String[] args) {
		Test t0=new Test();
		t0.start();
		t0.yield();
		Test t1=new Test();
		t1.start();
		// TODO Auto-generated method stub

	}

}
