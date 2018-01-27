package uinbdg.developer.silatin;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import uinbdg.developer.silatin.Adapter.ViewPagerAdapter;
import uinbdg.developer.silatin.Fragment.PelatihFragment;
import uinbdg.developer.silatin.Fragment.ProfilFragment;
import uinbdg.developer.silatin.Fragment.RegisterFragment;
import uinbdg.developer.silatin.Fragment.SanggarFragment;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        createTabIcons();
    }

    private void createTabIcons() {
        TextView sanggarTab = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        sanggarTab.setText("SANGGAR");
        tabLayout.getTabAt(0).setCustomView(sanggarTab);

        TextView pelatihTab = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        pelatihTab.setText("PELATIH");
        tabLayout.getTabAt(1).setCustomView(pelatihTab);

        TextView profilTab = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        profilTab.setText("PROFIL");
        tabLayout.getTabAt(2).setCustomView(profilTab);

        TextView registerTab = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        registerTab.setText("REGISTER");
        tabLayout.getTabAt(3).setCustomView(registerTab);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new SanggarFragment(), "SANGGAR");
        adapter.addFragment(new PelatihFragment(), "PELATIH");
        adapter.addFragment(new ProfilFragment(), "PROFIL");
        adapter.addFragment(new RegisterFragment(), "REGISTER");
        viewPager.setAdapter(adapter);
    }
}