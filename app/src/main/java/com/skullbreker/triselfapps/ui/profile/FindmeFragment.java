package com.skullbreker.triselfapps.ui.profile;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.skullbreker.triselfapps.databinding.FindmeFragmentBinding;

public class FindmeFragment extends Fragment{
    private FindmeFragmentBinding binding;
    private FindmeViewModel mViewModel;

    public static FindmeFragment newInstance() {
        return new FindmeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FindmeFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    }