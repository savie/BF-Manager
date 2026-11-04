package l;

/* JADX INFO: renamed from: l.۟ܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 26UL */
/* JADX INFO: loaded from: classes3.dex */
public final class C8051 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14521 f26677;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C5311 f26678;

    public C8051(C5311 c5311, C14521 c14521) {
        this.f26677 = c14521;
        this.f26678 = c14521 != null ? c14521.m35037() : c5311;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C14521 c14521 = this.f26677;
        if (c14521 != null) {
            c14521.close();
        }
    }
}
