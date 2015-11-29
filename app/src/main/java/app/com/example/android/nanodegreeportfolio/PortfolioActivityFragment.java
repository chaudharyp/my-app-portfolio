package app.com.example.android.nanodegreeportfolio;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class PortfolioActivityFragment extends Fragment implements View.OnClickListener {

    public PortfolioActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_portfolio, container, false);

        Button spotifyStreamer = (Button) rootView.findViewById(R.id.spotify_streamer);
        spotifyStreamer.setOnClickListener(this);
        Button scoresApp = (Button) rootView.findViewById(R.id.scores_app);
        scoresApp.setOnClickListener(this);
        Button libraryApp = (Button) rootView.findViewById(R.id.library_app);
        libraryApp.setOnClickListener(this);
        Button buildItBigger = (Button) rootView.findViewById(R.id.build_it_bigger);
        buildItBigger.setOnClickListener(this);
        Button xyzReader = (Button) rootView.findViewById(R.id.xyz_reader);
        xyzReader.setOnClickListener(this);
        Button capstoneApp = (Button) rootView.findViewById(R.id.capstone_app);
        capstoneApp.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        Button button = (Button) v;
        String buttonText = button.getText().toString();
        Toast.makeText(getContext(), "Prepare for a journey to " + buttonText, Toast.LENGTH_SHORT).show();
    }
}
