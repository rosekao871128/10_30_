import java.util.Scanner;

public class M2Q4{
    public static void main (String[]args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        for(int i=1 ; i<=a ; i++){
            for(int j=a ; j>i ; j--){
                System.out.print(" ");
            }
            for(int k=1 ; k<=2*i-1 ; k++){
                System.out.print("*");
                }
        System.out.println();
        }
    }
}