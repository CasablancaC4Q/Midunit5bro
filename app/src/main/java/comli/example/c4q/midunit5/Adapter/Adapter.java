package comli.example.c4q.midunit5.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import comli.example.c4q.midunit5.R;
import comli.example.c4q.midunit5.models.Connections;

/**
 * Created by c4q on 1/24/18.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private Connections[] results;

    public Adapter(Connections[] results) {
        this.results = results;
    }

    public void setAdapter(Connections[] results) {
        this.results = results;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Picasso.with(holder.view.getContext()).load(String.valueOf(results[position].getPicture().getClass())).into(holder.userImage);
        String name = results[position].getName().getTitle() + " " + results[position].getName().getFirst() + " " + results[position].getName().getLast();
        holder.userName.setText(name);

    }

    @Override
    public int getItemCount() {
        return results.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView userImage;
        private TextView userName;
        private View view;

        public ViewHolder(View itemView) {
            super(itemView);
            userImage = itemView.findViewById(R.id.user_image);
            userName = itemView.findViewById(R.id.user_name);
            view = itemView;
        }
    }
}

