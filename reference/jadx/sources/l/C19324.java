package l;

/* JADX INFO: renamed from: l.ᩳ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 59UK */
/* JADX INFO: loaded from: classes5.dex */
public final class C19324 extends AbstractC10373 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f62421 = C16980.m40037(C19324.class);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C9870 f62422;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte[] f62423;

    @Override // l.AbstractC10373
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo22017() {
        return false;
    }

    @Override // l.AbstractC10373
    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC9627[] mo22015() {
        InterfaceC9627[] interfaceC9627ArrM25686 = this.f62422.m25686();
        return interfaceC9627ArrM25686 == null ? new InterfaceC9627[0] : interfaceC9627ArrM25686;
    }

    @Override // l.AbstractC10373
    /* JADX INFO: renamed from: ܶ */
    public final InterfaceC9627 mo22016() throws C20728 {
        C19457 c19457M26677 = m26677();
        C0176 c0176 = new C0176(((C12523) m26678()).f40200.m4914(), c19457M26677.m44979());
        c0176.m1469(1);
        c0176.m1467(129);
        C18821 c18821 = new C18821(c19457M26677.m44979(), C6143.f20968);
        c18821.m43683("*");
        c0176.mo10313(c18821);
        try {
            this.f62423 = ((C7634) c19457M26677.m44971(c0176, null, new EnumC13269[0])).m20851();
            this.f62422 = (C9870) c18821.mo1727();
            InterfaceC9627 interfaceC9627M26675 = m26675(false);
            if (interfaceC9627M26675 == null) {
                m26676();
            }
            return interfaceC9627M26675;
        } catch (C20728 e) {
            C7634 c7634 = (C7634) c0176.mo1727();
            if (c7634 != null && c7634.mo12784() && c7634.m10323() == 0) {
                try {
                    c19457M26677.m44971(new C21059(c19457M26677.m44979(), c7634.m20851()), null, new EnumC13269[0]);
                } catch (C20728 e2) {
                    e.addSuppressed(e2);
                }
            }
            C9870 c9870 = (C9870) c18821.mo1727();
            if (c9870 != null && c9870.mo12784() && c9870.m10323() == -1073741809) {
                m26676();
                return null;
            }
            throw e;
        }
    }

    @Override // l.AbstractC10373
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo22014() throws C20728 {
        InterfaceC9627[] interfaceC9627ArrM25686 = this.f62422.m25686();
        C19457 c19457M26677 = m26677();
        C18821 c18821 = new C18821(c19457M26677.m44979(), this.f62423);
        c18821.m43683("*");
        c18821.m43682(interfaceC9627ArrM25686[interfaceC9627ArrM25686.length - 1].mo6139());
        c18821.m43681();
        try {
            C9870 c9870 = (C9870) c19457M26677.m44971(c18821, null, new EnumC13269[0]);
            if (c9870.m10323() == -2147483642) {
                return false;
            }
            this.f62422 = c9870;
            return true;
        } catch (C20728 e) {
            if (e.m47408() == -2147483642) {
                f62421.mo13711("End of listing", e);
                return false;
            }
            throw e;
        }
    }

    @Override // l.AbstractC10373
    /* JADX INFO: renamed from: ᩷ */
    public final void mo22018() {
        try {
            C19457 c19457M26677 = m26677();
            if (this.f62423 != null && c19457M26677.m44970()) {
                c19457M26677.m44971(new C21059(c19457M26677.m44979(), this.f62423), null, new EnumC13269[0]);
            }
        } finally {
            this.f62423 = null;
        }
    }
}
