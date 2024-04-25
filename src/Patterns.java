public class Patterns {
    public static void main(String[] args) {
        /***
         * === ***** ===
         * === ****  ===
         * === ***   ===
         * === **    ===
         * === *     ===
         * */

        for (int i = 5; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        /***
         * === *     ===
         * === **    ===
         * === ***   ===
         * === ****  ===
         * === ***** ===
         * */

        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("===================3===================");
        /***
         *  *****
         *  *****
         *  *****
         *  *****
         *  *****
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("===================4===================");
        /***
         *      *
         *     **
         *    ***
         *   ****
         *  *****
         */

        int i, j, row = 6;
//Outer loop work for rows
        for (i = 0; i < row; i++) {
//inner loop work for space
            for (j = 2 * (row - i); j >= 0; j--) {
//prints space between two stars
                System.out.print(" ");
            }
//inner loop for columns
            for (j = 0; j <= i; j++) {
//prints star
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }

}
}
