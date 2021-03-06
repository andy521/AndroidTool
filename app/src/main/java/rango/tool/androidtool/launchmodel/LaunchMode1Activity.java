package rango.tool.androidtool.launchmodel;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import rango.tool.androidtool.R;
import rango.tool.androidtool.base.BaseActivity;

public class LaunchMode1Activity extends BaseActivity {

    public static final String INTENT_KEY_TEST = "intent_key_test";

    public static void start(Context context, String value) {
        Intent starter = new Intent(context, LaunchMode1Activity.class);
        starter.putExtra(INTENT_KEY_TEST, value);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("rango", "onCreate");
        setContentView(R.layout.activity_launch_mode_1_layout);

        findViewById(R.id.btn_1).setOnClickListener(v -> {
            startActivity(LaunchMode2Activity.class);
        });
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e("rango", "onNewIntent()");
        setIntent(intent);
    }

    @Override protected void onStart() {
        super.onStart();
        Log.e("rango", "onStart()");
    }

    @Override protected void onResume() {
        super.onResume();
        Log.e("rango", "onResume()");
        Intent intent = getIntent();
        Log.e("rango", "intentValue = " + intent.getStringExtra(INTENT_KEY_TEST));
    }

    @Override protected void onRestart() {
        super.onRestart();
        Log.e("rango", "onRestart()");
    }

    @Override protected void onPause() {
        super.onPause();
        Log.e("rango", "onPause()");
    }

    @Override protected void onStop() {
        super.onStop();
        Log.e("rango", "onStop()");
    }

    @Override protected void onDestroy() {
        super.onDestroy();
        Log.e("rango", "onDestroy()");
    }

    @Override public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.e("rango", "onAttachedToWindow()");
    }

    @Override public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.e("rango", "onDetachedFromWindow()");
    }
}
