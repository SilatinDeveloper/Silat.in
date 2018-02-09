package uinbdg.developer.silatin.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import uinbdg.developer.silatin.Adapter.PelatihAdapter;
import uinbdg.developer.silatin.Model.Pelatih;
import uinbdg.developer.silatin.R;

public class PelatihActivity extends AppCompatActivity {

    private RecyclerView rvPelatih;
    private PelatihAdapter adapter;
    private List<Pelatih> listPelatih;

    private Spinner spAliran;
    private List<String> aliran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelatih);

        // Setting Toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Menu Pelatih");

        rvPelatih = (RecyclerView) findViewById(R.id.rv_pelatih);

        listPelatih = new ArrayList<>();
        listPelatih.add(new Pelatih(R.drawable.ic_launcher_foreground, "Nikko Eka Saputra", "IKS PI Kera Sakti", "Jalan Kelurahan Cipadung No.1, RT.03/08, Cipadung, Cibiru, Kota Bandung", "08988190546"));
        listPelatih.add(new Pelatih(R.drawable.ic_launcher_foreground, "Nikko Eka Saputra", "IKS PI Kera Sakti", "Jalan Kelurahan Cipadung No.1, RT.03/08, Cipadung, Cibiru, Kota Bandung", "08988190546"));
        listPelatih.add(new Pelatih(R.drawable.ic_launcher_foreground, "Nikko Eka Saputra", "IKS PI Kera Sakti", "Jalan Kelurahan Cipadung No.1, RT.03/08, Cipadung, Cibiru, Kota Bandung", "08988190546"));
        listPelatih.add(new Pelatih(R.drawable.ic_launcher_foreground, "Nikko Eka Saputra", "IKS PI Kera Sakti", "Jalan Kelurahan Cipadung No.1, RT.03/08, Cipadung, Cibiru, Kota Bandung", "08988190546"));
        listPelatih.add(new Pelatih(R.drawable.ic_launcher_foreground, "Nikko Eka Saputra", "IKS PI Kera Sakti", "Jalan Kelurahan Cipadung No.1, RT.03/08, Cipadung, Cibiru, Kota Bandung", "08988190546"));
        listPelatih.add(new Pelatih(R.drawable.ic_launcher_foreground, "Nikko Eka Saputra", "IKS PI Kera Sakti", "Jalan Kelurahan Cipadung No.1, RT.03/08, Cipadung, Cibiru, Kota Bandung", "08988190546"));

        adapter = new PelatihAdapter(getApplicationContext(), listPelatih);

        rvPelatih.setHasFixedSize(true);
        rvPelatih.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rvPelatih.setAdapter(adapter);

        spAliran = (Spinner) findViewById(R.id.sp_aliran);

        aliran = new ArrayList<String>();
        aliran.add("IKS PI");
        aliran.add("Tadjimalela");
        aliran.add("PSHT");
        aliran.add("Tapak Suci");
        aliran.add("Merpati Putih");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, aliran);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spAliran.setAdapter(dataAdapter);
        spAliran.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Aliran : " +adapterView.getItemAtPosition(i).toString(),
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
