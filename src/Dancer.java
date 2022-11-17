public class Dancer extends Person{
    public Dancer(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println(getName()+"  is walking down the street.");
    }
}
