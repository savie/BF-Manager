package l;

/* JADX INFO: renamed from: l.۫ۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: MIRA */
/* JADX INFO: loaded from: classes4.dex */
public final class C12871 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13616 f41201;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5414 f41202;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C5414 f41203;

    public C12871(C5414 c5414, C5414 c5415, C13616 c13616) {
        this.f41203 = c5414;
        this.f41202 = c5415;
        this.f41201 = c13616;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C1685.m6033(this.f41203);
        C1685.m6033(this.f41202);
    }
}
