package Q4;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {
  
    public static void main(String[] args) throws IOException {
        System.out.println("creating a HttpURLConnection");
        HttpURLConnection connection = (HttpURLConnection) new URL("http://pranavg.me").openConnection();

        System.out.println("setting FixedLengthStreamingMode");
        connection.setFixedLengthStreamingMode(664 + 2168);
        connection.connect();
        System.out.println("connection.getInstanceFollowRedirects() returns " + connection.getInstanceFollowRedirects());
        System.out.println("connection.getHeaderFieldDate() returns " + connection.getHeaderFieldDate("expires", 0));
        System.out.println("connection.getRequestMethod() returns " + connection.getRequestMethod());
        System.out.println("connection.usingProxy() returns " + connection.usingProxy());
    }
}
