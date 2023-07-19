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
        int nomber1 = array1[0];
        array1[1] = 2;
        int nomber2 = array1[1];
        array1[2] = 3;
        int nomber3 = array1[2];
        System.out.print(array1[0] + ",");
        System.out.print(array1[1] + ",");
        System.out.println(array1[2] + " ");
        double array2[] = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < 2; i++) {
            System.out.print(array1[i] + ",");
        }
        System.out.println(array2[2] + " ");


        int[] myArray = new int[]{16, 21, 25,};
        for (int i = 0; i < 2; i++) {
            System.out.print(myArray[i] + ",");
        }
        System.out.println(myArray[2] + " ");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] array1 = {1, 2, 3};
        int nomber1 = array1[0];
        array1[1] = 2;
        int nomber2 = array1[1];
        array1[2] = 3;
        int nomber3 = array1[2];
        System.out.print(array1[2] + ",");
        System.out.print(array1[1] + ",");
        System.out.println(array1[0] + " ");

        double[] array2 = new double[]{1.57, 7.654, 9.986};
        for (int i = 2; i >= 1; i--) {
            System.out.print(array2[i] + ",");
        }
        System.out.println(array2[0] + " ");

        int[] myArray = new int[]{16, 21, 25,};
        for (int i = 2; i >= 1; i--) {
            System.out.print(myArray[i] + ",");
        }
        System.out.println(myArray[0] + " ");

        System.out.println(" ");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] array1 = {1, 2, 3};
        int nomber1 = array1[0];
        array1[1] = 2;
        int nomber2 = array1[1];
        array1[2] = 3;
        int nomber3 = array1[2];
        for (int i = 0; i < 3; i++) {
            if (array1[i] % 2 != 0) {
                array1[i] = array1[i] + 1;
            }
            System.out.println(array1[i]);
        }
    }
}