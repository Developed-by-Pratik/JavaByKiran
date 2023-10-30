package com.tasks.OOPS;

public class StudentMember extends LibraryMember {

	public StudentMember(int memberID, String name) {
		super(memberID, name);
	}

	@Override
	public void borrowItem(LibraryItem item) {
		item.displayInfo();
	}

	
	
}
