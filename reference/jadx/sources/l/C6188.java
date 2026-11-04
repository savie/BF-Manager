package l;

/* JADX INFO: renamed from: l.ۛۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 88UO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6188 implements InterfaceC9060 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f21076;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f21077;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14390 f21078;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f21079;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f21080;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f21081;

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2298() {
        return true;
    }

    public C6188(InterfaceC14390 interfaceC14390, long j, long j2, long j3, long j4, long j5) {
        this.f21078 = interfaceC14390;
        this.f21081 = j;
        this.f21077 = j2;
        this.f21079 = j3;
        this.f21080 = j4;
        this.f21076 = j5;
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۙ */
    public final C9805 mo2290(long j) {
        C2349 c2349 = new C2349(j, C3950.m12660(this.f21078.mo34819(j), 0L, this.f21077, this.f21079, this.f21080, this.f21076));
        return new C9805(c2349, c2349);
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۚ */
    public final long mo2295() {
        return this.f21081;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m17835(long j) {
        return this.f21078.mo34819(j);
    }
}
