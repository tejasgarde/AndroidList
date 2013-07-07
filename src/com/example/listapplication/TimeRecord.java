package com.example.listapplication;

public class TimeRecord {

	private String time;
	private String notes;

	public TimeRecord(String t, String n) {
		time = t;
		notes = n;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
