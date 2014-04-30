package edu.csumb.csumb_map;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class MapActivity extends Activity
{
    
	private String title;
	private String snippet;
	private String result;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        // Get a handle to the Map Fragment
        GoogleMap map = ((MapFragment) getFragmentManager()
                .findFragmentById(R.id.map)).getMap();

        LatLng school = new LatLng(36.65417333132578, -121.79801280691527);
        LatLng MLC = new LatLng(36.65422497477866, -121.79984743788145);
        map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(MLC, 17));
        map.addMarker(new MarkerOptions()
                .title("Media Learning Center - #18")
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(MLC));
        
       
       // map.setOnInfoWindowClickListener(this);*/
        
	}

		/*public void onInfoWindowClick(Marker marker) {
			title = marker.getTitle();
			snippet = marker.getSnippet();
			result = title.substring(0, 5)+ " " + snippet;
			Intent intent = new Intent(getBaseContext(), MyCarpoolActivity.class);
			Bundle b = new Bundle();
			b.putString("result", result);
			intent.putExtras(b);
			startActivity(intent);
		}*/

}