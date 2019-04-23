import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MinhaThread extends Thread {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");

	public void run() {
	
		
		Thread estaThread = Thread.currentThread();
		
		for (int i = 0; i <100; i++) {
			String str = sdf.format(Calendar.getInstance().getTime());
			System.out.println("Estou na thread " + estaThread.getName() + " em " + str);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}

}
