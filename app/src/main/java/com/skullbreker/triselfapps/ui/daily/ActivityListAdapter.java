package com.skullbreker.triselfapps.ui.daily;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.skullbreker.triselfapps.R;
import com.skullbreker.triselfapps.database.Activities;

import java.util.List;

public class ActivityListAdapter extends RecyclerView.Adapter<ActivityListAdapter.ActivityViewHolder>  {
    private final Context context;
    private List<Activities> activitiesList;

    public ActivityListAdapter(Context context){ this.context =context;}
    @SuppressLint("NotifyDataSetChanged")
    public void setActivitiesList(List<Activities> list){
        this.activitiesList = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ActivityListAdapter.ActivityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycle_activities_rows,parent,false);
        return new ActivityListAdapter.ActivityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ActivityListAdapter.ActivityViewHolder holder, int position) {
        holder.kegiatan.setText((this.activitiesList.get(position).kegiatan));
    }

    @Override
    public int getItemCount() {
        return this.activitiesList.size();
    }
    public class ActivityViewHolder extends RecyclerView.ViewHolder{
        TextView kegiatan;
        public ActivityViewHolder (@NonNull View itemView) {
            super(itemView);
            kegiatan = itemView.findViewById(R.id.friend_recycle_activityname);
        }
    }
}
