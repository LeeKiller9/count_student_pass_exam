import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //enter size of array
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);

        //enter value for each element in array
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        //enter value for each element in array
        int count = 0;
        System.out.print("List of mark: ");
        for (int k : array) {
            System.out.print("\t" + k);
            if (k >= 5 && k <= 10) {
                count++;
            }
        }
        System.out.print("\nThe number of students passing the exam is " + count);
    }
}