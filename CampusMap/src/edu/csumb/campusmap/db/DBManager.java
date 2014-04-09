package edu.csumb.campusmap.db;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBManager extends SQLiteOpenHelper {
	//private SQLiteDatabase db;
	static final String DB_NAME = "assets/Locations.db";
	public DBManager(Context context)
	{
		//TODO figure out what a Context is
		super(context, DB_NAME, null, 1);
		
	}
	@Override
	public void onCreate(SQLiteDatabase db) 
	{
		// TODO Auto-generated method stub
		StringBuilder tableCreateString = new StringBuilder();
		BufferedReader createStringReader;
		try
		{
			createStringReader = new BufferedReader(new FileReader("assets/Locations.sql"));
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			createStringReader = null;
		}
		if(createStringReader != null)
		{
			try
			{
				while(createStringReader.ready())
				{
					tableCreateString.append(createStringReader.readLine());
					
				}
			}
			catch (IOException e)
			{
				e.printStackTrace();
			
			}
		}
		db.execSQL(tableCreateString.toString());
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}

}
