package com.learn.newinterface;

public class InterfaceTest {

	public static void main(String [] args) {
		WebTechnology web = new SpringBoot();
		web.webStackArea();
		web.hostOnline();
		WebTechnology.accessThroughHTTP();
		WebTechnology web2 = new VueJS();
		web2.webStackArea();
		web2.hostOnline();
		WebTechnology.accessThroughHTTP();
	}
	
}
