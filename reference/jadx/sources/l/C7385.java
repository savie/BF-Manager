package l;

/* JADX INFO: renamed from: l.۟ۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes3.dex */
public final class C7385 implements InterfaceC13320 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12325 f24509;

    public final String toString() {
        return "mainCompleter";
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ boolean mo1180() {
        return false;
    }

    public C7385(C12325 c12325) {
        this.f24509 = c12325;
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۙ */
    public final void mo1179(AbstractC23903 abstractC23903) {
        C12325 c12325 = this.f24509;
        C19670 c19670 = (C19670) abstractC23903;
        c12325.f41180.m52641(c19670);
        if (c19670.f77452 == EnumC10477.f35866) {
            c19670.f63146 = C21825.m48588();
            c19670.f63142 = C21825.m48588();
            c19670.f63140 = C21825.m48588();
            c19670.f63134 = C21825.m48588();
            c19670.f63151 = C21825.m48588();
        } else if ((c19670.f77447 & 4503599627370496L) != 0) {
            C12325.m30594(c12325, c19670);
        } else {
            try {
                c19670.f63139.mo49994();
            } catch (C4146 e) {
                c19670.f77452 = EnumC10477.f35866;
                c19670.f63146 = C21825.m48588();
                c19670.f63142 = C21825.m48588();
                c19670.f63140 = C21825.m48588();
                c19670.f63134 = C21825.m48588();
                c19670.f63151 = C21825.m48588();
                c12325.m30618(c19670);
                throw e;
            }
        }
        InterfaceC2173 interfaceC2173 = c19670.f63139.f73422;
        if (interfaceC2173 == null || interfaceC2173.mo6760() == EnumC11347.CLASS) {
            c12325.m30618(c19670);
        }
    }
}
