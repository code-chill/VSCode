import java.util.Scanner;
public class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,s;
        System.out.print("ENTER TWO NUMBERS: ");//ACCEPT TWO NUMBERS
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
        s=a+b;//SUM
        System.out.println("SUM OF TWO NUMBERS="+s+"\n\n");
    }
}