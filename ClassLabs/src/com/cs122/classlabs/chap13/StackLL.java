package com.cs122.classlabs.chap13;

import java.util.LinkedList;
public class StackLL<T> {
	public LinkedList<T> l;
	
	public void StacksLL() {
		l = new LinkedList<T>();
	}
	
	public void push(T o) {
		l.addFirst(o);
		
		
	}
	
	
	public T pop() {
		return l.removeFirst();	
	}
		
		public  T peek() {
			return l.get(0);
	}
		public String toString() {
			return l.toString();
			
		}
		

}
