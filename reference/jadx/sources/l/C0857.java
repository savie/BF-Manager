package l;

/* JADX INFO: renamed from: l.֨֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E8NG */
/* JADX INFO: loaded from: classes3.dex */
public class C0857 implements InterfaceC9060 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f3229;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9805 f3230;

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2298() {
        return false;
    }

    public C0857(long j) {
        this(j, 0L);
    }

    public C0857(long j, long j2) {
        this.f3229 = j;
        C2349 c2349 = j2 == 0 ? C2349.f7572 : new C2349(0L, j2);
        this.f3230 = new C9805(c2349, c2349);
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۚ */
    public final long mo2295() {
        return this.f3229;
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۙ */
    public final C9805 mo2290(long j) {
        return this.f3230;
    }
}
