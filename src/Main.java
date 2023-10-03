import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int l, N, k;
        double S;
        Scanner skan = new Scanner(System.in);
        System.out.print("l = ");
        l = skan.nextInt();
        System.out.print("N = ");
        N = skan.nextInt();
        S = 0;
        k = l;
        while (k <= N) {
            S += 1+Math.sqrt(1+Math.pow(k, 2)) / Math.pow(k, 2);
            k++;
        }
        System.out.println(S);
        S = 0;
        k = l;
        do {
            S += 1+Math.sqrt(1+Math.pow(k, 2)) / Math.pow(k, 2);
            k++;
        } while (k <= N);
        System.out.println(S);
        S = 0;
        for (k = l; k <= N; k++) {
            S += 1+Math.sqrt(1+Math.pow(k, 2)) / Math.pow(k, 2);
        }
        System.out.println(S);
        S = 0;
        for (k = N; k >= l; k--) {
            S += 1+Math.sqrt(1+Math.pow(k, 2)) / Math.pow(k, 2);
        }
        System.out.println(S);
    }
}
