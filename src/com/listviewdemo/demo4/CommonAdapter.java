package com.listviewdemo.demo4;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * author:janecer 
 * email:jiangxiaocai@youline.com.cn
 * 2014年8月29日  下午6:09:36
 * 类说明 
 * @param <T>
 */
public abstract class CommonAdapter<T>  extends BaseAdapter {

	protected List<T> mDatas;
	protected LayoutInflater mInflater;  
    protected Context mContext; 
    protected int layoutId;
    
    public CommonAdapter(Context ctx,List<T> lists,int layoutId){
    	this.mDatas=lists;
    	mInflater=(LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    	this.mContext=ctx;
    	this.layoutId=layoutId;
    }
    
	@Override
	public int getCount() {
		return mDatas.size();
	}

	@Override
	public Object getItem(int position) {
		return mDatas.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

/*	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder vh=ViewHolder.getViewHolder(convertView, mContext, parent, layoutId, position);
		convert(vh, mDatas.get(position));
		return vh.getConvertView();
	}
	
	abstract protected void convert(ViewHolder vh,T item);*/
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder vh=ViewHolder.getViewHolder(convertView, mContext, parent, layoutId, position);
		convert(vh, mDatas,position);
		return vh.getConvertView();
	}
	
	abstract protected void convert(ViewHolder vh,List<T> mDatas,int position);

}
