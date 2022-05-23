package applicantion;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args){

       method2();
    }

    public static void method2(){
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position");
            e.printStackTrace();
        }

        catch(InputMismatchException e){
            System.out.println("Invalid data");
        }

        System.out.println("End of the program");
        sc.close();
    }

}
