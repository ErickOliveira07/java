
public class ThreadLabNew extends Thread {
	
	public ThreadLabNew(String name) {
		super(name);
	}

	public void run() {
		
		for  (int i = 0; i < 10; i++) {
			metodoAuxiliar();
		}
	}
	
	private synchronized void metodoAuxiliar() {
		System.out.println(Thread.currentThread().getName());
	}
}


