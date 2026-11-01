package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.ۖۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2478 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("bin.mt.mcp.ACTION_FAILED_TO_START".equals(action)) {
            C5301.f18329 = false;
            String stringExtra = intent.getStringExtra(d.O);
            if (!TextUtils.isEmpty(stringExtra)) {
                C15829.m37613((CharSequence) stringExtra);
            }
        } else if (C5301.f18329 && "bin.mt.mcp.ACTION_STARTED".equals(action) && ServiceC8498.m22208() && ServiceC8498.m22215() == C16259.m38409()) {
            C5301.f18329 = false;
        } else if (C5301.f18329 && "bin.mt.mcp.ACTION_STOPPED".equals(action)) {
            C5301.f18329 = false;
            C16737.m39274(new RunnableC11652(), 500L);
        } else if ("android.net.wifi.WIFI_STATE_CHANGED".equals(action) || "android.net.wifi.WIFI_AP_STATE_CHANGED".equals(action) || "android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            C16737.m39274(new RunnableC17856(0), 500L);
        }
        C5301.m14717();
        C5301.m14698();
    }
}
