package sg.edu.rp.c346.demoandroidlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView LvAndroid;
    ArrayList<AndroidVersion> AndroidList;
    //ArrayAdapter<AndroidVersion> aaAndroid;
    ArrayList<AndroidVersion> alAndroidVersion;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LvAndroid = findViewById(R.id.ListViewAndroid);

        AndroidList = new ArrayList<>();
        AndroidVersion item1 = new AndroidVersion("Pie" , "9.0");
        AndroidList.add(item1);

        AndroidVersion item2 = new AndroidVersion("Oreo" , "8.0-8.1");
        AndroidList.add(item2);

        AndroidVersion item3 = new AndroidVersion("Nougat" , "7.0 - 7.1.2");
        AndroidList.add(item3);

        AndroidVersion item4 = new AndroidVersion("Marshmallow" , "6.0 - 6.0.1");
        AndroidList.add(item4);

        AndroidVersion item5 = new AndroidVersion("Lollipop" , "5.0 - 5.1.1");
        AndroidList.add(item5);

        AndroidVersion item6 = new AndroidVersion("KitKat" , "4.4 - 4.4.4");
        AndroidList.add(item6);

        AndroidVersion item7 = new AndroidVersion("Jelly Bean" , "4.1 - 4.3.1");
        AndroidList.add(item7);
       // aaAndroid = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,AndroidList);
        adapter = new CustomAdapter(this,R.layout.row,alAndroidVersion);
        LvAndroid.setAdapter(adapter);


    }
}
