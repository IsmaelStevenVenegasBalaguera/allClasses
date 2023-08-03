package Class4Java;


import java.util.Scanner;

public class Ex5Class4input {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner input=new Scanner(System.in);
        String name= input.nextLine();
        System.out.println("Hello "+ name);
    }
}
