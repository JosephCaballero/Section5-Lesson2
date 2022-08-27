import java.util.*;

public class WatchMovie {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the movie ticket price \n");
        double price = sc.nextDouble();
        System.out.println("Enter the movie rating ");
        int rating = sc.nextInt();
        if((price>=12)&&(rating==5)){
            System.out.println("Im interested in watching the movie.");
        }
        else{
            System.out.println("Im not interested in watching the movie");
        }


    }
}
