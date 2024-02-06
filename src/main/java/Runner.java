import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS

        System.out.println("---------SCOTTISH ISLANDS MVP---------");

        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");
//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0,"Tiree");
//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2,"Islav");
//        4. Print out the index position of "Skye"
        System.out.println("Skye Index Position: " + scottishIslands.indexOf("Skye"));
//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);
//        7. Print the number of islands in your arraylist
        System.out.println("Number of Islands is: " + scottishIslands.size());

//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);
//        9. Print out all the islands using a for loop
        for (String island: scottishIslands) {
            System.out.println(island);
        }

        System.out.println(scottishIslands);


//        NUMBERS


        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers - you got this WRONG (it was meant to be in another array list apparently...)
        System.out.println("My attempt of Extension Q1- even numbers");
        for (int i= 0; i < numbers.size(); i++) {
            Integer even = numbers.get(i);
            if (even%2 == 0) {
                System.out.println(even);
            }
        }
              // Therefore this is the correct answer:
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers){
            if (number % 2 == 0){
                evenNumbers.add(number);
            }
        }
        System.out.println("even numbers correct answer: " + evenNumbers);

//        2. Print the difference between the largest and smallest value
         int max = Collections.max(numbers);
         int min = Collections.min(numbers);
//
        System.out.println("The difference between the largest and smallest number is: ");
        System.out.println(max - min);

//        3. Print True if the list contains a 1 next to a 1 somewhere
        // Personally did not understand the question but after seeing the following model answer it makes more sense now!

        boolean result = false;
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) == 1 && numbers.get(i + 1) == 1){
                result = true;
            }
        }
        System.out.println("[MODEL ANSWER] numbers contains 1 next to a 1 is: " + result);



//        4. Print the sum of the numbers,
        int sum = 0;
        for (int i=0; i < numbers.size(); i++){
             int number = numbers.get(i);
            sum+= number;
        }
        System.out.println("Sum of numbers is: " + sum);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.

        int sum_not_13 = 0;
        for (int i=0; i < numbers.size(); i++){
            int number = numbers.get(i);
            if (number == 13) {break;}
            sum_not_13 += number;
        }
        System.out.println("Sum not including 13 and after: " + sum_not_13);

    }

}
