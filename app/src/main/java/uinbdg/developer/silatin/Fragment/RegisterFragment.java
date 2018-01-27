package uinbdg.developer.silatin.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import uinbdg.developer.silatin.R;

public class RegisterFragment extends Fragment {

    private CardView layoutRegisterSanggar, layoutRegisterPelatih;
    private Spinner spKategori;
    private List<String> kategori;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);

        layoutRegisterSanggar = (CardView) view.findViewById(R.id.layout_sanggar);
        layoutRegisterPelatih = (CardView) view.findViewById(R.id.layout_pelatih);

        //inisialisasi
        layoutRegisterPelatih.setVisibility(View.GONE);
        layoutRegisterSanggar.setVisibility(View.VISIBLE);

        spKategori = (Spinner) view.findViewById(R.id.sp_kategori);

        kategori = new ArrayList<String>();
        kategori.add("Sanggar");
        kategori.add("Pelatih");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_dropdown_item, kategori);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spKategori.setAdapter(dataAdapter);
        spKategori.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(adapterView.getItemAtPosition(i).toString().equalsIgnoreCase("Sanggar")){
                    layoutRegisterPelatih.setVisibility(View.GONE);
                    layoutRegisterSanggar.setVisibility(View.VISIBLE);
                }
                else if(adapterView.getItemAtPosition(i).toString().equalsIgnoreCase("Pelatih")){
                    layoutRegisterSanggar.setVisibility(View.GONE);
                    layoutRegisterPelatih.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        return view;
    }
}