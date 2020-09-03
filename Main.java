import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		Main main = new Main();
		String word = main.inputWord();
		StringBuffer result = CaesarCipher.encrypt(word);
		main.outputWord(result);
	}
	
	public String inputWord() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your word: ");
		String word = scan.nextLine().toUpperCase(); //all encrypted messages will be in caps, so if the user inputs a lowercase message, this line will make sure the encrypted output is in uppercase
		return word;
	}
	
	public int inputKey() {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter your key for this cipher: ");
		int key = scan1.nextInt();
		return key;
	}
	
	public void outputWord(StringBuffer result) {
		for(int i = 0; i < result.length(); i++) { //This for loop is a workaround for when Java replaces whitespace in the String with '!' or ';'
			if(!Character.isLetter(result.charAt(i))) {
				result.replace(i, i+1, " ");
			}
		}
		System.out.println(result);
	}
}
