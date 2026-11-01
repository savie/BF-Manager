package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ܿ֨۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17012 extends AbstractC3956 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0429 f54364;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17012(C0429 c0429, AbstractC11242 abstractC11242, EnumC11368 enumC11368, EnumSet enumSet) {
        super(c0429, abstractC11242, enumC11368, enumSet);
        this.f54364 = c0429;
    }

    @Override // l.AbstractC3956
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11442(EnumC13130 enumC13130) {
        return super.mo11442(enumC13130) && this.f54364.f1977;
    }

    @Override // l.AbstractC3956
    /* JADX INFO: renamed from: ۙ */
    public final void mo5135(int i, AbstractC23903 abstractC23903) {
        if (abstractC23903.f77452 == EnumC10477.f35865) {
            abstractC23903.f77447 |= 2305843009213693952L;
        }
        C0429 c0429 = this.f54364;
        char cM2248 = c0429.m2248();
        C19003 c19003 = new C19003();
        for (int i2 = 0; i2 < cM2248; i2++) {
            C16142 c16142 = new C16142(abstractC23903, c0429.f1983.m1623(c0429.m2248()), c0429.f1983.m1624(c0429.m2248()));
            c0429.m2240(c16142, EnumC13130.MEMBER);
            c19003.m43723(c16142);
        }
        ((C22492) abstractC23903).m49997(c19003.m43726());
    }
}
