package com.skullbreker.triselfapps;

import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

// Tanggal Pengerjaan   : 25 April 2022
// Nama                 : Tri Tafriyadi
// NIM                  : 10119213
// Kelas                : IF-6
public class PageThreeFragment extends Fragment {

    private ViewGroup vGroup;
    private Button mButton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vGroup = (ViewGroup) inflater.inflate(
                R.layout.activity_page_three_fragment, container, false);

        mButton = vGroup.findViewById(R.id.starthere);
        mButton.setOnClickListener(view -> {
            startActivity(new Intent(getActivity(),MainActivity.class));
        });

        return vGroup;
    }
}