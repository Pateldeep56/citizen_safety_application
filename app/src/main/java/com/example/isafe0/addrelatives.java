package com.example.isafe0;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class addrelatives extends AppCompatActivity {
    TextInputLayout edt_name , edt_num ;
    Button add , contacts ;
    DatabaseHandler db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addrelatives);
        edt_name = findViewById(R.id.et8);
        edt_num = findViewById(R.id.et9);
        add = findViewById(R.id.b3);
        contacts = findViewById(R.id.b4);
        db = new DatabaseHandler(this);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edt_name.getEditText().getText().toString().trim();
                String number = edt_num.getEditText().getText().toString().trim();
                if(edt_name.getEditText().length() != 0 && !checkPhoneNumber() && !isCheckContactExist(number)){
                    boolean isInserted = db.insertData(name,number);
                    if(isInserted){
                        edt_name.getEditText().setText(null);
                        edt_num.getEditText().setText(null);
                        Toast.makeText(addrelatives.this, "Contact added successfully!", Toast.LENGTH_SHORT).show();
                        edt_name.requestFocus();
                    }
                    else
                        Toast.makeText(addrelatives.this, "Something went wrong!", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(addrelatives.this, "Please enter correct data", Toast.LENGTH_SHORT).show();
            }
        });

        contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor cursor = db.getAllContacts();
                if(cursor.getCount() == 0){
                    Toast.makeText(addrelatives.this, "No Contacts added", Toast.LENGTH_SHORT).show();
                }
                else {
                    startActivity(new Intent(addrelatives.this,ViewContacts.class));
                }

            }
        });
    }

    public boolean checkPhoneNumber(){
        String number = edt_num.getEditText().getText().toString().trim();
        if(number.length() != 10){
            edt_num.setError("Invalid Number");
            edt_num.requestFocus();
            return true;
        } else {
            return false;
        }
    }

    private boolean isCheckContactExist(String phoneNo){
        if(db.getContact(phoneNo) != 0) {
            edt_num.setError("Contact Number Already Exists");
            edt_num.requestFocus();
            return true;
        }
        return false;
    }
}
