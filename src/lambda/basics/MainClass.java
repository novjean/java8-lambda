package lambda.basics;

public class MainClass extends MyRunnable{

	public static void main(String[] args){
//		First Method
//		MyRunnable r = new MyRunnable();
//		new Thread(r).start();
		
//		Second Method
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Second method");
				
			}
		};
		new Thread(r).start();		
		
//		Third Method
		new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("Third method");
				
			}
			
		}).start();
		
//		Fourth Method
		Runnable r1 = () -> System.out.println("Lamba style");
		new Thread(r1).start();
		
	}
}
