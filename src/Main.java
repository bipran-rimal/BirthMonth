import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your birthday month number: ");
        int birthdayMonth=0;
        birthdayMonth= in.nextInt();
        if (birthdayMonth==1){
            System.out.println("Your birth month is valid and is: Janurary"+" Your input is: "+birthdayMonth);
        } else if (birthdayMonth==2) {
            System.out.println("Your birthday month is valid and is: Feburary"+" Your input is: "+birthdayMonth);
        } else if (birthdayMonth==3) {
            System.out.println("Your birthday month is valid and is: March"+" Your input is: "+birthdayMonth);
        } else if (birthdayMonth==4) {
            System.out.println("Your birthday month is valid and is: April"+" Your input is: "+birthdayMonth);
        } else if (birthdayMonth==5) {
            System.out.println("Your birthday month is valid and is: May"+" Your input is: "+birthdayMonth);
        } else if (birthdayMonth==6) {
            System.out.println("Your birthday month is valid and is: June"+" Your input is: "+birthdayMonth);
        } else if (birthdayMonth==7) {
            System.out.println("Your birthday month is valid and is: July"+" Your input is: "+birthdayMonth);
        } else if (birthdayMonth==8) {
            System.out.println("Your birthday month is valid and is: August"+" Your input is: "+birthdayMonth);
        } else if (birthdayMonth==9) {
            System.out.println("Your birthday month is valid and is: September"+" Your input is: "+birthdayMonth);
        } else if (birthdayMonth==10) {
            System.out.println("Your birthday month is valid and is: October"+" Your input is: "+birthdayMonth);
        } else if (birthdayMonth==11) {
            System.out.println("Your birthday month is valid and is: November"+" Your input is: "+birthdayMonth);
        } else if (birthdayMonth==12) {
            System.out.println("Your birthday month is valid and is: December"+"Your input is: "+birthdayMonth);
        }else {
            System.out.println("The data is invalid, Please recheck again!");
        }
    }
}