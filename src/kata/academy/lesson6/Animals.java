package kata.academy.lesson6;

// 2.1.5 Практическое задание «Объявление класса»

class Animals {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik");
        Dog lili = new Dog("Lili");
        lili.catchCat(barsik);
    }

    public static class Cat {
        public String name;
        public String voice = "Мяу!";

        public Cat(String name) {
            this.name = name;
        }

        public void sayHello() {
            System.out.println(this.name + " " + voice);
        }
    }

    public static class Dog extends Cat {

        public Dog(String name) {
            super(name);
            voice = "Гав!";

        }

        public void catchCat(Cat name) {
            System.out.println("Кошка поймана");
            sayHello();
            name.sayHello();
        }
    }
}

