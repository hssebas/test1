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


/*test de rapatriement : Test Ok*/

/*voici la version de la branche 1 pour le moment en local*/

	public static final String TABLE_NAME = "test branche1";

/*voici la version de la branche 1 pour le moment en local*/

/*voici la version de la branche 2 pour le moment en local*/

	public static final String Test_Branche = "test branche2";

/*voici la version de la branche 2 pour le moment en local*/
	
}

