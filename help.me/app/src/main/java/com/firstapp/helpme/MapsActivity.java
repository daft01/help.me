package com.firstapp.helpme;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Intent intent;
    LocationManager mLocationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        mLocationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        intent = getIntent();
        int num = intent.getIntExtra("num", 0);
        if(num == 1)
        {
            Toast.makeText(this, "Message has been send to everyone in your contacts saying that your okay!",
                    Toast.LENGTH_LONG).show();
        }
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }

        /*
        if(mLocationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)){
            mLocationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, new LocationListener() {
                @Override
                public void onLocationChanged(Location location) {
                    double latitute = location.getLatitude();
                    double longititude = location.getLongitude();
                    LatLng latLng = new LatLng(latitute, longititude);
                    Geocoder geocoder = new Geocoder(getApplicationContext());
                    try {
                        List<Address> addressList = geocoder.getFromLocation(latitute, longititude, 1);
                        String str = addressList.get(0).getLocality() + ", ";
                        str += addressList.get(0).getCountryName();
                        mMap.addMarker(new MarkerOptions().position(latLng).title(str));
                        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 10.2f));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                @Override
                public void onStatusChanged(String s, int i, Bundle bundle) {

                }

                @Override
                public void onProviderEnabled(String s) {

                }

                @Override
                public void onProviderDisabled(String s) {

                }
            });
        }
        else if(mLocationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)){

        mLocationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                double latitute = location.getLatitude();
                double longititude = location.getLongitude();
                LatLng latLng = new LatLng(latitute, longititude);
                Geocoder geocoder = new Geocoder(getApplicationContext());
                try {
                    List<Address> addressList = geocoder.getFromLocation(latitute, longititude, 1);
                    String str = addressList.get(0).getLocality() + ", ";
                    str += addressList.get(0).getCountryName();
                    mMap.addMarker(new MarkerOptions().position(latLng).title(str));
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 10.2f));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onStatusChanged(String s, int i, Bundle bundle) {

            }

            @Override
            public void onProviderEnabled(String s) {

            }

            @Override
            public void onProviderDisabled(String s) {

            }
        });
    }

*/
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //Add a marker in Sydney and move the camera
        LatLng me = new LatLng(36.652603, -121.797308);
        mMap.addMarker(new MarkerOptions().position(me).title("Me"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(me, 17.2f));
    }

    public void familyClicked(View v){
        LatLng mom = new LatLng(36.666686, -121.812522);
        mMap.addMarker(new MarkerOptions().position(mom).title("MOM"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mom, 17.2f));

        LatLng dad = new LatLng(36.666787, -121.812372);
        mMap.addMarker(new MarkerOptions().position(dad).title("Dad"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(dad, 17.2f));
    }

    public void schoolClicked(View v){
        LatLng andy = new LatLng(36.652503, -121.797220);
        mMap.addMarker(new MarkerOptions().position(andy).title("Andy"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(andy, 17.2f));

        LatLng sonia = new LatLng(36.652506, -121.797186);
        mMap.addMarker(new MarkerOptions().position(sonia).title("Sonia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sonia, 17.2f));

        LatLng clarisa = new LatLng(36.652507, -121.797123);
        mMap.addMarker(new MarkerOptions().position(clarisa).title("Clarisa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(clarisa, 17.2f));

        LatLng joe = new LatLng(36.652548, -121.797119);
        mMap.addMarker(new MarkerOptions().position(joe).title("Joe"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(joe, 17.2f));

        LatLng adrian = new LatLng(36.652491, -121.797194);
        mMap.addMarker(new MarkerOptions().position(adrian).title("Adrian"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(adrian, 17.2f));

        LatLng tonny = new LatLng(36.652487, -121.797102);
        mMap.addMarker(new MarkerOptions().position(tonny).title("Tonny"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tonny, 17.2f));
    }

    public void helpClicked(View v){
        LatLng help = new LatLng(36.655218, -121.804342);
        mMap.addMarker(new MarkerOptions().position(help).title("Police Department"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(help, 17.2f));
    }

    public void friendsClicked(View v){
        LatLng maria = new LatLng(36.654314, -121.797266);
        mMap.addMarker(new MarkerOptions().position(maria).title("Maria"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(maria, 17.2f));

        LatLng josh = new LatLng(36.652416, -121.796381);
        mMap.addMarker(new MarkerOptions().position(josh).title("Josh"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(josh, 17.2f));

        LatLng jesus = new LatLng(36.653574, -121.797271);
        mMap.addMarker(new MarkerOptions().position(jesus).title("Jesus"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(jesus, 17.2f));

        LatLng daniel = new LatLng(36.652515, -121.795694);
        mMap.addMarker(new MarkerOptions().position(daniel).title("Daniel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(daniel, 17.2f));
    }



}
