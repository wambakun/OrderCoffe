package developerkampus.ordercoffe;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int quantity =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    // method ini di pakai ketika button order ditekan
    public void order(View view){
        String harga = "Total : Rp."+(quantity*10000);
        tampilPesan(harga);
    }
    //method ini dipakai ketika button tambah ditekan
    public void tambah (View view){
        quantity++;
        tampil(quantity);
    }
    //method ini di pakai ketika button kurang ditekan
    public void kurang (View view){
        quantity--;
        tampil(quantity);
    }
    // menampilkan harga
    private void tampilHarga(int number){
        TextView TvPrice = (TextView)findViewById(R.id.tv_price);
        TvPrice.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    //menampilkan pesan
    private void tampilPesan(String message){
        TextView TvPrice =(TextView)findViewById(R.id.tv_price);
        TvPrice.setText(message);
    }
    //menampilkan jumlah order
    private void tampil (int number){
        TextView TvQuantity = (TextView)findViewById(R.id.tv_quantity);
        TvQuantity.setText(" "+number);
    }

}
