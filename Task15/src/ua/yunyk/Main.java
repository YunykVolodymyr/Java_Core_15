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
				System.out.println("����������� ������� ����� ����");
				break;
			}
		}
	}
	
	public static void menu() {
		System.out.println("****************************************************************");
		System.out.println("������ 1, ��� ������ �������� �� �����");
		System.out.println("������ 2, ��� ������ ������� �� �������� �����");
		System.out.println("������ 3, ��� �������� ������� � �������� �����");
		System.out.println("������ 4, ��� �������� �������� � �����");
		System.out.println("������ 5, ��� �������� ��������� ������� � ��� ��������");
		System.out.println("������ 6, ��� ������� �� ����� �������");
		System.out.println("������ 7, ��� ����� � ��������");
		System.out.println("****************************************************************");

	}
}
