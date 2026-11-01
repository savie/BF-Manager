package l;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: renamed from: l.۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4M5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8288 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Intent m21707(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        if ((i & 4) == 0 || str != null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1);
        }
        String str2 = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (C6171.m17169(context, str2) == 0) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str2, handler);
        }
        throw new RuntimeException(C16523.m38890("Permission ", str2, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ComponentName m21706(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }
}
