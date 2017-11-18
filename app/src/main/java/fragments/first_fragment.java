package fragments;


import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import org.ankit.mypager.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class first_fragment extends Fragment implements View.OnClickListener{

Button b;
    public first_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View myView = inflater.inflate(R.layout.fragment_first_fragment, container, false);
        b=(Button)myView.findViewById(R.id.btn);
        b.setOnClickListener(this);

        return myView;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btn:
                Snackbar.make(view,"Clicked",Snackbar.LENGTH_LONG).show();
        }
    }
}
