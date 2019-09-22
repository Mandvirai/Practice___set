import java.util.Scanner;
    public class Q28 {
        public static void main(String[] arsg){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a number to check weather it is divisible by 5 or not");
            int a = in.nextInt();
            if(a%5 == 0){
                System.out.println("NUMBER IS DIVISIBLE BY 5");
            }
            else{
                System.out.println("NUMBER IS NOT DIVISIBLE BY 5");
            }
        }
    }


