import java.util.Scanner;
class CharToAscii{
	public static void main(String[] args){
		
		
		for(int i = 0;i<256;i++){
		char c = (char)i;
		System.out.println("Character: " + c + " ASCII Value " + i);
		}
	}
}