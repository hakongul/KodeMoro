import model.Person;

import java.util.Arrays;
import java.util.List;

public class KodeMoroJava7 {

    public static void main(String[] args) {
        List<Person> personer = Arrays.asList(
                new Person("Buzz", "Aldrin", 88),
                new Person("Neil", "Armstrong", 82),
                new Person("Jurij", "Gagarin", 34),
                new Person("Alan", "Shepard", 66),
                new Person("Jim", "Lovell", 90),
                new Person("Chris", "Hadfield", 58),
                new Person("Sally", "Ride", 61),
                new Person("Valentina", "Teresjkova", 81)
        );


        //Del 1 - Java 7 style
        //1.1: Sorter listen etter etternavn

        //1.2: Lag en metode som printer alle elementene i listen

        //1.3: Utvid print metoden til å benytte seg av vilkår (Condition) slik at man kan filtrere hva som printes
        // Print for eksempel ut alle med fornavn som starter på en bokstav eller som er over en gitt alder etc.
    }
}
