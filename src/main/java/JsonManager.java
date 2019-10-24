import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class that reads and writes JSON files.
 */
public class JsonManager {

    /**
     * Constructor of the JsonManager.
     */
    public JsonManager(){
    }

    /**
     * Reads the JSON with locations and retrieves a list.
     * @return a location.
     */
    public Location readJsonLocations(String locations){
        Location finalLocation = null;

        ArrayList<String> jsonLocations = new ArrayList<>();

        JSONParser parser = new JSONParser();

        try {
            JSONObject jsonObject = (JSONObject) parser.parse(locations);
            // Retrieve region
            JSONObject locationRegion = (JSONObject) jsonObject.get("region");
            //get the region name
            String regionName = (String) locationRegion.get("name");


            // loop locations array to retrieve location names
            JSONArray locationNames = (JSONArray) jsonObject.get("names");
            Iterator<String> iteratorNames = locationNames.iterator();
            while (iteratorNames.hasNext()) {
                Object slide = iteratorNames.next();
                JSONObject jsonObject2 = (JSONObject) slide;

                //get the name
                String locationName = (String) jsonObject2.get("name");

                //get the language
                JSONObject language = (JSONObject) jsonObject2.get("language");
                String languageName = (String) language.get("name");

                jsonLocations.add(locationName + " - " + languageName);
            }
            finalLocation = new Location(jsonLocations, regionName);
        }
        catch (ParseException e) {
            return null;
        }
        catch (NullPointerException e) {
            return null;
        }
        return finalLocation;
    }

    /**
     * Reads the JSON with Pokemons and retrieves a list.
     * @return a Pokemon.
     */
    public Pokemon readJsonPokemon(String pokemon) {
        Pokemon pokemon1 = null;
        JSONParser parser = new JSONParser();
        try {
            JSONObject jsonObject = (JSONObject) parser.parse(pokemon);
            long id = (long) jsonObject.get("id");
            String name = (String) jsonObject.get("name");
            long height = (long) jsonObject.get("height");
            long weight = (long) jsonObject.get("weight");
            String nameType;

            // loop locations array
            JSONArray pokemonType = (JSONArray) jsonObject.get("types");
            Iterator<String> iterator = pokemonType.iterator();
            while (iterator.hasNext()) {
                Object slide = iterator.next();
                JSONObject jsonObject2 = (JSONObject) slide;
                JSONObject pokemonType2 = (JSONObject) jsonObject2.get("type");
                nameType = (String)pokemonType2.get("name");
                pokemon1 = new Pokemon(id, name, height, weight, nameType);
            }
        } catch (ParseException e) {

            return null;
        }
        catch (NullPointerException e) {
            return null;
        }
        return pokemon1;
    }

    /**
     * Reads the JSON type of a pokemon.
     * @param type
     * @return
     */
    public ArrayList<Type> readJsonPokemonType(String type) {
        ArrayList<Type> weaknessAndStrength = new ArrayList<>();
        JSONParser parser = new JSONParser();
        try {
            JSONObject jsonObject = (JSONObject) parser.parse(type);
            JSONObject damageRelations = (JSONObject) jsonObject.get("damage_relations");
            String damage;
            // loop locations array
            for (int index = 0; index < Damage.TYPES.length; index++) {
                JSONArray noDamTo = (JSONArray) damageRelations.get(Damage.TYPES[index]);
                Iterator<String> iterator = noDamTo.iterator();
                while (iterator.hasNext()) {
                    Object slide = iterator.next();
                    JSONObject jsonObject2 = (JSONObject) slide;
                    damage = (String) jsonObject2.get("name");
                    weaknessAndStrength.add(new Type(Damage.TYPES[index], damage));
                }
            }
        } catch (ParseException e) {
            return null;
        }
        catch (NullPointerException e) {
            return null;
        }

        return weaknessAndStrength;
    }
}