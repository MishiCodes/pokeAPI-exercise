package pokemon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Enum class representing the damage levels.
 */
public enum DamageLevel {
    NO_DAMAGE_TO("Weak against"), HALF_DAMAGE_TO("Not very effective against"),
    DOUBLE_DAMAGE_FROM("Vulnerable to"), DOUBLE_DAMAGE_TO("Super effective against"),
    NO_DAMAGE_FROM("Immune against"), HALF_DAMAGE_FROM("Resistant to");

    private String damageLevelString;

    /**
     * Enum constructor.
     * @param damageLevelString represents the type of damage.
     */
    DamageLevel(String damageLevelString){
        this.damageLevelString = damageLevelString;
    }

    /**
     * Returns a list with the Enum values
     * @return an ArrayList with the damage types.
     */
    public static ArrayList<String> damageList() {
        return Arrays.stream(DamageLevel.values())
                .map(damageLevel -> damageLevel.name().toLowerCase())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public String toString(){
        return damageLevelString;
    }
}