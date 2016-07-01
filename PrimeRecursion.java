import java.util.Scanner;

/**
 * Created by HarryJohnson on 1/07/2016.
 */
public class PrimeRecursion {

    public static boolean primeCheck(int i, boolean result, int n) {
        if (i == 1) {
        }
        else if (i % n == 0) {
            result = false;
        }

        if(i == 4 || i == 1){
            result = false;
        }
        else if(i == 2){
            result = true;
        }
        else if (n > 3 && result) {
            result = primeCheck(i, result, n - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a positive integer to find if it is a prime:");
        int input = keyboard.nextInt();
        boolean result = true;
        result = primeCheck(input, result, input - 1);
        System.out.println(result);
    }
}