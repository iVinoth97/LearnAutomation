package _100DaysofCodeChallenge;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;

		String a = "KUmar";
		String b = "";
		b=a.replaceAll("[aeiouAEIOU]", "*");
		System.out.println("After removing :" +b);
	}

}
