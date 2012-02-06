package TestGoogleMap;


import com.google.android.maps.MapActivity;
//import com.google.android.maps.MapView;
import Test.Google.Map.R;
import android.os.Bundle;

public class HelloGoogleMaps extends MapActivity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
/*		MapView test = (MapView) findViewById(R.id.mapview);
		test.setBuiltInZoomControls(true);
*/	}
    @Override
    protected boolean isRouteDisplayed() {
        return false;
    }
}

/*test de rapatriement*/

/*test modif distance avec modif en cours en local*/

class HelloLinearLayoutActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}

/*fin test modif distance avec modif en cours en local*/
