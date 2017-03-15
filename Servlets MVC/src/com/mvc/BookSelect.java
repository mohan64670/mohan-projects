package com.mvc;

import java.util.ArrayList;
import java.util.List;

public class BookSelect {
	public List<String> getBooks(String Skill){
		List <String> Books = new ArrayList<String>();
		if(Skill.equals("Java")){
			Books.add("Head First Java");
			Books.add("Java: The Complete Reference");
		}
		if(Skill.equals("JavaScript")){
			Books.add("Head First JavaScript");
			Books.add("JavaScript the good parts");
		}
		if(Skill.equals("Spring")){
			Books.add("Head First Spring");
			Books.add("Spring Pro");
		}
		if(Skill.equals("Struts")){
			Books.add("Struts 2 in action");
			Books.add("Struts Survival Guide");
		}
		
		return Books;
		
		
	}

}
