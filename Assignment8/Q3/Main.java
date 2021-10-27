package Q3;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
   
    public static void main(String[] args) throws MalformedURLException, URISyntaxException {
        URL url = new URL("https://anukool.me:443/blog?a=b");

        System.out.println("url.getProtocol() returns: " + url.getProtocol());
        System.out.println("url.getHost() returns: " + url.getHost());
        System.out.println("url.getPort() returns: " + url.getPort());
        System.out.println("url.getAuthority() returns: " + url.getAuthority());
        System.out.println("url.toURI() returns: " + url.toURI());
        System.out.println("url.getQuery() returns: " + url.getQuery());
    }
}