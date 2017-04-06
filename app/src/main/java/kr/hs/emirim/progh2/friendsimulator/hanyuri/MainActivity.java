package kr.hs.emirim.progh2.friendsimulator.hanyuri;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void onClick( View view ){
        Toast.makeText(this, "작동 해요~", Toast.LENGTH_SHORT).show();
    }

}
