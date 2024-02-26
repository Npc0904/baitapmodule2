package bai4;

import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of row");
        int row = scanner.nextInt();
        System.out.println("Enter number of column");
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        do {

            System.out.println("==============MENU==============");
            System.out.println("1. Enter the values of array elements");
            System.out.println("2. Print out array elements");
            System.out.println("3. Display as matrix");
            System.out.println("4. Print main diagonal");
            System.out.println("5. Print out sub-diagonal");
            System.out.println("6. Print to border");
            System.out.println("7. Exit program");
            System.out.println("Please chose an option");
            int chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    System.out.println("Enter value for elements of array");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.printf("Value for arr[%d][%d]:", i, j);
                            matrix[i][j] = scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Elements of the matrix is as following:");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.printf("%d\t", matrix[i][j]);
                        }
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("The matrix is as following:");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.printf("%d\t", matrix[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("The main diagonal is as following:");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            if (j == i) {
                                System.out.printf("%d\t", matrix[i][j]);
                            } else {
                                System.out.print("\t");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("The sub-diagonal is as following:");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            if (i + j == matrix.length - 1) {
                                System.out.print(matrix[i][j]);
                            } else {
                                System.out.print("\t");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            if (i == 0 || i == matrix.length - 1) {
                                System.out.print(matrix[i][j] + "\t");
                            } else if (matrix[i].length - 1 == j || j == 0) {
                                System.out.print(matrix[i][j] + "\t");
                            } else {
                                System.out.print("\t");
                            }

                            {

                            }
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again!");
                    break;
            }

        } while (true);
    }
}