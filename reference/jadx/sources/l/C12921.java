package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.۬ۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8SZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12921 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3747 f42940;

    public C12921(C3747 c3747) {
        this.f42940 = c3747;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        C3747 c3747 = this.f42940;
        c3747.m10972(C2336.m7088(context, intent, c3747.f13583, c3747.f13585));
    }
}
