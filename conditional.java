import java.util.*;



// public class conditional {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         if(age >18) {
//          System.out.println("you are eligible ");
//         }  else {
//             System.out.println("not adult not eligible yet"); 
//         }
//     }
// }




// public class conditional {
//     public static void main(String[]arg){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         if (num%2==0){
//             System.out.println("yes its a even number ");
//         }else {
//             System.out.println("its a odd number");
//         }
        
//     }
// }








// class conditional{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         if (a==b){
//             System.out.println("both are equal");


//         }else {
//             if(a>b){
//                   System.out.println("a is greater and b is lesser ");

//             } else{
//                 if (a<b){
//                       System.out.println("b is greater and a is lessse");
//                 }
//             }
//         }        
        
        


//     }
// }









// class conditional{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();
//     if (button == 1){
//             System.out.println("namste");


//         }else {
//             if (button ==2){
//                 System.out.println("hello");
//             }else {
//                 if (button ==3){
//                     System.out.println("bonjor");
//                 }
//             }

//         }
//     }
// }
            







// SWITCH 










// class conditional{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();
//         switch(button){
//             case 1 : System.out.println("hello");
//             break;
//             case 2:  System.out.println("namste");
//             break;
//             case 3:  System.out.println("bonjor");
//             break;
//             default :  System.out.println("invalid");


//         }
//     }
// }   









// calculator






// class conditional{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         String o = sc.next();
        
//         if(o =="+"){
//             System.out.println(a+b);
//         }else{
//             if(o=="-"){
//                 System.out.println(a+b);


//             }else{
//                 if (o=="*"){
//                        System.out.println(a*b);

//                 }else {
//                     if (o=="%"){
//                            System.out.println(a%b);

//                     }else{
//                            System.out.println("invalid command");
//                     }
//                 }
//             }
//         }
//     }
// }







class conditional{
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
