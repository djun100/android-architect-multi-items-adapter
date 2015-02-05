package com.listviewdemo.demo4;

import java.util.List;

import android.content.Context;

public abstract class AdapterCommonSingleStyle<T> extends CommonAdapter {

	public AdapterCommonSingleStyle(Context ctx, List lists, int layoutId) {
		super(ctx, lists, layoutId);
	}

	@Override
	protected void convert(ViewHolder vh, List mDatas, int position) {
		// TODO Auto-generated method stub
		convert(vh, (T)mDatas.get(position));
	}
	abstract protected void convert(ViewHolder vh,T item);
}
