import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        Person[] people = new Person[3];
        people[0] = new Person("John");
        people[1] = new Person("Daniel");
        people[2] = new Person("Raj");

        Person dn = new Person("Fernando");
        Person[] newperson = addPerson(people, dn);

        System.out.println(people[3].getName());
    }

    public static Person[] addPerson(Person[] people, Person person){
        Person[] extraPerson = new Person[people.length + 1];
        for (int i = 0; i < people.length; i++){
            extraPerson[i] = people[i];
        }
        extraPerson[extraPerson.length - 1] = person;
        return extraPerson;
    }
}
