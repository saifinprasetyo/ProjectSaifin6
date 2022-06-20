package com.example.projectsaifin6;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button LogInButton;
    EditText Email, Password;
    TextView RegisterButton;
    String EmailHolder, PasswordHolder;
    boolean EditTextEmptyHolder;
    SQLiteDatabase sqLiteDatabaseObj;
    SQLiteHelper sqLiteHelper;
    Cursor cursor;
    String TempPassword = "NOT_FOUND";
    public static final String UserEmail = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogInButton = (Button) findViewById(R.id.buttonLogin);

        RegisterButton = (TextView) findViewById(R.id.textRegister);

        Email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        Password = (EditText) findViewById(R.id.editTextTextPassword);

        sqLiteHelper = new SQLiteOpenHelper(this) {
            @Override
            public void onCreate(SQLiteDatabase sqLiteDatabase) {

            }

            @Override
            public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

            }
        };

        //method OneClick Login
        LogInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Method Cek Email Password
                CheckEditTextStatus ();

                //Method Login Akun
                LoginFunction();
            }

            private void LoginFunction() {
            }
        });
    }

    private void CheckEditTextStatus() {
    }
}