package l;

/* JADX INFO: renamed from: l.ᩴ֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BCD */
/* JADX INFO: loaded from: classes5.dex */
public final class C19454 implements InterfaceC16470 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f62837 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m44961() {
        return this.f62837;
    }

    @Override // l.InterfaceC16470
    /* JADX INFO: renamed from: ۙ */
    public final void mo38989(C23930 c23930) {
        m44960((AbstractC17216) c23930);
    }

    @Override // l.InterfaceC16470
    /* JADX INFO: renamed from: ۙ */
    public final void mo38985(C6030 c6030) {
        m44960((AbstractC17216) c6030);
    }

    @Override // l.InterfaceC16470
    /* JADX INFO: renamed from: ۙ */
    public final void mo38984(C2301 c2301) {
        m44960((AbstractC17216) c2301);
    }

    @Override // l.InterfaceC16470
    /* JADX INFO: renamed from: ۙ */
    public final void mo38987(C8267 c8267) {
        m44960((AbstractC17216) c8267);
    }

    @Override // l.InterfaceC16470
    /* JADX INFO: renamed from: ۙ */
    public final void mo38986(C6776 c6776) {
        m44960((AbstractC17216) c6776);
    }

    @Override // l.InterfaceC16470
    /* JADX INFO: renamed from: ۙ */
    public final void mo39058(C11249 c11249) {
        m44960((AbstractC17216) c11249);
    }

    @Override // l.InterfaceC16470
    /* JADX INFO: renamed from: ۙ */
    public final void mo39059(C23184 c23184) {
        m44960((AbstractC17216) c23184);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44960(AbstractC17216 abstractC17216) {
        int iM47897;
        C20946 c20946M40437 = abstractC17216.m40437();
        if (c20946M40437 != null && (iM47897 = c20946M40437.m47897()) > this.f62837) {
            this.f62837 = iM47897;
        }
        C0063 c0063M40438 = abstractC17216.m40438();
        int size = c0063M40438.size();
        for (int i = 0; i < size; i++) {
            int iM47898 = c0063M40438.m31619get(i).m47897();
            if (iM47898 > this.f62837) {
                this.f62837 = iM47898;
            }
        }
    }
}
