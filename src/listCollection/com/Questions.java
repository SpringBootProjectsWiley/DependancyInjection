package listCollection.com;

import java.util.*;

public class Questions {
	private int id;
	private String name;
	private List<String> answers;
	public Questions(int id, String name, List<String> answers) {
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
	public void print() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		Iterator<String> itr=answers.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
