import java.util.Scanner;

public class Task330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of stores: ");
        int numStores = sc.nextInt();

        if (numStores < 1) {
            System.out.println("The number of stores must be at least 1.");
        } else {
            int totalAllItems = 0;
            int mostItems = -1;      // -1: the first store is always recorded
            int bestStore = 0;
            int storeNo = 1;

            while (storeNo <= numStores) {
                int numCustomers;
                do {
                    System.out.print("Enter the number of customers in store " + storeNo + ": ");
                    numCustomers = sc.nextInt();
                    if (numCustomers < 0) {
                        System.out.println("Must not be negative. Retry!");
                    }
                } while (numCustomers < 0);

                int storeItems = 0;

                for (int c = 1; c <= numCustomers; c++) {
                    int items;
                    do {
                        System.out.print("  Items bought by customer " + c + ": ");
                        items = sc.nextInt();
                        if (items < 0) {
                            System.out.println("  Must not be negative. Retry!");
                        }
                    } while (items < 0);
                    storeItems += items;
                }

                System.out.println("Store " + storeNo + " - customers: " + numCustomers
                        + ", total items: " + storeItems);

                totalAllItems += storeItems;

                if (storeItems > mostItems) {
                    mostItems = storeItems;
                    bestStore = storeNo;
                }

                storeNo++;
            }

            System.out.println("Total items across all stores: " + totalAllItems);
            System.out.println("Store with the most items: " + bestStore);
        }
        sc.close();
    }
}