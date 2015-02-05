package com.listviewdemo.demo4;

import java.util.ArrayList;

import com.example.listviewdemo.R;
import com.example.listviewdemo.bean.DemoBean;
import com.example.listviewdemo.demo1.adapter.Demo1Adapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

public class Demo4Activity extends Activity{

	private ListView listView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listview);
		listView=(ListView)findViewById(R.id.listview);
		
		CommonAdapter<DemoBean> mAdapter;
		listView.setAdapter(mAdapter = new AdapterCommonSingleStyle<DemoBean>(  
                getApplicationContext(), getDemoBean(), R.layout.type1)  
        {  
            @Override  
            public void convert(ViewHolder helper, DemoBean item)  
            {  
//                helper.setText(R.id.tv_time, item.getTime());  
                  
//              helper.getView(R.id.tv_title).setOnClickListener(l)  
            }  
  
        });
		
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
