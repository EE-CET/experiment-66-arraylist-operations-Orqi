import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();

        String[] items = scanner.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            list.add(items[i]);
        }

        Collections.sort(list);

        String searchItem = scanner.nextLine();

        System.out.println("Sorted Items: " + list);

        if (list.contains(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        scanner.close();
    }
}