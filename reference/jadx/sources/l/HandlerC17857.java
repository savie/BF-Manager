package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: l.ܽ᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC17857 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3687 f58549;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC17857(C3687 c3687, Looper looper) {
        super(looper);
        this.f58549 = c3687;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1000 && i == 1001 && C20512.m47035(C5596.m16575())) {
            C3687 c3687 = this.f58549;
            c3687.f12678.execute(new RunnableC23825(c3687));
        }
        super.handleMessage(message);
    }
}
