import java.util.Scanner;

public class a{
    public static void main (String[]args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int sum = 0;
        for(int i=1 ; i<=a ; i++){
            for(int j=1 ; j<=b ; j++){
                System.out.print((i*j+"\t"));
            }
            System.out.println();
        }
    }
}