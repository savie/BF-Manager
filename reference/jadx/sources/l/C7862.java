package l;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.۟ۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78OY */
/* JADX INFO: loaded from: classes4.dex */
public final class C7862 implements InterfaceC14068 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Message f26189;

    public /* synthetic */ C7862(int i) {
        this();
    }

    public C7862() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21396(Message message) {
        this.f26189 = message;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21397(Handler handler) {
        Message message = this.f26189;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.f26189 = null;
        C19049.m44159(this);
        return zSendMessageAtFrontOfQueue;
    }

    @Override // l.InterfaceC14068
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo21395() {
        Message message = this.f26189;
        message.getClass();
        message.sendToTarget();
        this.f26189 = null;
        C19049.m44159(this);
    }
}
