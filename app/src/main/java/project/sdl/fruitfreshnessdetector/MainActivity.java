package project.sdl.fruitfreshnessdetector;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void FruitOnClick(View view){
        switch(view.getId()){
            case R.id.banana:
                Toast.makeText(this, "Banana", Toast.LENGTH_SHORT).show();
                break;
            case R.id.apple:
                Toast.makeText(this, "Apple", Toast.LENGTH_SHORT).show();
                break;
        }
        Intent intent = new Intent(MainActivity.this, Selector.class);
        startActivity(intent);
    }
}

