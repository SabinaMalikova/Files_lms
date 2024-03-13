import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*      1. Параметирине String тибинде соз алып ал созду тескерисинен кылып кайтарган метод туз.

        2. StringBuilder аркылуу создордун массивдерин алып, аларды бир сапка бириктирген метод түз.

        3. Параметирине соз алып ал создун ичинде канча ундуу тамга бар экенин эсептеген метод туз.

        4. StringBuilder жардамы менен берилген. соз палиндром экенин текшеруучу метод туз.

        5. StringBuilder аркылуу сүйлөмдөгү ар бир сөздүн биринчи тамгасын баш тамга менен жазуучу  метод туз.

        6. String жана StringBuilder жардамы менен сүйлөмдөгү сөздөрдүн санын эсептөөчу метод туз.

        7. StringBuilder аркылуу ар бир тамганын өзүнүн ASCII коду менен алмаштырган метод туз.

        8. StringBuilder аркылуу cуйломдон бардык боштуктарды (пробелдерди) алып салуучу метод туз. */


        Scanner scanner = new Scanner(System.in);

        Programs programs = new Programs();

        System.out.println("Введите слово для написания слова наоборот:");
        String word = scanner.nextLine();
        String reversedWord = programs.reverseWord(word);
        System.out.println("Результат слова: " + reversedWord);

        System.out.println("Введите слово для подсчета гласных:");
        word = scanner.nextLine();
        int vowelsCount = programs.vowelsLetter(word);
        System.out.println("Количество гласных в слове: " + vowelsCount);

        System.out.println("Введите слово для проверки на палиндром:");
        word = scanner.nextLine();
        boolean isPalindrome = programs.isPalindrome(word);
        System.out.println("Результат проверки на палиндром: " + isPalindrome);

        System.out.println("Введите предложение:");
        String sentence = scanner.nextLine();
        String capitalizedSentence = programs.upperCaseLetter(sentence);
        System.out.println("Результат написания слов с заглавной буквы: " + capitalizedSentence);

        System.out.println("Введите предложение для подсчета слов:");
        sentence = scanner.nextLine();
        int wordCount = programs.countWords(sentence);
        System.out.println("Количество слов в предложении: " + wordCount);

        System.out.println("Введите слово для замены букв на ASCII коды:");
        word = scanner.nextLine();
        String asciiWord = programs.replaceToAscii(word);
        System.out.println("Результат замены букв на ASCII коды: " + asciiWord);

        System.out.println("Введите строку для удаления пробелов:");
        String stringWithSpaces = scanner.nextLine();
        String stringWithoutSpaces = programs.deleteSpaces(stringWithSpaces);
        System.out.println("Результат удаления пробелов из строки: " + stringWithoutSpaces);
    }
}