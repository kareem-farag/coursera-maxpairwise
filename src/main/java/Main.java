
import java.util.Scanner;
public class Main {

    public static void main (String[] args){


        int intCount = input ();



        System.out.println(getMaxPairwiseProduct(intCount));

    }
    public static int input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static int getMaxPairwiseProduct (int intCount){
        int i ;
        int counter ;

        int [] numbers = new int[intCount] ;
        int largest ;
        int largestSecond ;
        largest = 0;
        largestSecond = 0 ;
        System.out.println(intCount);
        for (i=0 ; i < intCount ; i++) {
            numbers[i] = input();
        }
        for (i=0 ; i < intCount ; i++) {
            for (counter = i + 1 ; counter < intCount ; counter ++){
                if (numbers[i]*numbers[counter] > largest) {
                    largest = numbers[i]*numbers[counter] ;
                }

            }

        }
    return largest ;
    }


}
