/**
 * This class demonstrates arrays.  
 * @author Reece Gavin - ID: 17197589  
 * @Lab attended - Wednesday 12-2
 * @version 17 Oct 2017   
 */

/*  EXAMPLE OF PROGRAM EXECUTION INPUT/OUTPUT
 * Using arrays and finding the average, min and sum.

Using arrays and finding the average, min and sum.

The array with 4 elements is: [4.5, 2.0, 1.2, 3.3]
The sum of[4.5, 2.0, 1.2, 3.3]is: 11.0
The Average of[4.5, 2.0, 1.2, 3.3]is: 2.75
The minimum of[4.5, 2.0, 1.2, 3.3]is: 1.2

How many numbers: 3
Enter lowest range: 1
Enter highest range: 100
Enter number 1.0: 4.1
Enter number 2.0: 400
Please re-enter in range [1.00 to 100.00]: 43.21
Enter number 3.0: 96.3

The numbers entered were[4.1, 43.21, 96.3]

The Sum of[4.1, 43.21, 96.3]is: 143.61

The Average of[4.1, 43.21, 96.3]is: 47.870000000000005

The Minimum of[4.1, 43.21, 96.3]is: 4.1

After fill with 1.2, the array is [1.2, 1.2, 1.2, 1.2, 1.2, 1.2]

The Values of makeArray are shown as: 
Term                 Array Value         
0                    4.100               
1                    43.210              
2                    96.300              

 */

import java.util.Scanner;

public class EngArray 
{  
    /**
     * Test the array methods
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Using arrays and finding the average, min and sum.");
        System.out.println();

        // a) Declare and initialise an array to hold the real data values 4.5, 2.0, 1.2 and 3.3
        double[] realDataValues = {4.5,2.0,1.2,3.3};

        // b) Using the provided toString( ) method display the array values for realDataValues.
        System.out.printf("The array with %d elements is: ", realDataValues.length);
        String str = toString(realDataValues);
        System.out.println( str );

        // c) Invoke calcSum and display the numbers and the sum 
        calcSum( realDataValues);
        System.out.println("The sum of" + toString(realDataValues) + "is: " + calcSum( realDataValues));

        // d) Invoke calcAvg and display the numbers and their average 
        calcAvg( realDataValues);
        System.out.println("The Average of" + toString(realDataValues) + "is: " + calcAvg( realDataValues));

        // e) Invoke findMin and display the minimum
        findMin( realDataValues);
        System.out.println("The minimum of" + toString(realDataValues) + "is: " + findMin( realDataValues));

        // g) Invoke makeArray and then display the sum, average and minimum of new array        
        double[] makeArrayCall = makeArray();

        System.out.println();

        System.out.println("The numbers entered were" + toString(makeArrayCall));  

        System.out.println();

        calcSum(makeArrayCall);
        System.out.println("The Sum of" + toString(makeArrayCall) + "is: " + calcSum(makeArrayCall));

        System.out.println();

        calcAvg(makeArrayCall);
        System.out.println("The Average of" + toString(makeArrayCall) + "is: " + calcAvg(makeArrayCall));

        System.out.println();

        findMin(makeArrayCall);
        System.out.println("The Minimum of" + toString(makeArrayCall) + "is: " + findMin(makeArrayCall));

        // h) Invoke fill to set a new array of 6 elements to 1.2 and then display modified array

        double[] fillExample = new double [6];

        fill(fillExample,1.2);

        System.out.println();

        System.out.println("After fill with 1.2, the array is " + toString(fillExample));

        //optional part 
        System.out.println();
        System.out.println("The Values of makeArray are shown as: ");
        orderArray(makeArrayCall);

        

    }

    
    /**
     * Calculates the Sum of any given values in an array
     * @param args the command line arguments
     */
    public static double calcSum (double[] array) 
    {
        double[] array1 = array;

        double output = 0.00;
        for ( int i = 0; i<array1.length; i++)
        {

            output+= array1[i];    

        }
        return output;
    }

    
    /**
     * Calculates the Average of any given values in an array
     * @param args the command line arguments
     */
    public static double calcAvg (double[] array) 
    {
        double[] array1 = array;

        double output = 0.00;

        for ( int i = 0; i<array1.length; i++)
        {

            output+= array1[i]; 

        }
        return output/array1.length;

    }

    /**
     * Calculates the Minimum of any given values in an array
     * @param args the command line arguments
     */
    public static double findMin (double[] array) 
    {
        double[] array1 = array;

        double output = 0.00;
        int i= 1;
        double min = array1[i-1];

        while(i < array1.length)
        {  

            if (min < array1[i])
                min = min;
            else min = array[i];
            i++;
        }

        return min;                                
    }

    /**
     * Returns a string representation of the array i.e. a comma separated list 
     * of elements within [ ].  Similar to java.util.Arrays.toString(double[] a) method.
     * Each array element will be displayed by String.valueOf(double).
     * @param array  the array whose string representation is required
     * @return a string representation of array
     */
    public static String toString( double[] array )
    {
        String arrayStr = "[";

        for ( int i = 0; i < array.length; i++)
        {
            if (i > 0)              // Insert comma separator after first one
                arrayStr += ", ";
            arrayStr += String.valueOf( array[i] );
        }
        arrayStr += "]";
        return arrayStr;
    }

    /**
     * Input a set of elements and store in the created array. The user specifies
     * the size of the array, and enters the elements.
     * @return the created array
     */
    public static double[] makeArray()          // Part f)
    {
        final String format = "%.2f";       // Use consistent format for printing numbers
        Scanner input = new Scanner( System.in );
        System.out.println();
        System.out.print("How many numbers: ");
        int numNumbers = input.nextInt( );

        System.out.print("Enter lowest range: ");       
        double lower = input.nextDouble( ); 
        System.out.print("Enter highest range: ");
        double upper = input.nextDouble( );

        // Declare and create the array:
        double[] userArray = new double[numNumbers];

        // Code below gets a single number, and must be modified to get multiple numbers
        // and store them in the array  e.g. using a for statement.

        double number = 0;
        double outputNumber = 0;

        for ( int i = 0; i<userArray.length; i++)
        {
            outputNumber= i+1; 

            System.out.printf("Enter number %.1f: ", outputNumber) ;//Will need to replace 0 with index// );      
            number = input.nextDouble( );

            while ( number < lower || number > upper )
            {
                System.out.print("Please re-enter in range ");
                System.out.printf("[" + format + " to " + format + "]: ", lower, upper );
                number = input.nextDouble( );                            
            }
            userArray[i] = number;

        }

        return userArray;// replace with arrayName created above.

    }

    /**
     * An array and value is inputted. The values in the array are let = to the value inputted in this method.
     * @param args the command line arguments
     */
    public static void fill(double[] array, double value)
    {

        for ( int i=0; i< array.length; i ++)

          
            if( value == value)

                array[i] = value;

    }

      
            
    public static void orderArray(double[] array ) 
    {      
        double output = 0 ;
        double term = 0;       
        System.out.printf("%-20s %-20s\n","Term", "Array Value");

        for( int i = 0; i< array.length; i++)

        {

            output = array[i];

            System.out.printf("%-20d %-20.3f\n",i, output);

            //System.out.printf("%-20.3f\n",output);

            
            
        }

          
            
    }
}
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
