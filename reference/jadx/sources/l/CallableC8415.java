package l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.۠᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC8415 implements Callable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21114 f29171;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureC12075 futureC12075M30018;
        C20409 c20409 = this.f29171.f68779;
        if (c20409.f66146 && c20409.f66125 != null) {
            return new C16176(true, null);
        }
        InterfaceC3800 interfaceC3800M28083 = C11153.m28083(c20409.m13348(), C12974.of(C2417.m7342().mo33986(), new String[0]));
        if (!C4138.m11771(interfaceC3800M28083)) {
            return new C16176(false, null);
        }
        if (c20409.f66141 != null) {
            throw new IllegalStateException("Inactive session save is already running");
        }
        if (c20409.f66148 != null) {
            futureC12075M30018 = c20409.f66148.m21872();
        } else {
            futureC12075M30018 = c20409.f66132 != null ? c20409.f66132.m21170().m30018((InterfaceC20892) new C5281()) : FutureC12075.m30001(null);
        }
        c20409.f66141 = new C18998(interfaceC3800M28083, futureC12075M30018);
        return new C16176(false, c20409.f66141);
    }
}
