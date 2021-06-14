package com.zukalover.secureapp;

import org.apache.tika.sax.BodyContentHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zukalover.secureapp.textextraction.ParserExtractor;

@SpringBootApplication
public class ApacheTikaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheTikaApplication.class, args);
		
		ParserExtractor parserExtractor = new ParserExtractor("tikaa.txt");
		BodyContentHandler handler = parserExtractor.getHandler();
		
		System.out.println("The file content is :" + handler.toString());
	}

}
