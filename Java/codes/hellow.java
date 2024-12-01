import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class hellow{
    public static void main(String[] args) {
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("May I know Your Name?");
        name = sc.nextLine();
         LocalDateTime now = LocalDateTime.now();

        // Get just the current time
        LocalTime currentTime = LocalTime.now();

        // Format the time with AM/PM
        DateTimeFormatter formatterWithAmPm = DateTimeFormatter.ofPattern("a");
        String formattedTimeWithAmPm = currentTime.format(formatterWithAmPm).toLowerCase();;

        int hour = currentTime.getHour();
        if((formattedTimeWithAmPm) == "am"){
            System.out.println("Hello! Good Morning"+ name +" have a Great day!");
        }else if((formattedTimeWithAmPm) == "pm" && hour<4){
            System.out.println("Hello! Good Afternoon "+ name +" have a Great day!");
        }else if((formattedTimeWithAmPm) == "pm" && hour>=4 && hour<7){
            System.out.println("Hello! Good Evening "+ name +" How about Tea/Coffee!");
        }else{
            System.out.println("Hello! Good Night "+ name +" Hope Today was Your Best day!");
        }
        
        sc.close();
    }
}