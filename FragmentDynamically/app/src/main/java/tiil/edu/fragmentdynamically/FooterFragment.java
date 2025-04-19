package tiil.edu.fragmentdynamically;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FooterFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_footer, container, false);
        Button b1 =v.findViewById(R.id.b1);
        Button b2 =v.findViewById(R.id.b2);
        Button b3 =v.findViewById(R.id.b3);

        FragmentManager fragmentManager = getParentFragmentManager();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, new FragmentOne())
                        .commit();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, new FragmentTwo())
                        .commit();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, new FragmentThree())
                        .commit();

            }
        });

        return v;
    }
}