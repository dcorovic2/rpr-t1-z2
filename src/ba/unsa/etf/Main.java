package ba.unsa.etf;

import java.util.Scanner;

public class Main {
    public static int sumaCifara(int x){
        int suma = 0;

        while(x > 0){
            int cifra = x%10;
            suma += cifra;
            x /= 10;
        }

        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Unesite broj n: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();

        for (int i = 1; i < n; i++) {
            if(i%sumaCifara(i) == 0) System.out.println(i);
        }
    }
}
