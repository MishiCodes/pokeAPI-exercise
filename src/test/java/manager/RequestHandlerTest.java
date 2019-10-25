package manager;

import manager.RequestHandler;
import org.junit.Test;

import static org.junit.Assert.*;

public class RequestHandlerTest {

    @Test
    public void httpRequestNotNull() {
        assertTrue(RequestHandler.makeHTTPRequest("location", "lavender-town") != null);
    }

    @Test
    public void httpRequestNull() {
        assertTrue(RequestHandler.makeHTTPRequest("location", "lisboa") == null);
    }
}