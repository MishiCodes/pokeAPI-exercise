/**
 * Represents a pokemon type
 */
public class Type {
    private String legend;
    private String damage;
    public Type(String legend, String damage) {
        this.legend = legend;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Type{" +
                "legend = '" + legend + '\'' +
                ", damage = '" + damage + '\'' +
                '}';
    }
}