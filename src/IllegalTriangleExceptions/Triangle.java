package IllegalTriangleExceptions;

import java.util.Scanner;

public class Triangle {

    private static void inputSideOfTriangle() throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Hãy nhập b: ");
        int b = scanner.nextInt();
        System.out.println("Hãy nhập c: ");
        int c = scanner.nextInt();
        if ((a + b < c)||(a + c < b) || (b + c < a) || (a < 0) || (b < 0) || (c < 0)) {
            throw new  IllegalTriangleException();
        }else {
            System.out.println("đây là 3 cạnh cảu tam giác");
        }
    }
    public static void main(String[] args) {
        try {
            inputSideOfTriangle();

        }catch (Exception i){
            System.err.println("đây ko phải 3 cạnh của tam giác");
        }

    }


}