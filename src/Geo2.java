import org.junit.Test;

import static javax.swing.SwingConstants.NORTH_EAST;
import static javax.swing.SwingConstants.NORTH_WEST;
import static junit.framework.TestCase.assertEquals;

public class Geo2 {
    private static String pozone;

    @Test
    public void testthatstate() {
        Geo2 politicalzone = Geo2.pozone("Kastina");
        assertEquals(NORTH_WEST, politicalzone);

    }

    private static Geo2 pozone(String kastina) {
        return null;
    }
}



