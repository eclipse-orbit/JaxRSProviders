package com.mycorp.examples.hello;

import com.mycorp.examples.hello.model.HelloMessage;

public interface IHello {
	
	public String hello();
	
	public HelloMessage hello2();

	public HelloMessage hello3(String from);
	
	public HelloMessage hello4(HelloMessage message);
}
