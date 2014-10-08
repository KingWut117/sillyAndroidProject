package ctec.sillyandroidproject.controller;

import ctec.sillyandroidproject.R;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SillyActivity extends ActionBarActivity
{
	private Button appButton;
	private TextView appText;
	private RelativeLayout appLayout;
	private Button redButton;
	private Button whiteButton;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.silly_activity);
		
		//Gives you access to a button or any View object
		appButton = (Button) findViewById(R.id.firstButton);
		redButton = (Button) findViewById(R.id.redButton);
		whiteButton = (Button) findViewById(R.id.whiteButton);
		appText = (TextView) findViewById(R.id.lyrics);
		appLayout = (RelativeLayout) findViewById(R.id.appLayout);
		
		
		setupListeners();
	}
	
	private void setupListeners()
	{
		appButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundResource(R.color.uglyGreen);
			}
		});
		
		redButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundResource(R.color.uglyRed);
			}
		});
		
		whiteButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundResource(R.color.white);
			}
		});
	}
}
