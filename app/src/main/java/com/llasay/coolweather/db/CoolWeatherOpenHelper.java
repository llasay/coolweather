package com.llasay.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by 19726 on 2016/5/4.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper{

    /**
     *  Create Table Province
     */
    public static final String CREATE_PROVICE = "create table Province ("
            + "id integer primary key autoincrement, "
            + "province_name text, "
            + "province_code text)";
    /**
     *  Create Table City
     */
    public static final String CREATE_CITY = "create table city ("
            + "id integer primary key autoincrement"
            + "city_name text, "
            + "city_code text"
            + "province_id integer";
    /**
     *  Create Table County
     */
    public static final String CREATE_COUNTY = "create table county ("
            + "id integer primary key autoincrement"
            + "county_name text, "
            + "county_code text"
            + "city_id integer";
    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_PROVICE); //create tables
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }
}
