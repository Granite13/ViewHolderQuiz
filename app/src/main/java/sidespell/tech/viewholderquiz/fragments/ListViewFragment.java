package sidespell.tech.viewholderquiz.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import sidespell.tech.viewholderquiz.R;

/**
 * A placeholder fragment containing a {@link android.widget.ListView}.
 */
public class ListViewFragment extends Fragment {

    private List<Item> movieItems;

    public static ListViewFragment newInstance() {

        return new ListViewFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_listview, container, false);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            // inflate the GridView item layout
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.fragment_listview, parent, false);

            viewHolder = new ViewHolder();

            viewHolder.imgAnime = (ImageView) convertView.findViewById(R.id.imgAnime);
            viewHolder.nameAnime = (TextView) convertView.findViewById(R.id.nameAnime);
            viewHolder.descAnime = (TextView) convertView.findViewById(R.id.descAnime);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();

        }


        return convertView;
    }

    private static class ViewHolder {
            ImageView imgAnime;
            TextView nameAnime;
            TextView descAnime;
        }

}
