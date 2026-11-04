package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: l.֡֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08RN */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC0076 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6789 f977;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0076(C6789 c6789, Looper looper) {
        super(looper);
        this.f977 = c6789;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        for (C14245 c14245 : this.f977.f22627) {
            if (c14245.m34586(bArr)) {
                c14245.m34584(message.what);
                return;
            }
        }
    }
}
