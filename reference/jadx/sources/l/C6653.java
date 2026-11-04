package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.ۛ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8UX */
/* JADX INFO: loaded from: classes3.dex */
public final class C6653 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC4415 f22188;

    public C6653(ServiceC4415 serviceC4415) {
        this.f22188 = serviceC4415;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            C23807 c23807M11951 = C3669.m11951();
            if (this.f22188.m14038(c23807M11951)) {
                c23807M11951.m53124();
            }
        }
    }
}
