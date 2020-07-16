package sg.edu.rp.c346.id19020844.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAPI;
    ArrayList<AndroidVersion> APIlist;
    CustomAdapter adapter;
    // ArrayAdapter<AndroidVersion> aaAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAPI = findViewById(R.id.API);

        APIlist = new ArrayList<>();

        APIlist.add(new AndroidVersion("Pie", "9.0"));
        APIlist.add(new AndroidVersion("Oreo", "8.0 - 8.1"));
        APIlist.add(new AndroidVersion("Nougat", "7.0 - 7.1.2"));
        APIlist.add(new AndroidVersion("Marshmallow", "6.0 - 6.0.1"));
        APIlist.add(new AndroidVersion("Lollipop", "5.0 - 5.1.1"));
        APIlist.add(new AndroidVersion("KitKat", "4.4 - 4.4.4"));
        APIlist.add(new AndroidVersion("Jelly Bean", "4.1 - 4.3.1"));

        // aaAPI = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, APIlist);

        adapter = new CustomAdapter(this, R.layout.row, APIlist);

        // lvAPI.setAdapter(aaAPI);

        lvAPI.setAdapter(adapter);

    }
}
