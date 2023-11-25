package AaPractice;


class Main {
    // public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Bunny myBunny = makeBunny("Fluffy", 2);

        // Accessing attributes of the created Bunny
        System.out.println("Bunny Name: " + myBunny.name);
        System.out.println("Bunny Age: " + myBunny.age);

        // Calling methods of the Bunny class
        displayInfo(myBunny);
        haveBirthday(myBunny);
        changeName(myBunny, "Mopsy");

        /*
        myBunny.hop();
        myBunny.eat("carrots");
        myBunny.sleep();
        */
    }

    public static Bunny makeBunny(String name, int age) {
        // Instantiate a new Bunny object
        Bunny newBunny = new Bunny();

        // Set the attributes of the Bunny object
        newBunny.name = name;
        newBunny.age = age;

        // Return the new Bunny object
        return newBunny;
    }

    public static void displayInfo(Bunny bunny) {
        System.out.println(bunny.name + " is a 3 year old bunny.");
    }

    public static void haveBirthday(Bunny bunny) {
        bunny.age++;
    }

    public static void changeName(Bunny bunny, String newName) {
        bunny.name = newName;
    }

}
