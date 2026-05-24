
package assistant;

import java.awt.Desktop;
import java.net.URI;

public class BrowserActions {

    public static void openGoogle() throws Exception {

        Desktop.getDesktop().browse(new URI("https://www.google.com"));
        System.out.println("Opening Google...");
    }

    public static void openYoutube() throws Exception {

        Desktop.getDesktop().browse(new URI("https://www.youtube.com"));
        System.out.println("Opening YouTube...");
    }

    public static void searchGoogle(String text) throws Exception {

        String url = "https://www.google.com/search?q=" + text.replace(" ", "+");

        Desktop.getDesktop().browse(new URI(url));

        System.out.println("Searching: " + text);
    }
}
