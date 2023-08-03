package Class4Java;

public class class4 {
    public static void main(String[] args) {
        boolean winter=true;
        String jacketColor= "red";
        String tShirt= "white";

        if(winter==false){
            System.out.println("it's very cold");
            if (jacketColor.equals("blue")){
                System.out.println("lets go wih Red Nike shoes");
            } else{
                System.out.println("let's go with the White shoes");
            }
        } else {
            System.out.println("no need to wear jackets");
        }
    }
}
