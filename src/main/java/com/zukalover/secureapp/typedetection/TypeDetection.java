package com.zukalover.secureapp.typedetection;

import java.io.File;
import java.io.IOException;

import org.apache.tika.Tika;

public class TypeDetection {

	private Tika tika;
	private File file;
	String fileName;
	String fileType;
	
	public TypeDetection()
	{
		
	}
	public TypeDetection(String fileName)
	{
		this.file = new File(fileName);
		this.tika = new Tika();
	}
	
	public String detectFile()
	{
		
		try {
			fileType = tika.detect(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return this.fileType;
	}
}
