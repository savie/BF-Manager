package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57R8 */
/* JADX INFO: loaded from: classes.dex */
public final class C22898 extends AbstractC11709 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC3506 f74381;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f74382 = new ArrayList();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f74379 = false;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f74380 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f74383 = new ArrayList();

    public C22898(AbstractC3506 abstractC3506) {
        this.f74381 = abstractC3506;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22898 m51629(AbstractC3506 abstractC3506) {
        return new C22898(abstractC3506);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51630(AbstractC11709 abstractC11709) {
        this.f74382.add(abstractC11709);
    }

    @Override // l.AbstractC11709
    /* JADX INFO: renamed from: ۙ */
    public final String mo6932() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f74382.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC11709) it.next()).m29386());
        }
        return sb.toString();
    }

    @Override // l.AbstractC11709
    /* JADX INFO: renamed from: ᩷ */
    public final C2346 mo6938() {
        C2346 c2346M7916 = AbstractC11709.f37885;
        Iterator it = this.f74382.iterator();
        while (it.hasNext()) {
            C2346 c2346M29384 = ((AbstractC11709) it.next()).m29384();
            if (c2346M7916.m7917()) {
                c2346M7916 = c2346M29384;
            } else if (!c2346M29384.m7917()) {
                c2346M7916 = c2346M7916.m7924(c2346M29384).m7916(AbstractC11709.f37886);
            }
        }
        return c2346M7916;
    }

    @Override // l.AbstractC11709
    /* JADX INFO: renamed from: ۙ */
    public final C15438 mo6933(InterfaceC8770 interfaceC8770, C15438 c15438) {
        int iM29385 = c15438.f50284 + m29385();
        if (iM29385 <= 100) {
            this.f74379 = true;
            return c15438.m36959(iM29385);
        }
        int iMo11499 = c15438.f50286 + this.f74381.mo11499();
        int i = 0;
        C15438 c15439 = new C15438(iMo11499, iMo11499, c15438.f50284, false);
        ArrayList arrayList = this.f74380;
        arrayList.clear();
        ArrayList arrayList2 = this.f74383;
        arrayList2.clear();
        arrayList.add(new ArrayList());
        for (AbstractC11709 abstractC11709 : this.f74382) {
            if (abstractC11709 instanceof C22152) {
                arrayList2.add((C22152) abstractC11709);
                arrayList.add(new ArrayList());
            } else {
                ((List) C16625.m39339(arrayList)).add(abstractC11709);
            }
        }
        C15438 c15438M51628 = m51628(interfaceC8770, c15439, C15867.empty(), (List) arrayList.get(0));
        while (i < arrayList2.size()) {
            C15867 c15867Of = C15867.of((C22152) arrayList2.get(i));
            i++;
            c15438M51628 = m51628(interfaceC8770, c15438M51628, c15867Of, (List) arrayList.get(i));
        }
        return c15438.m36959(c15438M51628.f50284);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15438 m51628(InterfaceC8770 interfaceC8770, C15438 c15438, C15867 c15867, List list) {
        int iM29385 = c15867.isPresent() ? ((C22152) c15867.get()).m29385() : 0;
        Iterator it = list.iterator();
        int iM29386 = 0;
        while (it.hasNext()) {
            iM29386 += ((AbstractC11709) it.next()).m29385();
            if (iM29386 >= 1000) {
                iM29386 = 1000;
                break;
            }
        }
        boolean z = (c15867.isPresent() && ((C22152) c15867.get()).f71359 == EnumC10963.UNIFIED) || c15438.f50287 || (c15438.f50284 + iM29385) + iM29386 > 100;
        if (c15867.isPresent()) {
            c15438 = ((C22152) c15867.get()).m50114(c15438, c15438.f50285, z);
        }
        int i = c15438.f50284;
        boolean z2 = iM29386 + i <= 100;
        C15438 c15439 = new C15438(c15438.f50285, c15438.f50286, i, false);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            c15439 = ((AbstractC11709) it2.next()).mo6933(interfaceC8770, c15439);
        }
        return !z2 ? new C15438(c15439.f50285, c15439.f50286, c15439.f50284, true) : c15439;
    }

    @Override // l.AbstractC11709
    /* JADX INFO: renamed from: ۙ */
    public final void mo6934(C11338 c11338) {
        if (this.f74379) {
            c11338.m28631(m29384(), m29386());
            return;
        }
        ArrayList arrayList = this.f74380;
        int i = 0;
        Iterator it = ((List) arrayList.get(0)).iterator();
        while (it.hasNext()) {
            ((AbstractC11709) it.next()).mo6934(c11338);
        }
        while (true) {
            ArrayList arrayList2 = this.f74383;
            if (i >= arrayList2.size()) {
                return;
            }
            ((C22152) arrayList2.get(i)).mo6934(c11338);
            i++;
            Iterator it2 = ((List) arrayList.get(i)).iterator();
            while (it2.hasNext()) {
                ((AbstractC11709) it2.next()).mo6934(c11338);
            }
        }
    }

    @Override // l.AbstractC11709
    /* JADX INFO: renamed from: ۤ */
    public final int mo6935() {
        Iterator it = this.f74382.iterator();
        int iM29385 = 0;
        while (it.hasNext()) {
            iM29385 += ((AbstractC11709) it.next()).m29385();
            if (iM29385 >= 1000) {
                return 1000;
            }
        }
        return iM29385;
    }

    public final String toString() {
        C3179 c3179M46714 = C20333.m46714(this);
        c3179M46714.m10379(this.f74381, "plusIndent");
        c3179M46714.m10379(this.f74382, "docs");
        return c3179M46714.toString();
    }
}
