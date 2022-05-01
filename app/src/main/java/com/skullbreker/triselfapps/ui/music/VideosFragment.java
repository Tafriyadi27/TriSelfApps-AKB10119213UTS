package com.skullbreker.triselfapps.ui.music;

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
import com.skullbreker.triselfapps.database.AppDatabase;
import com.skullbreker.triselfapps.database.Song;
import com.skullbreker.triselfapps.database.Videos;
import com.skullbreker.triselfapps.databinding.SongsFragmentBinding;
import com.skullbreker.triselfapps.databinding.VideosFragmentBinding;

import java.util.List;

public class VideosFragment extends Fragment {

    private VideosViewModel mViewModel;
    private VideosListAdapter videosListAdapter;
    private VideosFragmentBinding binding;
    public static VideosFragment newInstance() {
        return new VideosFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = VideosFragmentBinding.inflate(inflater,container,false);
        View root = binding.getRoot();

        initRecycle();

        loadVideosList();

        return root;
    }
    private void initRecycle() {
        RecyclerView recyclerView = binding.recycleviewVideos;
        recyclerView.setLayoutManager(new LinearLayoutManager(binding.getRoot().getContext(),
                LinearLayoutManager.VERTICAL,false));

        videosListAdapter = new VideosListAdapter(this.getLifecycle());
        recyclerView.setAdapter((videosListAdapter));
    }

    private void loadVideosList() {
        AppDatabase db =AppDatabase.getDbInstance((binding.getRoot().getContext()));
        List<Videos> videosList = db.videosDao().getAllVideos();
        videosListAdapter.setVideosList(videosList);
    }

}