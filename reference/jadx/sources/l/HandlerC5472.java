package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: l.ۚۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58T1 */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC5472 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11437 f19069;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC5472(C11437 c11437, Looper looper) {
        super(looper);
        this.f19069 = c11437;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C11437.m28793(this.f19069, message);
    }
}
