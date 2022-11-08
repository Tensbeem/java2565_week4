//1.Java if
public class IfElseStatement {
    public static void testIf(){
        int number = 10;
        if(number < 0){
            System.out.println("The number is negative");
        }
        System.out.println("Statement outside if block");
    }

    //2.Java if
    public static void testIfelse() {
        String language = "java";

        if (language == "java") {
            System.out.println("Java Programming");
        }
    }

    //3.Java if
    public static void testIfelse2(){
        int number = -10;
        if(number > 0){
            System.out.println("The number is positive");
        }
        if(number < 0){
            System.out.println("Statement outside if..else block");
        }
    }

    //4.Java if..else..if
    public static void testIfelseIfelse(){
        String day = "Monday";
        if(day == "Sunday"){
            System.out.println("Sunday");
        }
        else if(day == "Monday"){
            System.out.println("Monday");
        }
        else{
            System.out.print("ERROR Day");
        }
    }

    public static void nestedIfelse(){
        int age = 25;
        int weight = 48;

        if(age >= 18){
            if(weight > 50){
                System.out.println("You are eligble to donate blood");
            }else{
                System.out.println("Age must be greater than 18");
            }
        }
    }
}