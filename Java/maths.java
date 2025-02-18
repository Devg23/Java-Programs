public class maths{
    public static void main(String[] args){
        int a = 2002;
        int b = 8938;

        System.out.println("Maximum among the two is : " + Math.max(a,b));
        System.out.println("Minimum among the two is : " + Math.min(a,b));

        int num = 64;
        System.out.println("Square root of num is : " + Math.sqrt(num));
        System.out.println("Absolute difference between a and b is : " + Math.abs(a - b));

        System.out.println("Random number between 0 and 1000 is : " + (int)(Math.random() * 1001));
    }
}