public class ifelse{
    public static void main(String[] args){
        int myNum = -23;
        if (myNum > 0) {
        System.out.println("The value is a positive number.");
        } else if (myNum < 0) {
        System.out.println("The value is a negative number.");
        } else {
        System.out.println("The value is 0.");
        }

        int time  = 10;
        String res = (time<=12) ? "Good Morning" : "Good Evening";
        System.out.println(res);
    }
}