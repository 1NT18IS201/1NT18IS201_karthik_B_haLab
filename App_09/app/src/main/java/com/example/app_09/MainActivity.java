package com.example.app_09;
import android.database.Cursor;
//import android.support.v7.app.AlertDialog;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText name, contact, age, sal;
    Button insert, update, delete, view;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        contact=findViewById(R.id.contact);
        age=findViewById(R.id.age);
        sal=findViewById(R.id.sal);
        insert=findViewById(R.id.btnInsert);
        update=findViewById(R.id.btnUpdate);
        delete=findViewById(R.id.btnDelete);
        view=findViewById(R.id.btnView);
        DB = new DBHelper(this);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameTXT = name.getText().toString();
                String contactTXT = contact.getText().toString();
                String ageTXT = age.getText().toString();
                String salTXT = sal.getText().toString();
                Toast.makeText(MainActivity.this, "" + salTXT, Toast.LENGTH_SHORT).show();
                boolean qryStatus = DB.insertData(nameTXT,contactTXT,ageTXT,salTXT);
                if (qryStatus==true)
                    Toast.makeText(MainActivity.this, "New Record Created", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "New Record Creation Failed", Toast.LENGTH_SHORT).show();
                name.setText("");
                contact.setText("");
                age.setText("");
                sal.setText("");
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameTXT = name.getText().toString();
                String contactTXT = contact.getText().toString();
                String ageTXT = age.getText().toString();
                String salTXT = sal.getText().toString();
                boolean qryStatus = DB.updateData(nameTXT,contactTXT,ageTXT,salTXT);
                if (qryStatus==true)
                    Toast.makeText(MainActivity.this, "Record Updated", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Record Updation Failed", Toast.LENGTH_SHORT).show();
                name.setText("");
                contact.setText("");
                age.setText("");
                sal.setText("");
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameTXT = name.getText().toString();
                boolean qryStatus = DB.deleteData(nameTXT);
                if (qryStatus==true)
                    Toast.makeText(MainActivity.this, "Record Deleted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Record Deletion Failed", Toast.LENGTH_SHORT).show();
                name.setText("");
                contact.setText("");
                age.setText("");
                sal.setText("");
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = DB.viewData();
                if(res.getCount()==0)
                    Toast.makeText(MainActivity.this, "No Record Exist", Toast.LENGTH_SHORT).show();
                else {
                    StringBuffer buffer = new StringBuffer();
                    while(res.moveToNext()){
                        buffer.append("Name :"+res.getString(0)+"\n");
                        buffer.append("Contact :"+res.getString(1)+"\n");
                        buffer.append("Age :"+res.getString(2)+"\n");
                        buffer.append("Salary:"+res.getString(3)+"\n\n");
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setCancelable(true);
                    builder.setTitle("User Data");
                    builder.setMessage(buffer.toString());
                    builder.show();
                }
            }
        });
    } }
