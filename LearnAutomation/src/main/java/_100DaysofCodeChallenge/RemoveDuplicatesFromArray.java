package _100DaysofCodeChallenge;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromArray {
	public ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) 
	{
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for (Integer element : list) {
		if (!newList.contains(element)) {
		newList.add(element);
		}
		}
		return newList;
		}

		public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 15, 26, 35, 24, 48, 87, 10, 15));
		RemoveDuplicatesFromArray duplicates = new RemoveDuplicatesFromArray();
		System.out.println("Original list: " + list);
		ArrayList<Integer> newList = duplicates.removeDuplicates(list);
		System.out.println("List after removing duplicates: " + newList);
		}
		} 

