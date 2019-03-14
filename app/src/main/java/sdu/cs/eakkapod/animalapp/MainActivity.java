package sdu.cs.eakkapod.animalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Explicit
    EditText userEditText,passEditText;
    Button loginButton;
    String  userString , passString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ดูตัวแปล
        userEditText = findViewById(R.id.edtUsername);
        passEditText = findViewById(R.id.edtPassword);
        loginButton = findViewById(R.id.btnLogin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //ขั้ค่า
                userString = userEditText.getText().toString().trim();
                passString = passEditText.getText().toString().trim();
                //Check ค่าว่าง
                if (userString.length() == 0 || (passString.length() ==0 )) {
                    Toast.makeText(getApplicationContext(), "ใส่ให้ครับทุกช่องครับ", Toast.LENGTH_SHORT).show();
                }else if
                    (userString.equals("admin")&& (passString.equals("1234"))){
                    Toast.makeText(getApplicationContext(),"เข้าาสู่ระบบ",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,GameActivity.class);
                    intent.putExtra("name",userString);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(),"กรอกข้อมูลให้ถูกต้อง",Toast.LENGTH_SHORT).show();
                }


            }
        });
    }//end OnCreate
}//end class
