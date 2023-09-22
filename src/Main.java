import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Пожалуйста, введите текст: ");
        String plaintext = scanner.nextLine();
        int shift = 3;

        String encryptedText = CaesarCipher.encrypt(plaintext, shift);
        String decryptedText = CaesarCipher.decrypt(encryptedText, shift);

        System.out.println("Исходный текст: " + plaintext);
        System.out.println("Зашифрованный текст: " + encryptedText);
        System.out.println("Дешифрованный текст: " + decryptedText);
    }
}
