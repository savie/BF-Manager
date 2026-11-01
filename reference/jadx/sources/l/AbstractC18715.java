package l;

/* JADX INFO: renamed from: l.ᩴۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18715 extends C22220 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C19003 f60692;

    /* JADX INFO: renamed from: ۖ */
    public abstract void mo11337();

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo3930(C7672 c7672) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43247(C18009 c18009) {
        this.f60692.m43723(c18009);
        mo11337();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private EnumC12366 m43244(AbstractC8774 abstractC8774, C19003 c19003, EnumC21537 enumC21537) {
        this.f60692 = c19003;
        boolean z = false;
        for (C21825 c21825M43726 = this.f60692.m43726(); c21825M43726.m48595(); c21825M43726 = c21825M43726.f70877) {
            C18009 c18009 = (C18009) c21825M43726.f70876;
            if (c18009.f57603.m22847(enumC21537.f69958) && enumC21537.mo18155(c18009.f57603) == abstractC8774) {
                c18009.mo4051();
                z = true;
            } else {
                this.f60692.m43723(c18009);
            }
        }
        return EnumC12366.m30776(z);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC12366 m43248(AbstractC8774 abstractC8774) {
        return m43244(abstractC8774, new C19003(), EnumC21537.f69956);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC12366 m43245(AbstractC8774 abstractC8774, C19003 c19003) {
        return m43244(abstractC8774, c19003, EnumC21537.f69954);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC12366 m43249(AbstractC8774 abstractC8774, C19003 c19003) {
        return m43244(abstractC8774, c19003, EnumC21537.f69955);
    }

    @Override // l.C22220
    /* JADX INFO: renamed from: ܰ */
    public void mo7248(AbstractC8774 abstractC8774) {
        if (abstractC8774 != null) {
            AbstractC16579 abstractC16579 = abstractC8774.f30190;
            if (abstractC16579 == null || abstractC16579 != AbstractC16579.f53217) {
                abstractC8774.mo1802(this);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43246(AbstractC8774 abstractC8774, C5286 c5286) {
        if (abstractC8774.m22847(EnumC18651.f60487)) {
            c5286.f18294 = -1;
            C21473 c21473M14652 = c5286.m14652(null);
            c21473M14652.f69789 = abstractC8774;
            mo7248(c21473M14652);
            return;
        }
        c5286.f18294 = -1;
        C17924 c17924M14612 = c5286.m14612((AbstractC11242) null);
        c17924M14612.f56927 = abstractC8774;
        mo7248(c17924M14612);
    }
}
