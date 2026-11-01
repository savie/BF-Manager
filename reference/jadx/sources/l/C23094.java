package l;

/* JADX INFO: renamed from: l.᩺ܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public final class C23094 extends AbstractC6160 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23800 f75040;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f75041;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f75042;

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(Object obj, AbstractC16579 abstractC16579) {
        return abstractC16579;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C0309 c0309, Object obj) {
        C19003 c19003 = new C19003();
        boolean z = false;
        for (AbstractC16579 abstractC16579 : c0309.mo1943()) {
            AbstractC16579 abstractC165710 = (AbstractC16579) abstractC16579.mo1928(this, (Object) null);
            if (abstractC16579 != abstractC165710) {
                z = true;
            }
            c19003.m43723(abstractC165710);
        }
        if (!z) {
            return c0309;
        }
        AbstractC16579 abstractC165711 = c0309.f53222.f77449;
        return this.f75040.m52371(abstractC165711, abstractC165711.mo1943(), c19003.m43726());
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4811(C0350 c0350, Object obj) {
        AbstractC16579 abstractC16579 = (AbstractC16579) c0350.f1774.mo1928(this, (Object) null);
        return c0350.f1774 == abstractC16579 ? c0350 : m51101(abstractC16579, c0350.f1775, c0350.f1776);
    }

    @Override // l.AbstractC18154, l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo11014(C20771 c20771, Object obj) {
        AbstractC16579 abstractC16579M52402;
        C0350 c0350 = c20771.f67572;
        AbstractC16579 abstractC16579 = c0350.f1774;
        if (abstractC16579.mo1932((AbstractC16579) c20771)) {
            abstractC16579M52402 = this.f75040.m52402(abstractC16579);
        } else {
            abstractC16579M52402 = (AbstractC16579) abstractC16579.mo1928(this, (Object) null);
        }
        return m51101((AbstractC16579) abstractC16579M52402.mo1928(this, (Object) null), c0350.f1775, c0350.f1776);
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C22929 c22929, Object obj) {
        AbstractC16579 abstractC16579M52402;
        if (!this.f75042) {
            return c22929;
        }
        if (c22929.mo18112().mo1932((AbstractC16579) c22929)) {
            abstractC16579M52402 = this.f75040.m52402(c22929.mo18112());
        } else {
            abstractC16579M52402 = (AbstractC16579) c22929.mo18112().mo1928(this, (Object) null);
        }
        return m51101(abstractC16579M52402, c22929, EnumC15395.EXTENDS);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C0350 m51101(AbstractC16579 abstractC16579, C22929 c22929, EnumC15395 enumC15395) {
        C23800 c23800 = this.f75040;
        C3836 c3836 = c23800.f76937;
        int i = C14068.f46212[enumC15395.ordinal()];
        boolean z = this.f75041;
        if (i == 1) {
            if (z) {
                return C23800.m52330(c23800, m51102(abstractC16579), c22929);
            }
            return C23800.m52330(c23800, c3836.f14275, c22929);
        }
        if (i == 2) {
            if (z) {
                return C23800.m52348(c23800, c3836.f14228, c22929);
            }
            return C23800.m52348(c23800, m51102(abstractC16579), c22929);
        }
        if (i == 3) {
            return C23800.m52330(c23800, c3836.f14275, c22929);
        }
        C6171.m17174("Invalid bound kind " + enumC15395);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m51102(AbstractC16579 abstractC16579) {
        C3836 c3836 = this.f75040.f76937;
        while (abstractC16579.m39001(EnumC6617.WILDCARD)) {
            C0350 c0350 = (C0350) abstractC16579;
            EnumC15395 enumC15395 = c0350.f1776;
            boolean z = this.f75041;
            if (z) {
                if (enumC15395 == EnumC15395.EXTENDS) {
                    abstractC16579 = c0350.f1774;
                } else {
                    abstractC16579 = null;
                }
            } else if (enumC15395 == EnumC15395.SUPER) {
                abstractC16579 = c0350.f1774;
            } else {
                abstractC16579 = null;
            }
            if (abstractC16579 == null) {
                abstractC16579 = z ? c3836.f14275 : c3836.f14228;
            }
        }
        return abstractC16579;
    }

    public C23094(C23800 c23800, boolean z, boolean z2) {
        this.f75040 = c23800;
        this.f75041 = z;
        this.f75042 = z2;
    }
}
