import java.util.*;
public class FizzBuzz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Max value? ");
        int max = input.nextInt();
        String print = "";
        for (int i=1;i<=max;i++){
            if ((i % 3) == 0)
                print += "Fizz";
            if ((i % 5) == 0)
                print += "Buzz";
            if (print == "")
                print = Integer.toString(i);
            System.out.print(print + " ");
            if ((i % 20) == 0)
                System.out.println();
            print = "";
        }
    }
}