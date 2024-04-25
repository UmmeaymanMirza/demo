public abstract class Animal {
    public String name;

    Animal(String name) {
        this.name = name;
    }

    public abstract String makeSound();

    public String getName() {
        return name;
    }


        public static void main(String[] args) {
            Animal dog = new Dog("Buddy");
            Animal cat = new Cat("Whiskers");

            System.out.println(dog.getName() +" Says "+ dog.makeSound());
            System.out.println(cat.getName() +" Says "+ cat.makeSound());

        }


}

