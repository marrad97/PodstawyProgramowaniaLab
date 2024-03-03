import java.sql.SQLOutput;

public class Zajecia1 {

    public static void main(String[] args) {
        int x = 5;
        int y = 20;

        double sum = x + y;
        double sub = x - y;
        double multi = x * y;
        double div = x / y;

        System.out.println("Zadanie pierwsze");
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);

        System.out.println("Zadanie drugie");
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum2 = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[5] + numbers[6] + numbers[7]
                + numbers[8] + numbers[9];

        System.out.println("Średnia wynosi: "+sum2/numbers.length);


        System.out.println("Zadanie trzecie");
        if (sum % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Nieparzysta");
        }

        System.out.println("Zadanie czwarte");

    }

}
