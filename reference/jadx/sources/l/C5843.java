package l;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۚᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8459 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5843 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22970 f20067;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f20068 = 1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f20069 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25235 f20070;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5816 f20071;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC8036 f20072;

    public C5843(C25235 c25235, AbstractC8036 abstractC8036, AbstractC22970 abstractC22970) {
        this.f20070 = c25235;
        this.f20072 = null;
        this.f20067 = abstractC22970;
        this.f20072 = abstractC8036;
        AbstractC19728 abstractC19728M51194 = c25235.f81516.f49864.m51194(c25235.f81524.m38664() + "SwitchMap" + c25235.f81524.m38664() + c25235.f81516.m36600(C20693.m47330(abstractC22970.f38067.f73596.mo29575())).toString().replace('/', '.').replace('.', c25235.f81524.m38664()));
        C24550 c24550M56318 = C25235.m56318(c25235);
        C5816 c5816 = new C5816(4120L, abstractC19728M51194, new C2832(c25235.f81535.f48253, c25235.f81535.f48271), c24550M56318);
        this.f20071 = c5816;
        c24550M56318.mo29590();
        c24550M56318.f79576.mo7481(c5816);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17026() {
        C25235 c25235 = this.f20070;
        C15714 c15714 = c25235.f81517;
        AbstractC8036 abstractC8036 = this.f20072;
        abstractC8036.getClass();
        c15714.f51040 = C11239.m28342(abstractC8036);
        C5816 c5816 = this.f20071;
        C7926 c7926M56333 = c25235.m56333((C24550) c5816.f38069);
        AbstractC19728 abstractC19728 = c25235.f81516.f49852;
        AbstractC22970 abstractC22970 = this.f20067;
        C21549 c21549M37573 = c25235.f81517.m37573(c25235.f81517.m37557(c25235.f81535.f48253), C14769.of((Object) c25235.f81517.m37543(c25235.f81517.m37549(c25235.f81517.m37574(c25235.m56302(abstractC8036, abstractC19728, abstractC22970.f38067, C14769.m35543()))), c25235.f81535.f48281)), null);
        c21549M37573.f26659 = new C2832(c25235.f81535.f48253, c25235.f81535.f48271);
        C18499 c18499 = new C18499();
        C10377 c10377M56302 = c25235.m56302(abstractC8036, c25235.f81516.f49798, abstractC22970.f38067, C14769.m35543());
        C14769 c14769M35552 = C14769.m35543().m35552(c25235.f81517.m37503(c25235.f81517.m37523(new C5816(8589934592L, c25235.f81516.f49811, c25235.f81535.f48259, c25235.f81535.f48321), (AbstractC22295) null), c25235.f81517.m37506(0L, C14769.m35543())));
        for (Map.Entry entry : this.f20069.entrySet()) {
            C20605 c20605M37541 = c25235.f81517.m37541((AbstractC22295) c25235.f81517.m37531(c5816, c25235.f81517.m37549((AbstractC22295) c25235.f81517.m37543(c25235.f81517.m37574((C5816) entry.getKey()), c10377M56302))), (AbstractC22295) c25235.f81517.m37546((Integer) entry.getValue()));
            c20605M37541.f26659 = c25235.f81535.f48253;
            C11106 c11106M37567 = c25235.f81517.m37567(c20605M37541);
            C15714 c15715 = c25235.f81517;
            C4197 c4197M37506 = c25235.f81517.m37506(0L, C14769.of((Object) c11106M37567));
            c15715.getClass();
            c18499.m43089(c15715.m37518(C14769.m35543(), c4197M37506, c14769M35552, (C4197) null));
        }
        c7926M56333.f26344 = c7926M56333.f26344.m35552(c25235.f81517.m37506(8L, c18499.m43093())).m35552(c25235.f81517.m37523(c5816, c21549M37573));
    }
}
