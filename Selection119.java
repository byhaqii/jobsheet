import java.util.Scanner;

class Selection119 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        System.out.print("Input a number = ");
        int number = input19.nextInt();
        String Equals = number % 2 == 0?"Number "+number+" is even number" : "Number "+number+" is odd number";
        System.out.print(Equals);
    }
}