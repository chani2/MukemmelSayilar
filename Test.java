import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Bir sayi giriniz : ");
        int n = input.nextInt();

        int toplam = 0;

        for (int i = 1; i < n; i++){

            if (n%i==0){

                toplam+=i;
                System.out.println(i);
            }

        }
        if (toplam==n)
            System.out.println("Girdiginiz sayi mukemmel sayidir.");
        else
            System.out.println("Girdiginiz sayi mukemmel sayi degildir.");
    }
}