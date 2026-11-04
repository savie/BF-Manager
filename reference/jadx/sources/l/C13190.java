package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.۫ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13190 extends AbstractC14681 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11172 f42124;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13190(C11172 c11172, AbstractC19728 abstractC19728, EnumC3539 enumC3539, EnumSet enumSet) {
        super(c11172, abstractC19728, enumC3539, enumSet);
        this.f42124 = c11172;
    }

    @Override // l.AbstractC14681
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo32705(EnumC4241 enumC4241) {
        return super.mo32705(enumC4241) && this.f42124.f35190;
    }

    @Override // l.AbstractC14681
    /* JADX INFO: renamed from: ۙ */
    public final void mo2564(int i, AbstractC11781 abstractC11781) {
        if (abstractC11781.f38066 == EnumC13603.f43213) {
            C18499 c18499 = new C18499();
            C11172 c11172 = this.f42124;
            char cM28138 = c11172.m28138();
            for (int i2 = 0; i2 < cM28138; i2++) {
                c18499.m43089(c11172.f35205.m50337(c11172.m28138()));
            }
            ((C24550) abstractC11781).f79583 = c18499.m43093();
        }
    }
}
