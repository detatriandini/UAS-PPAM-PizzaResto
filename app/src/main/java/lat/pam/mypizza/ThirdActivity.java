package lat.pam.mypizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        TextView namaPengguna = findViewById(R.id.nama_pemesan);
        TextView store_name = findViewById(R.id.store);

        Intent item = getIntent();

        String data = item.getStringExtra(SecondActivity.EXTRA_MESSAGE);
        String data2 = item.getStringExtra(FourthActivity.EXTRA_MESSAGE);
        String store = item.getStringExtra(SecondActivity.EXTRA_STORE);
        String store2 = item.getStringExtra(FourthActivity.EXTRA_STORE);

        if (data != null) {
            namaPengguna.setText(data);
            store_name.setText(store);
        } else {
            namaPengguna.setText(data2);
            store_name.setText(store2);
        }

        LinearLayout item1 = findViewById(R.id.item1);
        LinearLayout item2 = findViewById(R.id.item2);
        LinearLayout item3 = findViewById(R.id.item3);
        LinearLayout item4 = findViewById(R.id.item4);

        String name = namaPengguna.getText().toString();
        String storeName = store_name.getText().toString();

        item1.setOnClickListener(view -> {
            TextView title = findViewById(R.id.papperoniTitle);
            String price = getString(R.string.papperoni_price);
            String desc = getString(R.string.papperoni_detail_desc);

            Bundle itemBundle = new Bundle();
            itemBundle.putString("name", name);
            itemBundle.putString("store", storeName);
            itemBundle.putString("title", title.getText().toString());
            itemBundle.putString("price", price);
            itemBundle.putString("desc", desc);

            Intent sendIntent = new Intent(ThirdActivity.this, FourthActivity.class);
            sendIntent.putExtras(itemBundle);
            startActivity(sendIntent);
        });

        item2.setOnClickListener(view -> {
            TextView title = findViewById(R.id.spaghettiTitle);
            String price = getString(R.string.spaghetti_price);
            String desc = getString(R.string.spaghetti_detail_desc);

            Bundle itemBundle = new Bundle();
            itemBundle.putString("name", name);
            itemBundle.putString("store", storeName);
            itemBundle.putString("title", title.getText().toString());
            itemBundle.putString("price", price);
            itemBundle.putString("desc", desc);

            Intent sendIntent = new Intent(ThirdActivity.this, FourthActivity.class);
            sendIntent.putExtras(itemBundle);
            startActivity(sendIntent);
        });

        item3.setOnClickListener(view -> {
            TextView title = findViewById(R.id.burgerTitle);
            String price = getString(R.string.burger_price);
            String desc = getString(R.string.burger_detail_desc);

            Bundle itemBundle = new Bundle();
            itemBundle.putString("name", name);
            itemBundle.putString("store", storeName);
            itemBundle.putString("title", title.getText().toString());
            itemBundle.putString("price", price);
            itemBundle.putString("desc", desc);

            Intent sendIntent = new Intent(ThirdActivity.this, FourthActivity.class);
            sendIntent.putExtras(itemBundle);
            startActivity(sendIntent);
        });

        item4.setOnClickListener(view -> {
            TextView title = findViewById(R.id.steakTitle);
            String price = getString(R.string.steak_price);
            String desc = getString(R.string.steak_detail_desc);

            Bundle itemBundle = new Bundle();
            itemBundle.putString("name", name);
            itemBundle.putString("store", storeName);
            itemBundle.putString("title", title.getText().toString());
            itemBundle.putString("price", price);
            itemBundle.putString("desc", desc);

            Intent sendIntent = new Intent(ThirdActivity.this, FourthActivity.class);
            sendIntent.putExtras(itemBundle);
            startActivity(sendIntent);
        });
    }
}