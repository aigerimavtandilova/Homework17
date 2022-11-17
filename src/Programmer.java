public class Programmer extends Person{
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println(getName()+"  is walking in the park.");
    }
}
