import org.junit.jupiter.api.Test;
import java.nio.file.Watchable;
import java.time.Clock;
//import java.time.Instant;
//import java.time.ZoneId;

//import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
import static java.lang.Integer.parseInt;
import static org.junit.jupiter.api.Assertions.assertEquals;

    public class MinutesTest {
        @Test
        public void convertsecondstominutes() {
            Minutes unit = new Minutes();
            unit.setminutes(1);
            assertEquals(60, unit.getsecond());

        }

        @Test
        public void convertminutestoSecond() {
            Minutes unit = new Minutes();
            unit.setseconds(1);
            int seconds = unit.getminutes();
            assertEquals(0, unit.getminutes());
        }


        }




