package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ᩴܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19903 extends AbstractC14681 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11172 f64054;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19903(C11172 c11172, AbstractC19728 abstractC19728, EnumC3539 enumC3539, EnumSet enumSet) {
        super(c11172, abstractC19728, enumC3539, enumSet);
        this.f64054 = c11172;
    }

    @Override // l.AbstractC14681
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo32705(EnumC4241 enumC4241) {
        return super.mo32705(enumC4241) && this.f64054.f35180;
    }

    @Override // l.AbstractC14681
    /* JADX INFO: renamed from: ۙ */
    public final void mo2564(int i, AbstractC11781 abstractC11781) {
        if (abstractC11781.f38066 == EnumC13603.f43213) {
            AbstractC11781 abstractC11782 = abstractC11781.f38069;
            if (abstractC11782.f38066 == EnumC13603.f43214) {
                EnumSet enumSet = ((C2920) abstractC11782).f9545;
                char cM28138 = this.f64054.m28138();
                EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC9631.class);
                for (EnumC9631 enumC9631 : EnumC9631.values()) {
                    if ((enumC9631.f31146 & cM28138) != 0) {
                        enumSetNoneOf.add(enumC9631);
                    }
                }
                enumSet.addAll(enumSetNoneOf);
            }
        }
    }
}
