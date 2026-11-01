package l;

/* JADX INFO: renamed from: l.ۡ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes4.dex */
public final class C8547 extends AbstractC9958 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC15954 f29573;

    /* JADX WARN: Code duplicated, block: B:22:0x002e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // l.AbstractRunnableC17718
    /* JADX INFO: renamed from: ۙ */
    public final FutureC12075 mo1013(int i) {
        Object obj;
        FutureC12075 futureC12075;
        InterfaceC15954 interfaceC15954;
        FutureC12075 futureC12076 = this.f34027;
        if (futureC12076 != null && (obj = futureC12076.f40418) != null && (futureC12075 = this.f34029) != null && (interfaceC15954 = this.f29573) != null) {
            if (futureC12075.f40418 == null) {
                if (obj instanceof C0784) {
                    Throwable th = ((C0784) obj).f3363;
                    if (th != null) {
                        futureC12075.m30020(obj, th);
                    } else {
                        obj = null;
                        if (i <= 0) {
                            if (!m25177()) {
                            }
                        }
                        futureC12075.m30030(interfaceC15954.apply(obj));
                    }
                } else {
                    if (i <= 0) {
                        try {
                            if (!m25177()) {
                            }
                        } catch (Throwable th2) {
                            futureC12075.m30035(th2);
                        }
                    }
                    futureC12075.m30030(interfaceC15954.apply(obj));
                }
            }
            this.f34027 = null;
            this.f34029 = null;
            this.f29573 = null;
            return futureC12075.m30017(futureC12076, i);
        }
        return null;
    }
}
