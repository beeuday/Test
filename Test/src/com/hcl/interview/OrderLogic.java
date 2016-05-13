package com.hcl.interview;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class OrderLogic {

	private static final ExecutorService executor = Executors.newFixedThreadPool(10);

	public void processOrder(Order order) {
       
		try {
            Future<String> futureA = executor.submit(new CallServiceA());
            Future<String> futureB = executor.submit(new CallServiceB());

            
            Future<String> futureAA = executor.submit(new CallServiceAA(futureA.get()));

            
            Future<String> futureC = executor.submit(new CallServiceC(futureB.get(),futureAA.get()));
            

		 } catch (ExecutionException e) {
	            e.printStackTrace();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
      
        executor.shutdown();
        
    }

 public static void main(String args[]){
	 OrderLogic orderLogic = new OrderLogic();
	 orderLogic.processOrder(null);
 }

}


