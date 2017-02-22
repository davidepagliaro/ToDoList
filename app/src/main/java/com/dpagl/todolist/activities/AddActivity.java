package com.dpagl.todolist.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.dpagl.todolist.R;

/**
 * Created by dpagl on 20/02/2017.
 */

public class AddActivity extends AppCompatActivity {
    EditText title,body,endDate;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        title=(EditText)findViewById(R.id.add_titleET);
        body=(EditText)findViewById(R.id.add_bodyET);
        endDate=(EditText)findViewById(R.id.add_dataEndET);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

}

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_edit,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        int id = item.getItemId();

        if(id==R.id.item_confirm){
            if(body.getText().length()<120
                    && body.getText().length()!=0
                    && title.getText().length()<15
                    && endDate.getText().length()==8
                    && title.getText().length()!=0){

                Intent returnIntent=new Intent();
                returnIntent.putExtra("TITLE",title.getText().toString());
                returnIntent.putExtra("BODY",body.getText().toString());
                returnIntent.putExtra("ENDDATE",endDate.getText().toString());
                setResult(RESULT_OK,returnIntent);
                finish();
            }else {
                if(body.getText().length()!=0||title.getText().length()!=0||endDate.getText().length()!=0){
                    Toast.makeText(AddActivity.this,"Controlla la lunghezza dei testi",Toast.LENGTH_LONG).show();

                }else{
                    Toast.makeText(AddActivity.this,"Completa tutti i campi",Toast.LENGTH_LONG).show();
                }
            }

        }else if(id==android.R.id.home){
            setResult(Activity.RESULT_CANCELED);
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
