package jurgenirgo.example.splashtohomejurgen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ImageView bgapp, clover;
    LinearLayout text_splash, text_home, menus;
    Animation froambottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        froambottom = AnimationUtils.loadAnimation(this,R.anim.froambottom);

        bgapp = (ImageView) findViewById(R.id.bgapp);
        clover = (ImageView) findViewById(R.id.clover);
        text_splash = (LinearLayout) findViewById(R.id.text_splash);
        text_home = (LinearLayout) findViewById(R.id.text_home);
        menus = (LinearLayout) findViewById(R.id.menus);


        bgapp.animate().translationY(-1900).setDuration(800).setStartDelay(300);
        clover.animate().alpha(0).setDuration(800).setStartDelay(600);
        text_splash.animate().translationY(140).alpha(0).setDuration(800).setStartDelay(300);

        text_home.startAnimation(froambottom);
        menus.startAnimation(froambottom);
    }
}
