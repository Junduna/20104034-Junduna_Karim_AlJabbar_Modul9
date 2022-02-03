package Modul9.Praktikum;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleException {
    public static void main(String[] args) {

        try {
            System.out.println(5/0); // Arithmatic Error

            int array1[] = {1, 2};
            System.out.println("Array");
            for (int i = 0; i <= array1.length; i++) { //Array Index Out Of Bounds Exception
                System.out.println(array1[i]);
            }

            Scanner scanner = new Scanner(System.in);
            System.out.print("Input Angka\t: ");
            int input = scanner.nextInt(); //InputMismatchException
            System.out.println(input);

            fileCall(); //FileNotFoundException

        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Bilangan tidak boleh dibagi 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Tidak ada index tersebut di Array");
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("Bukan Angka");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("File- nya kagak ketemu !");
        } finally {
            System.out.println("Jalanin aja");
            System.out.println("Apapun yang terjadi !");
        }
    }

    public static void fileCall() throws
            FileNotFoundException {
        throw new FileNotFoundException("File Tidak Ada");
    }
}
