package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.ۙۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8TX */
/* JADX INFO: loaded from: classes2.dex */
public final class C4577 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13751 f16228;

    public C4577(C13751 c13751) {
        this.f16228 = c13751;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        this.f16228.f45335.execute(new Runnable() { // from class: l.ۗۡۙ
            @Override // java.lang.Runnable
            public final void run() {
                C13751.m33496(context, this.f11786.f16228);
            }
        });
    }
}
