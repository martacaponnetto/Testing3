/*Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
Formatta la data ottenendo 01 marzo 2023
Stampa sulla console
Fai attenzione a usare almeno Java 8
Crea dei test per questo esercizio*/

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.println(formatDate(data));
    }
    public static String formatDate(OffsetDateTime data){
        DateTimeFormatter formatterMedium = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        String formattedMedium = data.format(formatterMedium);
        return formattedMedium;



    }
}

