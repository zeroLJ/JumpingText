package example.com.zero.jumpingtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private JumpingBeans jumpingBeans1, jumpingBeans2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView1 = (TextView) findViewById(R.id.jumping_text_1);
        jumpingBeans1 = JumpingBeans.with(textView1)
                .appendJumpingDots()
                .build();

        // Note that, even though we access textView2's text when starting to work on
        // the animation builder, we don't alter it in any way, so we're ok
        final TextView textView2 = (TextView) findViewById(R.id.jumping_text_2);
        jumpingBeans2 = JumpingBeans.with(textView2)
                .makeTextJump(0, textView2.getText().toString().indexOf(' '))
                .setIsWave(false)
                .setLoopDuration(1000)
                .build();
    }
}
