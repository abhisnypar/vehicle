package com.example.abhim.vehicle;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner vehicleType;
    private Spinner pickUpTime;
    private Spinner dropOffTime;

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();

        vehicleType = (Spinner) findViewById(R.id.vehicle_type_spinner);
        pickUpTime = (Spinner) findViewById(R.id.pickup_spinner);
        dropOffTime = (Spinner) findViewById(R.id.retutn_spinner);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.vehicle_type,
                android.R.layout.simple_spinner_dropdown_item);
        vehicleType.setAdapter(adapter);

        adapter = ArrayAdapter.createFromResource(this, R.array.pick_drop_time, android.R.layout.simple_spinner_dropdown_item);
        pickUpTime.setAdapter(adapter);
        dropOffTime.setAdapter(adapter);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        //Nothing to do

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

        //Nothing to do
    }
}
