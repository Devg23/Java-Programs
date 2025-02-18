public class loops{
    public static void main(String[] args){
        System.out.println("While loop");
        int x = 0;
        while(x<5){
            System.out.println(x);
            x++;
        }
        System.out.println("For loop");
        int sum = 0;
        for(int i = 1;i<=50;i++){
            sum = sum + i;
        }
        System.out.println("Sum upto 50 is :" + sum);

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }

        int[] arr = {2,45,3,66,332,5,3,23};

        for(int i = 0;i<arr.length;i++){
            System.out.println(i+1 + "th element of the array is : "+arr[i]);
        }
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int[] row : myNumbers) {
        for (int i : row) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        }
    }
}