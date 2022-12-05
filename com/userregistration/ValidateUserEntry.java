package com.userregistration;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserEntry{

    public static boolean checkFirstName(String FirstName){
        String fName = "^[A-Z]\\w{3,29}$";
        Pattern pattern = Pattern.compile(fName);
        if(FirstName==null)
            return false;
        Matcher match=pattern.matcher(FirstName);
        return match.matches();
    }
    public static boolean checkLastName(String LastName){
        String lName = "^[A-Z]\\w{3,29}$";
        Pattern pattern2 = Pattern.compile(lName);
        if(LastName==null)
             return false;
        Matcher match=pattern2.matcher(LastName);
        return match.matches();
    }
    public static boolean checkEmail(String Email){
        String email = "^[(.+)@(.+)$";
        Pattern pattern2 = Pattern.compile(email);
        if(Email==null)
             return false;
        Matcher match=pattern2.matcher(Email);
        return match.matches();
    }
    public static boolean checkMobileNum(String mobileNum){
        String mobilenum = "^(?:(?:\\+|0{0,2})91(\\s*\\s*)?|[0]?)?[789]\\d{9}$";
        Pattern pattern2 = Pattern.compile(mobilenum);
        if(mobileNum==null)
             return false;
        Matcher match=pattern2.matcher(mobileNum);
        return match.matches();
    }
    public static boolean checkPassword(String Password){
        String password = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8, 20}$";
        Pattern pattern2 = Pattern.compile(password);
        if(Password==null)
             return false;
        Matcher match=pattern2.matcher(Password);
        return match.matches();
    }
    


    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter First  Name : ");
    //     String firstName = sc.next();
    //     System.out.println(checkFirstName(firstName));

        // Scanner sc2=new Scanner(System.in);
        // System.out.println("Enter Last  Name : ");
        // String lastName = sc2.next();
        // System.out.println(checkLastName(lastName));}
    
}