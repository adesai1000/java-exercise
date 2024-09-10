import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        int arr[];
        int size;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of values: ");
        size = scanner.nextInt();
        arr = new int[size];

        System.out.print("Enter " + size + " integers, one per line: ");
        for(int i=0; i < arr.length; i++)
            arr[i] = scanner.nextInt();
        
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
		sum += arr[i];
		System.out.println("Average is " + sum/arr.length);
        
        int min = arr[0];
		int max = arr[0];
		for (int i = 1; i < arr.length; i++)
		{
			if (arr[i] < min)
				min = arr[i];
			else if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("Min value is " + min + " and max value is " + max);
		scanner.close();
    }
}

// import java.util.Scanner;

// public class Main{
//     public static void main (String args[]){
//     Scanner scanner = new Scanner(System.in);
    
//     System.out.print("Enter the size of the Data Set: ");
//     int size = scanner.nextInt();

//     int [] numbers = new int[size];

//     for(int i=0; i<size; i++){
//         System.out.print("Enter the elember Number "+ i +" : ");
//         numbers[i] = scanner.nextInt();
//     }
//     int sum = 0; 
//     for(int j = 0; j< size; j++){
//         sum += numbers[j];
//     }
//     double average = (double)sum/size;

//     int min = numbers[0];

//     for(int k = 0; k< size; k++){
//         if(numbers[k]<min){
//             min = numbers[k];
//         }
//     }
//     int max = numbers[0];

//     for(int l = 0; l< size; l++){
//         if(numbers[l]>max){
//             max = numbers[l];
//         }
//     }
//     System.out.println("The Average of all the numbers is: "+ average);
//     System.out.println("The Minimum Number is: "+min);
//     System.out.println("The Maximum Number is: "+max);
//     scanner.close();
//     }
// }