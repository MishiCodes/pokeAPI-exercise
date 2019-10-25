package pokemon;

/**
 * This class represents a Pokemon.
 */
public class Pokemon {
    private long pokemonID;
    private String pokemonName;
    private long pokemonHeight;
    private long pokemonWeight;
    private String pokemonType;

    /**
     * Pokemon constructor.
     * @param pokemonID
     * @param pokemonName
     * @param pokemonHeight
     * @param pokemonWeight
     * @param pokemonType
     */
    public Pokemon(long pokemonID, String pokemonName, long pokemonHeight, long pokemonWeight, String pokemonType) {
        this.pokemonID = pokemonID;
        this.pokemonName = pokemonName;
        this.pokemonHeight = pokemonHeight;
        this.pokemonWeight = pokemonWeight;
        this.pokemonType = pokemonType;
    }

    /**
     * Get the pokemon type.
     * @return the type of the pokemon.
     */
    public String getPokemonType() {
        return pokemonType;
    }

    @Override
    public String toString() {
        return ">> Pokemon {" +
                "ID = " + pokemonID +
                ", Name = '" + pokemonName + '\'' +
                ", Height = " + pokemonHeight +
                ", Weight = " + pokemonWeight +
                ", Type= '" + pokemonType + '\'' +
                '}';
    }
}