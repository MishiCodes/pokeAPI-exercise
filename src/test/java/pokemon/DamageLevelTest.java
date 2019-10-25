package pokemon;

import org.junit.Test;

import pokemon.DamageLevel;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class DamageLevelTest {
    @Test
    public void enumToListNotEmpty(){
        List<String> damage = DamageLevel.damageList();

        assertTrue(damage.size() > 0);
    }

    @Test
    public void enumValueOfTrue(){
        String legend = "NO_DAMAGE_TO";
        String damage = DamageLevel.valueOf(legend).toString();

        assertEquals("Weak against", damage);
    }
}