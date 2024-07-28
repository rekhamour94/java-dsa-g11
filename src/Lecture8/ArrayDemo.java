package Lecture8;

public class ArrayDemo {
    public static void main(String[] args) {
        arrayDemo();

    }

    private static void arrayDemo() {
        int[] arr = new int[15];
        int[] other = arr;
        System.out.println(arr);
        System.out.println(other);
    }
}
