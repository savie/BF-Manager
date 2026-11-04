package l;

/* JADX INFO: renamed from: l.ۙ᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4UL */
/* JADX INFO: loaded from: classes3.dex */
public final class C5151 extends AbstractC10172 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C9976 f17956;

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo1455(C10918 c10918) {
    }

    public C5151(C9976 c9976) {
        super(1, c9976.m25820() + C24018.m53570(c9976.m25821()) + 1);
        this.f17956 = c9976;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final EnumC3461 mo1454() {
        return EnumC3461.TYPE_STRING_DATA_ITEM;
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1457(C10918 c10918, C15000 c15000) {
        C9976 c9976 = this.f17956;
        C22460 c22460M25819 = c9976.m25819();
        int iM25821 = c9976.m25821();
        if (c15000.m36116()) {
            c15000.m36111(C24018.m53570(iM25821), "utf16_size: ".concat(C5306.m15938(iM25821)));
            c15000.m36111(c22460M25819.m50636() + 1, c9976.m25818());
        }
        c15000.m36117(iM25821);
        c15000.m36114(c22460M25819);
        c15000.m36129(0);
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ۧ */
    public final String mo1456() {
        return this.f17956.m25818();
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo15563(AbstractC10172 abstractC10172) {
        return this.f17956.compareTo(((C5151) abstractC10172).f17956);
    }
}
