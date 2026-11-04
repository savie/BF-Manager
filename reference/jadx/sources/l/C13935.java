package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13935 extends RunnableC20649 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11172 f44177;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C14769 f44178;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13935(C11172 c11172, AbstractC11781 abstractC11781, C14769 c14769) {
        super(c11172, abstractC11781, C14769.m35543());
        this.f44177 = c11172;
        this.f44178 = c14769;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m33922(C14769 c14769) {
        C18499 c18499 = new C18499();
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            C5207 c5207 = (C5207) it.next();
            C23892 c23892M18311 = m18311(c5207.f18368);
            c18499.m43089(new C24638(c23892M18311.f69124, c23892M18311.f77372, c5207.f18369));
        }
        return c18499.m43093();
    }

    @Override // l.RunnableC20649, java.lang.Runnable
    public final void run() {
        C11172 c11172 = this.f44177;
        InterfaceC15976 interfaceC15976 = c11172.f35182;
        try {
            c11172.f35182 = this.f66218;
            C14769 c14769M33922 = m33922(this.f44178);
            AbstractC11781 abstractC11781 = this.f66219;
            abstractC11781.m29569(c14769M33922.m35549(abstractC11781.mo29597()));
        } finally {
            c11172.f35182 = interfaceC15976;
        }
    }
}
