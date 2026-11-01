package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: l.᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC19931 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16403 f63869;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC19931(AbstractC16403 abstractC16403, Looper looper) {
        super(looper);
        this.f63869 = abstractC16403;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        InterfaceC12170 interfaceC12170;
        AbstractC16403 abstractC16403;
        HandlerC19931 handlerC19931;
        if (message.what == 1) {
            synchronized (this.f63869.f52775) {
                interfaceC12170 = (InterfaceC12170) this.f63869.f52774.get();
                abstractC16403 = this.f63869;
                handlerC19931 = abstractC16403.f52776;
            }
            if (interfaceC12170 == null || abstractC16403 != interfaceC12170.mo16002() || handlerC19931 == null) {
                return;
            }
            interfaceC12170.mo16003((C16094) message.obj);
            this.f63869.m38611(interfaceC12170, handlerC19931);
            interfaceC12170.mo16003(null);
        }
    }
}
