import java.util.*;

public class arraysum{
    public static void main(String[] args){
        System.out.println("Enter the size of array: ");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter the elements in array: ");
        int[]arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 0;i<n;i++){
            ans += arr[i];
        }

        System.out.println("Sum of the elements in array: " + ans);
    }
}