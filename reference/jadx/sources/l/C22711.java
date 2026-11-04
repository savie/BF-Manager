package l;

/* JADX INFO: renamed from: l.᩸ۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: AIV0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22711 extends C18959 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final EnumC19727 f73706;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22711 m51189(InterfaceC7377 interfaceC7377, EnumC19727 enumC19727, AbstractC1566 abstractC1566) {
        AbstractC1566 abstractC1567 = AbstractC1566.f5429;
        C6041 c6041M39109 = AbstractC16481.m39109(interfaceC7377, 0, (abstractC1566 == abstractC1567 && enumC19727.m45426()) ? AbstractC1566.f5430 : abstractC1566);
        if (abstractC1566 == abstractC1567 && enumC19727.m45426()) {
            abstractC1566 = AbstractC1566.f5412;
        }
        int iMo20258 = interfaceC7377.mo20258();
        if (iMo20258 == 2) {
            return new C22711(enumC19727, c6041M39109, new C6041(interfaceC7377.mo20252(0), abstractC1566), new C6041(interfaceC7377.mo20252(1), abstractC1566));
        }
        if (iMo20258 == 3) {
            return new C22711(enumC19727, c6041M39109, new C6041(interfaceC7377.mo20252(1), abstractC1566), new C6041(interfaceC7377.mo20252(2), abstractC1566));
        }
        throw new C8597("Unexpected registers count in " + interfaceC7377);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C22711 m51190(InterfaceC7377 interfaceC7377, EnumC19727 enumC19727, AbstractC1566 abstractC1566) {
        AbstractC1566 abstractC1567 = AbstractC1566.f5429;
        C6041 c6041M39109 = AbstractC16481.m39109(interfaceC7377, 0, (abstractC1566 == abstractC1567 && enumC19727.m45426()) ? AbstractC1566.f5430 : abstractC1566);
        if (abstractC1566 == abstractC1567 && enumC19727.m45426()) {
            abstractC1566 = AbstractC1566.f5412;
        }
        C23195 c23195M52120 = C23195.m52120(interfaceC7377.mo20261(), abstractC1566);
        int iMo20258 = interfaceC7377.mo20258();
        if (iMo20258 == 1) {
            return new C22711(enumC19727, c6041M39109, new C6041(interfaceC7377.mo20252(0), abstractC1566), c23195M52120);
        }
        if (iMo20258 == 2) {
            return new C22711(enumC19727, c6041M39109, new C6041(interfaceC7377.mo20252(1), abstractC1566), c23195M52120);
        }
        throw new C8597("Unexpected registers count in " + interfaceC7377);
    }

    public C22711(EnumC19727 enumC19727, C6041 c6041, AbstractC16481 abstractC16481, AbstractC16481 abstractC16482) {
        super(EnumC24203.ARITH, 2);
        this.f73706 = enumC19727;
        m44031(c6041);
        mo44014(abstractC16481);
        mo44014(abstractC16482);
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC19727 m51191() {
        return this.f73706;
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo4075(C18959 c18959) {
        if (this == c18959) {
            return true;
        }
        if ((c18959 instanceof C22711) && super.mo4075(c18959)) {
            C22711 c22711 = (C22711) c18959;
            if (this.f73706 == c22711.f73706) {
                AbstractC16481 abstractC16481Mo44035 = mo44035(1);
                AbstractC16481 abstractC16481Mo44036 = c22711.mo44035(1);
                abstractC16481Mo44035.getClass();
                boolean z = abstractC16481Mo44035 instanceof C23195;
                abstractC16481Mo44036.getClass();
                if (z == (abstractC16481Mo44036 instanceof C23195) && (!z || ((C23195) abstractC16481Mo44035).m52122() == ((C23195) abstractC16481Mo44036).m52122())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ۫ۙ */
    public final C18959 mo4072() {
        C22711 c22711 = new C22711(this.f73706, null, mo44035(0).mo17528(), mo44035(1).mo17528());
        m44033(c22711);
        return c22711;
    }

    @Override // l.C18959
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C8314.m22396(this.f61471));
        sb.append(": ARITH ");
        boolean zMo17865 = mo17865(EnumC1763.ARITH_ONEARG);
        EnumC19727 enumC19727 = this.f73706;
        if (zMo17865) {
            sb.append(mo44035(0));
            sb.append(' ');
            sb.append(enumC19727.m45425());
            sb.append("= ");
            sb.append(mo44035(1));
        } else {
            C6041 c6041M44027 = m44027();
            if (c6041M44027 != null) {
                sb.append(c6041M44027);
                sb.append(" = ");
            }
            sb.append(mo44035(0));
            sb.append(' ');
            sb.append(enumC19727.m45425());
            sb.append(' ');
            sb.append(mo44035(1));
        }
        m44030(sb);
        return sb.toString();
    }
}
