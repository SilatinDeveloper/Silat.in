package uinbdg.developer.silatin.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

import uinbdg.developer.silatin.R;

public class ProfileActivity extends AppCompatActivity {

    private ImageView btnEditProfile;
    private Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        bindView();

        // Setting Toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("My Profile");
    }

    private void bindView(){
        btnEditProfile = (ImageView) findViewById(R.id.btn_edit_profil);
        btnLogout = (Button) findViewById(R.id.btn_logout);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
