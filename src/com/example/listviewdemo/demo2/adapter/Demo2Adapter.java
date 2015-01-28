package com.example.listviewdemo.demo2.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.listviewdemo.R;
import com.example.listviewdemo.bean.DemoBean;
import com.example.listviewdemo.demo1.view.Type1ItemView;
import com.example.listviewdemo.demo1.view.Type2ItemView;

public class Demo2Adapter  extends BaseAdapter{
	
	private ArrayList<DemoBean> list;
	
	private Context context;
	
	public Demo2Adapter(Context context,ArrayList<DemoBean> list){
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
	
	/**
	 * 在使用ListView时，如果使用了getItemViewType， 记得他的值一定要是从0开始计数的。
	 *  且要覆盖getViewTypeCount方法。
	 *  并且让getViewTypeCount>getItemViewType否则会有数组越界异常：
	 */
	@Override
	public int getItemViewType(int position) {
		DemoBean bean=list.get(position);
		if("2".equals(bean.getType())){
			return 1;
		}
		
		return 0;
	}
	
	@Override
	public int getViewTypeCount() {
		return 2;
	}

	public View getView(int position, View convertView, ViewGroup parent) {

		DemoBean bean=list.get(position);
		/**
		 * 最多每个类型缓存1屏的view,比如 1屏显示4个view，2个类型，最多A布局生成4个B布局生成4个
		 */
		if(convertView==null){
			if("1".equals(bean.getType())){
				Type1ItemView type1=new Type1ItemView(context);
				convertView=type1.view;
				convertView.setTag(R.id.type,"1");
				convertView.setTag(type1);
				Log.e("Layout inflate", "Layout inflate: type1");
			}
			else if("2".equals(bean.getType())){
				Type2ItemView type2=new Type2ItemView(context);
				convertView=type2.view;
				convertView.setTag(R.id.type,"2");
				convertView.setTag(type2);
				Log.e("Layout inflate", "Layout inflate: type2");
			}
			
		} 
//		不一定要else 再getTag()。。。
//		set get操作只是取值而已。。if完再走一次get没有影响的 这样代码也好看一点，而且还可以给holder加final
		Object obj=convertView.getTag();
		if(obj instanceof Type1ItemView){
			Type1ItemView holder=(Type1ItemView)obj;
//			把holder拿出去单独写，这样adapter里面的代码不会乱。 
//			别把不懂布局的设置都写adapter里面,类似朋友圈那个界面的代码
			holder.setBean(bean);
			holder.setValue();
		}
		else if(obj instanceof Type2ItemView){
			Type2ItemView holder=(Type2ItemView)obj;
//			把holder拿出去单独写，这样adapter里面的代码不会乱。 
//			别把不懂布局的设置都写adapter里面,类似朋友圈那个界面的代码
			holder.setBean(bean);
			holder.setValue();
		}
		
		return convertView;
	}

 
}
