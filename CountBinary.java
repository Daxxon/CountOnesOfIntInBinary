import java.util.Scanner;

public class CountBinary {
  public static void main(String[] args) {

    Scanner keyboardInput = new Scanner(System.in);
    System.out.print("Feed me an integer: ");
    int myInt = keyboardInput.nextInt();
    int myIntTemp = myInt;
    int[] myIntInBinary = new int[countDivisionsByTwo(myInt)];
    // System.out.println("Array length: " + myIntInBinary.length);

    for (int i=0; i < myIntInBinary.length; i++) {
      if (myIntTemp - calculatePowerOfTwo(myIntInBinary.length - i) >= 0) {
        myIntInBinary[i] = 1;
        myIntTemp -= calculatePowerOfTwo(myIntInBinary.length - i);
      } else {
        myIntInBinary[i] = 0;
      }
    }

    // for (int i=0; i<myIntInBinary.length; i++) {
    //   System.out.println("Index " + i + " : " + myIntInBinary[i]);
    // }

    System.out.println("There are " + calculateNumberOfOnes(myIntInBinary) + " ones in the integer " + myInt + " in its binary form.");
  }

  static int calculateNumberOfOnes(int[] myNumberInBinaryAsArray) {
    int total = 0;
    for (int i=0; i<myNumberInBinaryAsArray.length; i++) {
      if (myNumberInBinaryAsArray[i] == 1) {
        total++;
      }
    }
    return total;
  }

  static int calculatePowerOfTwo(int myPower) {
    int result = 1;
    for (int i=0; i<myPower - 1; i++) {
      result *= 2;
    }
    //System.out.println("Result: " + result);
    return result;
  }

  static int countDivisionsByTwo(int myNumber) {
    int count = 1;
    while (myNumber > 1) {
      myNumber /= 2;
      //System.out.println("My number now: " + myNumber);
      count++;
      //System.out.println("Current count: " + count);
    }
    //System.out.println("Count = " + count);
    return count;
  }
}
