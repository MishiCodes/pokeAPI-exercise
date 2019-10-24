import java.util.ArrayList;

/**
 * A class representing a Location.
 */
public class Location {
    private ArrayList<String> locationName;
    private String regionOfLocation;

    /**
     * Class constructor.
     * @param locationName
     * @param regionOfLocation
     */
    public Location(ArrayList<String> locationName, String regionOfLocation) {
        this.locationName = locationName;
        this.regionOfLocation = regionOfLocation;
    }

    /**
     * Get location's name.
     * @return list of Strings
     */
    public ArrayList<String> getLocationName() { return locationName;
    }

    /**
     * Get location's region.
     * @return
     */
    public String getRegionOfLocation() {
        return regionOfLocation;
    }
}