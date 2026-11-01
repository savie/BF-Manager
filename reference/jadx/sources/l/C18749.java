package l;

/* JADX INFO: renamed from: l.ᩴ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56TX */
/* JADX INFO: loaded from: classes4.dex */
public final class C18749 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C8996 f60799;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f60800;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile C19455 f60801;

    public C18749(C19455 c19455, int i, C8996 c8996) {
        this.f60801 = c19455;
        this.f60800 = i;
        this.f60799 = c8996;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8996 m43301(InterfaceC10407 interfaceC10407) {
        C19455 c19455 = this.f60801;
        if (c19455 == null) {
            throw new IllegalStateException("Text batch is no longer active");
        }
        return C19455.m44507(c19455, this, interfaceC10407);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C19455 c19455 = this.f60801;
        if (c19455 != null) {
            c19455.m44522();
        }
    }
}
