package com.example.recycleview;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ListViewHolder> {

    private ArrayList<Song> listSong;

    public SongAdapter(ArrayList<Song> listSong) {
        this.listSong = listSong;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Song song = listSong.get(position);

        holder.txtTitle.setText(song.getTitle());
        holder.txtYear.setText(song.getYear());
    }

    @Override
    public int getItemCount() {
        return listSong.size();
    }

    public class ListViewHolder extends RecyclerrView.ViewHolder {
        TextView txtTitle;
        TextView txtYear;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtYear = itemView.findViewById(R.id.txtYear);
        }
    }
}