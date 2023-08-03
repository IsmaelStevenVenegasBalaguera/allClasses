package Class4Java;

import java.util.Scanner;

public class Ex6Impo {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        if(name.equals("Steven")){
        System.out.println("Java Master");
        }
        else{
            System.out.println("I don't know you");
        }
        System.out.println("Welcome back "+ name);
    }
}
