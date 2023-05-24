package com.testapi.demo;

import java.io.FileNotFoundException;

public class CustomerImplementation implements CustomerMethods {
	@Override
	public void subscriber() throws FileNotFoundException, InterruptedException {
		SubscriberMethods a = new SubscriberMethods();
		a.subscriberdata();
		a.subscriberDetails();
		Thread.sleep(3000);
		a.susbscriberEditdata();

	}

	@Override
	public void leads() {

	}

	@Override
	public void Quotes() {

	}

	@Override
	public void orders() {

	}

	@Override
	public void Templates() {

	}

}
