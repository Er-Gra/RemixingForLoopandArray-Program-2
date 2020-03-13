/*
 * March 13, 2020
 * Erika Graham
 * for loops and arrays program 1
 */

package remixingforloopsandarrays_program2;

import java.util.Scanner;

public class RemixingForloopsandArrays_Program2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner (System.in);
        
        String [] friends = new String [5]; //array declared, capacity changed to 5
        
        System.out.println("Enter the names of five friends:");  //promp to the user
        for (int i = 0; i <= 4; i = i + 1)  // range changed to 4
        {
            friends[i] = keyedInput.nextLine();
        }
        //output: the name of the second, third and fourth friends.
        System.out.println("The second, third and fourth names listed were:");
        System.out.println("Second: " + friends[1]);
        System.out.println("Third: " + friends[2]);  
        System.out.println("Fourth: " + friends[3]);
    }
    
}
