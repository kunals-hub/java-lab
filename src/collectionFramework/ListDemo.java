package collectionFramework;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// unique list = set

public class ListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("List size : " + list.size());

        System.out.println("How many items you want to enter : ");
        int item =  sc.nextInt();

        for (int i = 0; i < item; i++) {
            System.out.println("Enter element : " + (i + 1) + " item");
            System.out.println("List size : " + list.size());
            list.add(sc.nextInt());
        }

        System.out.println("List size : " + list.size());

        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        System.out.println("sum of " + list.size() + " item is " + sum);
        sc.close();
    }
}
