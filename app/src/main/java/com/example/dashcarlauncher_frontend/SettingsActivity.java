package com.example.dashcarlauncher_frontend;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    Button btnVolume, btnBrightness, btnThemes, btnPermissions, btnHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);

        ToolsListAdapter adapter = new ToolsListAdapter(this, makeTools());
        ListView listView = (ListView) findViewById(R.id.tools);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

    }

    Tool[] makeTools() {
        String [] tools = getResources().getStringArray(R.array.tools);
        Tool[] array = new Tool[tools.length];

        return array;
    }
}
