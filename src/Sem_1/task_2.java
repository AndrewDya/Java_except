package Sem_1;

public class task_2 {
    public static void main(String[] args) {
        int[] array1 = {5, 8, 12, 6};
        int[] array2 = {3, 6, 8, 2, 10};

        int[] difference = calculateDifference(array1, array2);

        if (difference != null) {
            System.out.println("Разности элементов массивов:");
            for (int j : difference) {
                System.out.println(j);
            }
        } else {
            System.out.println("Длины массивов не равны.");
        }
    }

    public static int[] calculateDifference(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return null;
        }

        int[] difference = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            difference[i] = array1[i] - array2[i];
        }

        return difference;
    }
}
