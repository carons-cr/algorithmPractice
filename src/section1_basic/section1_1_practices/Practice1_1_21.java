package section1_basic.section1_1_practices;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Practice1_1_21 {
    public static void main(String[] args) {
        Practice1_1_21.makeScoreTable();
    }

    private static void makeScoreTable() {
        Scanner scanner = new Scanner(System.in);
        String[][] table = new String[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = scanner.next();
            }
            DecimalFormat decimalFormat = new DecimalFormat(".000");
            table[i][3] = decimalFormat.format(Double.parseDouble(table[i][1])/Double.parseDouble(table[i][2])) + "";
        }

        System.out.println("name\tmath\tenglish\t\tmath/english");
        for (String[] row : table) {
            System.out.println(row[0] + "\t\t" + row[1] + "\t\t" + row[2] + "\t\t\t" + row[3]);
        }
    }
}
