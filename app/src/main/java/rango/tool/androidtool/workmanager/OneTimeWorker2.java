package rango.tool.androidtool.workmanager;

import android.support.annotation.NonNull;
import android.util.Log;

import androidx.work.Worker;
import rango.tool.common.utils.TimeUtils;

public class OneTimeWorker2 extends Worker {
    private static final String TAG = OneTimeWorker2.class.getSimpleName();

    @NonNull
    @Override
    public Result doWork() {
        Log.e(TAG, "do one time work!!!");
        String msg = "run: type = work_delay_2, current_time = " + TimeUtils.getCurrentTime() + ", do delay work;\n";
        ToolWorkManager.getInstance().writeMsg(msg);
        return Result.SUCCESS;
    }
}
