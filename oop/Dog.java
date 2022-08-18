package oop;

public class Dog {
    private String dog_name;
    private int dog_age;
    private String dog_like;

    Dog(String dog_name, int dog_age, String dog_like) {
        this.dog_name = dog_name;
        this.dog_age = dog_age;
        this.dog_like = dog_like;
    }
    String name() {
        return "我是" + this.dog_name;
    }
    String age() {
        return "我的年龄是" + this.dog_age;
    }
    String like() {
        return "我的爱好是" + this.dog_like;
    }

    public static void main(String[] args) {
        Dog my_dog = new Dog("dog", 3, "看书");
        System.out.println(my_dog.name());
        System.out.println(my_dog.age());
        System.out.println(my_dog.like());
    }
}
