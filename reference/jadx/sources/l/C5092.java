package l;

/* JADX INFO: renamed from: l.ۙᩳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C5092 extends AbstractC1100 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24705 f17786;

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1766(Object obj, AbstractC22664 abstractC22664) {
        return ((AbstractC11781) obj).f38067;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C10510 c10510, Object obj) {
        AbstractC11781 abstractC11781 = (AbstractC11781) obj;
        AbstractC11781 abstractC11782 = abstractC11781.f38069;
        if ((abstractC11781.mo29591() & 8) == 0 && abstractC11782.f38067.mo9330()) {
            C24705 c24705 = this.f17786;
            AbstractC22664 abstractC22664M55101 = c24705.m55101(abstractC11782, c10510);
            if (c10510.mo18914()) {
                abstractC22664M55101 = c24705.m55158(abstractC22664M55101);
            }
            if (abstractC22664M55101 != null) {
                C14769 c14769Mo9323 = abstractC11782.f38067.mo9323();
                C14769 c14769Mo9324 = abstractC22664M55101.mo9323();
                if (c14769Mo9323.m35550()) {
                    if (c14769Mo9324.isEmpty()) {
                        return c24705.m55132(abstractC11781.f38067);
                    }
                    return c24705.m55103(abstractC11781.f38067, c14769Mo9323, c14769Mo9324);
                }
            }
        }
        return abstractC11781.f38067;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C10729 c10729, Object obj) {
        C24705 c24705 = this.f17786;
        return c24705.m55126((AbstractC11781) obj, c24705.m55123(c10729));
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10772(C12748 c12748, Object obj) {
        return c12748;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1771(C17969 c17969, Object obj) {
        return this.f17786.m55126((AbstractC11781) obj, c17969.mo19992());
    }

    public C5092(C24705 c24705) {
        this.f17786 = c24705;
    }
}
