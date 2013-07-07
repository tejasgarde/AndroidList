package com.example.listapplication;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class ListActivity extends Activity {
	
	TimeTrackerAdapter timeTrackerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView listView = (ListView)findViewById(R.id.times_list);
        timeTrackerAdapter = new TimeTrackerAdapter();
        //Attach Adapter to the ListView
        listView.setAdapter(timeTrackerAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.list, menu);
        return true;
    }
    
}
