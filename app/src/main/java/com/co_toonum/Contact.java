package com.co_toonum;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.airbnb.lottie.LottieAnimationView;

public class Contact extends AppCompatActivity {

    DrawerLayout drawerLayout;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        //assign variable
        drawerLayout = findViewById(R.id.drawer_layout);
        lottieAnimationView = findViewById(R.id.pesan);
    }

    public void ClickMenu(View view){
        //open drawer
        MainActivity.openDrawer(drawerLayout);

    }

    public void ClickLogo(View view){
        //open drawer
        MainActivity.openDrawer(drawerLayout);

    }

    public void ClickHome(View view){
        //open drawer
        MainActivity.redirectActivity(this, MainActivity.class);

    }

    public void ClickAbout(View view){
        //Redirect activity to about us
        MainActivity.redirectActivity(this, AboutUs.class);

    }

    public void ClickContact(View view) {
        //Redirect activity to Contact
        recreate();

    }

    public void ClickLogout (View view){
        //logout app
        logout(this);
    }

    private void logout(Contact contact) {
        logout(this);
    }

    @Override
    protected void onPause(){
        super.onPause();
        //close drawer
        MainActivity.closeDrawer(drawerLayout);
    }

}