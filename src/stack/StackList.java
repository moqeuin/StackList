package stack;

import java.util.ArrayList;

public class StackList {
	private ArrayList<Object> list = new ArrayList<Object>();
	
	public StackList() {}
	/*
	 push, pop, isEmpty, peek
	 */
	
	
	// 데이터 공간이 비어있는지  확인하다. 리스트의 경우 길이가 0인지 확인.
	public boolean isEmpty() {
		boolean empty = false;
		if(list.size() == 0) {
			empty = true;
		}
		return empty;
	}
	// top인덱스를 가진 데이터를 가져온다. 없으면 null.
	public Object peek() {
		if(isEmpty()) {
			return null;
		}
		else {
			return list.get(list.size()-1);
		}
	}
	// push : 데이터를 저장공간에 저장한다. 그리고 top(size-1)의 인덱스를 갖는다.
	public void push(Object obj) {
		list.add(obj);		
	}
	// pop : top의 인덱스를 가진 데이터 가져와서  제거하고 데이터를 리턴한다.
	// 제거하기 전에 비어있는지 확인.
	public Object pop() {
		
		Object obj = peek();
		
		if(obj == null) {
			System.out.print("제거할 데이터가 없습니다 : ");
		}
		else {
			list.remove(obj);
		}
		return obj;		
	}
}
