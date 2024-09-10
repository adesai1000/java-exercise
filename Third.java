import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
    String name = new String();
    int hourlyRate, hoursWorked;
    int paycheck;

   
    
    while(true){
         // Taking Inputs
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter the Employee Name: ");
    name = reader.nextLine();
    System.out.print("Enter "+ name+"'s hourly wage: ");
    hourlyRate = reader.nextInt();
    System.out.print("Enter how many hours "+ name+" has worked: ");
    hoursWorked = reader.nextInt();
        if(hoursWorked == 0 ){
            break;
        }
        if(name.equals("DONE")){
            break;
        }
        if(hoursWorked > 40){
            int overtimeHours = hoursWorked - 40;
            int normalHours = hoursWorked - overtimeHours;
            System.out.println(overtimeHours);
            System.out.println(normalHours);
            double overtimeRate = 1.5*hourlyRate;
            double overtimePay = overtimeRate*overtimeHours;
            int normalPay = normalHours*hourlyRate;
            double totalPay = normalPay+overtimePay;
            System.out.println(name+ " 's paycheck is $"+totalPay);
        }
        else{
            paycheck = hourlyRate*hoursWorked;
            System.out.println(name+ " 's paycheck is $"+paycheck);
        }
        reader.close();
    }
}
}