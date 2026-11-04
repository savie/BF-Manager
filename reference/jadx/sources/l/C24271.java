package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.᩺ۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8TX */
/* JADX INFO: loaded from: classes.dex */
public final class C24271 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4133 f78580;

    public C24271(C4133 c4133) {
        this.f78580 = c4133;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        this.f78580.f14021.execute(new Runnable() { // from class: l.ۛۨۙ
            @Override // java.lang.Runnable
            public final void run() {
                C4133.m13256(context, this.f21516.f78580);
            }
        });
    }
}
