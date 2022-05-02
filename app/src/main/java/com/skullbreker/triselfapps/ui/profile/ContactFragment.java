package com.skullbreker.triselfapps.ui.profile;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.ViewModelProvider;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.skullbreker.triselfapps.R;
import com.skullbreker.triselfapps.databinding.ContactFragmentBinding;
import com.skullbreker.triselfapps.databinding.FragmentMusicBinding;
import com.skullbreker.triselfapps.databinding.FragmentProfileBinding;

public class ContactFragment extends Fragment {
    private ContactFragmentBinding binding;
    private ContactViewModel mViewModel;

    public static ContactFragment newInstance() {
        return new ContactFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = ContactFragmentBinding .inflate(inflater, container, false);
        TextView waText = binding.textwa;
        waText.setOnClickListener(view -> {
            String url = "https://api.whatsapp.com/send?phone=+6285156632447";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });
        TextView emailText = binding.textmail;
        emailText.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                    "mailto","skullbreaker@gmail.com", null));
            startActivity(Intent.createChooser(intent, "Choose an Email client :"));
        });
        TextView igText = binding.textig;
        igText.setOnClickListener(view -> {
            Uri uri = Uri.parse("https://instagram.com/_u/quicklybubble158");
            Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

            likeIng.setPackage("com.instagram.android");

            try {
                startActivity(likeIng);
            } catch (ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://instagram.com/quicklybubble158")));
            }
        });
        return binding.getRoot();
    }


}