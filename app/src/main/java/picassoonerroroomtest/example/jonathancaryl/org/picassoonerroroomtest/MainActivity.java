package picassoonerroroomtest.example.jonathancaryl.org.picassoonerroroomtest;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    static List<Activity> activitiesToLeak = new ArrayList<>();

    @Bind(R.id.imageView) ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        activitiesToLeak.add(this);

        Picasso.with(this).load("https://upload.wikimedia.org/wikipedia/commons/b/b8/ESO_Very_Large_Telescope.jpg")
            .error(R.drawable.very_big)
            .into(imageView);
    }
}
