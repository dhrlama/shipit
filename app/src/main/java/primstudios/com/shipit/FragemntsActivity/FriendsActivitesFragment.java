package primstudios.com.shipit.FragemntsActivity;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import primstudios.com.shipit.R;


public class FriendsActivitesFragment extends Fragment {
	
	LinearLayout linearLayout;
	public FriendsActivitesFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_friend_activities, container, false);
        linearLayout = (LinearLayout)rootView.findViewById(R.id.mylinearLayout);

        return rootView;
    }
}
