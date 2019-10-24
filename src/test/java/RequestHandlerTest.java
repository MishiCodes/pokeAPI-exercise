import org.junit.Test;

import static org.junit.Assert.*;

public class RequestHandlerTest {

    @Test
    public void httpRequestNotNull() {
        assertTrue(RequestHandler.makeHTTPRequest("location", "lavender-town") != null);
    }

    @Test
    public void makeHTTPRequestForLavenderTownTrue() {
        System.out.println(RequestHandler.makeHTTPRequest("location", "lavender-town"));
    }
}