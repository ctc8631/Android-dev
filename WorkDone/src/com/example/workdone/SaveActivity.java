package com.example.workdone;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SaveActivity extends Activity {
	@Override
	public void onCreate(Bundle saveInstanceState){
		super.onCreate(saveInstanceState);
		setContentView(R.layout.activity_save);
		initViews();
		showResults();
		//setListener();
	}
	
	private Button button_main;
	private TextView show_title;
	private TextView show_cat;
	private TextView show_date;
	private TextView show_time;
	private TextView show_descrip;
	
    private void initViews(){
    	button_main = (Button)findViewById(R.id.save_back);
    	show_title = (TextView)findViewById(R.id.title);
    	show_cat = (TextView)findViewById(R.id.cat);
    	show_date = (TextView)findViewById(R.id.date);
    	show_time = (TextView)findViewById(R.id.time);
    	show_descrip = (TextView)findViewById(R.id.descrip);
    }	
	
	private void showResults() {
		Bundle bundle = this.getIntent().getExtras();
		
	}
}
