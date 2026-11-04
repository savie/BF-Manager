package l;

/* JADX INFO: renamed from: l.᩷ᩳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public final class C22246 extends AbstractC14239 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24705 f71650;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22664 m50297(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        if (abstractC22665.f73595 == C14458.f45498) {
            return abstractC22664;
        }
        switch (C3600.f12306[abstractC22664.mo5501().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return abstractC22664;
            default:
                return abstractC22664.mo4934(abstractC22664.f73595.m34925(EnumC24156.ANNOTATIONS));
        }
    }

    @Override // l.C23475, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1766(Object obj, AbstractC22664 abstractC22664) {
        return abstractC22664.mo40452() ? abstractC22664 : m50297(abstractC22664, abstractC22664);
    }

    @Override // l.AbstractC14239, l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C10729 c10729, Object obj) {
        C24705 c24705 = this.f71650;
        return m50297(c24705.m55075(c24705.m55123(c10729), ((Boolean) obj).booleanValue()), (AbstractC22664) c10729);
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1771(C17969 c17969, Object obj) {
        return m50297(this.f71650.m55075(c17969.mo19992(), ((Boolean) obj).booleanValue()), (AbstractC22664) c17969);
    }

    @Override // l.C23475, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC22664 mo1766(Object obj, AbstractC22664 abstractC22664) {
        return abstractC22664.mo40452() ? abstractC22664 : m50297(abstractC22664, abstractC22664);
    }

    @Override // l.AbstractC14239, l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC22664 mo1769(C10729 c10729, Object obj) {
        C24705 c24705 = this.f71650;
        return m50297(c24705.m55075(c24705.m55123(c10729), ((Boolean) obj).booleanValue()), (AbstractC22664) c10729);
    }

    @Override // l.AbstractC14239, l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC22664 mo1768(C10510 c10510, Boolean bool) {
        AbstractC22664 abstractC22664Mo29576 = c10510.f73596.mo29576(this.f71650);
        if (bool.booleanValue()) {
            return new C19461(abstractC22664Mo29576.mo23449(), C14769.m35543(), abstractC22664Mo29576.f73596, c10510.f73595.m34925(EnumC24156.ANNOTATIONS));
        }
        return m50297(abstractC22664Mo29576, (AbstractC22664) c10510);
    }

    public C22246(C24705 c24705) {
        this.f71650 = c24705;
    }
}
