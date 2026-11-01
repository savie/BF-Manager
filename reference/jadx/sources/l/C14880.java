package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.ܶ֡۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8UX */
/* JADX INFO: loaded from: classes4.dex */
public final class C14880 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC17701 f48636;

    public C14880(ServiceC17701 serviceC17701) {
        this.f48636 = serviceC17701;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            C12763 c12763M10654 = C3589.m10654();
            if (this.f48636.m41231(c12763M10654)) {
                c12763M10654.m31734();
            }
        }
    }
}
