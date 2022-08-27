import java.util.Scanner;
public class SwitchVowel {
    public static void main(String[] arg) {
        boolean isVowel = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = scanner.next().charAt(0);
        scanner.close();
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                isVowel = true;
        }
        if (isVowel == true) {
            System.out.println(ch + " is  a Vowel");
        } else {
            System.out.println(ch + " is a Consonant");
        }
    }

}