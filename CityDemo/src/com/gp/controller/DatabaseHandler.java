/**
 * Author: GP
 * URL:
 * twitter:
 * */
package com.gp.controller;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Not in used
 * @author admin
 *
 */
public class DatabaseHandler extends SQLiteOpenHelper 
{
	// Database Version
	private static final int DATABASE_VERSION = 1;
	
	// Database Name
	private static final String DATABASE_NAME = "demo";
	
	

	private static final String TABLE_REGISTER = "register";
	public DatabaseHandler(Context context) {
		
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	

	// Creating Tables
	@Override
	public void onCreate(SQLiteDatabase db) {
			
	}
	// Upgrading database
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// Drop older table if existed
		
	}
	
}