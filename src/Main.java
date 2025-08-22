import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Max of 15 and 23: " + findMaximum(15, 23));
        System.out.println("Max of 100 and 50: " + findMaximum(100, 50));
        System.out.println("Max of -5 and -10: " + findMaximum(-5, -10));
    }
    public static int findMaximum(int a, int b) {
        int max = (a > b) ? a : b;
        return max;
    }
}
