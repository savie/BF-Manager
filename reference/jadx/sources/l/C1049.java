package l;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.֨ۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78OY */
/* JADX INFO: loaded from: classes2.dex */
public final class C1049 implements InterfaceC18648 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Message f4860;

    public /* synthetic */ C1049(int i) {
        this();
    }

    public C1049() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3910(Message message) {
        this.f4860 = message;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3911(Handler handler) {
        Message message = this.f4860;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.f4860 = null;
        C13045.m32253(this);
        return zSendMessageAtFrontOfQueue;
    }

    @Override // l.InterfaceC18648
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3909() {
        Message message = this.f4860;
        message.getClass();
        message.sendToTarget();
        this.f4860 = null;
        C13045.m32253(this);
    }
}
