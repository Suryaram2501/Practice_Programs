import java.util.Scanner;

public class palindrome_02 {
    public static void main(String[] args) {

        for (int x=0;x<5;x++) {
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            String rev = "";
            for (int i = name.length() - 1; i >= 0; i--) {
                rev = rev + name.charAt(i);
            }
            if (rev.equalsIgnoreCase(name))
                System.out.println("Given name is a palindrome");
            else
                System.out.println(("Given name is not a palindrome"));

        }
    }
}
