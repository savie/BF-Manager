package l;

/* JADX INFO: renamed from: l.۫ۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BDK */
/* JADX INFO: loaded from: classes4.dex */
public final class C12391 implements InterfaceC14239 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C1806 f41406;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20214 f41407;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14239 f41408;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C23680 f41409;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19883 f41410;

    public C12391(InterfaceC14239 interfaceC14239, C19883 c19883, boolean z) {
        this.f41408 = interfaceC14239;
        this.f41410 = c19883;
        C20214 c20214 = (C20214) interfaceC14239.getAttributes().m23873("Code");
        this.f41407 = c20214;
        C9300 c9300M45670 = c20214.m45670();
        C23680 c23680M52138 = C23680.f76615;
        for (C11042 c11042 = (C11042) c9300M45670.m23873("LineNumberTable"); c11042 != null; c11042 = (C11042) c9300M45670.m23871(c11042)) {
            c23680M52138 = C23680.m52138(c23680M52138, c11042.m27845());
        }
        this.f41409 = c23680M52138;
        C1806 c1806M5895 = C1806.f6960;
        if (z) {
            for (C23742 c23742 = (C23742) c9300M45670.m23873("LocalVariableTable"); c23742 != null; c23742 = (C23742) c9300M45670.m23871(c23742)) {
                c1806M5895 = C1806.m5894(c1806M5895, c23742.m32314());
            }
            C1806 c1806M5894 = C1806.f6960;
            for (C14570 c14570 = (C14570) c9300M45670.m23873("LocalVariableTypeTable"); c14570 != null; c14570 = (C14570) c9300M45670.m23871(c14570)) {
                c1806M5894 = C1806.m5894(c1806M5894, c14570.m32314());
            }
            if (c1806M5894.size() != 0) {
                c1806M5895 = C1806.m5895(c1806M5895, c1806M5894);
            }
        }
        this.f41406 = c1806M5895;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m30826() {
        return ((this.f41410.m45131() & 512) == 0 || this.f41408.mo30825().m2382()) ? false : true;
    }

    @Override // l.InterfaceC23411
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C0498 mo30825() {
        return this.f41408.mo30825();
    }

    @Override // l.InterfaceC23411
    public final C17432 getName() {
        return this.f41408.getName();
    }

    @Override // l.InterfaceC23411
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C17432 mo30818() {
        return this.f41408.mo30818();
    }

    @Override // l.InterfaceC23411
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo30824() {
        return this.f41408.mo30824();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m30827() {
        return (this.f41408.mo30824() & 8) != 0;
    }

    @Override // l.InterfaceC23411
    public final C9300 getAttributes() {
        return this.f41408.getAttributes();
    }

    @Override // l.InterfaceC23411
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C6143 mo30828() {
        return this.f41408.mo30828();
    }

    @Override // l.InterfaceC14239
    /* JADX INFO: renamed from: ۙ */
    public final C1909 mo28689() {
        return this.f41408.mo28689();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m30829() {
        return this.f41407.m45671();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m30823() {
        return this.f41407.m45668();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C16624 m30822() {
        return this.f41407.m45667();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7451 m30819() {
        return this.f41407.m45669();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C1806 m30820() {
        return this.f41406;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11312 m30821(int i) {
        return new C11312(this.f41410.m45142(), i, this.f41409.m52139(i));
    }
}
