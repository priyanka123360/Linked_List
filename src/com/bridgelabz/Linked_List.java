package com.bridgelabz;

public class Linked_List {
	static Node head;

	private class Node {
		int key;
		Node next;

		public Node(int key) {
			this.key = key;
		}

	}

	public boolean add(int i) {
		boolean isAdded = false;
		Node newNode = new Node(i);
		if (head == null) {
			head = newNode;
			isAdded = true;
		} else {

			Node temp = head;
			if (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			isAdded = true;
		}
		return isAdded;
	}

	 public static void push(int data) {
	 Node newNode = new Node(data);
	 newNode.next = head;
	 head = newNode;
	}
	
	public void add_At_end(int data) {

		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;

	}
	
	public static void insert_At_Position(int position, int data) {
		if(position<1) {
			System.out.println("Invalide Position. ");
		}
		if(position==1) {
			push(data);
		}
		 else {
			Node newNode =new Node(data);
			Node temp = head;
			int count=1;
			while(count<position-1) {
				temp=temp.next;
				count++;
			}
			Node current = temp.next;
			temp.next = newNode;
			newNode.next=current;
		}
	}
	
	public void print() {
		if (head == null) {
			System.out.println("linkedList is empty");
		} else {
			Node temp = head;
			System.out.println("LinkedList is : ");
			while (temp != null) {
				System.out.print(temp.key + "-->");
				temp = temp.next;
			}
		}
		System.out.println();
	}

}
