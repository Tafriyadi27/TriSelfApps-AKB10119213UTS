package com.skullbreker.triselfapps.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.skullbreker.triselfapps.MainActivity;
import com.skullbreker.triselfapps.R;
import com.skullbreker.triselfapps.database.AppDatabase;
import com.skullbreker.triselfapps.database.Friend;
import com.skullbreker.triselfapps.database.Gallery;
import com.skullbreker.triselfapps.databinding.FragmentGalleryBinding;
import com.skullbreker.triselfapps.ui.daily.FriendsFragment;
import com.skullbreker.triselfapps.ui.daily.FriendsListAdapter;

import java.util.List;

public class GalleryFragment extends Fragment {

    private GalleryListAdapter galleryListAdapter;
    private FragmentGalleryBinding binding;
    public static GalleryFragment newInstance() {
        return new GalleryFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        ((MainActivity)getActivity()).updateStatusBarColor("#04471C");
        View root = binding.getRoot();

        initRecycle();

        loadGalleryList();

        TextView textTitle = getActivity().findViewById(R.id.appbar_title);
        textTitle.setText(R.string.title_gallery);
        return root;
    }

    private void initRecycle() {
        RecyclerView recyclerView = binding.recycleviewGallery;
        recyclerView.setLayoutManager(new GridLayoutManager(binding.getRoot().getContext(),
                2));

        galleryListAdapter = new GalleryListAdapter(binding.getRoot().getContext());
        recyclerView.setAdapter((galleryListAdapter));
    }

    private void loadGalleryList() {
        AppDatabase db =AppDatabase.getDbInstance((binding.getRoot().getContext()));
        List<Gallery> galleryList = db.galleryDao().getAllGallery();
        galleryListAdapter.setGalleryList(galleryList);
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}