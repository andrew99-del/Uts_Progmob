package com.example.helloprogmob.Crud;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helloprogmob.Model.DefaultResult;
import com.example.helloprogmob.Network.GetDataService;
import com.example.helloprogmob.Network.RetrofitClientInstance;
import com.example.helloprogmob.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HapusMhsActivity extends AppCompatActivity {

    ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hapus_mhs);
        final EditText edNimYgAkanDicari = (EditText)findViewById(R.id.editTextInput);
        Button btnHapus = (Button)findViewById(R.id.buttonHapusMhs);
        pd = new ProgressDialog(HapusMhsActivity.this);

        btnHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pd.setTitle("S A B A R !");
                pd.show();

                GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
                Call<DefaultResult> call = service.delete_mhs(
                        edNimYgAkanDicari.getText().toString(),
                        "Kosongkan Saja nanti akan terisi di random sistem"


                );
                call.enqueue(new Callback<DefaultResult>() {
                    @Override
                    public void onResponse(Call<DefaultResult> call, Response<DefaultResult> response) {
                        pd.dismiss();
                        Toast.makeText( HapusMhsActivity.this, "Data Sudah Dihapus :)",Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onFailure(Call<DefaultResult> call, Throwable t) {
                        pd.dismiss();
                        Toast.makeText(HapusMhsActivity.this, "Data Tidak Bisa dihapus :(", Toast.LENGTH_LONG).show();

                    }
                });
            }
        });



    }
}