package app.databindingsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView viewById = findViewById(R.id.recyclerview);
        viewById.setLayoutManager(new LinearLayoutManager(this));
        viewById.setAdapter(new DataAdapter());
    }
}
