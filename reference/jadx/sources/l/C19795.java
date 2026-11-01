package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.᩵᩻ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public final class C19795 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f63562;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9212 f63563;

    public C19795(C9212 c9212) {
        this.f63563 = c9212;
        this.f63562 = new ArrayList();
        C19524 c19524 = c9212.f31302;
        Iterator it = c19524.m44584().iterator();
        while (it.hasNext()) {
            this.f63562.add(new C8506(this, (AbstractC16579) it.next()));
        }
        for (C8506 c8506 : this.f63562) {
            AbstractC16579 abstractC16579 = (AbstractC16579) ((C19003) c8506.f22269).first();
            for (C8506 c8507 : this.f63562) {
                AbstractC16579 abstractC165710 = (AbstractC16579) ((C19003) c8507.f22269).first();
                if (abstractC16579 != abstractC165710 && AbstractC16579.m38997(((C10229) c19524.m44602(abstractC16579)).m26012(EnumC8112.values()), C21825.of((Object) abstractC165710))) {
                    c8506.f29480.add(c8507);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (C21825 c21825 : C8732.m22598(this.f63562)) {
            if (c21825.m48596() > 1) {
                C8506 c8508 = (C8506) c21825.f70876;
                C21825<C8506> c21826 = c21825.f70877;
                Object obj = c8508.f22269;
                for (C8506 c8509 : c21826) {
                    C6171.m17175("Attempt to merge a compound node!", ((C19003) c8509.f22269).m43728() == 1);
                    ((C19003) obj).m43724((C19003) c8509.f22269);
                    Iterator it2 = c8509.f29480.iterator();
                    while (it2.hasNext()) {
                        c8508.f29480.add((C8506) it2.next());
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (C8506 c85010 : c8508.f29480) {
                    if (((C19003) obj).contains(((C19003) c85010.f22269).first())) {
                        linkedHashSet.add(c8508);
                    } else {
                        linkedHashSet.add(c85010);
                    }
                }
                c8508.f29480 = linkedHashSet;
                Iterator it3 = c21825.iterator();
                while (it3.hasNext()) {
                    m45008((C8506) it3.next(), c8508);
                }
            }
            arrayList.add((C8506) c21825.f70876);
        }
        this.f63562 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45008(C8506 c8506, C8506 c8507) {
        for (C8506 c8508 : this.f63562) {
            if (c8508.f29480.remove(c8506) && c8507 != null) {
                c8508.f29480.add(c8507);
            }
        }
    }
}
