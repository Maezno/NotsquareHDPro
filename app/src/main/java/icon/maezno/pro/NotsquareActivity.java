package icon.maezno.pro;


import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import com.jahirfiquitiva.paperboard.activities.MainActivity;


public class NotsquareActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(NotsquareActivity.this, MainActivity.class);
        startActivity(intent);

        finish();


    }
}
