package Class4Java;

public class Ex2class4Java {
    public static void main(String[] args) {
        double mortgageRate=4.3;
        double mortgagePrice=45000;

        if (mortgageRate<=4.5){
            System.out.println("You can now buy a house");
            if (mortgagePrice>=50000){
                System.out.println("You can take a loan");
            }
            else{
                System.out.println("you need to pay in cash");
            }

        }
        else{
            System.out.println("You can not consider buying a house at this point");
        }

    }
}
