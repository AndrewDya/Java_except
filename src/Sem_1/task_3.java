package Sem_1;

public class task_3 {
    public static void main(String[] args) {
        int[] array1 = {10, 8, 12, 6};
        int[] array2 = {2, 4, 6, 3};

        try {
            int[] division = calculateDivision(array1, array2);

            System.out.println("Частные элементов массивов:");
            for (int j : division) {
                System.out.println(j);
            }
        } catch (RuntimeException e) {
            System.out.println("Длины массивов не равны или обнаружено деление на ноль.");
            e.printStackTrace();
        }
    }

    public static int[] calculateDivision(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Длины массивов не равны.");
        }

        int[] division = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            if (array2[i] == 0) {
                throw new RuntimeException("Обнаружено деление на ноль.");
            }
            division[i] = array1[i] / array2[i];
        }

        return division;
    }
}
