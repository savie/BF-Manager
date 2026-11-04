package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ܳܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15427 extends AbstractC14681 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11172 f50272;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15427(C11172 c11172, AbstractC19728 abstractC19728, EnumC3539 enumC3539, EnumSet enumSet) {
        super(c11172, abstractC19728, enumC3539, enumSet);
        this.f50272 = c11172;
    }

    @Override // l.AbstractC14681
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo32705(EnumC4241 enumC4241) {
        return super.mo32705(enumC4241) && this.f50272.f35210;
    }

    @Override // l.AbstractC14681
    /* JADX INFO: renamed from: ۙ */
    public final void mo2564(int i, AbstractC11781 abstractC11781) {
        if (abstractC11781.f38066 == EnumC13603.f43213) {
            abstractC11781.f38071 |= 2305843009213693952L;
        }
        C11172 c11172 = this.f50272;
        char cM28138 = c11172.m28138();
        C18499 c18499 = new C18499();
        for (int i2 = 0; i2 < cM28138; i2++) {
            C22224 c22224 = new C22224(abstractC11781, c11172.f35205.m50340(c11172.m28138()), c11172.f35205.m50345(c11172.m28138()));
            c11172.m28126(c22224, EnumC4241.MEMBER);
            c18499.m43089(c22224);
        }
        ((C24550) abstractC11781).m54826(c18499.m43093());
    }
}
