package l;

/* JADX INFO: renamed from: l.ܶ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes5.dex */
public final class C14897 extends AbstractC22658 {
    @Override // l.AbstractRunnableC17718
    /* JADX INFO: renamed from: ۙ */
    public final FutureC12075 mo1013(int i) {
        Object obj;
        FutureC12075 futureC12075;
        Object obj2;
        FutureC12075 futureC12076;
        Throwable th;
        FutureC12075 futureC12077 = this.f34027;
        if (futureC12077 == null || (obj = futureC12077.f40418) == null || (futureC12075 = this.f73808) == null || (obj2 = futureC12075.f40418) == null || (futureC12076 = this.f34029) == null) {
            return null;
        }
        if (futureC12076.f40418 == null) {
            if ((obj instanceof C0784) && (th = ((C0784) obj).f3363) != null) {
                futureC12076.m30020(obj, th);
            } else if ((obj2 instanceof C0784) && (th = ((C0784) obj2).f3363) != null) {
                obj = obj2;
                futureC12076.m30020(obj, th);
            } else {
                futureC12076.m30029();
            }
        }
        this.f34027 = null;
        this.f73808 = null;
        this.f34029 = null;
        if (futureC12075.f40419 != null) {
            Object obj3 = futureC12075.f40418;
            if (obj3 == null) {
                futureC12075.m30033();
            }
            if (i >= 0 && (obj3 != null || futureC12075.f40418 != null)) {
                futureC12075.m30037();
            }
        }
        return futureC12076.m30017(futureC12077, i);
    }
}
