package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۬ۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57R8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12847 extends AbstractC17785 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ArrayList f42747 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f42748 = false;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f42749 = new ArrayList();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f42750 = new ArrayList();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC7202 f42751;

    public C12847(AbstractC7202 abstractC7202) {
        this.f42751 = abstractC7202;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12847 m31865(AbstractC7202 abstractC7202) {
        return new C12847(abstractC7202);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31866(AbstractC17785 abstractC17785) {
        this.f42747.add(abstractC17785);
    }

    @Override // l.AbstractC17785
    /* JADX INFO: renamed from: ۙ */
    public final String mo10842() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f42747.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC17785) it.next()).m41372());
        }
        return sb.toString();
    }

    @Override // l.AbstractC17785
    /* JADX INFO: renamed from: ܰ */
    public final C9548 mo10846() {
        C9548 c9548M24403 = AbstractC17785.f56394;
        Iterator it = this.f42747.iterator();
        while (it.hasNext()) {
            C9548 c9548M41374 = ((AbstractC17785) it.next()).m41374();
            if (c9548M24403.m24404()) {
                c9548M24403 = c9548M41374;
            } else if (!c9548M41374.m24404()) {
                c9548M24403 = c9548M24403.m24402(c9548M41374).m24403(AbstractC17785.f56393);
            }
        }
        return c9548M24403;
    }

    @Override // l.AbstractC17785
    /* JADX INFO: renamed from: ۙ */
    public final C6496 mo10843(InterfaceC13553 interfaceC13553, C6496 c6496) {
        int iM41373 = c6496.f21907 + m41373();
        if (iM41373 <= 100) {
            this.f42748 = true;
            return c6496.m17699(iM41373);
        }
        int iMo19145 = c6496.f21909 + this.f42751.mo19145();
        int i = 0;
        C6496 c6497 = new C6496(iMo19145, iMo19145, c6496.f21907, false);
        ArrayList arrayList = this.f42749;
        arrayList.clear();
        ArrayList arrayList2 = this.f42750;
        arrayList2.clear();
        arrayList.add(new ArrayList());
        for (AbstractC17785 abstractC17785 : this.f42747) {
            if (abstractC17785 instanceof C22019) {
                arrayList2.add((C22019) abstractC17785);
                arrayList.add(new ArrayList());
            } else {
                ((List) C22808.m50475(arrayList)).add(abstractC17785);
            }
        }
        C6496 c6496M31864 = m31864(interfaceC13553, c6497, C11521.empty(), (List) arrayList.get(0));
        while (i < arrayList2.size()) {
            C11521 c11521Of = C11521.of((C22019) arrayList2.get(i));
            i++;
            c6496M31864 = m31864(interfaceC13553, c6496M31864, c11521Of, (List) arrayList.get(i));
        }
        return c6496.m17699(c6496M31864.f21907);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6496 m31864(InterfaceC13553 interfaceC13553, C6496 c6496, C11521 c11521, List list) {
        int iM41373 = c11521.isPresent() ? ((C22019) c11521.get()).m41373() : 0;
        Iterator it = list.iterator();
        int iM41374 = 0;
        while (it.hasNext()) {
            iM41374 += ((AbstractC17785) it.next()).m41373();
            if (iM41374 >= 1000) {
                iM41374 = 1000;
                break;
            }
        }
        boolean z = (c11521.isPresent() && ((C22019) c11521.get()).f71382 == EnumC0851.UNIFIED) || c6496.f21906 || (c6496.f21907 + iM41373) + iM41374 > 100;
        if (c11521.isPresent()) {
            c6496 = ((C22019) c11521.get()).m48913(c6496, c6496.f21908, z);
        }
        int i = c6496.f21907;
        boolean z2 = iM41374 + i <= 100;
        C6496 c6497 = new C6496(c6496.f21908, c6496.f21909, i, false);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            c6497 = ((AbstractC17785) it2.next()).mo10843(interfaceC13553, c6497);
        }
        return !z2 ? new C6496(c6497.f21908, c6497.f21909, c6497.f21907, true) : c6497;
    }

    @Override // l.AbstractC17785
    /* JADX INFO: renamed from: ۙ */
    public final void mo10844(C18806 c18806) {
        if (this.f42748) {
            c18806.m43377(m41374(), m41372());
            return;
        }
        ArrayList arrayList = this.f42749;
        int i = 0;
        Iterator it = ((List) arrayList.get(0)).iterator();
        while (it.hasNext()) {
            ((AbstractC17785) it.next()).mo10844(c18806);
        }
        while (true) {
            ArrayList arrayList2 = this.f42750;
            if (i >= arrayList2.size()) {
                return;
            }
            ((C22019) arrayList2.get(i)).mo10844(c18806);
            i++;
            Iterator it2 = ((List) arrayList.get(i)).iterator();
            while (it2.hasNext()) {
                ((AbstractC17785) it2.next()).mo10844(c18806);
            }
        }
    }

    @Override // l.AbstractC17785
    /* JADX INFO: renamed from: ۨ */
    public final int mo10845() {
        Iterator it = this.f42747.iterator();
        int iM41373 = 0;
        while (it.hasNext()) {
            iM41373 += ((AbstractC17785) it.next()).m41373();
            if (iM41373 >= 1000) {
                return 1000;
            }
        }
        return iM41373;
    }

    public final String toString() {
        C23244 c23244M37072 = C15483.m37072(this);
        c23244M37072.m51284(this.f42751, "plusIndent");
        c23244M37072.m51284(this.f42747, "docs");
        return c23244M37072.toString();
    }
}
