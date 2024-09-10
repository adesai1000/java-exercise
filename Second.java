public class Second {
    public static void main(String[] args) {
        System.out.println("Celsius\tFahrenheit");
        for (int celsius = 0; celsius <= 100; celsius+=5){
        double f = (9.0/5.0) * celsius + 32;
        int sf = (int)f;
        System.out.println(celsius +"\t"+ sf);
        }
    }
}
