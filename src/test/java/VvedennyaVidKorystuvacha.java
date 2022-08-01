import java.util.Scanner;

public class VvedennyaVidKorystuvacha {

    public static void main(String[] args) {

//   Scanner -  це класс який вбудований в java і він використ. для того щоб отримувати інформацію від користувача(те що ми вводим)
//              він викорис елемент System.in який вводить данні в програму.

        System.out.println("Enter you name...");
        Scanner mijSkan = new Scanner(System.in);
        System.out.println("Hello, " + mijSkan.nextLine());

        System.out.println("Enter your year of birth...");
        int age = 2021 - mijSkan.nextInt();
        System.out.print("Your age: ");
        System.out.println(age);
        System.out.print(" years  :)");
    }
}
