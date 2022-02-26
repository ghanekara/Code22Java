package week1;

import java.time.LocalDateTime;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }
    String name;
    LocalDateTime birthdate;
    Sex gender;
    String emailAddress;

    public int getAge(){
        LocalDateTime dt = LocalDateTime.now();
        dt.minusYears(birthdate.getYear());
       return dt.getYear();
    }

    public void setBirthdate(){
        birthdate= LocalDateTime.of(1990,11,24,0,0,0);
    }

}
