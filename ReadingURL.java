package networking;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

 class ReadingURL {
	 
	 private static URL url;

	 	 
	 static void reading(String ur) throws IOException {
		 
		 try {
			 
				url = new URL(ur);
		
			 } 
		 
		 catch (MalformedURLException e){
			 
			 System.out.println("sorry" + e.getMessage() );
		 		}
		 
		 BufferedReader in = new BufferedReader(
			        new InputStreamReader(url.openStream()));
         FileWriter fw = new FileWriter("oracle.html");
         
			        String inputLine;
			        while ((inputLine = in.readLine()) != null)
			            //System.out.println(inputLine);
			        fw.write(inputLine);
			        fw.close();
			            
			        in.close();
		 
	 }
	 
 }
 
 
 
