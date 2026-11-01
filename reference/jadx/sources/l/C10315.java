package l;

/* JADX INFO: renamed from: l.ۤ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 73Q2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10315 extends AbstractC15254 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C16022 f35382;

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ܰ */
    public final int mo9739() {
        return 8;
    }

    public C10315(C16022 c16022) {
        this.f35382 = c16022;
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18075 mo4170() {
        return EnumC18075.TYPE_METHOD_HANDLE_ITEM;
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo4171(C4669 c4669) {
        c4669.m12890().m19995(this.f35382);
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo9738(C4669 c4669, C2718 c2718) {
        int iM26135 = m26135(c4669);
        C16022 c16022 = this.f35382;
        int iM37999 = c16022.m37999();
        if (c2718.m8288()) {
            c2718.m8283(0, m36532() + ' ' + c16022.toString());
            c2718.m8283(2, "type:     " + C22475.m49982(iM37999) + (" // " + C16022.m37997(iM37999)));
            c2718.m8283(2, "reserved: ".concat(C22475.m49982(0)));
            String str = " // " + c16022.m38000().toString();
            if (c16022.m38001()) {
                c2718.m8283(2, "fieldId:  " + C22475.m49982(iM26135) + str);
            } else {
                c2718.m8283(2, "methodId: " + C22475.m49982(iM26135) + str);
            }
            c2718.m8283(2, "reserved: ".concat(C22475.m49982(0)));
        }
        c2718.m8297(iM37999);
        c2718.m8297(0);
        c2718.m8297(m26135(c4669));
        c2718.m8297(0);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m26135(C4669 c4669) {
        C16022 c16022 = this.f35382;
        AbstractC9901 abstractC9901M38000 = c16022.m38000();
        if (c16022.m38001()) {
            return c4669.m12889().m32494((C23077) abstractC9901M38000);
        }
        if (c16022.m38002()) {
            if (abstractC9901M38000 instanceof C18137) {
                abstractC9901M38000 = ((C18137) abstractC9901M38000).m42224();
            }
            return c4669.m12884().m37944((AbstractC11788) abstractC9901M38000);
        }
        throw new IllegalStateException("Unhandled invocation type");
    }
}
