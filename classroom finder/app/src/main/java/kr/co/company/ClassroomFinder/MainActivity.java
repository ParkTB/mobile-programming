package kr.co.company.ClassroomFinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void signin (View view){
        Intent intent = new Intent(getApplicationContext(), sub1.class);
        startActivity(intent);
    }
    public void signup (View view){
        Intent intent = new Intent(getApplicationContext(), iddb.class);
        startActivity(intent);
    }


}
