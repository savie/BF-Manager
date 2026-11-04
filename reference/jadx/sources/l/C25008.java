package l;

/* JADX INFO: renamed from: l.᩻ۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U8NM */
/* JADX INFO: loaded from: classes.dex */
public final class C25008 implements InterfaceC9060 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f80949;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17548 f80950;

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2298() {
        return true;
    }

    public C25008(C17548 c17548, long j) {
        this.f80950 = c17548;
        this.f80949 = j;
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۚ */
    public final long mo2295() {
        return this.f80949;
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۙ */
    public final C9805 mo2290(long j) {
        C17548 c17548 = this.f80950;
        C9805 c9805M11083 = c17548.f57028[0].m11083(j);
        for (int i = 1; i < c17548.f57028.length; i++) {
            C9805 c9805M11084 = c17548.f57028[i].m11083(j);
            if (c9805M11084.f31592.f7573 < c9805M11083.f31592.f7573) {
                c9805M11083 = c9805M11084;
            }
        }
        return c9805M11083;
    }
}
