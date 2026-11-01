package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۜ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: G7LX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14356 extends AbstractC4954 {
    /* JADX INFO: renamed from: ۙ */
    public abstract void mo5555(AbstractC10495 abstractC10495, C21825 c21825, boolean z, AbstractC16579 abstractC16579);

    @Override // l.AbstractC4954
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC2982 mo9194(C6635 c6635) {
        AbstractC5930 abstractC5930 = c6635.f22412;
        AbstractC5930 abstractC5931 = c6635.f22413;
        C21825 c21825M48588 = C21825.m48588();
        C21825 c21825M13739 = AbstractC4954.m13739(abstractC5930);
        c21825M48588.getClass();
        C21825 c21825M48594 = c21825M13739.m48594(c21825M48588);
        C21825 c21825M137310 = AbstractC4954.m13739(abstractC5931);
        c21825M48594.getClass();
        C21825 c21825M48595 = c21825M137310.m48594(c21825M48594);
        AbstractC5930 abstractC5932 = c6635.f22412;
        AbstractC2982 abstractC2982M39895 = this.f17297.m39895(abstractC5932.f30190, abstractC5932);
        abstractC2982M39895.mo7179();
        abstractC2982M39895.mo5374();
        mo5555(c6635, c21825M48595, false, c6635.f30190);
        return abstractC2982M39895;
    }

    @Override // l.AbstractC4954
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC2982 mo9195(C22864 c22864) {
        AbstractC5930 abstractC5930 = c22864.f74367;
        AbstractC5930 abstractC5931 = c22864.f74368;
        C21825 c21825M48588 = C21825.m48588();
        C21825 c21825M13739 = AbstractC4954.m13739(abstractC5930);
        c21825M48588.getClass();
        C21825 c21825M48594 = c21825M13739.m48594(c21825M48588);
        C21825 c21825M137310 = AbstractC4954.m13739(abstractC5931);
        c21825M48594.getClass();
        mo5555(c22864, c21825M137310.m48594(c21825M48594), true, c22864.f30190);
        return this.f17297.m39916().m49070(this.f17301.f14220);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21825 m34593(C21825 c21825) {
        C19003 c19003 = new C19003();
        C19003 c19004 = new C19003();
        Iterator it = c21825.iterator();
        int i = 0;
        while (it.hasNext()) {
            AbstractC8774 abstractC8774 = (AbstractC8774) it.next();
            int i2 = (abstractC8774.f30190.mo1933() == EnumC6617.LONG || abstractC8774.f30190.mo1933() == EnumC6617.DOUBLE) ? 2 : 1;
            if (i + i2 >= 200) {
                c19003.m43723((Object) c19004.m43726());
                c19004.clear();
                i = 0;
            }
            c19004.m43723(abstractC8774);
            i += i2;
        }
        if (!c19004.isEmpty()) {
            c19003.m43723((Object) c19004.m43726());
        }
        return c19003.m43726();
    }
}
