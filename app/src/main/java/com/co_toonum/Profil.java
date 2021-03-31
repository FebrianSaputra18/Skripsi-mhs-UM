package com.co_toonum;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class Profil extends AppCompatActivity {

    //initialize variable
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        //assign variable
        drawerLayout = findViewById(R.id.drawer_layout);
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

    public void ClickProfil(View view){
        //recreate
        recreate();

    }

    public void ClickAbout(View view){
        //Redirect activity to about us
        MainActivity.redirectActivity(this, AboutUs.class);

    }

    public void ClickContact(View view) {
        //Redirect activity to Contact
        MainActivity.redirectActivity(this, Contact.class);

    }


    @Override
    protected void onPause(){
        super.onPause();
        //close drawer
        MainActivity.closeDrawer(drawerLayout);
    }

}