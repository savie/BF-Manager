package l;

/* JADX INFO: renamed from: l.᩷֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes5.dex */
public final class C20541 extends AbstractC9958 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC15954 f66528;

    @Override // l.AbstractRunnableC17718
    /* JADX INFO: renamed from: ۙ */
    public final FutureC12075 mo1013(int i) {
        Object obj;
        FutureC12075 futureC12075;
        InterfaceC15954 interfaceC15954;
        FutureC12075 futureC12076 = this.f34027;
        if (futureC12076 != null && (obj = futureC12076.f40418) != null && (futureC12075 = this.f34029) != null && (interfaceC15954 = this.f66528) != null) {
            if (futureC12075.m30024(obj, interfaceC15954, i > 0 ? null : this)) {
                this.f34027 = null;
                this.f34029 = null;
                this.f66528 = null;
                return futureC12075.m30017(futureC12076, i);
            }
        }
        return null;
    }
}
