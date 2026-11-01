package l;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗۜ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: G7LX */
/* JADX INFO: loaded from: classes2.dex */
public final class C3065 extends AbstractC4954 {
    @Override // l.AbstractC4954
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC2982 mo9194(C6635 c6635) {
        m9192((AbstractC10495) c6635);
        AbstractC5930 abstractC5930 = c6635.f22412;
        AbstractC16579 abstractC16579 = abstractC5930.f30190;
        C17094 c17094 = this.f17297;
        AbstractC2982 abstractC2982M39895 = c17094.m39895(abstractC16579, abstractC5930);
        if (abstractC2982M39895.mo7177() > 0) {
            c17094.m39913().m25378(((abstractC2982M39895.mo7177() - 1) * 3) + 90);
        }
        abstractC2982M39895.mo5374();
        m9193(c6635.f22412);
        for (AbstractC8774 abstractC8774 : AbstractC4954.m13739(c6635.f22413)) {
            c17094.m39895(abstractC8774.f30190, abstractC8774).mo5374();
            m9193(abstractC8774);
        }
        this.f17297.m39908((AbstractC8774) c6635, this.f17301.f14236, this.f17299.f77635, C21825.m48588(), false);
        return abstractC2982M39895;
    }

    @Override // l.AbstractC4954
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC2982 mo9195(C22864 c22864) {
        m9192((AbstractC10495) c22864);
        Iterator it = AbstractC4954.m13739((AbstractC8774) c22864).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C17094 c17094 = this.f17297;
            if (zHasNext) {
                AbstractC8774 abstractC8774 = (AbstractC8774) it.next();
                c17094.m39895(abstractC8774.f30190, abstractC8774).mo5374();
                m9193(abstractC8774);
            } else {
                C3836 c3836 = this.f17301;
                this.f17297.m39908((AbstractC8774) c22864, c3836.f14236, this.f17299.f77635, C21825.m48588(), false);
                return c17094.m39916().m49070(c3836.f14220);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9192(AbstractC10495 abstractC10495) {
        C17094 c17094 = this.f17297;
        C10039 c10039M39913 = c17094.m39913();
        C3836 c3836 = this.f17301;
        c10039M39913.m25365(187, c17094.m39893((InterfaceC12260) abstractC10495, c3836.f14236), (InterfaceC15767) c3836.f14236);
        c17094.m39913().m25378(89);
        this.f17297.m39908((AbstractC8774) abstractC10495, c3836.f14236, this.f17299.f77632, C21825.m48588(), false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m9193(AbstractC8774 abstractC8774) {
        AbstractC16579 abstractC16579Mo5593 = abstractC8774.f30190.mo5593();
        boolean zMo9481 = abstractC16579Mo5593.mo9481();
        C3836 c3836 = this.f17301;
        if (!zMo9481 && abstractC16579Mo5593.f53222 != c3836.f14220.f53222) {
            abstractC16579Mo5593 = c3836.f14275;
        }
        C6171.m17178(abstractC16579Mo5593.mo24292());
        HashMap map = this.f17298;
        AbstractC23903 abstractC23903M45527 = (AbstractC23903) map.get(abstractC16579Mo5593);
        C17094 c17094 = this.f17297;
        if (abstractC23903M45527 == null) {
            abstractC23903M45527 = this.f17296.m45527(abstractC8774, c17094.m39892(), c3836.f14236, this.f17299.f77563, C21825.of((Object) abstractC16579Mo5593), (C21825) null);
            map.put(abstractC16579Mo5593, abstractC23903M45527);
        }
        C22116 c22116M39916 = c17094.m39916();
        c22116M39916.getClass();
        C10039 c10039 = c22116M39916.f71608;
        C23800 c23800 = c22116M39916.f71612;
        C10039.m25336(abstractC23903M45527.mo50006(c23800));
        C13757 c13757 = (C13757) abstractC23903M45527.m52698(c23800);
        int iM25336 = C10039.m25336(c13757.f45368);
        if ((abstractC23903M45527.f77448.mo20276() & 512) != 0) {
            c10039.m25374(abstractC23903M45527, c13757);
        } else {
            c10039.m25354(abstractC23903M45527, c13757);
        }
        AbstractC2982 abstractC2982 = c22116M39916.f71611[iM25336];
    }
}
