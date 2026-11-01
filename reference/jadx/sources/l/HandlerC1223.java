package l;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.֨ܺܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: X58A */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC1223 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractFragmentC21685 f5354;

    public HandlerC1223(AbstractFragmentC21685 abstractFragmentC21685) {
        this.f5354 = abstractFragmentC21685;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.f5354.m48426();
    }
}
