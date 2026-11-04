package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: l.۬ۘ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I5JQ */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC13600 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC5703 f43194;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC13600(AbstractC5703 abstractC5703, Looper looper) {
        super(looper);
        this.f43194 = abstractC5703;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.f43194.m16739();
    }
}
