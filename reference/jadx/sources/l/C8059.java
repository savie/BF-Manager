package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.۟ᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8SZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8059 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19246 f26686;

    public C8059(C19246 c19246) {
        this.f26686 = c19246;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        C19246 c19246 = this.f26686;
        c19246.m44583(C14770.m35556(context, intent, c19246.f62257, c19246.f62260));
    }
}
