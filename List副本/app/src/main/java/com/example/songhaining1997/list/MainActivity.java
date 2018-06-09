package com.example.songhaining1997.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private final static String NAME = "name";
    private final static String GRADE = "grade";
    private final static String ID = "id";
    private final static String SEX = "sex";
    private final static String NUMBER = "number";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item);

        String[] name = {"Tina", "Nina", "John"};
        String[] grade = {"1", "2", "1"};
        String[] id_number = {"101", "201", "102"};
        String[] sex = {"女", "女", "男"};
        String[] phone = {"11111", "22222", "33333"};

        List<Map<String,Object>> items = new ArrayList<>();

        for(int i = 0; i < name.length; i++){
            Map<String, Object> item = new HashMap<>();
            item.put(NAME, name[i]);
            item.put(GRADE, grade[i]);
            item.put(ID, id_number[i]);
            item.put(SEX, sex[i]);
            item.put(NUMBER, phone[i]);
            items.add(item);
        }
        SimpleAdapter adapter = new SimpleAdapter(this, items,
                R.layout.activity_main,
                new String[]{NAME, GRADE, ID, SEX, NUMBER},
                new int[]{R.id.userName, R.id.userClass, R.id.userID, R.id.userSex, R.id.userNum});

        ListView list = findViewById(R.id.list_item);
        list.setAdapter(adapter);
    }

}
