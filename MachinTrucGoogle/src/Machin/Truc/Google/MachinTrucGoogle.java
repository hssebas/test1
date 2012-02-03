package Machin.Truc.Google;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;

//import android.app.Activity;
import android.os.Bundle;

public class MachinTrucGoogle extends MapActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        MapView test = (MapView) findViewById(R.id.mapview);
        test.setBuiltInZoomControls(true);
    }

	@Override
	protected boolean isRouteDisplayed() {
		return false;
	}
}