package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۛ֨۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5723 extends AbstractC3956 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0429 f19490;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5723(C0429 c0429, AbstractC11242 abstractC11242, EnumC11368 enumC11368, EnumSet enumSet) {
        super(c0429, abstractC11242, enumC11368, enumSet);
        this.f19490 = c0429;
    }

    @Override // l.AbstractC3956
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11442(EnumC13130 enumC13130) {
        return super.mo11442(enumC13130) && this.f19490.f1972;
    }

    @Override // l.AbstractC3956
    /* JADX INFO: renamed from: ۙ */
    public final void mo5135(int i, AbstractC23903 abstractC23903) {
        if (abstractC23903.f77452 == EnumC10477.f35865) {
            C19003 c19003 = new C19003();
            C0429 c0429 = this.f19490;
            char cM2248 = c0429.m2248();
            for (int i2 = 0; i2 < cM2248; i2++) {
                c19003.m43723(c0429.f1983.m1627(c0429.m2248()));
            }
            ((C22492) abstractC23903).f73421 = c19003.m43726();
        }
    }
}
