package com.example.listviewdemo.demo3.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.listviewdemo.R;
import com.example.listviewdemo.bean.DemoBean;
import com.example.listviewdemo.demo1.view.Type1ItemView;
import com.example.listviewdemo.demo1.view.Type2ItemView;

public class Demo3Adapter  extends BaseAdapter{
	
	private ArrayList<DemoBean> list;
	
	private Context context;
	
	public Demo3Adapter(Context context,ArrayList<DemoBean> list){
		this.list=list;
		this.context=context;
	}
	
	
	public int getCount() {
		return list.size();
	}

	
	public Object getItem(int position) {
		return position;
	}

	
	public long getItemId(int position) {
		return position;
	}

	
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder=null;
		if(convertView==null){
			holder=new ViewHolder();
			convertView=LayoutInflater.from(context).inflate(R.layout.type_include, null);
			holder.type1View=new Type1ItemView(convertView.findViewById(R.id.include_type1), context);
			holder.type2View=new Type2ItemView(convertView.findViewById(R.id.include_type2), context);
			
			Log.e("Layout inflate", "Layout inflate: type main");
			
			convertView.setTag(holder);
		} else{
			holder=(ViewHolder)convertView.getTag();
		}
		
		DemoBean bean=list.get(position);
		
		if("1".equals(bean.getType())){
			holder.type1View.setBean(bean);
			holder.type1View.setVisibility(View.VISIBLE);
			holder.type1View.setValue();
			holder.type2View.setVisibility(View.GONE);
		}
		else if("2".equals(bean.getType())){
			holder.type2View.setBean(bean);
			holder.type2View.setVisibility(View.VISIBLE);
			holder.type2View.setValue();
			holder.type1View.setVisibility(View.GONE);
		}
		
		return convertView;
	}
	
	class ViewHolder{
		
		public Type1ItemView type1View;
		public Type2ItemView type2View;
		
	}

 
}
