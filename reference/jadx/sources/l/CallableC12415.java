package l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۨܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC12415 implements Callable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21366 f39915;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureC23690 futureC23690M52933;
        C7941 c7941 = this.f39915.f68053;
        c7941.f26377 = null;
        if (c7941.f26388 && c7941.f26387 != null) {
            return new C18382(true, null);
        }
        InterfaceC24329 interfaceC24329M4658 = C1273.m4658(c7941.m19937(), C6429.of(C21301.m48536().mo4294(), new String[0]));
        if (!C10353.m26633(interfaceC24329M4658)) {
            return new C18382(false, null);
        }
        if (c7941.f26392 != null) {
            throw new IllegalStateException("Inactive session save is already running");
        }
        if (c7941.f26384 != null) {
            futureC23690M52933 = c7941.f26384.m31470();
        } else {
            futureC23690M52933 = c7941.f26402 != null ? c7941.f26402.m3666().m52933((InterfaceC11711) new C12110()) : FutureC23690.m52928(null);
        }
        c7941.f26392 = new C17636(interfaceC24329M4658, futureC23690M52933);
        return new C18382(false, c7941.f26392);
    }
}
