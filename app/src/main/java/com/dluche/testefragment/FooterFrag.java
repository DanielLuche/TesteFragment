package com.dluche.testefragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by d.luche on 10/10/2017.
 */

public class FooterFrag extends Fragment {

    private ImageView iv_play;
    private ImageView iv_more_info;
    private setOnPlayPauseClickListner setOnPlayPauseClickListner;
    private setOnInfoClickListner setOnInfoClickListner;

    public interface setOnInfoClickListner{
        void onInfoClick();
    }

    public interface setOnPlayPauseClickListner{
        void onPlayPauseClick();
    }

    public void setSetOnInfoClickListner(FooterFrag.setOnInfoClickListner setOnInfoClickListner) {
        this.setOnInfoClickListner = setOnInfoClickListner;
    }

    public void setSetOnPlayPauseClickListner(FooterFrag.setOnPlayPauseClickListner setOnPlayPauseClickListner) {
        this.setOnPlayPauseClickListner = setOnPlayPauseClickListner;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.footer_frag,container,false);

        iniVar(view);
        //
        iniAction();

        return view;
    }


    private void iniVar(View view) {

        iv_play = view.findViewById(R.id.footer_frag_iv_toogle_play_pause);
        //
        iv_more_info = view.findViewById(R.id.footer_frag_iv_more);
        //
    }

    private void iniAction() {

        //Clique no play
        iv_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(setOnPlayPauseClickListner != null){
                    setOnPlayPauseClickListner.onPlayPauseClick();
                }
            }
        });

        //Clique no info
        iv_more_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(setOnInfoClickListner != null){
                    setOnInfoClickListner.onInfoClick();
                }
            }
        });

    }
}
