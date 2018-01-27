package uinbdg.developer.silatin.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import uinbdg.developer.silatin.Adapter.PelatihAdapter;
import uinbdg.developer.silatin.Adapter.SanggarAdapter;
import uinbdg.developer.silatin.Model.Pelatih;
import uinbdg.developer.silatin.Model.Sanggar;
import uinbdg.developer.silatin.R;

public class SanggarFragment extends Fragment {

    private RecyclerView rvSanggar;
    private SanggarAdapter adapter;
    private List<Sanggar> listSanggar;

    public SanggarFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sanggar, container, false);

        rvSanggar = (RecyclerView) view.findViewById(R.id.rv_sanggar);

        listSanggar = new ArrayList<>();
        listSanggar.add(new Sanggar(R.drawable.ic_launcher_foreground, "Pelatih Silat Tadjimalela", "Jalan A.H Nasution No. 1, Cipadung, Cibiru, Kota Bandung", "08988190546", 0.5));
        listSanggar.add(new Sanggar(R.drawable.ic_launcher_foreground, "Pelatih Silat IKS PI Kera Sakti", "Jalan A.H Nasution No. 1, Cipadung, Cibiru, Kota Bandung", "08988190546", 0.61));
        listSanggar.add(new Sanggar(R.drawable.ic_launcher_foreground, "Pelatih Silat Tadjimalela", "Jalan A.H Nasution No. 1, Cipadung, Cibiru, Kota Bandung", "08988190546", 0.5));
        listSanggar.add(new Sanggar(R.drawable.ic_launcher_foreground, "Pelatih Silat IKS PI Kera Sakti", "Jalan A.H Nasution No. 1, Cipadung, Cibiru, Kota Bandung", "08988190546", 0.61));
        listSanggar.add(new Sanggar(R.drawable.ic_launcher_foreground, "Pelatih Silat Tadjimalela", "Jalan A.H Nasution No. 1, Cipadung, Cibiru, Kota Bandung", "08988190546", 0.5));
        listSanggar.add(new Sanggar(R.drawable.ic_launcher_foreground, "Pelatih Silat IKS PI Kera Sakti", "Jalan A.H Nasution No. 1, Cipadung, Cibiru, Kota Bandung", "08988190546", 0.61));

        adapter = new SanggarAdapter(getContext(), listSanggar);

        rvSanggar.setHasFixedSize(true);
        rvSanggar.setLayoutManager(new LinearLayoutManager(getContext()));
        rvSanggar.setAdapter(adapter);

        return view;

    }
}