package com.zukalover.secureapp.textextraction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

public class ParserExtractor {

	private File file;
	private Parser parser;
	private BodyContentHandler handler;
	private Metadata metadata;
	private FileInputStream inputStream;
	private ParseContext context;
	
	public ParserExtractor()
	{
		
	}
	
	public ParserExtractor(String fileName)
	{
		this.file =new File(fileName);
		this.parser = new AutoDetectParser();
		this.handler = new BodyContentHandler();
		this.metadata = new Metadata();
		this.context = new ParseContext();
		
	}
	
	public BodyContentHandler getHandler()
	{
		try {
			this.inputStream = new FileInputStream(this.file);
			this.parser.parse(this.inputStream, this.handler, this.metadata, this.context);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TikaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return this.handler;
	}
	
	
}
