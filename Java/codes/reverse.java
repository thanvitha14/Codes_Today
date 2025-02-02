import java.util.Scanner;
public class reverse {
    public static int reverser(int number) {
        int reversed=0,rem;
        while(number!=0){
            rem=number%10;
            number=number/10;
            reversed=reversed*10+rem;
            
        }
        return reversed;
        
    }
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("REVERSING A NUMBER ");
        System.out.print("Enter the number you want to reverse: ");
        number = sc.nextInt();
        System.out.println();
        int reversed_number = reverser(number);

        System.out.println("Reversed Number is => "+reversed_number);
        sc.close();

    }
}
