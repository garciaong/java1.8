package com.learn.newinterface;

public class InterfaceTest {

	public static void main(String[] args) {
		/**
		 * SpringBoot handling back-end application 
		 * Web application hosted online
		 * Accessible either through HTTP or HTTPS protocol 
		 * Vue JS handling front-end application 
		 * Web application hosted online 
		 * Accessible either through HTTP or HTTPS protocol
		 */
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
