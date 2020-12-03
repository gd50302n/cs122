package com.cs122.classlabs.chap13;

public class IntList {
	
	private IntNode list;
	
	public void add(int x) {
		IntNode newNode = new IntNode(x);
		IntNode current;
		
		if(list == null)
			list = newNode;
		else
			current = list;
			while(current.next != null)
				current = current.next;
		
	}
	
	public void print() {
		
	}
	
	private class IntNode{
	public int data;
	public IntNode next;
	
	public IntNode(int n) {
		data = n;
		next = null;
	
	
	
	
	
