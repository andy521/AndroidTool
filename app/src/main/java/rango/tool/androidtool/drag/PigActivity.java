package rango.tool.androidtool.drag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import rango.tool.androidtool.R;
import rango.tool.androidtool.base.BaseActivity;
import rango.tool.androidtool.drag.pig.PigContainerView;

public class PigActivity extends BaseActivity {

    private PigContainerView pigContainerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pig_layout);

        pigContainerView = findViewById(R.id.pig_container_view);
        findViewById(R.id.buy_button).setOnClickListener(v -> {
            int x = v.getLeft() + v.getWidth() / 2;
            int y = v.getTop() + v.getHeight() / 2;
            pigContainerView.generatePig(0, x, y);
        });
    }
}
