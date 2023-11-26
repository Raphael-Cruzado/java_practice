package KittyClass;

class Kitty {
    private String name;
    private int age;

    public Kitty() {
        this.age = 0;
        this.name = "Kitty";
    }

    public Kitty(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public String meow() {
        return String.format(this.age + " year old " + this.name + " says 'Meow!'");
    }
}
