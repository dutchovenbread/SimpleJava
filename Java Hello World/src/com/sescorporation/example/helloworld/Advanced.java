package com.sescorporation.example.helloworld;

public class Advanced 
{
	public static String interpretLanguage(String language) throws Exception
	{
	      if(language == "de")
	      {
	    	  return "Hallo Welt!";
	      }
	      else if(language == "es")
	      {
	    	  return "Hola, Mundo";
	      }
	      else if(language == "fr")
	      {
	    	  return "Bonjour, le monde";
	      }
	      else if(language == "en")
	       {
	    	  return "Hello, World!";
	       }
	       else
	       {
	    	   throw new Exception("Error: language not recognized.");
	       }
	}
}
