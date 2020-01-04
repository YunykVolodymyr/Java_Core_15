package ua.yunyk;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		ZooClub club = new ZooClub();
		Scanner s = new Scanner(System.in);
		String key;
		while(true) {
			menu();
			key = s.next();
			switch (key) {
			case "1":
				club.addPerson();
				break;
			case "2":
				club.addPet();
				break;
			case "3":
				club.removePet();
				break;
			case "4":
				club.removePerson();
				break;
			case "5":
				club.removePetFromEveryone();
				break;
			case "6":
				club.printZooClub();
				break;
			case "7":
				System.exit(0);
				break;
			default:
				System.out.println("Ќеправильно введено номер меню");
				break;
			}
		}
	}
	
	public static void menu() {
		System.out.println("****************************************************************");
		System.out.println("¬вед≥ть 1, щоб додати учасника до клубу");
		System.out.println("¬вед≥ть 2, щоб додати тварину до учасника клубу");
		System.out.println("¬вед≥ть 3, щоб видалити тварину з учасника клубу");
		System.out.println("¬вед≥ть 4, щоб видалити учасника з клубу");
		System.out.println("¬вед≥ть 5, щоб видилати конкретну тварину з≥ вс≥х власник≥в");
		System.out.println("¬вед≥ть 6, щоб вивести на екран зооклуб");
		System.out.println("¬вед≥ть 7, щоб вийти з програми");
		System.out.println("****************************************************************");

	}
}
