package com.example.listviewdemo.demo1.activity;

import java.util.ArrayList;

import com.example.listviewdemo.R;
import com.example.listviewdemo.bean.DemoBean;
import com.example.listviewdemo.demo1.adapter.Demo1Adapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

public class Demo1Activity extends Activity{

	private ListView listView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listview);
		listView=(ListView)findViewById(R.id.listview);
		
		listView.setAdapter(new Demo1Adapter(Demo1Activity.this,getDemoBean()));
		
		Toast.makeText(Demo1Activity.this, "强烈不建议，会内存溢出", Toast.LENGTH_SHORT).show();
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
