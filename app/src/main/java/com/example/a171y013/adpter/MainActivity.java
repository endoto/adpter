package com.example.a171y013.adpter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.GridView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ListViewに表示する項目を生成
        ArrayList<CustomDataClass> listData = new ArrayList<>();
        for(int i = 1; i <=  10; i++){
            CustomDataClass data = new CustomDataClass(R.mipmap.ic_launcher, "メイン"+i, "サブサブサブ"+i, "説明説明説明説明説明説明説明"+i);
            listData.add(data);
        }

        /**
         * CustomAdapterを生成
         * R.layout.custom_list_layout : リストビュー自身のレイアウト。今回は自作。
         */
        CustomAdapter customAdapter = new CustomAdapter(
                this,
                listData, // 使用するデータ
                R.layout.custom_list_layout // 自作したレイアウト
        );

        // idがlistのListViewを取得
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(customAdapter);

    }
}
