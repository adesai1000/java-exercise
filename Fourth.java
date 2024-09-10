import java.util.Scanner;

class Fourth{
    public static void main (String args[]){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the size of the Data Set: ");
    int size = scanner.nextInt();

    int [] numbers = new int[size];

    for(int i=0; i<size; i++){
        System.out.print("Enter the elember Number "+ i +" : ");
        numbers[i] = scanner.nextInt();
    }
    int sum = 0; 
    for(int j = 0; j< size; j++){
        sum += numbers[j];
    }
    double average = (double)sum/size;

    int min = numbers[0];

    for(int k = 0; k< size; k++){
        if(numbers[k]<min){
            min = numbers[k];
        }
    }
    int max = numbers[0];

    for(int l = 0; l< size; l++){
        if(numbers[l]>max){
            max = numbers[l];
        }
    }
    System.out.println("The Average of all the numbers is: "+ average);
    System.out.println("The Minimum Number is: "+min);
    System.out.println("The Maximum Number is: "+max);
    scanner.close();
    }
}