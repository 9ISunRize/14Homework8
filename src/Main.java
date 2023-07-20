public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] array1 = {1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        int[] myArray = new int[3];
        myArray[0] = 16;
        myArray[1] = 21;
        myArray[1] = 25;

    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] array1 = {1, 2, 3};
        for (int i = 0; i < array1.length; i++) {
            if (i == array1.length - 1) {
                System.out.print(array1[i]);
            } else {
                System.out.print(array1[i] + ",");
            }
        }
        System.out.println(" ");
        double array2[] = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < array2.length; i++) {
            if (i == array1.length - 1) {
                System.out.print(array2[i]);
            } else {
                System.out.print(array2[i] + ",");
            }
        }
        System.out.println(" ");
        int[] myArray = new int[]{16, 21, 25,};
        for (int i = 0; i < myArray.length; i++) {
            if (i == array1.length - 1) {
                System.out.print(myArray[i]);
            } else {
                System.out.print(myArray[i] + ",");
            }
        }
        System.out.println(" ");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] array1 = {1, 2, 3};
        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array1[i]);
            } else {
                System.out.print(array1[i] + ",");
            }
        }
        System.out.println(" ");
        double[] array2 = new double[]{1.57, 7.654, 9.986};
        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array2[i]);
            } else {
                System.out.print(array2[i] + ",");
            }
        }
        System.out.println(" ");
        int[] myArray = new int[]{16, 21, 25,};
        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.print(myArray[i]);
            } else {
                System.out.print(myArray[i] + ",");
            }
        }
        System.out.println(" ");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] array1 = {1, 2, 3};
        for (int i = 0; i < 3; i++) {
            if (array1[i] % 2 != 0) {
                array1[i] = array1[i] + 1;
            }
            System.out.println(array1[i]);
        }
    }
}