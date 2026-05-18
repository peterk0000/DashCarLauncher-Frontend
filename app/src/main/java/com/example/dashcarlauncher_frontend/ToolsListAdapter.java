package com.example.dashcarlauncher_frontend;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ToolsListAdapter extends ArrayAdapter<Tool> {
    public ToolsListAdapter(Context context, Tool[] arr) {
        super(context, R.layout.tools_item, arr);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        final Tool tool = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.tools_item, null);
        }

        String iconName = tool.tool_name.toLowerCase();
        int idImagePerson = getContext().getResources().getIdentifier(iconName,
                "drawable", getContext().getPackageName());


        ((ImageView) convertView.findViewById(R.id.tool_icon)).setImageResource(idImagePerson);
        ((TextView) convertView.findViewById(R.id.tool_name)).setText(tool.tool_name);


        return convertView;
    }

}
