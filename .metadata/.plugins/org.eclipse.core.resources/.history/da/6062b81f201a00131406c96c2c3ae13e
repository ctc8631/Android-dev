package com.example.workdone;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	private Button button_save;
	private EditText text_title;
	private EditText text_cat;
	private EditText event_date;
	private EditText event_time;
	private EditText text_descrip;
	
	//	Call when the activity is first created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initViews();
        setListener();
    }
    
    private void initViews(){
    	button_save = (Button)findViewById(R.id.save);
    	text_title = (EditText)findViewById(R.id.title);
    	text_cat = (EditText)findViewById(R.id.cat);
    	event_date = (EditText)findViewById(R.id.date);
    	event_time = (EditText)findViewById(R.id.time);
    	text_descrip = (EditText)findViewById(R.id.descrip);
    }
    
    private void setListener() {
		button_save.setOnClickListener(saveRecord);
	}

    private OnClickListener saveRecord = new OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			String title = text_title.getText().toString();
			String cat = text_cat.getText().toString();
			String date = event_date.getText().toString();
			String time = event_time.getText().toString();
			String descrip = text_descrip.getText().toString();

		}
	};

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
