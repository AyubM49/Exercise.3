import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double c, f;
        Scanner s = new Scanner(System.in);
        System.out.print("What is the temperature in Fahrenheit:");
        f = s.nextDouble();
        c= (f-32)*(0.5555);
        System.out.println("The temperature in Celsius is:"+c);

        }
    }

