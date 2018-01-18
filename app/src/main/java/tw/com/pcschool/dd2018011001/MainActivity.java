package tw.com.pcschool.dd2018011001;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.textView);
        handler = new Handler();
//        MyThread t = new MyThread();
//        t.start();
        handler.post(r);
    }
    Runnable r = new Runnable() {
        @Override
        public void run() {
            tv1.setText(String.valueOf(Integer.valueOf(tv1.getText().toString()) + 1));
            handler.postDelayed(r, 1000);
        }
    };
//    class MyThread extends Thread
//    {
//        @Override
//        public void run() {
//            super.run();
//            while (true)
//            {
//                try
//                {
//                    Thread.sleep(1000);
//                }
//                catch(Exception e)
//                {
//                    e.printStackTrace();
//                }
//                handler.post(new Runnable() {
//                    @Override
//                    public void run() {
//                        tv1.setText(String.valueOf(Integer.valueOf(tv1.getText().toString()) + 1));
//                    }
//                });
//            }
//        }
//    }
}
