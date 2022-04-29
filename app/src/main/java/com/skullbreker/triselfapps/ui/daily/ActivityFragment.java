package com.skullbreker.triselfapps.ui.daily;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.skullbreker.triselfapps.R;
import com.skullbreker.triselfapps.database.Activities;
import com.skullbreker.triselfapps.database.AppDatabase;
import com.skullbreker.triselfapps.database.Friend;
import com.skullbreker.triselfapps.databinding.ActivityFragmentBinding;
import com.skullbreker.triselfapps.databinding.FriendsFragmentBinding;

import java.util.List;

public class ActivityFragment extends Fragment {

    private ActivityListAdapter activityListAdapter;

    private ActivityFragmentBinding binding;
    public static ActivityFragment newInstance() {
        return new ActivityFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = ActivityFragmentBinding.inflate(inflater,container,false);
        View root = binding.getRoot();

        initRecycle();

        loadActivitiesList();

        return root;
    }
    private void initRecycle() {
        RecyclerView recyclerView = binding.recycleviewActivity;
        recyclerView.setLayoutManager(new LinearLayoutManager(binding.getRoot().getContext(),
                LinearLayoutManager.VERTICAL,false));

        activityListAdapter = new ActivityListAdapter(binding.getRoot().getContext());
        recyclerView.setAdapter((activityListAdapter));
    }

    private void loadActivitiesList() {
        AppDatabase db =AppDatabase.getDbInstance((binding.getRoot().getContext()));
        List<Activities> activitiesList = db.activitiesDao().getAllActivities();
        activityListAdapter.setActivitiesList(activitiesList);
    }


}