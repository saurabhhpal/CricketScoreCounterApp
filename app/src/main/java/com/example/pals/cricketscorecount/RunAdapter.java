package com.example.pals.cricketscorecount;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class RunAdapter extends ArrayAdapter<RunsByOver>{

    private Context mContext;
    private List<RunsByOver> runsByOverList = new ArrayList<>();

    public RunAdapter(@NonNull Context context, ArrayList<RunsByOver> list) {
        super(context, 0,list);
        mContext = context;
        runsByOverList = list;

    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getCount() {
        return runsByOverList.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = null ; //convertView;
        if(convertView == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.ball_list_ind, parent, false);
        else{
            listItem = convertView;
        }

        RunsByOver currentRun = runsByOverList.get(position);
        Button button  = (Button) listItem.findViewById(R.id.run);
        button.setText(String.valueOf(currentRun.getRun()));

        return listItem;
    }
}
