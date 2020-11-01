package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private String[] song = {"Remaja","Pelangi","Mata Ke Hati","Orang Ke 3","Kereta Kencan","Satu-Satunya","Siapkah Kau","You Move Me","Lemme Get That","Bye Bye Bye","Lose","Lowkey","New Rules","Don't Start Now","One Kiss","Scared to Be Lonely","Rockabye","Ciao Adios"};
    private String[] songYear = {"2017","2016","2017","2011","2017","2018","2017","2019","2000","2000","2020","2019","2017","2019","2018","2017","2016","2017"};

    private ArrayList<Song> songList;
    private RecyclerView rv_song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        songList = new ArrayList<>();

        for (int i = 0; i < (song.length) ; i++) {
            Song song = new Song(song[i],songYear[i]);
            songList.add(song);
        }

        rv_song = findViewById(R.id.rv_song);
        rv_song.setHasFixedSize(true);

        rv_song.setLayoutManager(new LinearLayoutManager(this));

        SongAdapter movieAdapter = new SongAdapter(songList);
        rv_song.setAdapter(movieAdapter);

    }
}
