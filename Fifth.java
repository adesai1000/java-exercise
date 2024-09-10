import java.util.Scanner;

public class Fifth{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int commaCount = 0;
        int dollarCount = 0;
        int carriageReturnCount = 0;
        char character;

        System.out.println("Enter the characters: ");
        while(true){
        character = scanner.next().charAt(0);   

        switch(character){
            case ',':
                commaCount++;
                break;
            case '$':
                dollarCount++;
                break;
            case '#':
                System.out.println("Number of Commas: "+ commaCount);
                System.out.println("Number of Dollar Signs: "+ dollarCount);
                System.out.println("Number of Carraige Return: "+ carriageReturnCount);
                scanner.close();
                return;
            case '\r':
                carriageReturnCount++;
                break;
            default:
                break;
            }
        }
    }
}
