/**
 * Author: GP
 * URL:
 * twitter:
 * */
package com.gp.controller;

import java.util.List;

import com.gp.livedemo.R;
import com.gp.model.Geoname;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomListAdapter extends BaseAdapter {
	
	private Context context;
	private List<Geoname> list;
	
	public CustomListAdapter(Context context,List<Geoname> list){
		this.context = context;
		this.list = list;
	}

	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Geoname getItem(int position) {		
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	public class ViewHolder
	{
		TextView txt_title,txt_code;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder=null;
		Geoname item=getItem(position);
		if (convertView == null) 
		{
			holder=new ViewHolder();
            LayoutInflater mInflater = (LayoutInflater)
                    context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.item_list_child, null);
           holder.txt_title=(TextView)convertView.findViewById(R.id.textView1);
           holder.txt_code=(TextView)convertView.findViewById(R.id.textView2);
           convertView.setTag(holder);
        }
		else
		{
			holder=(ViewHolder)convertView.getTag();
		}
               
		holder.txt_title.setTextColor(Color.BLACK);
		holder.txt_title.setText(item.getName());
		holder.txt_code.setTextColor(Color.BLACK);
		holder.txt_code.setText(""+item.getCountrycode());
		
	//	holder.txt_to.setText(item.getDestination());
		
        return convertView;
	}

}
