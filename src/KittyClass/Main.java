package KittyClass;


public class Main {
    public static void main(String[] args) {
        Kitty myKitty = new Kitty("Fifi", 3);

        System.out.printf("My Kitty %s is %d%n", myKitty.getName(), myKitty.getAge());

        System.out.println("getName method  : " + myKitty.getName());
        myKitty.setName("Elle");
        System.out.println("setName method  : " + myKitty.getName());
        System.out.println("getAge method   : " + myKitty.getAge());
        myKitty.setAge(myKitty.getAge() + 1);
        System.out.println("setAge method   : " + myKitty.getAge());
        System.out.print("meow method     : ");
        System.out.println(myKitty.meow());
    }
}
