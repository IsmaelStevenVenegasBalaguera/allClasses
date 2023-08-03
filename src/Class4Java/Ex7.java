package Class4Java;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please  enter your gender F/M");
        char gender=scanner.next().charAt(0);
        System.out.println("your gender is " +gender);


    }
}
