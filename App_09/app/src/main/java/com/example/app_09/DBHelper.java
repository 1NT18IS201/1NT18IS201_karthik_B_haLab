package com.example.app_09;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
//import android.support.annotation.Nullable;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import org.jetbrains.annotations.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {
        super(context, "User.db", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create Table Userdetails(name TEXT primary key, contact TEXT, age TEXT, sal TEXT)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop Table if exists Userdetails");
    }
    public boolean insertData(String name,String contact,String age, String sal){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("name",name);
        cv.put("contact",contact);
        cv.put("age",age);
        cv.put("sal",sal);
        long result=db.insert("Userdetails", null, cv);
        if(result==-1)
            return false;
        else
            return true;
    }
    public boolean updateData(String name,String contact,String age, String sal){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("contact",contact);
        cv.put("age",age);
        cv.put("sal",sal);
        Cursor cursor = db.rawQuery("Select * from Userdetails where name = ?", new String[] {name});
        if(cursor.getCount() > 0) {
            long result = db.update("Userdetails", cv, "name=?", new String[] {name});
            if (result == -1)
                return false;
            else
                return true;
        } else {
            return false;
        }
    }
    public boolean deleteData(String name){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        Cursor cursor = db.rawQuery("Select * from Userdetails where name = ?", new String[] {name});
        if(cursor.getCount() > 0) {
            long result = db.delete("Userdetails", "name=?", new String[] {name});
            if (result == -1)
                return false;
            else
                return true;
        } else {
            return false;
        }
    }
    public Cursor viewData () {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("Select * from Userdetails", null);
        return cursor;
    }
}