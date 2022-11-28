package com.example.intencionesenandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.os.Bundle;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.RemoteActionCompatParcelizer;
import android.support.v4.app.RemoteActionCompatParcelizer;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pgWeb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.androidcurso.com/"));
        startActivity(intent);
    }
    public void llamadaTelefono(View view) {

        Intent intent = new Intent(Intent.ACTION_CALL,
                Uri.parse("tel:6142410030"));
        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.CALL_PHONE) !=
                PackageManager.PERMISSION_GRANTED) {

            return;
        }
        startActivity(intent);
    }
    public void googleMaps(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:28.70872474,-106.10845745"));
        startActivity(intent);
    }

    public void googleMapsCalle(View view) {

        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("google.streetview:cbll=28.7245144,-106.1081964"));
                    startActivity(intent);

    }
    public void tomarFoto(View view) {
        Intent intent = new
                Intent("MediaStore.ACTION_IMAGE_CAPTURE");
        startActivity(intent);
    }
    public void mandarCorreo(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "correo");
        intent.putExtra(Intent.EXTRA_TEXT, "correo desde aplicación de android");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]
                        {"leonevarez71@gmail.com"});
        startActivity(intent);
    }

}