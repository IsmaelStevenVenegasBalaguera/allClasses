package Class4Java;

public class Ex3Class4Java {
    public static void main(String[] args) {
        int age=18;
        double weight=50;

        if (age>=18){
            System.out.println("Congratulations You have the appropriate age to donate blood");
            if (weight>=55){
                System.out.println("Congratulations you also have the right weight conditions, we will call you soon");

            }
            else {
                System.out.println("but unfortunately you are under the safe weight to donate");
            }
        }
        else {
            System.out.println("Sorry, only once you are 18 or older you will be allowed to vote and donate blood");
        }
    }
}
