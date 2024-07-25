package homework4june;

import java.util.Scanner;

public class main {
	public static void main(String[]args) throws Exception {
		System.out.println("plz press 1 for insert\n press 2 for read\n press 3 for update\n press 4 for delete");
		method obj = new method();
		int i = 0;
		while(i<5) {
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		//if(choice < 5) {
		switch(choice) {
		case 1 : obj.insert();
		break;
		case 2 : obj.read();
		break;
		case 3 : obj.Update();
		break;
		case 4 : obj.delete();
		break;
		default: System.out.println("plz input correct button for crud operation");
		}
		System.out.println("plz press 1 for insert\n press 2 for read\n press 3 for update\n press 4 for delete");
		}
		}
	}
//}
	



