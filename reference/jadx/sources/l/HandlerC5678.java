package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: l.ۚ᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08RN */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC5678 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21906 f19385;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC5678(C21906 c21906, Looper looper) {
        super(looper);
        this.f19385 = c21906;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        for (C14146 c14146 : this.f19385.f71084) {
            if (c14146.m34218(bArr)) {
                c14146.m34216(message.what);
                return;
            }
        }
    }
}
