# JumpingText
 
 复制JumpingBeans和JumpingBenansSpan到自己项目即可使用.
 
// Append jumping dots

final TextView textView1 = (TextView) findViewById(R.id.jumping_text_1);
jumpingBeans1 = JumpingBeans.with(textView1)
        .appendJumpingDots()
        .build();

// Make the first word's letters jump

final TextView textView2 = (TextView) findViewById(R.id.jumping_text_2);
jumpingBeans2 = JumpingBeans.with(textView2)
        .makeTextJump(0, textView2.getText().toString().indexOf(' '))
        .setIsWave(false)
        .setLoopDuration(1000)  // ms
        .build();
