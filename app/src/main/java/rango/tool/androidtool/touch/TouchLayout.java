package rango.tool.androidtool.touch;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class TouchLayout extends RelativeLayout {

    private static final String TAG = TouchLayout.class.getSimpleName();

    public TouchLayout(Context context) {
        super(context);
    }

    public TouchLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TouchLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        switch (event.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                Log.e(TAG, "ACTION_DOWN");
//                break;
//            case MotionEvent.ACTION_MOVE:
//                Log.e(TAG, "ACTION_MOVE");
//                break;
//            case MotionEvent.ACTION_UP:
//                Log.e(TAG, "ACTION_UP");
//                break;
//            default:
//                Log.e(TAG, "DEFAULT");
//                break;
//        }
//
//        return true;
//    }
}
