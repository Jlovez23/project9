
public class Guesser{
	public static void main(String[] args){
		Guesser G = new Guesser();
	}// end main

	public void Guesser(){
		java.util.Scanner input = new java.util.Scanner(System.in);
		boolean keepGoing = true;
		while(keepGoing){
			G.menuPrint();
			String response = input.nextLine();

			if (response.equals("0")){
				keepGoing = false;
			}
			else if (response.equals("1")){
				System.out.println("HumanGuesser");
			}
			else if (response.equals("2")){
				System.out.println("ComputerGuesser");
			}
			else
				System.out.print("incorrect input");
		}//end while
		System.out.print("Goodbye!");	
	}//end menuLoop
	
	public void menuPrint(){
		System.out.println("press 0 to quit");
		System.out.println("press 1 to start human guesser");
		System.out.println("press 2 to start computer guesser");
	}//end print
	

	public void ComputerGuesser(){
	}//end ComputerGuesser
	
	public void HumanGuesser(){
	}//end HumanGuesser
}// end menu def
