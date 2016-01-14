package sidespell.tech.viewholderquiz.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import sidespell.tech.viewholderquiz.R;

/**
 * A placeholder fragment containing a {@link android.widget.GridView}.
 */
public class GridViewFragment extends Fragment {



    public static GridViewFragment newInstance() {
        return new GridViewFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gridview, container, false);
    }

}
