package com.example.a171y013.adpter;

import android.app.Activity;
import android.widget.BaseAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by 171Y013 on 2018/07/06.
 */

public class CustomAdapter extends BaseAdapter {
    private Context context = null;

    // ArrayListの中に独自クラスのCustomDataClassを指定
    private ArrayList<CustomDataClass> data = null;

    private int resource = 0;


    // コンストラクタ  MainActivityでアダプターを生成する箇所で呼ばれている
    public CustomAdapter(Context context, ArrayList<CustomDataClass> data, int resource){
        this.context = context;
        this.data = data;
        this.resource = resource;
    }


    /**
     * データの個数を返すメソッド
     * ※このメソッドは必ず記述すること
     */
    public int getCount() {
        return data.size();
    }

    /**
     * 指定された順番にある項目を返すメソッド
     * ※このメソッドは必ず記述すること
     */
    public Object getItem(int position) {
        return data.get(position);
    }

    /**
     * 指定された順番にある項目の識別idを返すメソッド
     * ※このメソッドは必ず記述すること
     */
    public long getItemId(int position) {
        return data.get(position).getId();
    }

    /**
     * リスト項目を表示するためのメソッド
     * 自作アダプターを作成するにあたって一番重要
     * 実際にユーザが呼ぶ箇所ではなく、リストを生成するために自動で呼ばれる
     * ※このメソッドは必ず記述すること
     */
    public View getView(int position, View convertView, ViewGroup parent) {
        Activity activity = (Activity) context;
        // 指定された位置のデータを取得
        CustomDataClass data = (CustomDataClass) getItem(position);

        // 再利用可能なビューが無かったら生成する
        if(convertView == null){
            convertView = activity.getLayoutInflater().inflate(resource, null);
        }

        /**
         * ここから各項目に値を割り当てる処理
         */
        // 画像割り当て
        ((ImageView) convertView.findViewById(R.id.image)).setImageResource(data.getImageId());
        // idがmainTextのTextViewに、指定されたデータのmainStringの値を格納している
        ((TextView) convertView.findViewById(R.id.mainText)).setText(data.getMainString());
        // こっちの書き方のほうがいつもの書き方なのでわかりやすいかも？
        TextView sub = (TextView) convertView.findViewById(R.id.subText);
        sub.setText(data.getSubString());
        // idがdescriptionのTextViewに、指定されたデータのdescriptionの値を格納している
        ((TextView) convertView.findViewById(R.id.description)).setText(data.getDescription());

        return convertView;
    }
}
