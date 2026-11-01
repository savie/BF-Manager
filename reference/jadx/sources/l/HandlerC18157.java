package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: l.ᩳܺܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5JQ */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC18157 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16042 f58049;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC18157(AbstractC16042 abstractC16042, Looper looper) {
        super(looper);
        this.f58049 = abstractC16042;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.f58049.m38032();
    }
}
