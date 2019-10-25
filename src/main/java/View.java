/**
 * This class represents an user interface.
 */
public class View {

    /**
     * Constructor of View class.
     */
    public View(){
    }

    /**
     * Print out a Welcome message to the user.
     */
    public void printWelcome() {
        System.out.println(">> Welcome to Pokemon wiki\n");
    }

    /**
     * Print main menu.
     */
    public void printOptions(){
        System.out.println(">> Pick an option:");
        String[] actions = {">> (1) Search a Pokemon", ">> (2) Search a location", ">> (3) Search a Pokemon type",
                ">> (4) Quit"};
        for (int i = 0; i < actions.length; i++) {
            System.out.println(actions[i]);
        }
    }

    /**
     * Print a message asking for any input to return to the main menu.
     */
    public void printReturnMenu() {
        System.out.println(">> Please, press Enter to return to the menu");
    }

    /**
     * Print a message for user to insert a pokemon name.
     */
    public void printSearchPokemonMessage() {
        System.out.println(">> Insert a pokemon name:");
    }

    /**
     * Print the searched pokemon.
     */
    public void printPokemon(String pokemon) {
        System.out.println(pokemon);
    }

    /**
     * Print a message for user to insert a type name.
     */
    public void printSearchTypeMessage() {
        System.out.println(">> Insert a pokemon type:");
    }

    /**
     * Print the searched type.
     */
    public void printType(String type) {
        System.out.println(type);
    }

    /**
     * Print a message for user to insert a location name.
     */
    public void printSearchLocationMessage() {
        System.out.println(">> Insert a location name:");
    }

    /**
     * Print the searched location.
     */
    public void printLocation(String location) {
        System.out.println(">> Location name = " + location);
    }

    /**
     * Print the location region.
     */
    public void printLocationRegion(String region) {
        System.out.println(">> Region = " + region);
    }

    /**
     * Print a message stating that the input was valid.
     */
    public void printInvalidInput() {
        System.out.println(">> Invalid input.");
    }

    /**
     * Print a message saying that Type wasn't found.
     */
    public void printNoTypeFound() {
        System.out.println(">> Type not found. Did you insert a valid type?");
    }

    /**
     * Print a message saying that Location wasn't found.
     */
    public void printNoLocationFound() {
        System.out.println(">> Location not found. Did you insert the correct location name?");
    }

    /**
     * Print a message saying that Pokemon wasn't found.
     */
    public void printNoPokemonFound() {
        System.out.println(">> Pokemon not found. Did you insert the correct pokemon name?");
    }

    /**
     * Print a message saying what is the type of the Pokemon and its damage levels.
     */
    public void printPokemonType(String type) {
        System.out.println(">> \'" + type + "\' type properties:");
    }
}