package com.example.csumbmap;

import android.app.Activity;
import android.os.Bundle;
import edu.csumb.csumbmap.R;

/*public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}*/




import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;

import android.os.Bundle;
import android.view.KeyEvent;

public class MainActivity extends Activity {
	MapView mapView;
	GoogleMap map;
	LatLng coords;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {        
		super.onCreate(savedInstanceState);        
		setContentView(R.layout.activity_main);  
		try{
		map = ((MapFragment) getFragmentManager().findFragmentById(R.id.mapFragment)).getMap();
		if(map == null){throw new NullPointerException("map failed to initialize!");}
		}
		catch (NullPointerException e)
		{
			e.printStackTrace();
		}
		double lng = -121.80809139999997;
		double lat = 36.6544335;
		
		coords = new LatLng(lat,lng);
		map.animateCamera(CameraUpdateFactory.newLatLngZoom(coords, 15.0F));
		//mapView.invalidate();
		
		}
	
	/*public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		MapCOntroller mc = mapView.getController();
		switch (keyCode)
		{
		case KeyEvent.KEYCODE_3:
			mc.zoomIn();
			break;
		case KeyEvent.KEYCODE_1:
			mc.zoomOut();
			break;
		}
		return super.onKeyDown(keyCode, event);
	}*/
	
	/*@Override    
	protected boolean isRouteDisplayed() {        
		// TODO Auto-generated method stub        
		return false;    
		} 
	}*/

}