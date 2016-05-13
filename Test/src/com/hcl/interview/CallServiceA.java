package com.hcl.interview;
import java.util.concurrent.Callable;

public class CallServiceA implements Callable<String> {
    @Override
    public String call() throws Exception {
    	System.out.println("Calling A");
           return "testServiceA";
    }
}