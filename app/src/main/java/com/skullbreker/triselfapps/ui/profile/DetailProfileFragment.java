package com.skullbreker.triselfapps.ui.profile;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.skullbreker.triselfapps.R;

public class DetailProfileFragment extends Fragment {

    private DetailProfileViewModel mViewModel;

    public static DetailProfileFragment newInstance() {
        return new DetailProfileFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.detail_profile_fragment, container, false);
    }


}