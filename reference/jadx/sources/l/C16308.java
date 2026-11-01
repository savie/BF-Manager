package l;

/* JADX INFO: renamed from: l.ܽ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes5.dex */
public final class C16308 extends AbstractC9958 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC7486 f52515;

    @Override // l.AbstractRunnableC17718
    /* JADX INFO: renamed from: ۙ */
    public final FutureC12075 mo1013(int i) {
        Object obj;
        FutureC12075 futureC12075;
        InterfaceC7486 interfaceC7486;
        FutureC12075 futureC12076 = this.f34027;
        if (futureC12076 != null && (obj = futureC12076.f40418) != null && (futureC12075 = this.f34029) != null && (interfaceC7486 = this.f52515) != null) {
            if (futureC12075.m30023(obj, interfaceC7486, i > 0 ? null : this)) {
                this.f34027 = null;
                this.f34029 = null;
                this.f52515 = null;
                return futureC12075.m30017(futureC12076, i);
            }
        }
        return null;
    }
}
