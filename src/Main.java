import Classes.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of registration nos: ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Registration nos: ");
        List<String> R = new ArrayList<String>();
        for (int i = 0; i < num; i++) {
            R.add(sc.nextLine());
        }
        R.stream().forEach(T -> System.out.println(String.format("%15s %30s", T, Program.getResults(T))));
    }
}