package uinbdg.developer.silatin.Activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.widget.TextView;

import uinbdg.developer.silatin.Adapter.ViewPagerAdapter;
import uinbdg.developer.silatin.Fragment.SanggarFragment;
import uinbdg.developer.silatin.R;

public class SanggarActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanggar);

        // Setting Toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Menu Sanggar");

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        createTabIcons();
    }

    private void createTabIcons() {
        TextView mapsTab = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        mapsTab.setText("MAPS");
        tabLayout.getTabAt(0).setCustomView(mapsTab);

        TextView listTab = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        listTab.setText("LIST");
        tabLayout.getTabAt(1).setCustomView(listTab);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new SanggarFragment(), "MAPS");
        adapter.addFragment(new SanggarFragment(), "LIST");
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