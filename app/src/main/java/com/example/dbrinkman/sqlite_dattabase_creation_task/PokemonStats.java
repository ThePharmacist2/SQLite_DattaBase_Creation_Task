package com.example.dbrinkman.sqlite_dattabase_creation_task;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by student on 14/04/2016.
 */
public class PokemonStats extends SQLiteOpenHelper{
    private final static String DB_NAME = "Pokemon";
    private final static int DB_Version = 1;
    public PokemonStats(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE POKEMON STATS "
                + "(_id INTEGER PRIMARY KEY AUTOINCRIMENT, "
                + "NAME TEXT, "
                + "ATTACK INTEGER, "
                + "SP_ATTACK INTEGER, "
                + "HP INTEGER, "
                + "DEFENSE INTEGER, "
                + "SP_DEFENSE INTEGER, "
                + "SPEED INTEGER);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
