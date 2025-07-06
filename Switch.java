import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = "mango";     //sc.next();
        switch (fruit) {
            case "mango":
                System.out.println("King");
                break;

            default:
                System.out.println("idk");
                break;
            
            case "apple":
                System.out.println("doctor's nightmare");
                break;
        }

        // or a new, cleaner syntax:
        switch(fruit){
            case "mango" -> System.out.println("sweet");
            case "grape" -> System.out.println("small");
            default -> System.out.println("default");
        }


        int day = sc.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
            default:
                System.out.println("not a valid day!");
                break;
        }

        // or look how cleannn this is:
        switch(day){
            case 1,2,3,4,5 -> System.out.println("weekday");
            case 6,7 -> System.out.println("weekend");
            default -> System.out.println("not a valid day!");
        }
        sc.close();
    }
}
