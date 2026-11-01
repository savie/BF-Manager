package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۜ֨۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6428 extends AbstractC3956 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0429 f21771;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6428(C0429 c0429, AbstractC11242 abstractC11242, EnumC11368 enumC11368, EnumSet enumSet) {
        super(c0429, abstractC11242, enumC11368, enumSet);
        this.f21771 = c0429;
    }

    @Override // l.AbstractC3956
    /* JADX INFO: renamed from: ۙ */
    public final void mo5135(int i, AbstractC23903 abstractC23903) {
        EnumC10477 enumC10477 = abstractC23903.f77452;
        EnumC10477 enumC10478 = EnumC10477.f35865;
        C0429 c0429 = this.f21771;
        if (enumC10477 == enumC10478) {
            C22492 c22492 = (C22492) abstractC23903;
            boolean z = true;
            c0429.f1993 = true;
            try {
                C0309 c0309 = (C0309) c22492.f77449;
                if (c22492 != c0429.f1964) {
                    z = false;
                }
                C6171.m17176(z);
                AbstractC11242 abstractC11242M1624 = c0429.f1983.m1624(c0429.m2248());
                byte[] bArrMo28214 = abstractC11242M1624.mo28214();
                int iMo28207 = abstractC11242M1624.mo28207();
                int iMo28217 = abstractC11242M1624.mo28217();
                c0429.f1973 = bArrMo28214;
                c0429.f1962 = iMo28207;
                c0429.f1978 = iMo28207 + iMo28217;
                c0309.f1655 = c0429.m2231();
                c0309.f1654 = c0429.m2228();
                C19003 c19003 = new C19003();
                while (c0429.f1962 != c0429.f1978) {
                    c19003.m43723(c0429.m2228());
                }
                c0309.f1658 = c19003.m43726();
                return;
            } finally {
                c0429.f1993 = false;
            }
        }
        C21825 c21825Mo33524 = abstractC23903.f77449.mo33524();
        AbstractC16579 abstractC16579M1623 = c0429.f1983.m1623(c0429.m2248());
        abstractC23903.f77449 = abstractC16579M1623;
        if (abstractC23903.f77452 == EnumC10477.f35879 && abstractC16579M1623.mo33524().isEmpty()) {
            abstractC23903.f77449.mo27295().f45366 = c21825Mo33524;
        }
    }
}
