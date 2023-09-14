package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
	
	private List<Integer> list = new ArrayList<>();
	
	public void addValue(int value) {
		list.add(value);
	}
	
	public int first() {
		return list.get(0);
	}
	
	public void print() {
		System.out.println(list);
	}

}
