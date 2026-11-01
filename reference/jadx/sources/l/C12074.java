package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.۫֨۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12074 extends AbstractC3956 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0429 f40410;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12074(C0429 c0429, AbstractC11242 abstractC11242, EnumC11368 enumC11368, EnumSet enumSet) {
        super(c0429, abstractC11242, enumC11368, enumSet);
        this.f40410 = c0429;
    }

    @Override // l.AbstractC3956
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11442(EnumC13130 enumC13130) {
        return super.mo11442(enumC13130) && this.f40410.f1959;
    }

    @Override // l.AbstractC3956
    /* JADX INFO: renamed from: ۙ */
    public final void mo5135(int i, AbstractC23903 abstractC23903) {
        if (abstractC23903.f77452 == EnumC10477.f35865) {
            AbstractC23903 abstractC23904 = abstractC23903.f77448;
            if (abstractC23904.f77452 == EnumC10477.f35868) {
                EnumSet enumSet = ((C19670) abstractC23904).f63144;
                char cM2248 = this.f40410.m2248();
                EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC8381.class);
                for (EnumC8381 enumC8381 : EnumC8381.values()) {
                    if ((enumC8381.f29111 & cM2248) != 0) {
                        enumSetNoneOf.add(enumC8381);
                    }
                }
                enumSet.addAll(enumSetNoneOf);
            }
        }
    }
}
