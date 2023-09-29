import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int itemCost = 0;
        double tax = 0.02;
        double itemWithTax;
        System.out.println("How much does your item cost?");
        itemCost = scan.nextInt();
        itemWithTax = itemCost * tax;

        if (itemCost <= 100) {
            System.out.println("Your total cost is: $" + (itemCost + itemWithTax));
        }
        else {
            System.out.println("Your total cost is: $" + itemCost);
        }
    }
}