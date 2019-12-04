import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 5;
        Scanner input = new Scanner(System.in);
        int a[] = new int[ARRAY_LENGTH];

        int count = 0;
        int x = 0;
        int num = 0;

        System.out.println("Enter five numbers, each between 10 and 100:");
        while (x < a.length) {
            System.out.println("Enter number: ");
            num = input.nextInt();

            if ((num >= 10) && (num <= 100)) {
                boolean digit = false;
                x++;
                for (int i = 0; i < a.length; i++) {
                    if (a[i] == num)
                        digit = true;
                }
                if (!digit) {
                    a[count] = num;
                    count++;
                } else{
                    System.out.printf("the number was entered before \n");
                }
            } else {
                System.out.println("number must be between 10 and 100");
            }

            for (int i = 0; i < x; i++) {
                if (a[i] != 0){
                    System.out.print(a[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
