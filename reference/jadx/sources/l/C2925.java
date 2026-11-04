package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ۖ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes2.dex */
public final class C2925 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f9583;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8891 f9584;

    public C2925(C8891 c8891) {
        this.f9584 = c8891;
        this.f9583 = new ArrayList();
        C2596 c2596 = c8891.f29052;
        Iterator it = c2596.m8712().iterator();
        while (it.hasNext()) {
            this.f9583.add(new C9636(this, (AbstractC22664) it.next()));
        }
        for (C9636 c9636 : this.f9583) {
            AbstractC22664 abstractC22664 = (AbstractC22664) ((C18499) c9636.f21176).first();
            for (C9636 c9637 : this.f9583) {
                AbstractC22664 abstractC22665 = (AbstractC22664) ((C18499) c9637.f21176).first();
                if (abstractC22664 != abstractC22665 && AbstractC22664.m51060(((C8274) c2596.m8710(abstractC22664)).m22332(EnumC0816.values()), C14769.of((Object) abstractC22665))) {
                    c9636.f31154.add(c9637);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (C14769 c14769 : C18917.m43925(this.f9583)) {
            if (c14769.m35551() > 1) {
                C9636 c9638 = (C9636) c14769.f48335;
                C14769<C9636> c147610 = c14769.f48336;
                Object obj = c9638.f21176;
                for (C9636 c9639 : c147610) {
                    C11972.m30025("Attempt to merge a compound node!", ((C18499) c9639.f21176).m43094() == 1);
                    ((C18499) obj).m43091((C18499) c9639.f21176);
                    Iterator it2 = c9639.f31154.iterator();
                    while (it2.hasNext()) {
                        c9638.f31154.add((C9636) it2.next());
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (C9636 c96310 : c9638.f31154) {
                    if (((C18499) obj).contains(((C18499) c96310.f21176).first())) {
                        linkedHashSet.add(c9638);
                    } else {
                        linkedHashSet.add(c96310);
                    }
                }
                c9638.f31154 = linkedHashSet;
                Iterator it3 = c14769.iterator();
                while (it3.hasNext()) {
                    m9574((C9636) it3.next(), c9638);
                }
            }
            arrayList.add((C9636) c14769.f48335);
        }
        this.f9583 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9574(C9636 c9636, C9636 c9637) {
        for (C9636 c9638 : this.f9583) {
            if (c9638.f31154.remove(c9636) && c9637 != null) {
                c9638.f31154.add(c9637);
            }
        }
    }
}
