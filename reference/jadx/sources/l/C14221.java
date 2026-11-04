package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰ֡ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6EJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C14221 extends C0052 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34512(InterfaceC3145 interfaceC3145, C9812 c9812) {
        m34509(interfaceC3145, new C3781(), c9812);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34513(InterfaceC3145 interfaceC3145, C9812 c9812) {
        m34511(interfaceC3145, new C3781(), c9812);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0113  */
    /* JADX WARN: Code duplicated, block: B:56:0x012e A[PHI: r0
      0x012e: PHI (r0v3 l.ܶۢۗ) = (r0v2 l.ܶۢۗ), (r0v2 l.ܶۢۗ), (r0v2 l.ܶۢۗ), (r0v7 l.ܶۢۗ) binds: [B:28:0x00b5, B:30:0x00bc, B:32:0x00c6, B:55:0x0117] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34509(InterfaceC3145 interfaceC3145, C3781 c3781, C9812 c9812) {
        c3781.m12273(c9812);
        int i = C23919.f77430[c9812.m25590().ordinal()];
        if (i == 1) {
            C22913 c22913M25585 = c9812.m25585();
            EnumC15997 enumC15997M51668 = c22913M25585.m51668();
            AbstractC16481 abstractC16481M51662 = c22913M25585.m51662();
            AbstractC16481 abstractC16481M51667 = c22913M25585.m51667();
            AbstractC1566 type = abstractC16481M51662.getType();
            AbstractC1566 abstractC1566 = AbstractC1566.f5436;
            if (type.equals(abstractC1566)) {
                abstractC16481M51667.getClass();
                if ((abstractC16481M51667 instanceof C23195) && abstractC16481M51667.getType().equals(abstractC1566)) {
                    if (((C23195) abstractC16481M51667).m52122() == 0) {
                        enumC15997M51668 = enumC15997M51668.m38126();
                    }
                    if (enumC15997M51668 == EnumC15997.EQ) {
                        if (c3781.m12272().size() == 1) {
                            m942(interfaceC3145, abstractC16481M51662, false);
                        } else {
                            boolean zM34510 = m34510(abstractC16481M51662);
                            if (zM34510) {
                                interfaceC3145.mo10270('(');
                            }
                            m942(interfaceC3145, abstractC16481M51662, false);
                            if (zM34510) {
                                interfaceC3145.mo10270(')');
                            }
                        }
                    } else if (enumC15997M51668 == EnumC15997.NE) {
                        interfaceC3145.mo10270('!');
                        boolean zM34511 = m34510(abstractC16481M51662);
                        if (zM34511) {
                            interfaceC3145.mo10270('(');
                        }
                        m942(interfaceC3145, abstractC16481M51662, false);
                        if (zM34511) {
                            interfaceC3145.mo10270(')');
                        }
                    } else {
                        this.f908.m31136("Unsupported boolean condition " + enumC15997M51668.m38125());
                        m942(interfaceC3145, abstractC16481M51662, m34510(abstractC16481M51662));
                        interfaceC3145.mo10270(' ').add(enumC15997M51668.m38125()).mo10270(' ');
                        m942(interfaceC3145, abstractC16481M51667, m34510(abstractC16481M51667));
                    }
                } else {
                    m942(interfaceC3145, abstractC16481M51662, m34510(abstractC16481M51662));
                    interfaceC3145.mo10270(' ').add(enumC15997M51668.m38125()).mo10270(' ');
                    m942(interfaceC3145, abstractC16481M51667, m34510(abstractC16481M51667));
                }
            } else {
                m942(interfaceC3145, abstractC16481M51662, m34510(abstractC16481M51662));
                interfaceC3145.mo10270(' ').add(enumC15997M51668.m38125()).mo10270(' ');
                m942(interfaceC3145, abstractC16481M51667, m34510(abstractC16481M51667));
            }
        } else if (i == 2) {
            m34509(interfaceC3145, c3781, c9812.m25580());
            interfaceC3145.add(" ? ");
            m34509(interfaceC3145, c3781, c9812.m25588());
            interfaceC3145.add(" : ");
            m34509(interfaceC3145, c3781, c9812.m25584());
        } else if (i == 3) {
            interfaceC3145.mo10270('!');
            m34511(interfaceC3145, c3781, (C9812) c9812.m25586().get(0));
        } else {
            if (i != 4 && i != 5) {
                throw new C8597("Unknown condition mode: " + c9812.m25590());
            }
            String str = c9812.m25590() == EnumC18763.AND ? " && " : " || ";
            Iterator it = c9812.m25586().iterator();
            while (it.hasNext()) {
                m34511(interfaceC3145, c3781, (C9812) it.next());
                if (it.hasNext()) {
                    interfaceC3145.add(str);
                }
            }
        }
        c3781.m12274();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m34511(InterfaceC3145 interfaceC3145, C3781 c3781, C9812 c9812) {
        boolean z = false;
        if (!c9812.m25589() && !c9812.mo17865(EnumC1763.DONT_WRAP) && c9812.m25590() != EnumC18763.NOT) {
            z = true;
        }
        if (z) {
            interfaceC3145.mo10270('(');
        }
        m34509(interfaceC3145, c3781, c9812);
        if (z) {
            interfaceC3145.mo10270(')');
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m34510(AbstractC16481 abstractC16481) {
        abstractC16481.getClass();
        if (!(abstractC16481 instanceof C17227)) {
            return false;
        }
        C18959 c18959M40461 = ((C17227) abstractC16481).m40461();
        EnumC24203 type = c18959M40461.getType();
        if (type == EnumC24203.ARITH) {
            int i = C23919.f77429[((C22711) c18959M40461).m51191().ordinal()];
            return (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? false : true;
        }
        switch (C23919.f77431[type.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                return true;
        }
    }
}
