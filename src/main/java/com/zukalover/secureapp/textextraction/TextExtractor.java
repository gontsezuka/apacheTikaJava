package com.zukalover.secureapp.textextraction;

import java.io.File;
import java.io.IOException;

import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;

public class TextExtractor {

	private File file;
	private Tika tika;
	private String content;
	
	
	public TextExtractor()
	{
		
	}
	
	public TextExtractor(String fileName)
	{
		this.file = new File(fileName);
		this.tika = new Tika();
	}
	
	
	public String getFileContent()
	{
		try {
			this.content = tika.parseToString(file);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TikaException e) {
			e.printStackTrace();
		}
		return this.content;
	}
}
