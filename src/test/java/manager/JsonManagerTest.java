package manager;

import manager.*;
import pokemon.*;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class JsonManagerTest {

    @Test
    public void readJsonLocationsRegionTrue(){
        JsonManager jsonManager = new JsonManager();
        Location location = jsonManager.readJsonLocations(RequestHandler.makeHTTPRequest("location", "lavender-town"));

        assertEquals("kanto", location.getRegionOfLocation());
    }

    @Test
    public void readJsonTypeTrue(){
        JsonManager jsonManager = new JsonManager();
        ArrayList<Type> type = jsonManager.readJsonPokemonType(RequestHandler.makeHTTPRequest("type", "ground"));

        String typeLegend = type.get(0).getLegend();
        String typeDamage = type.get(0).getDamage();
        String line = "{" + typeLegend.replace("_"," ") + " " +
                            typeDamage.replace("_", " ") + "}";

        assertEquals(line, type.get(0).toString());
    }
}