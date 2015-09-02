package networking;

import java.io.IOException;
import java.net.*;

 public class Test {

	
	public static void main(String[] args) throws IOException {
		
		//constructor with full http centric url		
		URL aURL = new URL("http://example.com:80/docs/books/tutorial"
                          + "/index.html?name=networking#DOWNLOADING");

		// accessor methods available for parsing urls
		System.out.println("protocol = " + aURL.getProtocol());
		System.out.println("authority = " + aURL.getAuthority());
		System.out.println("host = " + aURL.getHost());
		System.out.println("port = " + aURL.getPort());
		System.out.println("path = " + aURL.getPath());
		System.out.println("query = " + aURL.getQuery());
		System.out.println("filename = " + aURL.getFile());
		System.out.println("ref = " + aURL.getRef());
		
		ReadingURL.reading("http://www.oracle.com");
		
		
		
		
	}

}
