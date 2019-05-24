package com.learn.newinterface;

public interface WebTechnology {

	public void webStackArea();
	
	default void hostOnline() {
		System.out.println("Web application hosted online");
	}
	
	static void accessThroughHTTP() {
		System.out.println("Accessible either through HTTP or HTTPS protocol");
	}
}
