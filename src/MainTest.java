import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main = new Main();



    @Test
    void testFormatDate() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String result = main.formatDate(data);
        assertEquals("01-marzo-2023", result);


    }
}