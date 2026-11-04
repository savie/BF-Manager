package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public class C13032 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC11781 f41712;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5575 f41713;

    public C13032(C5575 c5575, AbstractC11781 abstractC11781) {
        this.f41713 = c5575;
        this.f41712 = abstractC11781;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22664 mo32454(AbstractC22664 abstractC22664) {
        C5575 c5575 = this.f41713;
        C24705 c24705 = c5575.f19361;
        C24705 c24706 = c5575.f19361;
        AbstractC22664 abstractC22664M55088 = c24705.m55088(abstractC22664);
        abstractC22664M55088.getClass();
        if (abstractC22664M55088 instanceof C1562) {
            Iterator it = ((C1562) abstractC22664M55088).m5502().iterator();
            while (it.hasNext()) {
                if (!c24706.f79928.m50027((AbstractC22664) it.next())) {
                    C17007 c17007M45975 = c24706.f79965.m45975(C19859.m45719(abstractC22664M55088));
                    C11540 c11540 = new C11540();
                    c11540.f36297 = c17007M45975;
                    throw c11540;
                }
            }
        } else if (!c24706.f79928.m50027(abstractC22664M55088)) {
            C17007 c17007M45976 = c24706.f79965.m45975(C19859.m45719(abstractC22664M55088));
            C11540 c11541 = new C11540();
            c11541.f36297 = c17007M45976;
            throw c11541;
        }
        return c24706.m55126(this.f41712, abstractC22664M55088);
    }
}
