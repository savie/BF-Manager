package l;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;

/* JADX INFO: renamed from: l.۠۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6KF */
/* JADX INFO: loaded from: classes3.dex */
public final class C8480 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13700 f27764;

    public C8480(C13700 c13700) {
        this.f27764 = c13700;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        C13700 c13700 = this.f27764;
        c13700.f43460.post(c13700.f43462);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        C13700 c13700 = this.f27764;
        c13700.f43460.post(c13700.f43462);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        C13700 c13700 = this.f27764;
        c13700.f43460.post(c13700.f43462);
    }
}
