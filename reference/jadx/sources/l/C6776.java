package l;

/* JADX INFO: renamed from: l.ۜ֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: MBBP */
/* JADX INFO: loaded from: classes3.dex */
public final class C6776 extends AbstractC17216 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC11050 f22595;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m18898(InterfaceC11050 interfaceC11050) {
        StringBuilder sbM3018 = C0703.m3018(100, "catch");
        int size = interfaceC11050.size();
        for (int i = 0; i < size; i++) {
            sbM3018.append(" ");
            sbM3018.append(interfaceC11050.getType(i).mo1843());
        }
        return sbM3018.toString();
    }

    public C6776(C18708 c18708, C9012 c9012, C0063 c0063, InterfaceC11050 interfaceC11050) {
        super(c18708, c9012, null, c0063);
        if (c18708.m43508() != 6) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c18708.m43508());
        }
        if (interfaceC11050 == null) {
            throw new NullPointerException("catches == null");
        }
        this.f22595 = interfaceC11050;
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ᩸ */
    public final String mo7782() {
        return m18898(this.f22595);
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC11050 mo7781() {
        return this.f22595;
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۙ */
    public final void mo7779(InterfaceC16470 interfaceC16470) {
        interfaceC16470.mo38986(this);
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17216 mo7777(C5085 c5085) {
        return new C6776(m40434(), m40433(), m40438(), this.f22595.mo1038(c5085));
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17216 mo7778(C20946 c20946, C0063 c0063) {
        return new C6776(m40434(), m40433(), c0063, this.f22595);
    }
}
