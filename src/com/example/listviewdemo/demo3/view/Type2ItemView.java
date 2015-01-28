package com.example.listviewdemo.demo3.view;
import com.example.listviewdemo.R;
import com.example.listviewdemo.bean.DemoBean;

import android.content.Context;
import android.view.View;
import android.widget.*;
import android.view.LayoutInflater;

public class Type2ItemView {

	 public View view;
	 public Context context;

	 public TextView  contentTx;
	 public ImageView  headImg;

	 private DemoBean bean;
	 
	 public Type2ItemView(Context context){
		 view=LayoutInflater.from(context).inflate(R.layout.type2, null);
		 this.context=context;
		 find();
	 }

 
	 public Type2ItemView(View view,Context context){
		 this.view=view;
		 this.context=context;
		 find();
	 }

	 private void find() {
		 contentTx=(TextView)view.findViewById(R.id.content_tx);
		 headImg=(ImageView)view.findViewById(R.id.head_img);

	 }

	 
		public DemoBean getBean() {
			return bean;
		}


		public void setBean(DemoBean bean) {
			this.bean = bean;
		}


		public void setValue() {
			contentTx.setText("当前类型为：type:"+bean.getType());
		}
		 
}
