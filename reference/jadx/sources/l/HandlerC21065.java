package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: l.᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes5.dex */
public final class HandlerC21065 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC0182 f67310;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC21065(AbstractC0182 abstractC0182, Looper looper) {
        super(looper);
        this.f67310 = abstractC0182;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        InterfaceC7640 interfaceC7640;
        AbstractC0182 abstractC0182;
        HandlerC21065 handlerC21065;
        if (message.what == 1) {
            synchronized (this.f67310.f1265) {
                interfaceC7640 = (InterfaceC7640) this.f67310.f1266.get();
                abstractC0182 = this.f67310;
                handlerC21065 = abstractC0182.f1267;
            }
            if (interfaceC7640 == null || abstractC0182 != interfaceC7640.mo20857() || handlerC21065 == null) {
                return;
            }
            interfaceC7640.mo20858((C5734) message.obj);
            this.f67310.m1480(interfaceC7640, handlerC21065);
            interfaceC7640.mo20858(null);
        }
    }
}
