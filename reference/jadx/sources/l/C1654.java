package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ۜ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: G7LX */
/* JADX INFO: loaded from: classes3.dex */
public final class C1654 extends AbstractC14356 {
    @Override // l.AbstractC14356
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
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
            StringBuilder sb = new StringBuilder(c21826.m48596());
            C19003 c19003 = new C19003();
            C19003 c19004 = new C19003();
            boolean z3 = z2;
            for (AbstractC8774 abstractC8774 : c21826) {
                Object objMo24292 = abstractC8774.f30190.mo24292();
                if (!"".equals(objMo24292)) {
                    AbstractC16579 abstractC165710 = abstractC8774.f30190;
                    if (abstractC165710 == c3836.f14228) {
                        sb.append((String) null);
                    } else if (objMo24292 != null) {
                        String strMo9478 = abstractC165710.mo9478();
                        if (strMo9478.indexOf(2) != -1 || strMo9478.indexOf(1) != -1) {
                            sb.append((char) 2);
                            c19004.m43723(C8711.m22544(strMo9478));
                        } else {
                            sb.append(strMo9478);
                        }
                    } else {
                        sb.append((char) 1);
                        AbstractC16579 abstractC165711 = abstractC8774.f30190;
                        if (!z3 || z) {
                            this.f17297.m39895(abstractC165711, abstractC8774).mo5374();
                        }
                        if (!this.f17295.m52355(abstractC165711).mo9481() && abstractC165711.f53222 != c3836.f14220.f53222) {
                            this.f17297.m39908((AbstractC8774) abstractC10495, c3836.f14220, this.f17299.f77616, C21825.of((Object) c3836.f14275), true);
                            abstractC165711 = c3836.f14220;
                        }
                        c19003.m43723(abstractC165711);
                        z3 = false;
                    }
                }
            }
            m5554(abstractC16579, abstractC10495, sb.toString(), c19004.m43726(), c19003.m43726());
            z2 = z3;
        }
        if (c21825M34593.m48596() > 1) {
            C19003 c19005 = new C19003();
            StringBuilder sb2 = new StringBuilder();
            for (i = 0; i < c21825M34593.m48596(); i++) {
                c19005.m43723(c3836.f14220);
                sb2.append((char) 1);
            }
            m5554(abstractC16579, abstractC10495, sb2.toString(), C21825.m48588(), c19005.m43726());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5554(AbstractC16579 abstractC16579, AbstractC10495 abstractC10495, String str, C21825 c21825, C21825 c21826) {
        C23942 c23942 = this.f17299;
        C17094 c17094 = this.f17297;
        C21825 c21825M48588 = C21825.m48588();
        C3836 c3836 = this.f17301;
        C22492 c22492 = c3836.f14240;
        AbstractC16579 abstractC165710 = c3836.f14220;
        C13757 c13757 = new C13757(c21826, abstractC16579, c21825M48588, c22492);
        C5286 c5286 = this.f17300;
        int i = c5286.f18294;
        try {
            c5286.m14629((InterfaceC12260) abstractC10495);
            C19003 c19003 = new C19003();
            C19003 c19004 = new C19003();
            Iterator it = c21825.iterator();
            while (it.hasNext()) {
                c19004.m43723((InterfaceC7299) it.next());
                c19003.m43723(abstractC165710);
            }
            C21825 c21825M48591 = C21825.of((Object) c3836.f14301, (Object) abstractC165710, (Object) c3836.f14295).m48591(abstractC165710);
            c21825M48591.getClass();
            C6969 c6969 = new C6969(c23942.f77564, c3836.f14243, this.f17296.m45527(abstractC10495, c17094.m39892(), c3836.f14299, c23942.f77564, c19003.m43726().m48594(c21825M48591), (C21825) null).mo36947(), c13757, (InterfaceC7299[]) c19004.m43726().m48594(C21825.of((Object) C8711.m22544(str))).toArray(new InterfaceC7299[c19004.size()]));
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
