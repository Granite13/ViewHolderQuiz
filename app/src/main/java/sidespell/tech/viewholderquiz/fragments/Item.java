package sidespell.tech.viewholderquiz.fragments;

import android.graphics.drawable.Drawable;

/**
 * Created by whyaguilar on 1/14/16.
 */
public class Item {

        public final Drawable icon;       // the drawable for the ListView item ImageView
        public final String title;        // the text for the ListView item title
        public final String description;  // the text for the ListView item description

        public Item(Drawable icon, String title, String description) {
            this.icon = icon;
            this.title = title;
            this.description = description;
        }
}

