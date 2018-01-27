package uinbdg.developer.silatin.Adapter;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import uinbdg.developer.silatin.MainActivity;
import uinbdg.developer.silatin.Model.Pelatih;
import uinbdg.developer.silatin.R;

/**
 * Created by Nikko Eka Saputra on 27/01/2018.
 */

public class PelatihAdapter extends RecyclerView.Adapter<PelatihAdapter.ViewHolder> {

    private Context context;
    private List<Pelatih> listPelatih;

    public PelatihAdapter(Context context, List<Pelatih> listPelatih){
        this.context = context;
        this.listPelatih = listPelatih;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_pelatih, null, false);

        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        v.setLayoutParams(layoutParams);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Pelatih pelatihModel = listPelatih.get(position);
        holder.lblNamaPelatih.setText(pelatihModel.getNamaPelatih());
        holder.lblAliranPelatih.setText(pelatihModel.getAliranPelatih());
        holder.lblAlamatPelatih.setText(pelatihModel.getAlamatPelatih());
        holder.lblNoTelpPelatih.setText("Telp. "+pelatihModel.getNoTelpPelatih());
        if (pelatihModel.hasImage()) {
            holder.lblImagePelatih.setImageResource(pelatihModel.getImagePelatih());
            holder.lblImagePelatih.setVisibility(View.VISIBLE);
        }
        else {
            holder.lblImagePelatih.setVisibility(View.GONE);
        }
        holder.cvPelatih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, pelatihModel.getNamaPelatih(), Toast.LENGTH_SHORT).show();
            }
        });
        holder.btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //masih error
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse(pelatihModel.getNoTelpPelatih()));
                callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                if (ActivityCompat.checkSelfPermission(context,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                context.startActivity(callIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPelatih.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cvPelatih;
        private ImageView lblImagePelatih;
        private TextView lblNamaPelatih, lblAliranPelatih, lblAlamatPelatih, lblNoTelpPelatih;
        private Button btnCall;

        public ViewHolder(View itemView) {
            super(itemView);

            cvPelatih = (CardView) itemView.findViewById(R.id.cv_pelatih);
            lblImagePelatih = (ImageView) itemView.findViewById(R.id.image);
            lblNamaPelatih = (TextView) itemView.findViewById(R.id.tv_nama_pelatih);
            lblAliranPelatih = (TextView) itemView.findViewById(R.id.tv_aliran);
            lblAlamatPelatih = (TextView) itemView.findViewById(R.id.tv_alamat_pelatih);
            lblNoTelpPelatih = (TextView) itemView.findViewById(R.id.tv_no_telp_pelatih);
            btnCall = (Button) itemView.findViewById(R.id.btn_call);
        }
    }

}
