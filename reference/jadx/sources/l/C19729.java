package l;

import android.content.BroadcastReceiver;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.᩵᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6KF */
/* JADX INFO: loaded from: classes4.dex */
public final class C19729 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Runnable f63310;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final BroadcastReceiver f63312;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f63313;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ContextWrapper f63315;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ConnectivityManager f63317;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ConnectivityManager.NetworkCallback f63318;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Handler f63314 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final RunnableC4263 f63316 = new RunnableC4263(7, this);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final RunnableC7361 f63311 = new RunnableC7361(3, this);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m44855(C19729 c19729) {
        RunnableC4263 runnableC4263 = c19729.f63316;
        Handler handler = c19729.f63314;
        boolean z = c19729.f63313;
        if (z) {
            return;
        }
        if (!z) {
            c19729.f63310.run();
        }
        handler.removeCallbacks(runnableC4263);
        handler.postDelayed(runnableC4263, 500L);
    }

    public C19729(ContextWrapper contextWrapper, Runnable runnable) {
        C19023 c19023 = new C19023(this);
        this.f63318 = c19023;
        C8440 c8440 = new C8440(this);
        this.f63312 = c8440;
        this.f63315 = contextWrapper;
        this.f63310 = runnable;
        ConnectivityManager connectivityManager = (ConnectivityManager) contextWrapper.getSystemService("connectivity");
        this.f63317 = connectivityManager;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), c19023);
        IntentFilter intentFilter = new IntentFilter("android.net.wifi.WIFI_AP_STATE_CHANGED");
        intentFilter.addAction("android.net.conn.TETHER_STATE_CHANGED");
        contextWrapper.registerReceiver(c8440, intentFilter);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44853(C19729 c19729) {
        if (c19729.f63313) {
            return;
        }
        c19729.f63310.run();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44856() {
        if (this.f63313) {
            return;
        }
        this.f63313 = true;
        this.f63317.unregisterNetworkCallback(this.f63318);
        this.f63315.unregisterReceiver(this.f63312);
        this.f63314.removeCallbacksAndMessages(null);
    }
}
