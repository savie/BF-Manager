package l;

/* JADX INFO: renamed from: l.ۜᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes4.dex */
public final class C7334 implements InterfaceC14852 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19881 f24152;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19113 f24153;

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ boolean mo11630() {
        return false;
    }

    public C7334(C19881 c19881, C19113 c19113) {
        this.f24152 = c19881;
        this.f24153 = c19113;
    }

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۙ */
    public final void mo11629(AbstractC11781 abstractC11781) {
        C2920 c2920 = (C2920) abstractC11781;
        c2920.f38071 |= 268435456;
        C19881 c19881 = this.f24152;
        C4965 c4965 = new C4965(c19881);
        C7312 c7312 = c19881.f63971;
        C19113 c19113 = this.f24153;
        InterfaceC15976 interfaceC15976M34530 = c7312.m34530(c19113.f61856);
        C14835 c14835M44238 = c19113.m44238();
        C6147 c6147 = c19881.f63974;
        c14835M44238.getClass();
        InterfaceC5075 interfaceC5075M17747 = c6147.m17747((InterfaceC5075) c14835M44238);
        try {
            c4965.mo1516(c14835M44238);
            c19881.m45757(c2920);
            C19881.m45751(c19881, c14835M44238);
        } finally {
            c19881.f63971.m34530(interfaceC15976M34530);
            c19881.f63974.m17747(interfaceC5075M17747);
            c2920.f38071 &= -268435457;
        }
    }

    public final String toString() {
        return "SourceCompleter: " + this.f24153.f61856.getName();
    }
}
