package com.example.timingmate;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	private ListView drawerList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _initMenu();
    }
    
    private void _initMenu(){
    	String[] fake_list_items = {"a","b","c","d"};
    	ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this,R.layout.drawer_list_item,fake_list_items);
    	drawerList = (ListView) findViewById(R.id.drawer);
        if (drawerList != null)
            drawerList.setAdapter(listAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
