package l;

/* JADX INFO: renamed from: l.ۢ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BIJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C9803 implements InterfaceC0855 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC5203 f31588;

    public C9803(InterfaceC5203 interfaceC5203) {
        this.f31588 = interfaceC5203;
    }

    @Override // l.InterfaceC0855
    /* JADX INFO: renamed from: ۙ */
    public final void mo3491(C24132 c24132, CharSequence charSequence, boolean z, C11228 c11228) throws Exception {
        C10833 c10833;
        InterfaceC5203 interfaceC5203 = this.f31588;
        try {
            interfaceC5203.mo6415(charSequence, new C13406(c24132.m54057(), c24132.m54049(), z), c11228);
        } catch (Exception e) {
            if (interfaceC5203 == C23103.f74901 && (e instanceof C11014)) {
                C11014 c11014 = (C11014) e;
                String message = c11014.getMessage();
                if (c11014.f34787 == EnumC19965.SYNTAX) {
                    message = "line " + c11014.f34788 + ":" + (c11014.f34786 + 1) + ": " + message;
                }
                throw new C3090(message);
            }
            if (interfaceC5203 == C23103.f74905 && (e instanceof C21744)) {
                C21744 c21744 = (C21744) e;
                c10833 = new C10833(null, c21744.f69355, c21744.f69353, c21744.getMessage());
                c10833.initCause((Throwable) c21744);
            } else if (interfaceC5203 == C23103.f74904 && (e instanceof C18298)) {
                C18298 c18298 = (C18298) e;
                c10833 = new C10833(null, c18298.m42632(), c18298.m42630(), c18298.getMessage());
                c10833.initCause((Throwable) c18298);
            }
        }
    }
}
