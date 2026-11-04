package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: l.ۡܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X32D */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC9483 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7247 f30722;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC9483(C7247 c7247, Looper looper) {
        super(looper);
        this.f30722 = c7247;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1) {
            this.f30722.m19878();
        } else {
            super.handleMessage(message);
        }
    }
}
