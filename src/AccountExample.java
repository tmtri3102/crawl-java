//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class AccountExample {
//    public static void main(String[] args) {
//        try {
//            URL url = new URL("https://www.google.com");
//            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
//            scanner.useDelimiter("\\Z");
//            String content = scanner.next();
//            // close scanner
//            scanner.close();
//            // remove all new line
//            content = content.replaceAll("\\n+", "");
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }
//    }
//
//}
