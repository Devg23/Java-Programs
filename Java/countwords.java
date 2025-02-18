import java.util.*;

public class countwords{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string ");
        String line = sc.nextLine();

        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count+1);
    }
}