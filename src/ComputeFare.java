import java.util.*;
public class ComputeFare {

    public static void main(String args[]) {
        System.out.print("Enter the age \n");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int fare;
        if (age<11){
            fare = 3;
            System.out.println("Fare is $" + fare);
        }
        else if((age>11)&&(age<65)){
            fare = 5;
            System.out.println("Fare is $" + fare);
        }
        else{
            fare = 3;
            System.out.println("Fare is $" + fare);
        }

    }
}
