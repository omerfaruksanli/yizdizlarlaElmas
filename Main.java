import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Basamak Sayısını Giriniz : ");
        n = input.nextInt();

        for (int i=1; i<= n; i++){
            for (int k = 1; k<= (n-i); k++){
                System.out.print(" ");
            }
            for(int j=1; j <= (2*i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
            }

        for (int i=0; i<=n-1; i++){
            for (int j=n; j>=n-i; j--){
                System.out.print(" ");

            }for (int k=1; k<(n-i-1)*2;k++){
                System.out.print("*");

            }
            System.out.println();
        }
        }

    }


