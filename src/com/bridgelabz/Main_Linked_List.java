package com.bridgelabz;

public class Main_Linked_List {
	public static void main(String[] args) {
		Linked_List linkedlist = new Linked_List();
		linkedlist.add(70);
		linkedlist.add(88);
		linkedlist.add(56);
		// linkedlist.push(70);
		// linkedlist.push(90);
		// linkedlist.push(56);

		// linkedlist.add_At_end(70);
		// linkedlist.add_At_end(30);
		// linkedlist.add_At_end(56);

		// Linked_List.insert_At_Position(3, 30);
		linkedlist.print();
	//	linkedlist.pop();
	//	System.out.println("Deleted node is : ");
		linkedlist.popLast();
		System.out.println("Deleted Last node is : ");
		linkedlist.print();

	}
}
