package com.sunbeam;

public class LinkedList {
	static class Node {
		int data;
		Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;
	private Node tail;

	public LinkedList() {
		head = null;
		tail = null;
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (head == null) {
			head = newnode;
			tail = newnode;
		} else {
			tail.next = newnode;
			tail = newnode;
		}
		System.out.println("Added " + value + " at the end. Head: " + head.data + ", Tail: " + tail.data);
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;
		if(tail == null) {
			tail=newnode;
		}
	}

	public void insertAfter(int afterValue, int newValue) {
		Node trav = head;
		while (trav != null && trav.data != afterValue) {
			trav = trav.next;
		}
		if (trav != null) {
			Node newnode = new Node(newValue);
			newnode.next = trav.next;
			trav.next = newnode;
			if (trav == tail) {
				tail = newnode;
			}
		}
	}

	public void display() {
		Node trav = head;
		System.out.print("List :: ");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst(10);
		list.addFirst(20);
  	   list.addLast(30);
  	   
  	   list.insertAfter(2, 50);
  		list.display();
		
	}
}
