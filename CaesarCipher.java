//An encryption program where the user will type a message and, using Caesar's Cipher, the computer 
//will return a scrambled version of the message. The Caesar's Cipher will use the same key for each letter
//for the sake of simplicity at the moment.
import java.util.Scanner;

public class CaesarCipher {



	public static StringBuffer encrypt(String str) {
		Main main = new Main();
		int key = main.inputKey();
		StringBuffer result = new StringBuffer();
		for(int i = 0; i < str.length(); i++) {
			if(!Character.isWhitespace(str.charAt(i))) {
			char characterToBeScrambled = str.charAt(i);
			if(key > 0) {
			char scrambledCharacter = (char)((((int)characterToBeScrambled -'A'+key) % 26)+'A');
			result.append(scrambledCharacter);
			} else if(key < 0) {
				char scrambledCharacter2 = (char)((int)(((characterToBeScrambled - 'Z') + key)%26) + 'Z');
				result.append(scrambledCharacter2);
			}
		} else if(Character.isWhitespace(str.charAt(i))) {
			result.append(str.charAt(i));
			continue;
		}
		}
		return result;
	}
	

}