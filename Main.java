import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String str = sc.nextLine();

        int[] frequency = new int[256];

        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }

        
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                System.out.println((char)i + " = " + frequency[i]);
            }
        }

        sc.close();
    }
}