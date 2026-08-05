import java.util.Scanner;

public class practical2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        if (age<13) {
            System.out.println("you are a child");
                   }
                   else if(age>=13 && age<=19){
                    System.out.println("you are a teenager");
                   }
                   else if (age>=20 && age<=60){
                    System.out.println("you are adult");
                   }
                   else {
                    System.out.println("you are a senoir citizen");
                   }
    }
}