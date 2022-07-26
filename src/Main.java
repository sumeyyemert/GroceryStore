import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pear, apple, tomatoes, banana, eggplant, total;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        pear = input.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        apple = input.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        tomatoes = input.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        banana = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        eggplant = input.nextDouble();

        total = pear*2.14 + apple*3.67 + tomatoes*1.11 + banana*0.95 + eggplant*5.00;
        System.out.println("Toplam Tutar : " + total + " TL");

    }
}