package com.co_toonum;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer_layout);

        VideoView video = findViewById(R.id.videoView5);
        Uri lokasi = Uri.parse("android.resource://" +getPackageName() + "/" + R.raw.vid1);
        video.setVideoURI(lokasi);
        video.start();
        video.requestFocus();
        video.setOnPreparedListener(mp -> mp.setLooping(true));
    }

    public void ClickMenu(View view){
        //membuka drawer
        openDrawer(drawerLayout);
    }

    public static void openDrawer(DrawerLayout drawerLayout) {
        //membuka layout drawer
        drawerLayout.openDrawer(GravityCompat.START);
    }

    public void ClickLogo(View view){
        //tutup drawer
        closeDrawer(drawerLayout);
    }

    public static void closeDrawer(DrawerLayout drawerLayout){
        //memnutup layout drawer
        //cek kondisi
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            //Ketika membuka drawer
            //menutup drawer
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }

    public void ClickHome (View view){
        //membuat activity lagi
        recreate();
    }

    public void ClickAbout (View view){
        //mengalihkan ke activity ke About
        redirectActivity(this, AboutUs.class);
    }

    public void ClickContact (View view){
        //mengalihkan ke activity ke Contact
        redirectActivity(this, Contact.class);
    }

    public void ClickLogout (View view){
        //logout app
        logout(this);
    }

    public void logout(Activity activity) {
        //initialize alert dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        //set tittle
        builder.setTitle("Logout");
        //set pesan
        builder.setMessage("Apakah anda yakin mau keluar");
        //Positive yes button
        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //finis activity
                finish();
                //keluar
                System.exit(0);
            }
        });

        //Negative no button
        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Dimiss dialog
                dialog.dismiss();
            }
        });
        //Show dialog
        builder.show();
    }

    public static void redirectActivity(Activity activity, Class aClass) {
        //initialize intent
        Intent intent = new Intent(activity,aClass);
        //set flug
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //start activity
        activity.startActivity(intent);
    }

    @Override
    protected void onPause(){
        super.onPause();
        //close drawer
        closeDrawer(drawerLayout);
    }

    public void baca1 (View view){
        Intent intent = new Intent( MainActivity.this, Ebook_1.class);
    }

    public void baca2 (View view){
        Intent intent = new Intent( MainActivity.this, Ebook_2.class);
    }

    public void baca3 (View view){
        Intent intent = new Intent( MainActivity.this, Ebook_3.class);
    }

    public void baca4 (View view){
        Intent intent = new Intent( MainActivity.this, Ebook_4.class);
    }

    public void baca5 (View view){
        Intent intent = new Intent( MainActivity.this, Ebook_5.class);
    }

    public void baca6 (View view){
        Intent intent = new Intent( MainActivity.this, Ebook_6.class);
    }

}