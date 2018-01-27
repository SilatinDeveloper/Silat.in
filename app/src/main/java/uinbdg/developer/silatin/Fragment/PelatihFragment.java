package uinbdg.developer.silatin.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import uinbdg.developer.silatin.Adapter.PelatihAdapter;
import uinbdg.developer.silatin.Adapter.SanggarAdapter;
import uinbdg.developer.silatin.Model.Pelatih;
import uinbdg.developer.silatin.Model.Sanggar;
import uinbdg.developer.silatin.R;

public class PelatihFragment extends Fragment {

    private RecyclerView rvPelatih;
    private PelatihAdapter adapter;
    private List<Pelatih> listPelatih;

    private Spinner spAliran;
    private List<String> aliran;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pelatih, container, false);

        rvPelatih = (RecyclerView) view.findViewById(R.id.rv_pelatih);

        listPelatih = new ArrayList<>();
        listPelatih.add(new Pelatih(R.drawable.ic_launcher_foreground, "Nikko Eka Saputra", "IKS PI Kera Sakti", "Jalan Kelurahan Cipadung No.1, RT.03/08, Cipadung, Cibiru, Kota Bandung", "08988190546"));
        listPelatih.add(new Pelatih(R.drawable.ic_launcher_foreground, "Nikko Eka Saputra", "IKS PI Kera Sakti", "Jalan Kelurahan Cipadung No.1, RT.03/08, Cipadung, Cibiru, Kota Bandung", "08988190546"));
        listPelatih.add(new Pelatih(R.drawable.ic_launcher_foreground, "Nikko Eka Saputra", "IKS PI Kera Sakti", "Jalan Kelurahan Cipadung No.1, RT.03/08, Cipadung, Cibiru, Kota Bandung", "08988190546"));
        listPelatih.add(new Pelatih(R.drawable.ic_launcher_foreground, "Nikko Eka Saputra", "IKS PI Kera Sakti", "Jalan Kelurahan Cipadung No.1, RT.03/08, Cipadung, Cibiru, Kota Bandung", "08988190546"));
        listPelatih.add(new Pelatih(R.drawable.ic_launcher_foreground, "Nikko Eka Saputra", "IKS PI Kera Sakti", "Jalan Kelurahan Cipadung No.1, RT.03/08, Cipadung, Cibiru, Kota Bandung", "08988190546"));
        listPelatih.add(new Pelatih(R.drawable.ic_launcher_foreground, "Nikko Eka Saputra", "IKS PI Kera Sakti", "Jalan Kelurahan Cipadung No.1, RT.03/08, Cipadung, Cibiru, Kota Bandung", "08988190546"));

        adapter = new PelatihAdapter(getContext(), listPelatih);

        rvPelatih.setHasFixedSize(true);
        rvPelatih.setLayoutManager(new LinearLayoutManager(getContext()));
        rvPelatih.setAdapter(adapter);

        spAliran = (Spinner) view.findViewById(R.id.sp_aliran);

        aliran = new ArrayList<String>();
        aliran.add("IKS PI");
        aliran.add("Tadjimalela");
        aliran.add("PSHT");
        aliran.add("Tapak Suci");
        aliran.add("Merpati Putih");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_dropdown_item, aliran);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spAliran.setAdapter(dataAdapter);
        spAliran.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(), "Aliran : " +adapterView.getItemAtPosition(i).toString(),
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        return view;
    }
}