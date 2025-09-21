import javax.swing.plaf.metal.MetalTheme;

public class Main {
    //   Uniform random numbers.
    //   Write a program that prints five uniform random numbers between 0 and 1,
    //   their average value,
    //   and their minimum and maximum values.
    //   Use Math.random(), Math.min(), and Math.max().

    //   For these two exercises, use only Java features that
    //   we have introduced in this course so far (e.g. no loops or conditionals).

    // There is no input there is only an output.
    // 1. The computer is supposed to
    // generate 5 random numbers and store them in variables.
    public static void main(String[] args) {
        double randomNumber1 = Math.random();
        double randomNumber2 = Math.random();
        double randomNumber3 = Math.random();
        double randomNumber4 = Math.random();
        double randomNumber5 = Math.random();

    //  The computer should calculate the average
    //  of all 5 numbers and store it in a variable.
    //  average = sum of all values / the number of values.

        double sum = randomNumber1 + randomNumber2 + randomNumber3 + randomNumber4 + randomNumber5;
        double averageNumber = sum / 5;


        System.out.println(randomNumber1);
        System.out.println(randomNumber2);
        System.out.println(randomNumber3);
        System.out.println(randomNumber4);
        System.out.println(randomNumber5);
        System.out.println("The average is: " + averageNumber);

    //  The computer should determine which number is the lowest
        double lowestNumber = Math.min(randomNumber1, randomNumber2);
        lowestNumber = Math.min(lowestNumber, randomNumber3);
        lowestNumber = Math.min(lowestNumber, randomNumber4);
        lowestNumber = Math.min(lowestNumber, randomNumber5);
        System.out.println("The lowest number is: " + lowestNumber);

    //  The computer should determine which number is the highest
        double highestNumber = Math.max(randomNumber1, randomNumber2);
        highestNumber = Math.max(highestNumber, randomNumber3);
        highestNumber = Math.max(highestNumber, randomNumber4);
        highestNumber = Math.max(highestNumber, randomNumber5);
        System.out.println("The highest number is: " + highestNumber);
    }
}
