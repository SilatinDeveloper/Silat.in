package uinbdg.developer.silatin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import uinbdg.developer.silatin.Activity.PelatihActivity;
import uinbdg.developer.silatin.Activity.ProfileActivity;
import uinbdg.developer.silatin.Activity.RegisterActivity;
import uinbdg.developer.silatin.Activity.SanggarActivity;

public class DashboardActivity extends AppCompatActivity {

    private CardView btnMenuSanggar, btnMenuPelatih, btnMenuEvent, btnMenuJualBeli, btnMenuRegister;
    private ImageView btnProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        bindView();

        btnMenuSanggar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DashboardActivity.this, SanggarActivity.class);
                startActivity(i);
            }
        });

        btnMenuPelatih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DashboardActivity.this, PelatihActivity.class);
                startActivity(i);
            }
        });

        btnMenuEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DashboardActivity.this, "Coming Soon !", Toast.LENGTH_SHORT).show();
//                Intent i = new Intent(DashboardActivity.this, EventActivity.class);
//                startActivity(i);
            }
        });

        btnMenuJualBeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DashboardActivity.this, "Coming Soon !", Toast.LENGTH_SHORT).show();
//                Intent i = new Intent(DashboardActivity.this, JualBeliActivity.class);
//                startActivity(i);
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DashboardActivity.this, ProfileActivity.class);
                startActivity(i);
            }
        });

        btnMenuRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DashboardActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });


    }

    private void bindView(){
        btnMenuSanggar = (CardView) findViewById(R.id.menu_sanggar);
        btnMenuPelatih = (CardView) findViewById(R.id.menu_pelatih);
        btnMenuEvent = (CardView) findViewById(R.id.menu_event);
        btnMenuJualBeli = (CardView) findViewById(R.id.menu_jual_beli);
        btnMenuRegister = (CardView) findViewById(R.id.menu_register);
        btnProfile = (ImageView) findViewById(R.id.btn_profile);
    }
}
