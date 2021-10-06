package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.util.Log;

import java.util.zip.Inflater;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather_activity);
        Log.i("Weather App status", "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Weather App status", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Weather App status", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Weather App status", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Weather App status", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Weather App status", "onDestroy()");
    }
}
class ForecastFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment, container, false);
        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();
    }
}
