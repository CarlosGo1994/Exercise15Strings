package com.exercise16strings.app;

public class Tuneador {

	public static String[] tunea(String[] cads) 
	
	{	
		for(int i=0;i<cads.length;i++)
		{
			cads[i]=cads[i].trim();
			cads[i]=cads[i].toLowerCase();
			cads[i]=cads[i].toLowerCase(
			
		}
		
		return cads;

	}

}
