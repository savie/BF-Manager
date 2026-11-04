package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.ۨ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12644 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("bin.mt.mcp.ACTION_FAILED_TO_START".equals(action)) {
            C6679.f22263 = false;
            String stringExtra = intent.getStringExtra(d.O);
            if (!TextUtils.isEmpty(stringExtra)) {
                C22673.m51154((CharSequence) stringExtra);
            }
        } else if (C6679.f22263 && "bin.mt.mcp.ACTION_STARTED".equals(action) && ServiceC6459.m18242() && ServiceC6459.m18246() == C0492.m2384()) {
            C6679.f22263 = false;
        } else if (C6679.f22263 && "bin.mt.mcp.ACTION_STOPPED".equals(action)) {
            C6679.f22263 = false;
            C21576.m49069(new RunnableC20849(0), 500L);
        } else if ("android.net.wifi.WIFI_STATE_CHANGED".equals(action) || "android.net.wifi.WIFI_AP_STATE_CHANGED".equals(action) || "android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            C21576.m49069(new RunnableC9309(0), 500L);
        }
        C6679.m18693();
        C6679.m18698();
    }
}
