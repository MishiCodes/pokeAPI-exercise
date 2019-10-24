import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 * A class to handle the http requests.
 */
public class RequestHandler {

    /**
     * Method that retrieves information from the server
     * @param type
     * @param name
     * @return
     */
    public static String makeHTTPRequest(String type, String name) {
        String urlString = "https://pokeapi.co/api/v2/" + type + "/" + name;
        String response = null;

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            Scanner responseScanner = new Scanner(connection.getInputStream());
            while (responseScanner.hasNext()) {
                response = responseScanner.nextLine();
            }
        } catch (IOException e) {
            return null;
        }
        return response;
    }
}
