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

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.tabs.TabLayout;
import com.skullbreker.triselfapps.R;
import com.skullbreker.triselfapps.databinding.FindmeFragmentBinding;

import java.util.ArrayList;
import java.util.List;

// Tanggal Pengerjaan   : 2 Mei 2022
// Nama                 : Tri Tafriyadi
// NIM                  : 10119213
// Kelas                : IF-6
public class FindmeFragment extends Fragment implements OnMapReadyCallback {
    private GoogleMap mMap;
    private FindmeFragmentBinding binding;

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
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        List<Marker> markers = new ArrayList<>();
        markers.add(googleMap.addMarker(new MarkerOptions()
        .position(new LatLng(-6.83167496447813, 107.61718502947778))
        .title("Delichip Cake Shop")));
        for(Marker m: markers)
            {
                builder.include(m.getPosition());
            }
            LatLngBounds bounds = builder.build();

            int padding = 0;
            CameraUpdate cu = CameraUpdateFactory.newLatLngBounds(bounds,512,200,padding);

            googleMap.moveCamera(cu);
//        LatLng delichip = new LatLng(-6.831668,107.614997);
//        googleMap.addMarker(new MarkerOptions().position(delichip).title("delichip"));
//        googleMap.moveCamera(CameraUpdateFactory.newLatLng(delichip));
    }

}