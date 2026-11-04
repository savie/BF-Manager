package l;

import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.ܰܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8VY */
/* JADX INFO: loaded from: classes5.dex */
public final class C14673 implements InterfaceC3980, Handler.Callback {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Handler f47974;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21387 f47975;

    public C14673(C21387 c21387, InterfaceC14420 interfaceC14420) {
        this.f47975 = c21387;
        Handler handlerM19479 = C7116.m19479(this);
        this.f47974 = handlerM19479;
        interfaceC14420.mo32288(this, handlerM19479);
    }

    @Override // l.InterfaceC3980
    /* JADX INFO: renamed from: ۙ */
    public final void mo12835(long j) {
        if (Build.VERSION.SDK_INT < 30) {
            int i = (int) (j >> 32);
            int i2 = (int) j;
            Handler handler = this.f47974;
            handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, i, i2));
            return;
        }
        m35302(j);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        String str = C7116.f23455;
        m35302(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i2)));
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m35302(long j) {
        C21387 c21387 = this.f47975;
        if (this != c21387.f68111 || c21387.m22689() == null) {
            return;
        }
        if (j == C25227.FOREVER_NS) {
            C21387.m48632(c21387);
            return;
        }
        try {
            c21387.m48646(j);
        } catch (C18566 e) {
            c21387.m22677(e);
        }
    }
}
