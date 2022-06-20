package br.com.etecia.mybooks;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Context context;
    private List<Books> books;


    public MyAdapter(Context context, List<Books> books) {
        this.context = context;
        this.books = books;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        CardView idModeloCardLivros;
        TextView txtModeloLivros;
        ImageView imgModeloLivros;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            idModeloCardLivros = itemView.findViewById(R.id.idCardLivros);
            txtModeloLivros = itemView.findViewById(R.id.txtModeloLivros);
            imgModeloLivros = itemView.findViewById(R.id.imgModeloLivros);
        }
    }


}
