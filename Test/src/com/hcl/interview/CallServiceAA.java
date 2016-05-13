package com.hcl.interview;

import java.util.concurrent.Callable;

public class CallServiceAA implements Callable<String> {

	private String data;

	public CallServiceAA(String data) {
		this.data = data;
	}

	@Override
	public String call() throws Exception {
		System.out.println("Calling AA");
		return "testServiceAA";
	}
}