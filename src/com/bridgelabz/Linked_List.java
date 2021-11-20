package com.bridgelabz;

public class Linked_List implements LinkedList_Interface{
	static Node head;

	private class Node {
		int key;
		Node next;

		public Node(int key) {
			this.key = key;
		}

	}
	@Override
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
	@Override
	  public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	@Override
	public void insert_At_Position(int position, int data) {
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
	@Override
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
	@Override
	public  void find_Node(int data) {
		Node temp = head;
		if (head == null) {
			System.out.println("List is empty");
		} else {
			while (temp != null) {
				temp = temp.next;
				if (temp.key == data) {
					System.out.println(temp.key + " is found at Node: " + temp);
					return ;
				}
			}
			System.out.print(data + " is Not found");
		}
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
