package rango.tool.androidtool.farm;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import rango.tool.androidtool.R;
import rango.tool.androidtool.base.BaseActivity;
import rango.tool.androidtool.falling.BaseFallingSurfaceView;
import rango.tool.androidtool.farm.pig.PigContainerView;

public class PigActivity extends BaseActivity {

    private PigContainerView pigContainerView;
    private BaseFallingSurfaceView fallingSurfaceView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pig_layout);

        fallingSurfaceView = findViewById(R.id.falling_view);

        pigContainerView = findViewById(R.id.pig_container_view);
        findViewById(R.id.buy_button).setOnClickListener(v -> {
            int x = v.getLeft() + v.getWidth() / 2;
            int y = v.getTop() + v.getHeight() / 2;
            pigContainerView.generatePig(0, x, y);
        });

        findViewById(R.id.accelerate_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                fallingSurfaceView.startFalling(5000, 10);
                fallingSurfaceView.startFalling();
            }
        });

        findViewById(R.id.stop_btn).setOnClickListener(v -> fallingSurfaceView.stopFalling());
        findViewById(R.id.resume_button).setOnClickListener(v -> fallingSurfaceView.resumeFalling());
        findViewById(R.id.pause_btn).setOnClickListener(v -> fallingSurfaceView.pauseFalling());

    }
}
