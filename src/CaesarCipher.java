public class CaesarCipher {

    // Метод для шифрования текста с использованием шифра Цезаря
    public static String encrypt(String text, int shift) {
        StringBuilder encryptedText = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) { // Проверяем, является ли символ буквой
                char base = Character.isUpperCase(c) ? 'A' : 'a'; // Определяем базовую букву (верхний или нижний регистр)
                char encryptedChar = (char) (base + (c - base + shift) % 26); // Шифруем символ с учетом сдвига
                encryptedText.append(encryptedChar); // Добавляем зашифрованный символ к результату
            } else {
                encryptedText.append(c); // Если символ не является буквой, оставляем его без изменений
            }
        }

        return encryptedText.toString(); // Возвращаем зашифрованный текст
    }

    // Метод для дешифрования текста, зашифрованного шифром Цезаря
    public static String decrypt(String encryptedText, int shift) {
        return encrypt(encryptedText, 26 - shift); // Дешифрование - это обратный сдвиг
    }
}
