package com.dluche.testefragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private MainFrag mainFrag;
    private InfoFrag infoFrag;
    private FragmentManager fragManager;
    private Context context;
    private FooterFrag footerFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniVars();
        //
        iniAction();
    }

    private void iniVars() {
        context = this;
        //
        fragManager = getSupportFragmentManager();
        //
        footerFrag = (FooterFrag) fragManager.findFragmentById(R.id.main_footer_fragment);
        //
        mainFrag = new MainFrag();
        //
        infoFrag = new InfoFrag();
        //
        //Seta primeiro fragmento na tela.
        FragmentTransaction fragTrans =  fragManager.beginTransaction();
        fragTrans.add(R.id.main_frag_container,mainFrag);
        fragTrans.commit();
        //

    }

    private void iniAction() {

        footerFrag.setSetOnPlayPauseClickListner(new FooterFrag.setOnPlayPauseClickListner() {
            @Override
            public void onPlayPauseClick() {
                //Toast.makeText(context,"play/pause ativado",Toast.LENGTH_SHORT).show();;
                changeFragment(mainFrag);
            }
        });
        //
        footerFrag.setSetOnInfoClickListner(new FooterFrag.setOnInfoClickListner() {
            @Override
            public void onInfoClick() {
                //Toast.makeText(context,"Info clicado",Toast.LENGTH_SHORT).show();
                changeFragment(infoFrag);
            }
        });



    }

    private void changeFragment(Fragment fragment){
        FragmentTransaction fragTrans =  fragManager.beginTransaction();
        fragTrans.replace(R.id.main_frag_container,fragment);
        fragTrans.commit();

    }
}
