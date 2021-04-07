import java.util.Scanner;

public class sumprime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter String: ");
        String str = sc.nextLine();
        int n=str.length();
        int count=0;
        char[] strArray = str.toCharArray();
        for(int i=0;i<n;i++)
        {
            if(isPrime(strArray[i]-'0'))

            {
                count=count+strArray[i]-'0';
            }
        }
        System.out.println (count);

    }



    private static boolean isPrime(int num)
    {
        if(num==1 ||(num!=2 && num%2==0))
        {
            return false;
        }
        else
        {
            for(int i=2;i<num/2;i++)
            {
                if(num%i==0)
                    return false;
            }

        }
        return true;

    }
}
