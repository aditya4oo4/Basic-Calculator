
import java.util.*;
class calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre number here:>");
        int a = sc.nextInt();
         System.out.println("entre number here:>");
         int b = sc.nextInt();
          System.out.println("entre operator here +-*%");
          String c = sc.next();
          if (c.equals("+")){
             System.out.println(a+b);
          }else{
            if (c.equals("-")){
                 System.out.println(a-b);
            }else{
                if (c.equals("*")){
                     System.out.println(a*b);
                }else{
                    if (c.equals("%")){
                         System.out.println(a%b);
                    }else{
                         System.out.println("invalid operation");
                    }
                }
            }
          }

        }
    }