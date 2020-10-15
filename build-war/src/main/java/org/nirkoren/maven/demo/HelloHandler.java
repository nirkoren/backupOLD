package org.nirkoren.maven.demo;

import java.text.SimpleDateFormat;  
import java.util.Date;  

public class HelloHandler {

	public String sayHello() {
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());
		return "Dear Developer, is it working from your laptop?" + formatter.format(date);
	}

}
