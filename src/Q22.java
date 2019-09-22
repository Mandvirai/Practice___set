import java.util.Scanner;
public class Q22 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String name = in.nextLine().trim();
        String gender = in.nextLine().trim();
        int age = in.nextInt();
        System.out.println("Name = "+name+", age = "+age+", Gender = "+gender);
    }

}
