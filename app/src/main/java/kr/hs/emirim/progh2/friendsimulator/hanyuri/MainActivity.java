package kr.hs.emirim.progh2.friendsimulator.hanyuri;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String TAG = "한유리:Main";
    private ImageView mImageViewFriendVisual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate 메소드 호출~");
        setContentView(R.layout.activity_main);
        mImageViewFriendVisual = (ImageView) findViewById(R.id.friend_visual);
        Log.d(TAG, "activity_main 레이아웃 세팅~");
    }

    void onClick( View view ){
        Log.d(TAG, "onClick 메소드 호출~");
        Log.d(TAG, "클릭된 뷰 id:" + view.getId() );
        switch( view.getId() ){
            case R.id.button1:
                Log.d(TAG, "버튼1 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.han01);
                Toast.makeText(this, "인냐~~~~~?", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Log.d(TAG, "버튼2 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.han02);
                Toast.makeText(this, "야 디질래?", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Log.d(TAG, "버튼3 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.han03);
                Toast.makeText(this, "이러나~", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Log.d(TAG, "버튼4 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.han05);
                Toast.makeText(this, "헛쏘리하지마", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Log.e(TAG, "버튼5 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.han06);
                Toast.makeText(this, "우하하하하핳ㅎ하하", Toast.LENGTH_SHORT).show();
                break;
            default:
                Log.e(TAG, "모르는 녀석 클릭");
                Toast.makeText(this, "뭐라하는지 모르겠어용", Toast.LENGTH_SHORT).show();
                break;
        }
        Log.d(TAG, "onClick 메소드 무사히 종료");


    }

}
