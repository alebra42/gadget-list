package pw.talamaur.android.gadgetlist;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ListView listViewGadgets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hideActionBar();

        ImageView imageViewLogo = findViewById(R.id.imageViewLogo);
        Picasso.get().load(R.drawable.logo).fit().centerInside().into(imageViewLogo);

        listViewGadgets = findViewById(R.id.listViewGadgets);
        listViewGadgets.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        //TODO
                        break;

                    default:
                        Toast.makeText(MainActivity.this, R.string.unsupported_category,
                                Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void hideActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
    }
}
