package ua.yunyk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ZooClub {

	private Map<Person, List<Animal>> map = new HashMap<Person, List<Animal>>();
	
	public void addPerson() {
		Scanner s = new Scanner(System.in);
		System.out.println("������ ��'�");
		String name = s.next();
		System.out.println("������ ��");
		int age = s.nextInt();
		map.put(new Person(name, age), new ArrayList<>());
	}
	
	public void addPet() {
		Scanner s = new Scanner(System.in);
		System.out.println("������ ��'� ������");
		String name = s.next();
		System.out.println("������ �� ������");
		int age = s.nextInt();
		
		boolean flag = false;
		Iterator<Entry<Person, List<Animal>>> iterator1 = map.entrySet().iterator();
		while(iterator1.hasNext()) {
			Entry<Person, List<Animal>> next1 = iterator1.next();
			if(next1.getKey().getAge() == age && next1.getKey().getName().equalsIgnoreCase(name)) {
				flag = true;
			}
		}
		
		if(!flag) {
			System.out.println("������ � ��������� ����������� � ������� �� �������");
		} else {
		System.out.println("������ ��� �������");
		String type = s.next();
		System.out.println("������ ������ �������");
		String nameAnimal = s.next();
		
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if(next.getKey().getAge() == age && 
				next.getKey().getName().equalsIgnoreCase(name)
				) {
					List<Animal> value = next.getValue();
					value.add(new Animal(type, nameAnimal));
					next.setValue(value);
			}
		}
		}
	}
	
	public void removePet() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("������ ��'� ������");
		String name = s.next();
		System.out.println("������ �� ������");
		int age = s.nextInt();
		System.out.println("������ ��� �������");
		String type = s.next();
		System.out.println("������ ������ �������");
		String nameAnimal = s.next();
		
		boolean flag = false;
		boolean flag2 = false;
		Iterator<Entry<Person, List<Animal>>> iterator1 = map.entrySet().iterator();
		while(iterator1.hasNext()) {
			Entry<Person, List<Animal>> next1 = iterator1.next();
			if(next1.getKey().getAge() == age && next1.getKey().getName().equalsIgnoreCase(name)) {
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("������ � ��������� ����������� � ������� �� �������");
		} else {
		
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if(next.getKey().getAge() == age && 
				next.getKey().getName().equalsIgnoreCase(name)
				) {
					Iterator<Animal> iterator2 = next.getValue().iterator();
					while(iterator2.hasNext()) {
						Animal next2 = iterator2.next();
						if(next2.getName().equalsIgnoreCase(nameAnimal)
							&& next2.getType().equalsIgnoreCase(type)
							) {
								iterator2.remove();
								flag2 = true;
						}
					}
			}
		}
		}
		if(!flag2) {
			System.out.println("������� �� ��������");
		}
	}
	
	public void removePerson() {
		Scanner s = new Scanner(System.in);
		System.out.println("������ ��'� ������");
		String name = s.next();
		System.out.println("������ �� ������");
		int age = s.nextInt();
		boolean flag = false;
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if(next.getKey().getName().equalsIgnoreCase(name) && next.getKey().getAge() == age) {
				iterator.remove();
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("������ � ��������� ����������� � ������� �� �������");
		}
	}
	
	public void removePetFromEveryone() {
		Scanner s = new Scanner(System.in);
		System.out.println("������ ��� �������");
		String type = s.next();
		boolean flag = false;
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			List<Animal> value = next.getValue();
			Iterator<Animal> iterator2 = value.iterator();
			while(iterator2.hasNext()) {
				Animal next2 = iterator2.next();
				if(next2.getType().equalsIgnoreCase(type)) {
					iterator2.remove();
					next.setValue(value);
					flag = true;
				}
			}
		}
	
		if(!flag) {
		System.out.println("������� �� ��������");
		}
	}
	
	public void printZooClub() {
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			System.out.print(next.getKey().getName() + "(" + next.getKey().getAge() + ") � ��������� - ");
			Iterator<Animal> iterator2 = next.getValue().iterator();
			while(iterator2.hasNext()) {
				Animal next2 = iterator2.next();
				System.out.print(next2.getType() + " " + next2.getName() + " | ");
			}
			System.out.println();
		}
	}
	
}
