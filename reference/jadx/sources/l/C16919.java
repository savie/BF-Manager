package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ܺܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16919 extends AbstractC14681 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11172 f55310;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16919(C11172 c11172, AbstractC19728 abstractC19728, EnumC3539 enumC3539, EnumSet enumSet) {
        super(c11172, abstractC19728, enumC3539, enumSet);
        this.f55310 = c11172;
    }

    @Override // l.AbstractC14681
    /* JADX INFO: renamed from: ۙ */
    public final void mo2564(int i, AbstractC11781 abstractC11781) {
        C11172 c11172 = this.f55310;
        char cM28138 = c11172.m28138();
        C14769 c14769M35543 = C14769.m35543();
        for (int i2 = 0; i2 < cM28138; i2++) {
            c14769M35543 = c14769M35543.m35552(c11172.f35205.m50337(c11172.m28138()).f38067);
        }
        if (abstractC11781.f38067.mo50622().isEmpty()) {
            abstractC11781.f38067.mo15883().f75157 = c14769M35543.m35554();
        }
    }
}
