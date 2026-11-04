package l;

/* JADX INFO: renamed from: l.᩵ᩳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C20754 extends AbstractC1100 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24705 f66499;

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo1766(Object obj, AbstractC22664 abstractC22664) {
        return null;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C10510 c10510, Object obj) {
        AbstractC11781 abstractC11781 = (AbstractC11781) obj;
        AbstractC22970 abstractC22970 = c10510.f73596;
        if (abstractC22970 == abstractC11781) {
            return c10510;
        }
        AbstractC22664 abstractC22664 = abstractC11781.f38067;
        C24705 c24705 = this.f66499;
        AbstractC22664 abstractC22664M55157 = c24705.m55157(abstractC22970, abstractC22664);
        if (abstractC22664M55157 != null) {
            C18499 c18499 = new C18499();
            C18499 c184910 = new C18499();
            try {
                c24705.m55111(abstractC22664M55157, c10510, c18499, c184910);
                AbstractC22664 abstractC22664M55103 = c24705.m55103(abstractC11781.f38067, c18499.m43093(), c184910.m43093());
                if (c24705.m55131(abstractC22664M55103, (AbstractC22664) c10510, true)) {
                    C18499 c184911 = new C18499();
                    for (C14769 c14769Mo9323 = abstractC11781.f38067.mo9323(); c14769Mo9323.m35550(); c14769Mo9323 = c14769Mo9323.f48336) {
                        if (abstractC22664M55103.mo9325((AbstractC22664) c14769Mo9323.f48335) && !c10510.mo9325((AbstractC22664) c14769Mo9323.f48335)) {
                            c184911.m43089((AbstractC22664) c14769Mo9323.f48335);
                        }
                    }
                    if (!c184911.m43096()) {
                        return abstractC22664M55103;
                    }
                    if (c10510.mo9328()) {
                        return c24705.m55132(abstractC22664M55103);
                    }
                    C14769 c14769M43093 = c184911.m43093();
                    C18499 c184912 = new C18499();
                    for (C14769 c14769 = c14769M43093; c14769.m35550(); c14769 = c14769.f48336) {
                        C14764 c14764 = c24705.f79947;
                        c184912.m43089(new C10729(c14764.f48286, EnumC18670.UNBOUND, c14764.f48274, (C17969) c14769.f48335));
                    }
                    return c24705.m55103(abstractC22664M55103, c14769M43093, c184912.m43093());
                }
            } catch (C0617 unused) {
                return null;
            }
        }
        return null;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10772(C12748 c12748, Object obj) {
        return c12748;
    }

    public C20754(C24705 c24705) {
        this.f66499 = c24705;
    }
}
