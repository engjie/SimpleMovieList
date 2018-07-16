package sg.edu.rp.c346.simplemovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //step 1b -- create a ListView variables
    ListView lvMovie;

    //step 2a -- create ArrayList variables

    ArrayList<String> alMovieList;
    //step 3a create an ArrayAdapter variable
    ArrayAdapter<String>aaMovie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step 1c find the ListView UI element to the Java variables
        lvMovie = findViewById(R.id.listViewMovie);


        //step 2b initialize the ArrayList
        alMovieList = new ArrayList<>();

        //step 2c Ad data into ArrayList
        alMovieList.add("Avengers Infinity War Release date 2018.04");
        alMovieList.add("Justice League 2017.11");


        //step 3b initialize the ArrayAdapter and blind it to ArrayList

        aaMovie = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,alMovieList);

        //step 4: blind ListView to ArrayAdapter
        lvMovie.setAdapter(aaMovie);



    }
}
