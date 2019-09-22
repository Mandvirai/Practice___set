import java.util.Scanner;
public class Q27 {
    public static void main(String[] arsg){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check weather it is even or odd");
        int a = in.nextInt();
        if(a%2 == 0){
            System.out.println("NUMBER IS EVEN");
        }
        else{
            System.out.println("NUMBER IS ODD");
        }
    }
}
