package l;

/* JADX INFO: renamed from: l.ۗ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06PO */
/* JADX INFO: loaded from: classes3.dex */
public final class C3720 implements AutoCloseable, InterfaceC7509 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final CharSequence f12783;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20874 f12784;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f12785;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C15508 f12786;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC23858 f12787;

    public C3720(AbstractC20874 abstractC20874, long j, CharSequence charSequence, C15508 c15508, InterfaceC23858 interfaceC23858) {
        this.f12784 = abstractC20874;
        this.f12785 = j;
        this.f12783 = charSequence;
        this.f12786 = c15508;
        this.f12787 = interfaceC23858;
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        AbstractC20874 abstractC20874 = this.f12784;
        return abstractC20874.f66817 || this.f12785 != abstractC20874.f66813;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C15508 c15508 = this.f12786;
        if (c15508 != null) {
            c15508.close();
        }
    }
}
