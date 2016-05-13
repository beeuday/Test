package com.hcl.interview;
import java.util.concurrent.Callable;

public class CallServiceB implements Callable<String> {
    @Override
    public String call() throws Exception {
    	System.out.println("Calling B");
          return "testServiceB";
    }
}