import java.util.*;

public class reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");

        String str = sc.nextLine();
        System.out.println(str);
        int i = 0;
        String ans = "";
        while(i<str.length()){

            ans = str.charAt(i) + ans;
            i++;
        }

        System.out.println(ans);

    }
}