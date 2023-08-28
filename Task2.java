public class Task2 {
    public static void divideEighthElement(int[] intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[5] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Размер массива - " + intArray.length + ". Максимально возможный индекс - "
                    + (intArray.length - 1));
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        divideEighthElement(arr);
    }

}
