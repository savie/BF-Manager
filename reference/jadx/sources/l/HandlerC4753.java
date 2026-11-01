package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: l.ۙܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC4753 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2636 f16747;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC4753(C2636 c2636, Looper looper) {
        super(looper);
        this.f16747 = c2636;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1000 && i == 1001 && C2761.m8429(C1791.m5862())) {
            C2636 c2636 = this.f16747;
            c2636.f10279.execute(new RunnableC11810(c2636));
        }
        super.handleMessage(message);
    }
}
