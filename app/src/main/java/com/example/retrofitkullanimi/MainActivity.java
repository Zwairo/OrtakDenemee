package com.example.retrofitkullanimi;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private Button btnGetTime;
    private TextView txtTime;
    private Button btn;

    private Retrofit retrofit;
    private String baseUrl="http://worldtimeapi.org/api/timezone";
    private TimeApi timeApi;

    public void init(){
        btnGetTime=findViewById(R.id.button);
        txtTime=findViewById(R.id.txtTime);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        init();

        btnGetTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRetrofitSetting();
            }
        });

        selam();
    }

    private void selam() {
        System.out.println("Selam");
    }

    //http://worldtimeapi.org/api/timezone
    private void setRetrofitSetting(){
    retrofit=new Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory .create())
            .build();

    timeApi=retrofit.create(TimeApi.class);
addOnContextAvailableListener(new OnContextAvailableListener() {
    @Override
    public void onContextAvailable(@NonNull Context context) {

    }
});
    }
}