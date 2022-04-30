package com.skullbreker.triselfapps.ui.daily;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.skullbreker.triselfapps.database.Activities;
import com.skullbreker.triselfapps.database.Friend;
import com.skullbreker.triselfapps.databinding.FriendsFragmentBinding;

import com.skullbreker.triselfapps.R;
import com.skullbreker.triselfapps.database.AppDatabase;

import java.util.List;
import java.util.concurrent.Executors;

public class FriendsFragment extends Fragment {

    private FriendsListAdapter friendListAdapter;

    private FriendsFragmentBinding binding;
    public static FriendsFragment newInstance() {
        return new FriendsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FriendsFragmentBinding.inflate(inflater,container,false);
        View root = binding.getRoot();

        initRecycle();

        loadFriendList();


        AppDatabase db =AppDatabase.getDbInstance((binding.getRoot().getContext()));
        Handler handler = new Handler(Looper.getMainLooper());

        FloatingActionButton fabButton = binding.clearTable;
        fabButton.setOnClickListener(view -> Executors.newSingleThreadExecutor().execute(() ->
        {
            db.friendDao().deleteAllFriends();
            db.friendDao().insert(Friend.isiData());
            handler.post(this::loadFriendList);

        }));
        return root;
    }

    private void initRecycle() {
        RecyclerView recyclerView = binding.recycleviewFriends;
        recyclerView.setLayoutManager(new LinearLayoutManager(binding.getRoot().getContext(),
                LinearLayoutManager.HORIZONTAL,false));

        friendListAdapter = new FriendsListAdapter(binding.getRoot().getContext());
        recyclerView.setAdapter((friendListAdapter));
    }

    private void loadFriendList() {
        AppDatabase db =AppDatabase.getDbInstance((binding.getRoot().getContext()));
        List<Friend> friendList = db.friendDao().getAllFriends();
        friendListAdapter.setFriendList(friendList);
    }



}