package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		System.out.print("How many names will be inserted? ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();;
		
		input.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "# name: ");
			list.add(input.nextLine());
		}
		
		System.out.println();
		System.out.println("List size: " + list.size());
		
		System.out.println();
		System.out.println("---Names inserted---");
		for (String x : list) {
			System.out.println(x);
		}
		
		
		input.close();

	}

}
