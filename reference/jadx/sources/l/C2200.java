package l;

import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.ۖ֨ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8VY */
/* JADX INFO: loaded from: classes2.dex */
public final class C2200 implements InterfaceC4370, Handler.Callback {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Handler f7951;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5023 f7952;

    public C2200(C5023 c5023, InterfaceC13544 interfaceC13544) {
        this.f7952 = c5023;
        Handler handlerM41832 = C17983.m41832(this);
        this.f7951 = handlerM41832;
        interfaceC13544.mo30201(this, handlerM41832);
    }

    @Override // l.InterfaceC4370
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6814(long j) {
        if (Build.VERSION.SDK_INT < 30) {
            int i = (int) (j >> 32);
            int i2 = (int) j;
            Handler handler = this.f7951;
            handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, i, i2));
            return;
        }
        m6813(j);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        String str = C17983.f57504;
        m6813(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i2)));
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m6813(long j) {
        C5023 c5023 = this.f7952;
        if (this != c5023.f17483 || c5023.m35926() == null) {
            return;
        }
        if (j == C17492.FOREVER_NS) {
            C5023.m13922(c5023);
            return;
        }
        try {
            c5023.m13965(j);
        } catch (C2170 e) {
            c5023.m35918(e);
        }
    }
}
