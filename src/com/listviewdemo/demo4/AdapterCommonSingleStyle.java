package com.listviewdemo.demo4;

import java.util.List;

import android.content.Context;

/**item样式完全一样，不需要position信息加以区别更改指定position的item的样式的AdapterCommon子类
 * 不需要针对不同item进行处理
 * @author 承影
 *
 * @param <T>
 */
public abstract class AdapterCommonSingleStyle<T> extends AdapterCommon {

	public AdapterCommonSingleStyle(Context ctx, List<?> lists, int layoutId) {
		super(ctx, lists, layoutId);
	}

	@Override
	protected void convert(ViewHolder vh, List mDatas, int position) {
		// TODO Auto-generated method stub
		convert(vh, (T)mDatas.get(position));
	}
	abstract protected void convert(ViewHolder vh,T item);
}
