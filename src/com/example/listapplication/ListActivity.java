package com.example.listapplication;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
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
    
    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
    	if(item.getItemId() == R.id.add_time_menu_item){
    		Intent intent = new Intent(this , AddTimeActivity.class);
    		startActivity(intent);
    		
    		return true;
    	}
    	return super.onMenuItemSelected(featureId, item);
    }
    
}
