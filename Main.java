//William Bukowski - palindrome tester with queues, built in queues
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
	
	public static void main(String args[]) {
		
		
		String input = "";
		String reverse = "";
		
		//Queue created, string type with a linked list
		Queue<Character> Q = new LinkedList<>();

		while (!(input.equals("exit")))
		{
			//Initial output, prompts user for a word to test
			System.out.println("Enter a word to be tested for being a Palindrome: ");
			
			//scanner object for user input
			Scanner scanner = new Scanner(System.in);
			input = scanner.nextLine();
			System.out.println("You have entered the word " + input);		
			
			if(input.equals("exit")) {
				break;
			}
			else
			{		
				//grab the last char from input string, repeat til word is backwards in queue.
				for (int i = input.length() - 1; i >= 0; i--)
				{
					Q.add(input.charAt(i));
				}
				
				//clear reverse var
				reverse= "";
				
				//add the first letter in the que to the string reverse, repeat til queue empty.
				for (int i = input.length() - 1; i >=0; i--)
				{
					reverse = reverse + Q.remove();
				}
				
				//print out reverse
				System.out.println("The word in reverse is " + reverse);
				
				//if reverse equals input, the word is a palindrome
				if(reverse.equals(input))
				{
					System.out.println(input +  " is a palindrome");
				}
				else {
					System.out.println(input + " is not a palindrome");
				}
			}
			
		}
		System.out.println("GOODBYE!");
		
	}
	
}
