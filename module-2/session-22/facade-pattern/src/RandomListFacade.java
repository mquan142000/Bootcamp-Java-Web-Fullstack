import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class RandomListFacade {
    public void printRandomEvenList(int size, int min, int max) {
        RandomNumber randomNumber = new RandomNumber();
        List<Integer> evenList = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            double randomDouble = Math.random();
            int number = (int) (randomDouble * (max - min + 1) + min);
            if (number % 2 == 0) {
                evenList.add(number);
            }
        }
        evenList.forEach(System.out::println);
    }
}
