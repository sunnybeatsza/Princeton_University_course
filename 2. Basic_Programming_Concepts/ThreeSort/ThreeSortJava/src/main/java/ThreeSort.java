import java.net.Inet4Address;

public class ThreeSort {
//
//    Three-sort. Write a program
//    that takes three integer command-line arguments and
//    prints them in ascending order. Use Math.min() and Math.max().

    public static void main(String[] args) {
        //Input = 3 numbers from command-line
        System.out.println("this is the first number " + args[0]);
        System.out.println("this is the second number " + args[1]);
        System.out.println("this is the third number " + args[2]);

        //Process = Sorting them from smallest to biggest.

        // 1. Determine the lowest number first.
        int lowestNumber = 0;
        lowestNumber = Math.min(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        lowestNumber = Math.min(lowestNumber, Integer.parseInt(args[2]));

        // 2. Determine the highest number next.
        int highestNumber = 0;
        highestNumber = Math.max(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        highestNumber = Math.max(highestNumber, Integer.parseInt(args[2]));

        // 3. Then the number in the middle will be the link
        int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]) + Integer.parseInt(args[2]);
        int middleNumber = sum - highestNumber;
        middleNumber = middleNumber - lowestNumber;


        //Output = Display the numbers in ascending order.
        System.out.println(lowestNumber);
        System.out.println(middleNumber);
        System.out.println(highestNumber);

    }



}


// In order to test make sure to compile the file like below
// javac ThreeSort.java

// Then make sure to run the compiled file with 3 arguments like below
// java ThreeSort 10 2 21