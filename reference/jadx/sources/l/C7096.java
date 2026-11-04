package l;

/* JADX INFO: renamed from: l.ۜۧۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04RH */
/* JADX INFO: loaded from: classes3.dex */
public final class C7096 extends AbstractC19029 implements InterfaceC5431, InterfaceC21839 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C3630 f23414;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f23415;

    @Override // l.InterfaceC10650
    /* JADX INFO: renamed from: ۤ */
    public final int mo4171() {
        return 9;
    }

    public C7096(int i, String str) {
        super(i);
        this.f23415 = str;
    }

    @Override // l.InterfaceC5431
    /* JADX INFO: renamed from: ۚ */
    public final String mo16161() {
        return this.f23415;
    }

    @Override // l.InterfaceC5431
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC22759 mo16162() {
        C3630 c3630 = this.f23414;
        if (c3630 != null) {
            return c3630;
        }
        if (this.f23415 == null) {
            return null;
        }
        return new C8587(this);
    }

    @Override // l.InterfaceC21839
    /* JADX INFO: renamed from: ۙ */
    public final void mo2770(C8850 c8850) {
        this.f23414 = c8850.m23708(this.f23415);
    }
}
