import java.io.FileWriter;
import java.io.IOException;

public class SdetPractice {

    public static void main( String[] args ) {

        try {

            FileWriter fw = new FileWriter("output.txt");

            String str1="";

            for (int i = 0; i < 5; i++) {
                for (int j  = 1;  j<=5-i ; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            fw.write(str1);
            fw.close();
        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }

}