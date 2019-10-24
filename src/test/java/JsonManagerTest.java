import org.junit.Test;

import static org.junit.Assert.*;

public class JsonManagerTest {

    @Test
    public void readJsonLocationsRegionTrue(){
        JsonManager jsonManager = new JsonManager();
        Location location = jsonManager.readJsonLocations(RequestHandler.makeHTTPRequest("location", "lavender-town"));

        assertEquals("kanto", location.getRegionOfLocation());
    }
}