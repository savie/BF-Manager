package l;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.᩷ۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1XI */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC20767 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Handler f67571;

    public HandlerC20767(Handler handler) {
        this.f67571 = handler;
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        try {
            super.dispatchMessage(message);
        } catch (Throwable unused) {
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f67571.handleMessage(message);
    }
}
