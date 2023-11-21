import java.util.ArrayList;

public class TablesinArraylist {

    public static void main(String[] args) {
        // Create a nested ArrayList to store tables
        ArrayList<ArrayList<Integer>> tables = new ArrayList<>();

        // Create and populate tables for numbers 1, 2, and 3
        for (int i = 1; i <= 3; i++) {
            ArrayList<Integer> table = new ArrayList<>();
            for (int j = 1; j <= 10; j++) {
                table.add(i * j);
            }
            tables.add(table);
        }

        // Print the tables
        for (int i = 0; i < tables.size(); i++) {
            ArrayList<Integer> table = tables.get(i);
            System.out.println("Table of " + (i + 1) + ":");
            for (int j = 0; j < table.size(); j++) {
                System.out.println((i + 1) + " x " + (j + 1) + " = " + table.get(j));
            }
            System.out.println();
        }
    }
}
