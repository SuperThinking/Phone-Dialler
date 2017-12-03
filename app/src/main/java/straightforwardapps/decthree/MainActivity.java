package straightforwardapps.decthree;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText num_show;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num_show = (EditText) findViewById(R.id.num_show);
    }

    public void callbaby(View view)
    {
        Intent i = new Intent(Intent.ACTION_CALL);
        s = num_show.getText().toString();
        if(s.isEmpty())
        {
            Toast.makeText(this, "Empty", Toast.LENGTH_SHORT).show();
        }
        else
        {
            i.setData(Uri.parse("tel:"+s));
        }

        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED)
        {
            //startActivity(i);
            Toast.makeText(this, "GRANT PERMISSION", Toast.LENGTH_SHORT).show();
            permission();
        }
        else
        {
            startActivity(i);
        }
    }

    private void permission()
    {
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 1);
    }
}
