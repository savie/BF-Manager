package l;

/* JADX INFO: renamed from: l.ܽ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 159C */
/* JADX INFO: loaded from: classes5.dex */
public final class C16297 extends AbstractC1479 implements InterfaceC12064 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C17002 f52495;

    @Override // l.InterfaceC12064
    /* JADX INFO: renamed from: ۙ */
    public final C17002 mo986() {
        return this.f52495;
    }

    public C16297(EnumC2890 enumC2890, AbstractC7124 abstractC7124, C17002 c17002) {
        super(enumC2890, abstractC7124);
        this.f52495 = c17002;
    }

    @Override // l.AbstractC4777
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC4777 mo985(C10527 c10527) {
        C17002 c17002Mo2550 = c10527.mo2550(this.f52495);
        return new C16297(this.f16795, this.f6011.mo3325(c10527), c17002Mo2550);
    }

    public final String toString() {
        return "if " + this.f6011 + " GOTO " + this.f52495.m39782();
    }
}
