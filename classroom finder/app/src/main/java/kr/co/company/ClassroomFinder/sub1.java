package kr.co.company.ClassroomFinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class sub1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void gclick (View view){
        Intent intent = new Intent(getApplicationContext(), sub2.class);
        startActivity(intent);
    }
    public void iclick (View view){
        Intent intent = new Intent(getApplicationContext(), sub2.class);
        startActivity(intent);
    }
    public void seven (View view){
        Intent intent = new Intent(getApplicationContext(), sub2.class);
        startActivity(intent);
    }
    public void bclick (View view){
        Intent intent = new Intent(getApplicationContext(), sub2.class);
        startActivity(intent);
    }
    public void sclick (View view){
        Intent intent = new Intent(getApplicationContext(), sub2.class);
        startActivity(intent);
    }
    public void aclick (View view){
        Intent intent = new Intent(getApplicationContext(), sub2.class);
        startActivity(intent);
    }
    public void lclick (View view){
        Intent intent = new Intent(getApplicationContext(), sub2.class);
        startActivity(intent);
    }


}
