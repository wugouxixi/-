package com.example.songhaining1997.dialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) this.findViewById(R.id.buttonTest);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                //LayoutInflater inflater = getLayoutInflater();
                builder.setTitle("登录");

                View v = LayoutInflater.from(MainActivity.this).inflate(R.layout.login_dialog, null);
                builder.setView(v);

                final EditText username = (EditText)v.findViewById(R.id.editTextUserId);
                final EditText password = (EditText)v.findViewById(R.id.editTextPwd);

                //add action button
                builder.setPositiveButton("登录", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        //login
                        String str1, str2;

                        str1 = username.getText().toString();
                        str2 = password.getText().toString();
                        if(str1.equals("abc") && str2.equals("123"))
                            Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(MainActivity.this, "输入的用户名或密码错误", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        //cancel
                    }
                });
                builder.show();
            }
        });
    }
}

