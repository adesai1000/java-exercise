import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		int		commaCount = 0;
		int		dollarCount = 0;
		int 	carriageCount = 0;
		char	ch;

		Scanner scanner = new Scanner(System.in);

		ch = scanner.next().charAt(0);
		while (ch != '#')
		{
			switch (ch)
			{
				case ',':	commaCount++;
							break;
				case '$':	dollarCount++;
							break;
				case '\n':	carriageCount++;
							break;
			}
			ch = scanner.next().charAt(0);
		}

		System.out.println("Commas:\t\t" + commaCount);
		System.out.println("Dollars:\t" + dollarCount);
		System.out.println("Returns:\t" + carriageCount);

		scanner.close();
	}
}
// import java.util.Scanner;

// public class Menu{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         int commaCount = 0;
//         int dollarCount = 0;
//         int carriageReturnCount = 0;
//         char character;

//         System.out.println("Enter the characters: ");
//         while(true){
//         character = scanner.next().charAt(0);   

//         switch(character){
//             case ',':
//                 commaCount++;
//                 break;
//             case '$':
//                 dollarCount++;
//                 break;
//             case '#':
//                 System.out.println("Number of Commas: "+ commaCount);
//                 System.out.println("Number of Dollar Signs: "+ dollarCount);
//                 System.out.println("Number of Carraige Return: "+ carriageReturnCount);
//                 scanner.close();
//                 return;
//             case '\r':
//                 carriageReturnCount++;
//                 break;
//             default:
//                 break;
//             }
//         }
//     }
// }
