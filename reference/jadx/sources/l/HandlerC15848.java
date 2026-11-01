package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: l.ܺۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58T1 */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC15848 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0324 f51302;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC15848(C0324 c0324, Looper looper) {
        super(looper);
        this.f51302 = c0324;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C0324.m1965(this.f51302, message);
    }
}
