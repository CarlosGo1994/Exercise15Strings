package com.exercise16strings.app;

public class StringsApp 
{

	public static void main(String[] args) 
	{
		
		String cad1="Un texto es una composición de signos codificados en un sistema de escritura que forma una unidad de sentido. "
				+ "También es una composición de caracteres imprimibles generados por un algoritmo de cifrado que, aunque no tienen sentido para cualquier persona, "
				+ "sí puede ser descifrado por su destinatario original.";

		String cad2="Un texto es una composición de signos codificados en un sistema de escritura que forma una unidad de sentido. "
				+ "También es una composición de caracteres imprimibles generados por un algoritmo de cifrado que, aunque no tienen sentido para cualquier persona, "
				+ "sí puede ser descifrado por su destinatario original.";
		
		
			System.out.println(cad1.charAt(3));
			System.out.println(cad1.codePointAt(4));
			System.out.println(cad1.codePointBefore(4));
			System.out.println(cad1.codePointCount(3,4));
			System.out.println(cad1.compareTo(cad2));
			
			//Algotithm for reversing strings 
			String reversedString="";
			for( int index=cad1.length()-1;index>=0;index--)
			{
				reversedString=reversedString+cad1.charAt(index);
			}
			System.out.println(reversedString);
	}

}
