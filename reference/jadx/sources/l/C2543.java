package l;

/* JADX INFO: renamed from: l.ۖ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BIJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2543 implements InterfaceC5366 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7112 f10060;

    public C2543(InterfaceC7112 interfaceC7112) {
        this.f10060 = interfaceC7112;
    }

    @Override // l.InterfaceC5366
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7927(C6111 c6111, CharSequence charSequence, C18503 c18503) throws Exception {
        C18066 c18066;
        InterfaceC7112 interfaceC7112 = this.f10060;
        try {
            interfaceC7112.mo11516(charSequence, new C12052(c6111.m16904(), c6111.m17014()), c18503);
        } catch (Exception e) {
            if (interfaceC7112 == C19813.f63608 && (e instanceof C18671)) {
                C18671 c18671 = (C18671) e;
                String message = c18671.getMessage();
                if (c18671.f60607 == EnumC19377.SYNTAX) {
                    message = "line " + c18671.f60609 + ":" + (c18671.f60608 + 1) + ": " + message;
                }
                throw new C8142(message);
            }
            if (interfaceC7112 == C19813.f63610 && (e instanceof C19418)) {
                C19418 c19418 = (C19418) e;
                c18066 = new C18066(null, c19418.f62578, c19418.f62577, c19418.getMessage());
                c18066.initCause((Throwable) c19418);
            } else if (interfaceC7112 == C19813.f63601 && (e instanceof C13877)) {
                C13877 c13877 = (C13877) e;
                c18066 = new C18066(null, c13877.m33719(), c13877.m33718(), c13877.getMessage());
                c18066.initCause((Throwable) c13877);
            }
        }
    }
}
