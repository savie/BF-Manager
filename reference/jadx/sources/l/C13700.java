package l;

import android.content.BroadcastReceiver;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.۬۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6KF */
/* JADX INFO: loaded from: classes4.dex */
public final class C13700 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final BroadcastReceiver f43454;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f43455;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final RunnableC20701 f43456;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ContextWrapper f43457;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Runnable f43458;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ConnectivityManager.NetworkCallback f43459;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Handler f43460 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConnectivityManager f43461;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final RunnableC22205 f43462;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m33491(C13700 c13700) {
        RunnableC20701 runnableC20701 = c13700.f43456;
        Handler handler = c13700.f43460;
        boolean z = c13700.f43455;
        if (z) {
            return;
        }
        if (!z) {
            c13700.f43458.run();
        }
        handler.removeCallbacks(runnableC20701);
        handler.postDelayed(runnableC20701, 500L);
    }

    public C13700(ContextWrapper contextWrapper, Runnable runnable) {
        int i = 4;
        this.f43456 = new RunnableC20701(i, this);
        this.f43462 = new RunnableC22205(i, this);
        C8480 c8480 = new C8480(this);
        this.f43459 = c8480;
        C6989 c6989 = new C6989(this);
        this.f43454 = c6989;
        this.f43457 = contextWrapper;
        this.f43458 = runnable;
        ConnectivityManager connectivityManager = (ConnectivityManager) contextWrapper.getSystemService("connectivity");
        this.f43461 = connectivityManager;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), c8480);
        IntentFilter intentFilter = new IntentFilter("android.net.wifi.WIFI_AP_STATE_CHANGED");
        intentFilter.addAction("android.net.conn.TETHER_STATE_CHANGED");
        contextWrapper.registerReceiver(c6989, intentFilter);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33489(C13700 c13700) {
        if (c13700.f43455) {
            return;
        }
        c13700.f43458.run();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33493() {
        if (this.f43455) {
            return;
        }
        this.f43455 = true;
        this.f43461.unregisterNetworkCallback(this.f43459);
        this.f43457.unregisterReceiver(this.f43454);
        this.f43460.removeCallbacksAndMessages(null);
    }
}
