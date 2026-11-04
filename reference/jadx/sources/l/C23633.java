package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.᩹ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes.dex */
public final class C23633 extends AbstractC14681 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11172 f76675;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23633(C11172 c11172, AbstractC19728 abstractC19728, EnumC3539 enumC3539, EnumSet enumSet) {
        super(c11172, abstractC19728, enumC3539, enumSet);
        this.f76675 = c11172;
    }

    @Override // l.AbstractC14681
    /* JADX INFO: renamed from: ۙ */
    public final void mo2564(int i, AbstractC11781 abstractC11781) {
        C24550 c24550 = (C24550) abstractC11781;
        C11172 c11172 = this.f76675;
        AbstractC19728 abstractC19728M50345 = c11172.f35205.m50345(c11172.m28138());
        c24550.f79584 = new C7224(abstractC19728M50345);
        String string = abstractC19728M50345.toString();
        if (c24550.f38069.f38066 == EnumC13603.f43219 && string.endsWith(".java") && !string.equals(c24550.f38072.toString().concat(".java"))) {
            c24550.f38071 |= 17592186044416L;
        }
    }
}
