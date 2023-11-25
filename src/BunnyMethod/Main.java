package BunnyMethod;


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

        displayInfo(myBunny);

        System.out.println();
        feed(myBunny, "bread", "carrots", "carrot cake");
        System.out.println();
        play(myBunny);
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
        System.out.println(bunny.name + " is a " + bunny.age + " year old bunny.");
    }

    public static void haveBirthday(Bunny bunny) {
        bunny.age++;
    }

    public static void changeName(Bunny bunny, String newName) {
        bunny.name = newName;
    }

    public static void feed(Bunny bunny, String appetizers, String mainCourse, String dessert) {
        bunny.eat(appetizers);
        bunny.eat(mainCourse);
        bunny.eat(dessert);
    }

    public static void play(Bunny bunny) {
        bunny.hop();
        bunny.eat("lettuce");
        bunny.eat("carrots");
        bunny.sleep();
    }

}
