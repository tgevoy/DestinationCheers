package ca.timevoy.destinationcheers;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ca.timevoy.destinationcheers.Deals;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link ItemListActivity}
 * in two-pane mode (on tablets) or a {@link ItemDetailActivity}
 * on handsets.
 */
public class ItemDetailFragment extends Fragment {

    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The deals content this fragment is presenting.
     */
    private Deals.DealItem mItem;

    TextView establishmentLabel;
    TextView locationLabel;
    TextView availabilityLabel;
    TextView detailsLabel;
    TextView websiteLabel;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the deals content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = Deals.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.getDay());
                //appBarLayout.setSubTitle(mItem.getDealOfDay());
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_detail, container, false);

        // Show the deal content as text in a TextView.
        if (mItem != null) {

            establishmentLabel = (TextView) rootView.findViewById(R.id.establishmentLabel);
            establishmentLabel.setText(String.format("Place: %s", mItem.getEstablishment()));

            locationLabel = (TextView) rootView.findViewById(R.id.locationLabel);
            locationLabel.setText(String.format("Location: %s", mItem.getLocation()));

            availabilityLabel = (TextView) rootView.findViewById(R.id.availabilityLabel);
            availabilityLabel.setText(String.format("Availability: %s", mItem.getAvailability()));

            detailsLabel = (TextView) rootView.findViewById(R.id.detailsLabel);
            detailsLabel.setText(String.format("Details: %s", mItem.getDetails()));

            websiteLabel = (TextView) rootView.findViewById(R.id.websiteLabel);
            websiteLabel.setText(String.format("Website: %s", mItem.getWebsite()));
        }

        return rootView;
    }
}
