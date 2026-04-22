package lab_assignment_09.unit3.task2;

import java.util.Scanner;

class ExceptionDemo {

    public void performOperation() {

        Scanner sc = new Scanner(System.in);

        int arr[] = {10, 20, 30};

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        System.out.print("Enter number to divide: ");
        int num = sc.nextInt();

        int result = arr[index] / num;

        System.out.println("Result: " + result);

        sc.close();
    }
}
