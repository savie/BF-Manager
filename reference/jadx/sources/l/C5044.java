package l;

/* JADX INFO: renamed from: l.ۙܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes3.dex */
public final class C5044 extends AbstractC13970 {
    @Override // l.AbstractRunnableC11009
    /* JADX INFO: renamed from: ۙ */
    public final FutureC23690 mo7115(int i) {
        Object obj;
        FutureC23690 futureC23690;
        Object obj2;
        FutureC23690 futureC23691;
        Throwable th;
        FutureC23690 futureC23692 = this.f19885;
        if (futureC23692 == null || (obj = futureC23692.f76816) == null || (futureC23690 = this.f44300) == null || (obj2 = futureC23690.f76816) == null || (futureC23691 = this.f19886) == null) {
            return null;
        }
        if (futureC23691.f76816 == null) {
            if ((obj instanceof C9495) && (th = ((C9495) obj).f30768) != null) {
                futureC23691.m52936(obj, th);
            } else if ((obj2 instanceof C9495) && (th = ((C9495) obj2).f30768) != null) {
                obj = obj2;
                futureC23691.m52936(obj, th);
            } else {
                futureC23691.m52944();
            }
        }
        this.f19885 = null;
        this.f44300 = null;
        this.f19886 = null;
        if (futureC23690.f76817 != null) {
            Object obj3 = futureC23690.f76816;
            if (obj3 == null) {
                futureC23690.m52950();
            }
            if (i >= 0 && (obj3 != null || futureC23690.f76816 != null)) {
                futureC23690.m52946();
            }
        }
        return futureC23691.m52934(futureC23692, i);
    }
}
