public class GamingReport {
    public static void main(String[] args) {
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };
        int[] totalSales = new int[3];

        System.out.println("---------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-20s %-10s %-10s %-10s\n", "", "PS5", "XBOX", "SWITCH");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < 3; i++) {
            System.out.printf("%-20s %-10d %-10d %-10d\n", cities[i], sales[i][0], sales[i][1], sales[i][2]);
            totalSales[i] = sales[i][0] + sales[i][1] + sales[i][2];
        }

        System.out.println("---------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("---------------------------------------------------------------");
        int maxIndex = 0;
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-20s %d\n", cities[i], totalSales[i]);
            if (totalSales[i] > totalSales[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + cities[maxIndex]);
        System.out.println("---------------------------------------------------------------");
    }
}
