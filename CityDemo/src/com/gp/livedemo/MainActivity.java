/**
 * Author: GP
 * URL:
 * twitter:
 * */
package com.gp.livedemo;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

import com.android.volley.Request.Method;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.gp.controller.CustomListAdapter;
import com.gp.model.Geoname;
import com.gp.model.ItemDemo;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	ListView lv_list;
    private ProgressDialog pDialog;
    
    ItemDemo mainlist=null;
    List<Geoname> list;
    CustomListAdapter adapter;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		init();
	}

	
	private void init()
	{
		pDialog = new ProgressDialog(this);
        pDialog.setMessage("Please wait...");
        pDialog.setCancelable(false);
		lv_list=(ListView)findViewById(R.id.lv_list);
		
		mainlist=new ItemDemo();
		list=new ArrayList<Geoname>();
		adapter=new CustomListAdapter(getApplicationContext(), list);
		lv_list.setAdapter(adapter);
		
		getGeonames();
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
		lv_list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Geoname item=list.get(arg2);
				AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
				View view=getLayoutInflater().inflate(R.layout.dialog_view, null);
				/*"lng": -99.12766456604,
			      "geonameId": 3530597,
			      "countrycode": "MX",
			      "name": "Mexiko-Stadt",
			      "fclName": "city, village,...",
			      "toponymName": "Mexico City",
			      "fcodeName": "capital of a political entity",
			      "wikipedia": "en.wikipedia.org/wiki/Mexico_City",
			      "lat": 19.428472427036,
			      "fcl": "P",
			      "population": 12294193,
			      "fcode": "PPLC" 		*/
				TextView txt_lat=(TextView)view.findViewById(R.id.txt_lat);
				TextView txt_long=(TextView)view.findViewById(R.id.txt_long);
				TextView txt_geonameId=(TextView)view.findViewById(R.id.txt_geoname);
				TextView txt_countrycode=(TextView)view.findViewById(R.id.txt_country_code);
				TextView txt_name=(TextView)view.findViewById(R.id.txt_name);
				TextView txt_fclName=(TextView)view.findViewById(R.id.txt_Flc_name);
				TextView txt_toponymName=(TextView)view.findViewById(R.id.txt_toponymName);
				TextView txt_fcodeName=(TextView)view.findViewById(R.id.txt_fcodeName);
				TextView txt_wikipedia=(TextView)view.findViewById(R.id.txt_wikipedia);
				TextView txt_fcl=(TextView)view.findViewById(R.id.txt_flc);
				TextView txt_population=(TextView)view.findViewById(R.id.txt_population);
				TextView txt_fcode=(TextView)view.findViewById(R.id.txt_fcode);
				
				builder.setView(view);
				
				txt_lat.setText(Html.fromHtml("<b>Latitude: </b>"+item.getLat()));
				txt_long.setText(Html.fromHtml("<b>Longitude: </b>"+item.getLng()));
				txt_geonameId.setText(Html.fromHtml("<b>GeonameId: </b>"+item.getGeonameId()));
				txt_countrycode.setText(Html.fromHtml("<b>Countrycode: </b>"+item.getCountrycode()));
				txt_name.setText(Html.fromHtml("<b>Name: </b>"+item.getName()));
				txt_fclName.setText(Html.fromHtml("<b>fclName: </b>"+item.getFclName()));
				txt_toponymName.setText(Html.fromHtml("<b>toponymName: </b>"+item.getToponymName()));
				txt_fcodeName.setText(Html.fromHtml("<b>fcodeName: </b>"+item.getFcodeName()));
				txt_wikipedia.setText(Html.fromHtml("<b>wikipedia: </b>"+item.getWikipedia()));
				txt_fcl.setText(Html.fromHtml("<b>fcl: </b>"+item.getFcl()));
				txt_population.setText(Html.fromHtml("<b>Population: </b>"+item.getPopulation()));
				txt_fcode.setText(Html.fromHtml("<b>fcode: </b>"+item.getFcode()));
				
				builder.setPositiveButton("Okey", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						dialog.dismiss();
					}
				});
			//	builder.setTitle("Details");
				AlertDialog dialog=builder.create();
				dialog.show();
			}
		});
		
		
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}
	
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
	
	
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);
	}
	
	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onRestoreInstanceState(savedInstanceState);
	}
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
	private void getGeonames()
	{
		
		showpDialog();
		 
	    String urlJsonArry = "http://api.geonames.org/citiesJSON?north=44.1&south=-9.9&east=-22.4&west=55.2&lang=de&username=demo";
	    JsonObjectRequest req = new JsonObjectRequest(Method.GET,
	            urlJsonArry, null, new Response.Listener<JSONObject>() {
	                @Override
	                public void onResponse(JSONObject response) {
	                	Log.d("TAG", "response: " + response.toString());
		                   
	                    try {
	                    	
	                    	list.clear();
	                    	    
	                    	Geoname.deleteAll(Geoname.class);
	                      mainlist =AppController.gson.fromJson(response.toString(),ItemDemo.class);
	                      list= mainlist.getGeonames();
	                      	for (Geoname i :list) {
								i.save();
							}
	                     
	                      	/**
	                      	 * Refresh Adapter
	                      	 */
	                      refresh();
	                      
	                      
	                    } catch (Exception e) {
	                        e.printStackTrace();
	                    }
	 
	                    hidepDialog();
	                }
	            }, new Response.ErrorListener() {
	                @Override
	                public void onErrorResponse(VolleyError error) {
	                    VolleyLog.d("TAG", "Error: " + error.getMessage());
	                    Toast.makeText(getApplicationContext(),
	                            error.getMessage(), Toast.LENGTH_SHORT).show();
	                    hidepDialog();
	                }
	            });
	 
	    // Adding request to request queue
	    
	   AppController.getInstance().addToRequestQueue(req);
		
		
	}
	
	private void showpDialog() {
        if (!pDialog.isShowing())
            pDialog.show();
    }
 
    private void hidepDialog() {
        if (pDialog.isShowing())
            pDialog.dismiss();
    }
    
    private void refresh() {
        
    	 list=new ArrayList<Geoname>();
    	 list=Geoname.listAll(Geoname.class);
    	
        adapter=new CustomListAdapter(getApplicationContext(), list);
        lv_list.setAdapter(adapter);
        adapter.notifyDataSetChanged();

	}
}
