import java.util.Scanner;

public class StringProblem {
   private static  Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the String :");
        String s=sc.next();
        StringRearrange(s);

    }
    public static void StringRearrange(String s)
    {
        char[]ss=s.toCharArray();
        String ReverseString="";
        int lenghtOfString=ss.length-1;

        for(int i=lenghtOfString;i>=0;i--)
        {
            ReverseString+=  ss[i];
        }
            if(ReverseString.equals(s))
        {
            System.out.println("Its not possible to rearrange");
        }
        else {
            System.out.println("Its possible to rearrange");

        }

        }
    }

