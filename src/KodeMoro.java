import model.Person;

import java.util.Arrays;
import java.util.List;

public class KodeMoro {

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

        //1.3: Lag en metode som printer alle personene med fornavn som begynner på gitt bokstav



        //Del 2 - Java 8 style
        //2.1: Sorter listen etter etternavn

        //2.2: Lag en metode som printer alle elementene i listen

        //2.3: Lag en metode som printer alle personene med fornavn som begynner på gitt bokstav
    }
}
