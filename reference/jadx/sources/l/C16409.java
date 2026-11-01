package l;

/* JADX INFO: renamed from: l.ܽۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06PO */
/* JADX INFO: loaded from: classes4.dex */
public final class C16409 implements AutoCloseable, InterfaceC5614 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C3329 f52788;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12176 f52789;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f52790;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CharSequence f52791;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC0180 f52792;

    public C16409(AbstractC12176 abstractC12176, long j, CharSequence charSequence, C3329 c3329, InterfaceC0180 interfaceC0180) {
        this.f52789 = abstractC12176;
        this.f52790 = j;
        this.f52791 = charSequence;
        this.f52788 = c3329;
        this.f52792 = interfaceC0180;
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        AbstractC12176 abstractC12176 = this.f52789;
        return abstractC12176.f40755 || this.f52790 != abstractC12176.f40760;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C3329 c3329 = this.f52788;
        if (c3329 != null) {
            c3329.close();
        }
    }
}
