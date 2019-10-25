package pokemon;

/**
 * Represents a pokemon type.
 */
public class Type {
    private String legend;
    private String damage;

    /**
     * Constructor of pokemon type.
     * @param legend the type of damage.
     * @param damage the pokemon type affected by the type of damage.
     */
    public Type(String legend, String damage) {
        this.legend = legend;
        this.damage = damage;
    }

    /**
     * Get type legend.
     * @return a legend.
     */
    public String getLegend() {
        return legend;
    }

    /**
     * Get type damage.
     * @return a damage.
     */
    public String getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return ">> " + DamageLevel.valueOf(legend.toUpperCase()).toString() + " '" +
                damage.replace("_", " ") + "' (" +
                legend.replace("_"," ") + ")";
    }
}