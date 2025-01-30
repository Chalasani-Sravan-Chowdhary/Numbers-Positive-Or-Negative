import java.util.Scanner;

public class Numbers{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number=scanner.nextInt();

        if(number>0){
            System.out.println(number + " is a Positive number");
        }
        else if(number<0){
            System.out.println(number + " is a Negative number");
        }
        scanner.close();
    }
}

