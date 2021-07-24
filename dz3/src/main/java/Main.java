import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>();
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new Apple(1));
        apples.add(new Apple(2));
        apples.add(new Apple(3));
        appleBox.setFruitList(apples);

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange(2.5f));
        orangeBox.addFruit(new Orange(4.5f));

        System.out.println("Apple Box Weight = " + appleBox.getWeight());
        System.out.println("Orange Box Weight = " + orangeBox.getWeight());
    }

    public static void changeArrElements(Object[] array, int a, int b) {
        System.out.println(Arrays.toString(array));
        Object tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }


}
