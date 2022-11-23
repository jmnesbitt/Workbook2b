public class SumAvgArray {
    public static void main(String[] args) {
        // create integer variable called sum, set to 0
        int sum = 0;

        // create int array size of 10,name this array 'numbers',put ten numbers inside this array
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};

        /* use for loop (or for each below) to call the array and add them together, save it inside sum variable
        for (int i = 0; i<0; i++){
            sum += numbers[i];
        }
       */

        // use for each to call the array and add them together, save it inside sum variable
        for (int x : numbers){
            sum = x + sum;
        }

        // print the sum
        System.out.println(sum);

        // calculate the average and print the average in double variable
        double average = (double)sum/numbers.length;

        System.out.println("Average = " + average);
    }
}
