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
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView num_show;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num_show = (TextView) findViewById(R.id.num_show);
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

    public void clear(View view)
    {
        num_show.setText(null);
    }
    public void addnum0(View view)
    {
        num_show.setText(num_show.getText()+"0");
    }
    public void addnum1(View view)
    {
        num_show.setText(num_show.getText()+"1");
    }
    public void addnum2(View view)
    {
        num_show.setText(num_show.getText()+"2");
    }
    public void addnum3(View view)
    {
        num_show.setText(num_show.getText()+"3");
    }
    public void addnum4(View view)
    {
        num_show.setText(num_show.getText()+"4");
    }
    public void addnum5(View view)
    {
        num_show.setText(num_show.getText()+"5");
    }
    public void addnum6(View view)
    {
        num_show.setText(num_show.getText()+"6");
    }
    public void addnum7(View view)
    {
        num_show.setText(num_show.getText()+"7");
    }
    public void addnum8(View view)
    {
        num_show.setText(num_show.getText()+"8");
    }
    public void addnum9(View view)
    {
        num_show.setText(num_show.getText()+"9");
    }
    public void dell(View view)
    {
        String la = num_show.getText().toString();
        if(la.isEmpty()) {
            Toast.makeText(this, "Empty", Toast.LENGTH_SHORT).show();
        }
        else
        {
            String lala = la.substring(0, la.length() - 1);
            num_show.setText(lala);
        }
    }




}
