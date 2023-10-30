package com.tasks.OOPS;

public class FacultyMember extends LibraryMember {

	public FacultyMember(int memberID, String name) {
		super(memberID, name);
	}

	@Override
	public void borrowItem(LibraryItem item) {
		item.displayInfo();
	}

	
	
}
