package iut.projetandroid.elgarrailavigne.geosms;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by POSTE on 08/03/2016.
 */
public class Destinataires extends Fragment {

    public Destinataires newInstance(int index) {
        Destinataires d = new Destinataires();

        Bundle args =new Bundle();
        args.putInt("index", index);
        d.setArguments(args);

        return d;
    }

    public int getShownIndex(){
        return getArguments().getInt("index",0);
    }


    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragmentdestinataires,container, false);
    }
}
