package com.co_toonum;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.FirebaseAuth;

public class LoginTabFragment extends Fragment {


    TabLayout tabLayout;
    ViewPager viewPager;
    FloatingActionButton facebook,google,number;
    TextView btnReset;
    EditText email, pass;
    Button button;
    float v = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment, container, false);

        email = root.findViewById(R.id.email);
        pass = root.findViewById(R.id.pass);
        btnReset = root.findViewById(R.id.btnReset);

        email.setTranslationY(800);
        pass.setTranslationY(800);
        btnReset.setTranslationY(800);

        email.setAlpha(v);
        pass.setAlpha(v);
        btnReset.setAlpha(v);

        email.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pass.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        btnReset.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();

        return root;
    }
}
