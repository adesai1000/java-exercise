public class Main {
    public static void main(String args[]) {
        System.out.println("Celsius\tFahrenheit");
        for (int celsius = 0; celsius <= 100; celsius += 5){
        int fahrenheit = (int) (9.0/5.0 * celsius + 32);
        System.out.println(celsius +"\t"+ fahrenheit);
        }
    }
}
