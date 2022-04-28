package com.skullbreker.triselfapps.ui.daily;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.skullbreker.triselfapps.MainActivity;
import com.skullbreker.triselfapps.databinding.FragmentDailyBinding;

public class DailyFragment extends Fragment {

    private FragmentDailyBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentDailyBinding.inflate(inflater, container, false);
        ((MainActivity)getActivity()).updateStatusBarColor("#007537");
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}