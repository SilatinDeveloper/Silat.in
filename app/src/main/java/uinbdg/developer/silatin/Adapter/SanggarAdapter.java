package uinbdg.developer.silatin.Adapter;

import android.content.Context;
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

import uinbdg.developer.silatin.Model.Sanggar;
import uinbdg.developer.silatin.R;

/**
 * Created by Nikko Eka Saputra on 27/01/2018.
 */

public class SanggarAdapter extends RecyclerView.Adapter<SanggarAdapter.ViewHolder> {

    private Context context;
    private List<Sanggar> listSanggar;

    public SanggarAdapter(Context context, List<Sanggar> listSanggar){
        this.context = context;
        this.listSanggar = listSanggar;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_sanggar, null, false);

        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        v.setLayoutParams(layoutParams);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Sanggar sanggarModel = listSanggar.get(position);
        holder.lblNamaSanggar.setText(sanggarModel.getNamaSanggar());
        holder.lblAlamatSanggar.setText(sanggarModel.getAlamatSanggar());
        holder.lblNoTelpSanggar.setText("Telp. "+sanggarModel.getNoTelpSanggar());
        holder.lblJarakSanggar.setText("+ "+sanggarModel.getJarakSanggar()+" KM");
        if (sanggarModel.hasImage()) {
            holder.lblImageSanggar.setImageResource(sanggarModel.getImageSanggar());
            holder.lblImageSanggar.setVisibility(View.VISIBLE);
        }
        else {
            holder.lblImageSanggar.setVisibility(View.GONE);
        }
        holder.cvSanggar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, sanggarModel.getNamaSanggar(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listSanggar.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cvSanggar;
        private ImageView lblImageSanggar;
        private TextView lblNamaSanggar, lblAlamatSanggar, lblNoTelpSanggar, lblJarakSanggar;
        private Button btnDirectMaps;

        public ViewHolder(View itemView) {
            super(itemView);

            cvSanggar = (CardView) itemView.findViewById(R.id.cv_sanggar);
            lblImageSanggar = (ImageView) itemView.findViewById(R.id.image);
            lblNamaSanggar = (TextView) itemView.findViewById(R.id.tv_nama_sanggar);
            lblAlamatSanggar = (TextView) itemView.findViewById(R.id.tv_alamat_sanggar);
            lblNoTelpSanggar = (TextView) itemView.findViewById(R.id.tv_no_telp_sanggar);
            lblJarakSanggar = (TextView) itemView.findViewById(R.id.tv_jarak_sanggar);
            btnDirectMaps = (Button) itemView.findViewById(R.id.btn_direct_maps);
        }
    }

}
