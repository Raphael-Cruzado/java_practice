package AaPractice;


public class Main {
    public static void main(String[] args) {
        Bunny myBunny = new Bunny();
        Bunny yourBunny = new Bunny();

        myBunny.setName("Flopsy");
        myBunny.setAge(3);

        yourBunny.setName("Mopsy");
        yourBunny.setAge(5);

        myBunny.print();
        yourBunny.print();
    }
}
