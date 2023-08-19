package _100DaysofCodeChallenge;

//Java program to reverse each word in a String

public class ReverseEachWord {
	
	public String reverseEachWord(String givenStr){
		String reversedStr="";
		String[] givenStrArray=givenStr.split(" ");
		for (String word: givenStrArray) {
		char[] givenCharArray=word.toCharArray();
		for(int i=givenCharArray.length-1; i>=0; i--){
		reversedStr=reversedStr+givenCharArray[i];
		}
		reversedStr=reversedStr.toString()+" ";
		}
		return reversedStr.trim();
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseEachWord reverseEachWordInString=new ReverseEachWord();
		System.out.println(reverseEachWordInString.reverseEachWord("Java programming"));

	}

}
