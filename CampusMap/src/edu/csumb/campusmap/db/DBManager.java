package edu.csumb.campusmap.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBManager extends SQLiteOpenHelper {
	private SQLiteDatabase db;

	public DBManager(Context context, String name, SQLiteDatabase.CursorFactory factory, int version)
	{
		//TODO figure out what a Context is
		super(context, name, factory, version);
		db = SQLiteDatabase.openDatabase("assets/Locations.db", null, SQLiteDatabase.OPEN_READWRITE);
		
	}
	@Override
	public void onCreate(SQLiteDatabase arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}

}
