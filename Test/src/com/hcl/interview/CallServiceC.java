package com.hcl.interview;

import java.util.concurrent.Callable;

public class CallServiceC implements Callable<String> {

	private String dataAA;
	private String dataB;

	public CallServiceC(String dataAA, String dataB) {
		this.dataAA = dataAA;
		this.dataB = dataB;
	}

	@Override
	public String call() throws Exception {
		System.out.println("Calling C");
		return "testServiceC";
	}
}