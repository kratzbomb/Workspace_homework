package ru.less3;

public class Main {

    public static void main(String[] args) {


        Cat murzik = new Cat("Murz", 5,10,10);
        murzik.infoCat();
        Human misha = new Human("Misha", 20,10,10);
        misha.infoHuman();
        Robot r2d2 = new Robot("R2D2", 50,10,10);
        r2d2.infoRobot();

        Competitable[] competitors = {new Cat("Vasya", 5,3,6),
                new Human("Vova", 10,20,15), new Robot("P123", 1,30,40)};


        Overcomable[] overcomables = {new Wall(5), new Road(3)};

        for (Competitable competitable : competitors){
            for (Overcomable overcomable : overcomables){
                overcomable.overcome(competitable);
            }
        }


    }

}

