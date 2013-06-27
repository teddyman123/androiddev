/*******************************************************************************
 * Copyright 2013 Gabriele Mariotti
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package it.gmariotti.android.example.listview;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Bad Adapter.
 * 
 * DON'T USE IT !!!!!
 * 
 */
public class MyBadAdapter extends ArrayAdapter<MyObj> {

	private static String TAG= "MyBadAdapter";
	
	private Activity mContext;
	//private LayoutInflater mInflater;

	public MyBadAdapter(Activity context, int textViewResourceId) {
		super(context, textViewResourceId);
		mContext=context;
		// mInflater =
		// (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	
	public View getView(int position, View convertView, ViewGroup parent) {

		Log.d(TAG, "position="+position);
		LayoutInflater mInflater = mContext.getLayoutInflater();
		View item = mInflater.inflate(R.layout.list_item, null);

		MyObj data = getItem(position);

		((TextView) item.findViewById(R.id.text1)).setText(data.text1);
		((TextView) item.findViewById(R.id.text2)).setText(data.text2);
		((TextView) item.findViewById(R.id.longtext)).setText(data.longText);
		return item;
	}

}