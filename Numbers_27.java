import java.util.Scanner;

public class Numbers_27 {
    public static void main( String args[] ){
        int num;
        Scanner in = new Scanner( System.in );
        System.out.print("Input a number: ");
        num = in.nextInt();
        int num_of_digits = 0, divisor_part=1, circular_num=num;
        boolean all_Prime = true;
        for( int temp = num; temp > 0; temp /= 10 ){
            num_of_digits++;
            divisor_part *=10;
        }
        divisor_part /=10;
        System.out.println( "Output: " );
        do{
            System.out.println( "        "+circular_num );
            circular_num = circulate( circular_num, divisor_part );
            if( !is_Prime( circular_num ) ) all_Prime=false;
        }while( circular_num != num );
        System.out.print( "\n        " );
        if( all_Prime ) System.out.println( num + " is a circular_num Prime number." );
        else System.out.println( num + " It is not a Circular Prime number." );
    }
    public static boolean is_Prime( int number ){
        int factorCount = 0;
        if( number < 2 ) return false;
        else if( number == 2 ) return true;
        else if( number % 2 == 0 ) return false;
        else{
            int limit = (int) Math.sqrt( number );
            for( int i = 3 ; i <= limit ; i+=2 ){
                if( number %i == 0 ){
                    return false;
                }
            }
        }
        return true;
    }
    public static int circulate( int n, int divisor_part ){
        if( n < 10 ) return n;
        else return ( n % divisor_part ) * 10 + n / divisor_part;
    }
}
