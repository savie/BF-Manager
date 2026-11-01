package l;

/* JADX INFO: renamed from: l.᩷ۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes5.dex */
public final class C20791 implements InterfaceC13320 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12325 f67617;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10164 f67618;

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ boolean mo1180() {
        return false;
    }

    public C20791(C12325 c12325, C10164 c10164) {
        this.f67617 = c12325;
        this.f67618 = c10164;
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۙ */
    public final void mo1179(AbstractC23903 abstractC23903) {
        C19670 c19670 = (C19670) abstractC23903;
        c19670.f77447 |= 268435456;
        C12325 c12325 = this.f67617;
        C0329 c0329 = new C0329(c12325);
        C20414 c20414 = c12325.f41202;
        C10164 c10164 = this.f67618;
        InterfaceC2173 interfaceC2173M48202 = c20414.m48202(c10164.f34725);
        C18255 c18255M25899 = c10164.m25899();
        C2714 c2714 = c12325.f41201;
        c18255M25899.getClass();
        InterfaceC12260 interfaceC12260M8270 = c2714.m8270((InterfaceC12260) c18255M25899);
        try {
            c0329.mo1981(c18255M25899);
            c12325.m30618(c19670);
            C12325.m30602(c12325, c18255M25899);
        } finally {
            c12325.f41202.m48202(interfaceC2173M48202);
            c12325.f41201.m8270(interfaceC12260M8270);
            c19670.f77447 &= -268435457;
        }
    }

    public final String toString() {
        return "SourceCompleter: " + this.f67618.f34725.getName();
    }
}
