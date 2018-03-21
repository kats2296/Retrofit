package com.example.kats.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kats.retrofit.dailysummary.DailySummary;

import java.util.ArrayList;

import retrofit2.*;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView text, text2;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView)findViewById(R.id.t1);

        text2 = (TextView)findViewById(R.id.t2);


        //calling the method to display the heroes
        getData();

    }

    private void getData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();

        Api api = retrofit.create(Api.class);

        Call<Data> call = api.getData();

        call.enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, retrofit2.Response<Data> response) {


                ArrayList<DailySummary> dlist = response.body().getHistory().getDailySummary();

                for(int i=0; i<dlist.size();i++)
                {
                    text.setText(dlist.get(i).getMaxtempm()+ "`C");
                    text2.setText(dlist.get(i).getMintempm()+"`C");
                }
            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
}