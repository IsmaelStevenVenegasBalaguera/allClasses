package Class4Java;

public class Ex1class4 {
    public static void main(String[] args) {
        boolean diploma=false;
        double gpa=3.4;


        if (diploma==true){
            System.out.println("Congratulations");
            if (gpa>3.5){

                System.out.println("You are eligible for scholarship");

            }
            else {
                System.out.println("You should have studies harder");
            }

        }
        else {
            System.out.println("Get a degree");
        }
    }
}
