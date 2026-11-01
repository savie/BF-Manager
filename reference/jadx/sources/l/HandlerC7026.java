package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: l.ۜ᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X32D */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC7026 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21843 f23626;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC7026(C21843 c21843, Looper looper) {
        super(looper);
        this.f23626 = c21843;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1) {
            this.f23626.m48615();
        } else {
            super.handleMessage(message);
        }
    }
}
