package ac.pradita.it.simpelapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener {
private ImageView mail, phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        mail = (ImageView)findViewById(R.id.mail);
        mail.setOnClickListener(this);
        phone = (ImageView)findViewById(R.id.phone);
        phone.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.mail:
                //String email = "secretariat@pssi.org";
                //Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "secretariat@pssi.org",null));
                //startActivity(emailIntent);
                //break;
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "secretariat@pssi.org",null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "");
                startActivity(Intent.createChooser(emailIntent,"Pilih Opsi"));
                break;
            case R.id.phone:
                String phoneNumber = "02129115678";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;

        }
    }
}

