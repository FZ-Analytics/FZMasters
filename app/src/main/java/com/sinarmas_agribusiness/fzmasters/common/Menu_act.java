package com.sinarmas_agribusiness.fzmasters.common;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.sinarmas_agribusiness.fzmasters.R;
import com.sinarmas_agribusiness.fzmasters.user.User_act;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Menu_act extends AppCompatActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_lay);
		ButterKnife.bind(this);
	}

	@OnClick({R.id.ivUser, R.id.rlUser})
	public void onViewClicked(View view)
	{
		switch(view.getId())
		{
			case R.id.ivUser:
			case R.id.rlUser:
				Intent MenuUserIntent=new Intent(Menu_act.this, User_act.class);
				startActivity(MenuUserIntent);
				finish();
			break;
		}
	}
}
