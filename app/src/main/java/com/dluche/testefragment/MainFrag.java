package com.dluche.testefragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

/**
 * Created by d.luche on 16/10/2017.
 */

public class MainFrag extends Fragment {

    private ProgressBar progressBar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_frag,container,false);

        iniVar(view);

        iniActions();

        return view;
    }

    private void iniVar(View view) {

        progressBar = view.findViewById(R.id.main_frag_progress);
        //


    }

    private void iniActions() {

    }
}
