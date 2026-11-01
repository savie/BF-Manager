package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢۜ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: G7LX */
/* JADX INFO: loaded from: classes4.dex */
public final class C9417 extends AbstractC14356 {
    @Override // l.AbstractC14356
    /* JADX INFO: renamed from: ۙ */
    public final void mo5555(AbstractC10495 abstractC10495, C21825 c21825, boolean z, AbstractC16579 abstractC16579) {
        int i;
        C3836 c3836;
        C21825 c21825M34593 = AbstractC14356.m34593(c21825);
        Iterator it = c21825M34593.iterator();
        boolean z2 = true;
        while (true) {
            boolean zHasNext = it.hasNext();
            c3836 = this.f17301;
            if (!zHasNext) {
                break;
            }
            C21825<AbstractC8774> c21826 = (C21825) it.next();
            C6171.m17175("Arguments list is empty", !c21826.isEmpty());
            C19003 c19003 = new C19003();
            for (AbstractC8774 abstractC8774 : c21826) {
                if (!"".equals(abstractC8774.f30190.mo24292())) {
                    AbstractC16579 abstractC165710 = abstractC8774.f30190;
                    AbstractC16579 abstractC165711 = c3836.f14228;
                    C23800 c23800 = this.f17295;
                    if (abstractC165710 == abstractC165711) {
                        abstractC165710 = c23800.m52383(c3836.f14293).f77449;
                    }
                    if (!z2 || z) {
                        this.f17297.m39895(abstractC8774.f30190, abstractC8774).mo5374();
                    }
                    if (!c23800.m52355(abstractC165710).mo9481() && abstractC165710.f53222 != c3836.f14220.f53222) {
                        this.f17297.m39908((AbstractC8774) abstractC10495, c3836.f14220, this.f17299.f77616, C21825.of((Object) c3836.f14275), true);
                        abstractC165710 = c3836.f14220;
                    }
                    c19003.m43723(abstractC165710);
                    z2 = false;
                }
            }
            m24174(abstractC16579, abstractC10495, c19003.m43726());
        }
        if (c21825M34593.m48596() > 1) {
            C19003 c19004 = new C19003();
            for (i = 0; i < c21825M34593.m48596(); i++) {
                c19004.m43723(c3836.f14220);
            }
            m24174(abstractC16579, abstractC10495, c19004.m43726());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24174(AbstractC16579 abstractC16579, AbstractC10495 abstractC10495, C21825 c21825) {
        C23942 c23942 = this.f17299;
        C17094 c17094 = this.f17297;
        C21825 c21825M48588 = C21825.m48588();
        C3836 c3836 = this.f17301;
        C13757 c13757 = new C13757(c21825, abstractC16579, c21825M48588, c3836.f14240);
        C5286 c5286 = this.f17300;
        int i = c5286.f18294;
        try {
            c5286.m14629((InterfaceC12260) abstractC10495);
            C6969 c6969 = new C6969(c23942.f77624, c3836.f14243, this.f17296.m45527(abstractC10495, c17094.m39892(), c3836.f14299, c23942.f77624, C21825.of((Object) c3836.f14301, (Object) c3836.f14220, (Object) c3836.f14295), (C21825) null).mo36947(), c13757, (InterfaceC7299[]) C21825.m48588().toArray(new InterfaceC7299[0]));
            C22116 c22116M39916 = c17094.m39916();
            c22116M39916.getClass();
            C23800 c23800 = c22116M39916.f71612;
            C10039.m25336(c6969.mo50006(c23800));
            C6171.m17176(c6969.f77452 == EnumC10477.f35879);
            C13757 c13758 = (C13757) c6969.mo50006(c23800);
            int iM25336 = C10039.m25336(c13758.f45368);
            c22116M39916.f71608.m25370(c6969, c13758);
            AbstractC2982 abstractC2982 = c22116M39916.f71611[iM25336];
        } finally {
            c5286.f18294 = i;
        }
    }
}
