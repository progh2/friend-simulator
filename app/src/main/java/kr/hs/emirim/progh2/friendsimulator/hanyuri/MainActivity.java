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
        switch( view.getId() ){
            case R.id.button1:
                Toast.makeText(this, "인냐~~~~~?", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this, "야 디질래?", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(this, "이러나~", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(this, "헛쏘리하지마", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(this, "우하하하하핳ㅎ하하", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this, "뭐라하는지 모르겠어용", Toast.LENGTH_SHORT).show();
                break;
        }



    }

}
