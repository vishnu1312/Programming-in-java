import java.util.*;
class q1 {
public static void main(String args[]) {
   Scanner s = new Scanner(System.in);
    System.out.println("enter a string:");
   String str = s.next();
    for(int i=str.length()-1;i>=0;i--) {
       System.out.print(str.charAt(i));
     
         }
      }
   }
import java.util.*;
class q2 {
  public static void main(String args[]) {
   Scanner s = new Scanner(System.in);
   System.out.println("enter a string:");
     String str = s.next();
     int n = Integer.parseInt(str);
  System.out.print(n);
     }
 }


import java.util.*;
class usernamevalidator {
  public static String RegularExpression = "[a-zA-z][a-zA-Z0-9@]{3,20}$";
      }
class q3 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
  System.out.println("enter username:");
   String s1 = s.next();
    if(s1.matches(usernamevalidator.RegularExpression)) {
       System.out.println("valid");
        }
      else
     System.out.println("Invalid");
       }
}

import java.util.*;
class q4 {
 public static void main(String args[]) {
   Scanner s = new Scanner(System.in);
    System.out.println("enter the number of names:");
        int n = s.nextInt();
      System.out.println("enter names seperated with 'commas':");
     String s1 = s.nextLine();
    String s2[] = s1.split(",");
    System.out.println("enter A for ascending order and D for descending order:");
    String s3 = s.next();
   if(s3.equalsIgnoreCase("A"));
     {
       Arrays.sort(s2);
        }
 else if(s3.equalsIgnoreCase("B")) {
    Arrays.sort(s2,Collections.reverseOrder());
    }
else 
    System.out.println("Invalidv sort order");
for(String n1:s2) {
  System.out.println(n1);
      }
 }
}