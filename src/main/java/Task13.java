import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку из слов, разделенных пробелами(кириллица+латиница): ");
        String str = scanner.nextLine();
        System.out.println("Вы ввели: " + str);


        Pattern pattern = Pattern.compile("[a-zA-Z,\\s]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String newString = str.substring(matcher.start(), matcher.end());
            System.out.print(newString);
        }

    }

}
