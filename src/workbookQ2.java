public class workbookQ2 {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};System.out.println(cars.length);

        // call the element of the array
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);

        // call all elements in the array using for loops
        for (int i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }

        // for each, to call all the elements
        for (String x : cars) {
            System.out.println(x);
        }
        // the size of the array using length
        System.out.println(cars.length); // question 3
    }

}
