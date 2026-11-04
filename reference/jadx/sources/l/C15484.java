package l;

/* JADX INFO: renamed from: l.ܳܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes5.dex */
public final class C15484 extends AbstractC5790 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C8227 f50404;

    /* JADX WARN: Code duplicated, block: B:22:0x002e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // l.AbstractRunnableC11009
    /* JADX INFO: renamed from: ۙ */
    public final FutureC23690 mo7115(int i) {
        Object obj;
        FutureC23690 futureC23690;
        C8227 c8227;
        FutureC23690 futureC23691 = this.f19885;
        if (futureC23691 != null && (obj = futureC23691.f76816) != null && (futureC23690 = this.f19886) != null && (c8227 = this.f50404) != null) {
            if (futureC23690.f76816 == null) {
                if (obj instanceof C9495) {
                    Throwable th = ((C9495) obj).f30768;
                    if (th != null) {
                        futureC23690.m52936(obj, th);
                    } else {
                        obj = null;
                        if (i <= 0) {
                            if (!m16889()) {
                            }
                        }
                        c8227.m22132(obj);
                        futureC23690.m52944();
                    }
                } else {
                    if (i <= 0) {
                        try {
                            if (!m16889()) {
                            }
                        } catch (Throwable th2) {
                            futureC23690.m52952(th2);
                        }
                    }
                    c8227.m22132(obj);
                    futureC23690.m52944();
                }
            }
            this.f19885 = null;
            this.f19886 = null;
            this.f50404 = null;
            return futureC23690.m52934(futureC23691, i);
        }
        return null;
    }
}
