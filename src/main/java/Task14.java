
public class Task14 {
    public static void main(String[] args) {

        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 41) - 20);
            System.out.println(array[i]);
        }
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Максимальное число массива: " + max);

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Минимальное число массива: " + min);

        int maxModule = Math.max(Math.abs(max), Math.abs(min));
        System.out.println("Максимальное число массива по модулю: " + maxModule);
    }
}
