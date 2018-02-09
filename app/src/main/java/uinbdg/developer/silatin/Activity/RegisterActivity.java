package uinbdg.developer.silatin.Activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.widget.TextView;

import uinbdg.developer.silatin.Adapter.ViewPagerAdapter;
import uinbdg.developer.silatin.Fragment.RegisterPelatihFragment;
import uinbdg.developer.silatin.Fragment.RegisterSanggarFragment;
import uinbdg.developer.silatin.R;

public class RegisterActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Setting Toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Menu Register");

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        createTabIcons();
    }

    private void createTabIcons() {
        TextView regSanggar = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        regSanggar.setText("SANGGAR");
        tabLayout.getTabAt(0).setCustomView(regSanggar);

        TextView regPelatih = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        regPelatih.setText("PELATIH");
        tabLayout.getTabAt(1).setCustomView(regPelatih);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new RegisterSanggarFragment(), "SANGGAR");
        adapter.addFragment(new RegisterPelatihFragment(), "PELATIH");
        viewPager.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
