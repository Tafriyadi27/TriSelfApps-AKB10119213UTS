package com.skullbreker.triselfapps.ui.profile;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.tabs.TabLayout;
import com.skullbreker.triselfapps.R;
import com.skullbreker.triselfapps.databinding.FindmeFragmentBinding;

public class FindmeFragment extends Fragment implements OnMapReadyCallback {
    private GoogleMap mMap;
    private FindmeFragmentBinding binding;
    private FindmeViewModel mViewModel;

    public static FindmeFragment newInstance() {
        return new FindmeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FindmeFragmentBinding.inflate(inflater, container, false);
        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        return binding.getRoot();
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        LatLng delichip = new LatLng(-6.831668,107.614997);
        googleMap.addMarker(new MarkerOptions().position(delichip).title("delichip"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(delichip));
    }

}