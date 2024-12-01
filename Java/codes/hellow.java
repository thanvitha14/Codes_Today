import java.util.Scanner;

public class hellow{
    public static void main(String[] args) {
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("May I know Your Name?");
        name = sc.nextLine();
        System.out.println("Hello "+ name +" have a Great day!");
        sc.close();
    }
}