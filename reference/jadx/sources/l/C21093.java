package l;

/* JADX INFO: renamed from: l.᩷᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26UL */
/* JADX INFO: loaded from: classes4.dex */
public final class C21093 implements AutoCloseable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C8311 f68720;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13625 f68721;

    public C21093(C13625 c13625, C8311 c8311) {
        this.f68720 = c8311;
        this.f68721 = c8311 != null ? c8311.m21738() : c13625;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C8311 c8311 = this.f68720;
        if (c8311 != null) {
            c8311.close();
        }
    }
}
