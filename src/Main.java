public class Main {
    public static void main(String[] args) {
    Person [] persons={new Programmer("Azat"),new Singer("Aigul"),new Dancer("Zhibek")};
        for (Person person:persons) {
            System.out.println(person);
            person.walk();
        }
    }
}