package com.mycompany.app;


public class App
{
	/*
	 * 
	 * 
	 * commentaire
	 */

	public static void helloCall( String chose)
    {
		String str = new String();
		str = "La Factory c'est super !"+ chose;
		
		
			System.out.println( str );
			
    }
 

    public static void main( String[] args )
    {
    	
    	helloCall(" Yes c'est  yo  Génial");
   
    	
    }
    
}
