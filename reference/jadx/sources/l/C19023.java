package l;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;

/* JADX INFO: renamed from: l.ᩴ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6KF */
/* JADX INFO: loaded from: classes4.dex */
public final class C19023 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19729 f61543;

    public C19023(C19729 c19729) {
        this.f61543 = c19729;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        C19729 c19729 = this.f61543;
        c19729.f63314.post(c19729.f63311);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        C19729 c19729 = this.f61543;
        c19729.f63314.post(c19729.f63311);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        C19729 c19729 = this.f61543;
        c19729.f63314.post(c19729.f63311);
    }
}
