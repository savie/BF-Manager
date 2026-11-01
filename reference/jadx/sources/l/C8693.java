package l;

import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ۡۛۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes3.dex */
public final class C8693 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public WeakHashMap f29904 = new WeakHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19276 m22514(AbstractC23903 abstractC23903, EnumC11678 enumC11678) {
        C21825<C19276> c21825 = (C21825) this.f29904.get(abstractC23903);
        if (c21825 == null) {
            return null;
        }
        for (C19276 c19276 : c21825) {
            if (c19276.f62232.f5037.mo4575().f42957 == enumC11678) {
                return c19276;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22515(AbstractC8774 abstractC8774, C1116 c1116) {
        AbstractC23903 abstractC23903 = c1116.f5037.mo4575().f42951;
        WeakHashMap weakHashMap = this.f29904;
        C21825 c21825M48588 = (C21825) weakHashMap.get(abstractC23903);
        if (c21825M48588 == null) {
            c21825M48588 = C21825.m48588();
        }
        C19276 c19276 = new C19276();
        c19276.f62233 = abstractC8774;
        c19276.f62232 = c1116;
        weakHashMap.put(abstractC23903, c21825M48588.m48597(c19276));
    }
}
