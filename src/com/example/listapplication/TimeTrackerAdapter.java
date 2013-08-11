package com.example.listapplication;

import java.util.ArrayList;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class TimeTrackerAdapter extends BaseAdapter {
	// Arraylist of Actual Records To be Displayed on List
	ArrayList<TimeRecord> times = new ArrayList<TimeRecord>();
	
	
	public TimeTrackerAdapter(){
		times.add(new TimeRecord("21:21", "Feeling Good"));
		times.add(new TimeRecord("42:45", "Feeling Good"));
		times.add(new TimeRecord("51:50", "Feeling Good"));
		times.add(new TimeRecord("60:21", "Feeling Good"));
		times.add(new TimeRecord("75:25", "Feeling Good"));
	}

	// Get the # of Record (Dtat Related Method)
	@Override
	public int getCount() {
		return times.size();
	}

	// Get The Item to be displayed (Dtat Related Method)
	@Override
	public Object getItem(int position) {
		return getItem(position);
	}

	// Get the Record ID (Dtat Related Method)
	@Override
	public long getItemId(int position) {
		return -1;
	}

	// Get the View To Display Each Record (View Related Method)
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			// if view is null we ashould create view Using Layout inflator
			LayoutInflater inflater = LayoutInflater.from(parent.getContext());
			convertView = inflater.inflate(R.layout.time_list_item, parent,
					false);
		}

		// Each TIme Record to be displayed on List
		TimeRecord record = times.get(position);

		// Set Time of the Record
		TextView timeTextView = (TextView) convertView
				.findViewById(R.id.time_view);
		timeTextView.setText(record.getTime());
		// Set Notes of the record
		TextView notesTextView = (TextView) convertView
				.findViewById(R.id.notes_view);
		notesTextView.setText(record.getNotes());

		return convertView;
	}
	
	
	public void addTimeRecord(TimeRecord record){
		
		this.times.add(record);
	}

}
