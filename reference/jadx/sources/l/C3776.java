package l;

/* JADX INFO: renamed from: l.ۘۜܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8NG */
/* JADX INFO: loaded from: classes2.dex */
public class C3776 implements InterfaceC6599 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f13645;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12950 f13646;

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo5382() {
        return false;
    }

    public C3776(long j) {
        this(j, 0L);
    }

    public C3776(long j, long j2) {
        this.f13645 = j;
        C22828 c22828 = j2 == 0 ? C22828.f74276 : new C22828(0L, j2);
        this.f13646 = new C12950(c22828, c22828);
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۬ */
    public final long mo5383() {
        return this.f13645;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۙ */
    public final C12950 mo5381(long j) {
        return this.f13646;
    }
}
