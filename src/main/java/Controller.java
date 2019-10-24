import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is the main class of the application.
 */
public class Controller {
    private View view;
    private JsonManager jsonManager;
    private Scanner scan;

    /**
     * Constructor of the Controller class.
     */
    public Controller() {
        view = new View();
        jsonManager = new JsonManager();
        scan = new Scanner(System.in);
    }

    /**
     * Method with the main routine that will keep program running
     * until user wants to quit.
     */
    private void start() {
        view.printWelcome();
        while (true) {
            view.printOptions();
            switch (userInput()) {
                case "1":
                    //Search a Pokemon
                    view.printSearchPokemonMessage();
                    searchPokemon(userInput());
                    break;
                case "2":
                    //Search a location
                    view.printSearchLocationMessage();
                    searchLocation(userInput());
                    break;
                case "3":
                    // Search a type
                    view.printSearchTypeMessage();
                    searchType(userInput());
                    break;
                case "4":
                    //quit
                    return;
                default:
                    view.printInvalidInput();
            }
            view.printReturnMenu();
            userInput();
        }
    }

    /**
     * Method that allows user to search for Pokemons.
     * @param pokemon to be searched.
     */
    private void searchPokemon(String pokemon) {
        String response = RequestHandler.makeHTTPRequest("pokemon",
                pokemon.trim().replace(".","").replace(" ","-").toLowerCase());

        Pokemon pokemonFromApi = jsonManager.readJsonPokemon(response);

        if (pokemonFromApi != null){
            view.printPokemon(pokemonFromApi.toString());
        }
        else{
            view.printNoPokemonFound();
        }
    }

    /**
     * Method that allows user to search for Locations.
     * @param location to be searched.
     */
    private void searchLocation(String location) {
        String response = RequestHandler.makeHTTPRequest("location",
                location.trim().replace(".","").replace(" ","-").toLowerCase());

        Location locationFromApi = jsonManager.readJsonLocations(response);

        if (locationFromApi != null){
            view.printLocationRegion(locationFromApi.getRegionOfLocation());
            locationFromApi.getLocationName().stream()
                    .forEach(locationFinal -> view.printLocation(locationFinal));
        }
        else{
            view.printNoLocationFound();
        }
    }

    /**
     * Method that allows user to search for pokemon types.
     * @param type to be searched.
     */
    private void searchType(String type) {
        String response = RequestHandler.makeHTTPRequest("type",
                type.trim().replace(".","").replace(" ","-").toLowerCase());

        ArrayList<Type> typeFromApi = jsonManager.readJsonPokemonType(response);

        if (typeFromApi != null){
            typeFromApi.stream()
                        .forEach(typeFinal -> view.printType(typeFinal.toString()));
        }
        else{
            view.printNoTypeFound();
        }
    }

    /**
     * Collect user input.
     * @return user input as a String.
     */
    public String userInput() {
        return scan.nextLine();
    }

    /**
     * Start of the application.
     * @param args
     */
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.start();
    }
}