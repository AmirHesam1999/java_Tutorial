public class Main {

    public static void main(String[] args) {
        // Create variables of different data types
        int item = 50;
        float costPerItem = 9.99f;
        float totalCost = item * costPerItem;
        char currency = '$';

        // Print variables
        System.out.println("Number of items : " + item);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);
    }
}