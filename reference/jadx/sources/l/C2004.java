package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.֫ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2004 extends AbstractC14681 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11172 f6675;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2004(C11172 c11172, AbstractC19728 abstractC19728, EnumC3539 enumC3539, EnumSet enumSet) {
        super(c11172, abstractC19728, enumC3539, enumSet);
        this.f6675 = c11172;
    }

    @Override // l.AbstractC14681
    /* JADX INFO: renamed from: ۙ */
    public final void mo2564(int i, AbstractC11781 abstractC11781) {
        C11172 c11172 = this.f6675;
        if (!c11172.f35187) {
            c11172.f35199 += i;
            return;
        }
        c11172.m28138();
        c11172.m28138();
        c11172.f35199 += c11172.m28131();
        c11172.f35199 = (c11172.m28138() * '\b') + c11172.f35199;
        c11172.m28126(abstractC11781, EnumC4241.MEMBER);
        ((C10377) abstractC11781).f33009 = null;
    }
}
