package com.example.jayson.assignment6.domain;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.TextView;

/**
 * Created by JAYSON on 2016-09-17.
 */
public class DB extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Employee.db";

    public DB(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE employees ( ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME, SURNAME, LICENSE)");

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS employees");
        onCreate(db);

    }

    public void viewEmployees(TextView textView)
    {
        Cursor cursor = this.getReadableDatabase().rawQuery("select * from employees", null);
        textView.setText("");
        while(cursor.moveToNext())
        {
            textView.append(cursor.getString(0) +" "+ cursor.getString(1)+ " "+ cursor.getString(2)+ " "+ cursor.getString(3)+"\n");
        }
    }

    public boolean insertEmployee(String name, String surname, String license) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("surname", surname);
        contentValues.put("license", license);

        long result = db.insert("employees", null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
}
