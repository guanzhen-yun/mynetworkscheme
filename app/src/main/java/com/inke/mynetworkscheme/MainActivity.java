package com.inke.mynetworkscheme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

//    private String url = "http://v.juhe.cn/historyWeather/citys?provice_id=2&key=bb52107206585ab074fe59a8c73875b";
    private String url = "http://xxxx";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendRequest();
    }

    private void sendRequest() {
        NeHttp.sendJsonRequest(url, null, ResponseClass.class, new IJsonDataListener<ResponseClass>() {
            @Override
            public void onSuccess(ResponseClass o) {
                Log.e("===>", o.toString());
            }
        });
    }
}