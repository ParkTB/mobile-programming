package kr.co.company.ClassroomFinder;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

class DBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "mycontacts.db";

    private static final int DATABASE_VERSION = 2;

    public DBHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE contacts ( _id INTEGER PRIMARY KEY" +
            " AUTOINCREMENT, id TEXT, passwd TEXT);");
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS contacts");
            onCreate(db);
    }
}

public class iddb extends AppCompatActivity {
    DBHelper helper;
    SQLiteDatabase db;
    EditText user_id, user_passwd;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helper = new DBHelper(this);
        try {
            db = helper.getWritableDatabase();
        } catch (SQLiteException ex) {
            db = helper.getReadableDatabase();
        }
        user_id = (EditText) findViewById(R.id.id);
        user_passwd = (EditText) findViewById(R.id.passwd);
    }

    public void insert(View target) {
        String id = user_id.getText().toString();
        String passwd = user_passwd.getText().toString();
        db.execSQL("INSERT INTO contacts VALUES (null, '" + id + "', '" + passwd
                + "');");
        Toast.makeText(getApplicationContext(), "성공적으로 추가되었음",
                Toast.LENGTH_SHORT).show();
        user_id.setText("");
        user_passwd.setText("");
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }



}

