import java.util.Arrays;

public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int days = arr.length;
        // Example-1
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");


        // Example-2
        Arrays.sort(arr);
        System.out.println("Минимальная сумма трат за день составила " + arr[0] + " рублей. " +
                "Максимальная сумма трат за день составила " + arr[arr.length - 1] + " рублей");

        // Example-3
        double srSum = sum / days;
        System.out.println("Средняя сумма трат за месяц составила " + srSum + " рублей.");

        // Example-4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }





}