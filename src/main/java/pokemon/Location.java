package pokemon;

import java.util.ArrayList;

/**
 * A class representing a Location.
 */
public class Location {
    private ArrayList<String> locationName;
    private String regionOfLocation;

    /**
     * Class constructor.
     * @param locationName The names of a location.
     * @param regionOfLocation THe region of a location
     */
    public Location(ArrayList<String> locationName, String regionOfLocation) {
        this.locationName = locationName;
        this.regionOfLocation = regionOfLocation;
    }

    /**
     * Get location's name.
     * @return list of Strings with location names in several languages.
     */
    public ArrayList<String> getLocationName() { return locationName;
    }

    /**
     * Get location's region.
     * @return a region as a String.
     */
    public String getRegionOfLocation() {
        return regionOfLocation;
    }
}