package ru.less3;

public class Human implements Competitable{
    private String name;
    private int age;
    private int jumpHeight;
    private int runlength;


    public Human(String name, int age, int jumpHeight, int runlength) {
        this.name = name;
        this.age = age;
        this.jumpHeight = jumpHeight;
        this.runlength = runlength;
    }
    public void infoHuman(){
        System.out.println("name " + name + ", " + "age " + age + "." );
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void jump(int height) {
        if (height > jumpHeight){
            System.out.println("Я человек, я не смог перепрыгнуть!");
        } else {
            System.out.println("я человек, я смог перепргнуть!");
        }

    }

    @Override
    public void run(int length) {
        if (length > runlength){
            System.out.println("Я человек, я не смог пробежать ((");
        } else {
            System.out.println("я человек, я смог пробежать!");
        }

    }
}

