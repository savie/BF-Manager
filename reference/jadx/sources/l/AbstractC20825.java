package l;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.᩵᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20825 extends AbstractC20496 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C14769 f66693;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f66694 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5558 f66692 = new C5558(null, Integer.MAX_VALUE);

    public AbstractC20825(C14769 c14769) {
        this.f66693 = c14769;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5558 m47632(C9636 c9636) {
        HashMap map = this.f66694;
        C5558 c5558 = (C5558) map.get(c9636);
        if (c5558 == null) {
            LinkedHashSet linkedHashSet = c9636.f31154;
            Object obj = c9636.f21176;
            if (linkedHashSet.isEmpty()) {
                c5558 = new C5558(C14769.of((Object) c9636), Integer.valueOf(((C18499) obj).m43094()));
            } else {
                Iterator it = c9636.f31154.iterator();
                while (it.hasNext()) {
                    if (((C9636) it.next()) != c9636) {
                        c5558 = new C5558(C14769.of((Object) c9636), Integer.valueOf(((C18499) obj).m43094()));
                        for (C9636 c9637 : c9636.f31154) {
                            if (c9637 != c9636) {
                                C5558 c5558M47632 = m47632(c9637);
                                c5558 = new C5558(((C14769) c5558.f19300).m35549((C14769) c5558M47632.f19300), Integer.valueOf(((Integer) c5558M47632.f19301).intValue() + ((Integer) c5558.f19301).intValue()));
                            }
                        }
                    }
                }
                c5558 = new C5558(C14769.of((Object) c9636), Integer.valueOf(((C18499) obj).m43094()));
            }
            map.put(c9636, c5558);
        }
        return c5558;
    }

    @Override // l.AbstractC20496, l.InterfaceC14111
    /* JADX INFO: renamed from: ۙ */
    public final C9636 mo34261(C2925 c2925) {
        this.f66694.clear();
        C5558 c5558 = this.f66692;
        C5558 c5559 = c5558;
        for (C9636 c9636 : c2925.f9583) {
            if (!Collections.disjoint((Collection) c9636.f21176, this.f66693)) {
                C5558 c5558M47632 = m47632(c9636);
                if (((Integer) c5558M47632.f19301).intValue() < ((Integer) c5559.f19301).intValue()) {
                    c5559 = c5558M47632;
                }
            }
        }
        if (c5559 == c5558) {
            throw new C7400();
        }
        return (C9636) ((C14769) c5559.f19300).f48335;
    }
}
