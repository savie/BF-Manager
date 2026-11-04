package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import java.io.File;

/* JADX INFO: renamed from: l.ۛ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 39N7 */
/* JADX INFO: loaded from: classes3.dex */
public class C6647 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        int i;
        File cacheDir;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            C14849.m35778(context, new ExecutorC20817(), new C12612(this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                return;
            }
            String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
            if (!"WRITE_SKIP_FILE".equals(string)) {
                if ("DELETE_SKIP_FILE".equals(string)) {
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    setResultCode(11);
                    return;
                }
                return;
            }
            try {
                C14849.m35779(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                setResultCode(10);
                return;
            } catch (PackageManager.NameNotFoundException unused) {
                i = 7;
            }
        } else {
            if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                if (Build.VERSION.SDK_INT < 24) {
                    setResultCode(13);
                    return;
                } else {
                    Process.sendSignal(Process.myPid(), 10);
                    setResultCode(12);
                    return;
                }
            }
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            if ("DROP_SHADER_CACHE".equals(extras.getString("EXTRA_BENCHMARK_OPERATION"))) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 34) {
                    cacheDir = C25293.m56476(context).getCacheDir();
                } else {
                    if (i2 >= 24) {
                        context = C25293.m56476(context);
                    } else if (i2 != 23) {
                        cacheDir = context.getCacheDir();
                    }
                    cacheDir = context.getCodeCacheDir();
                }
                if (C17087.m40242(cacheDir)) {
                    setResultCode(14);
                    return;
                } else {
                    setResultCode(15);
                    return;
                }
            }
            i = 16;
        }
        setResultCode(i);
    }
}
