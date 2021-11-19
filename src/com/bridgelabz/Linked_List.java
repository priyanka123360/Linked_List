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

	public boolean add(int data) {

		boolean isAdded = false;
		Node newNode = new Node(data);
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

	public static void insert_At_Position(int position, int data) {
		if (position < 1) {
			System.out.println("invalide position");
		}
		if (position == 1) {
			push(data);
		} else {
			Node newNode = new Node(data);
			Node temp = head;
			int count = 1;
			while (count < position - 1) {
				temp = temp.next;
				count++;
			}
			Node current = temp.next;
			temp.next = newNode;
			newNode.next = current;
		}
	}

	public int pop() {

		if (head == null) {
			System.out.println("Empty List");
		}
		Node temp = head;
		head = temp.next;

		return temp.key;
	}
	public int popLast() {
		if(head==null) {
			System.out.println(" Empty List");
		}
		
		Node temp = head;
		
		if (temp.next != null) {
			temp = temp.next;
		}
		
		int popLastKey=temp.next.key;
		temp.next=null;
		return popLastKey;
	}

	public static void print() {
		if (head == null) {
			System.out.println("LinkedList is Empty.");
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
