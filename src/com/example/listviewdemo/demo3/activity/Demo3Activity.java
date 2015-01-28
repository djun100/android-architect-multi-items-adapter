package com.example.listviewdemo.demo3.activity;

import java.util.ArrayList;

import com.example.listviewdemo.R;
import com.example.listviewdemo.bean.DemoBean;
import com.example.listviewdemo.demo1.adapter.Demo1Adapter;
import com.example.listviewdemo.demo3.adapter.Demo3Adapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

public class Demo3Activity extends Activity{

	private ListView listView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listview);
		listView=(ListView)findViewById(R.id.listview);
		
		listView.setAdapter(new Demo3Adapter(Demo3Activity.this,getDemoBean()));
		
	}
	
	
	private ArrayList<DemoBean>  getDemoBean(){
		ArrayList<DemoBean> list=new ArrayList<DemoBean>();
		for (int i = 0; i < 10; i++) {
			list.add(new DemoBean("1"));
			list.add(new DemoBean("1"));
			list.add(new DemoBean("1"));
			list.add(new DemoBean("1"));
			list.add(new DemoBean("1"));
			list.add(new DemoBean("1"));
			list.add(new DemoBean("2"));
			list.add(new DemoBean("2"));
			list.add(new DemoBean("2"));
			list.add(new DemoBean("2"));
			list.add(new DemoBean("2"));
			list.add(new DemoBean("2"));
		}
		
		return list;
	}
	
}
