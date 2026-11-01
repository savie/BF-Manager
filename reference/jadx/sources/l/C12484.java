package l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.۫ܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5VY */
/* JADX INFO: loaded from: classes3.dex */
public final class C12484 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f41646 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC8956 m31026(String str) {
        C13465.m32966(str, "key");
        return (AbstractC8956) this.f41646.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31028(String str, AbstractC8956 abstractC8956) {
        C13465.m32966(str, "key");
        C13465.m32966(abstractC8956, "viewModel");
        AbstractC8956 abstractC8957 = (AbstractC8956) this.f41646.put(str, abstractC8956);
        if (abstractC8957 != null) {
            abstractC8957.mo17355();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashSet m31029() {
        return new HashSet(this.f41646.keySet());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31027() {
        LinkedHashMap linkedHashMap = this.f41646;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((AbstractC8956) it.next()).m23251();
        }
        linkedHashMap.clear();
    }
}
