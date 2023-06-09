
public class Task12 {
    public static void main(String[] args) {
        String string = "I like Java!!!";

        Boolean containString = string.contains("Java");
        System.out.println("Строка содержит подстроку “Java”: " + containString);

        Boolean startString = string.startsWith("I like");
        System.out.println("Строка начинается с подстроки “I like”: " + startString);

        Boolean endString = string.endsWith("!!!");
        System.out.println("Строка заканчивается подстрокой “!!!”: " + endString);

        if (containString & startString & endString) {
            String upperString = string.toUpperCase();
            System.out.println("Строка в верхнем регистре: " + upperString);

        }
        String newString = string.replace('a', 'o').substring(7,11);
        System.out.println("Новая строка: " + newString);

    }
}
