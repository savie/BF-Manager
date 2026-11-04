package l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.᩹ܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5VY */
/* JADX INFO: loaded from: classes.dex */
public final class C23656 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f76733 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC13213 m52889(String str) {
        C15243.m36590(str, "key");
        return (AbstractC13213) this.f76733.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52891(String str, AbstractC13213 abstractC13213) {
        C15243.m36590(str, "key");
        C15243.m36590(abstractC13213, "viewModel");
        AbstractC13213 abstractC13214 = (AbstractC13213) this.f76733.put(str, abstractC13213);
        if (abstractC13214 != null) {
            abstractC13214.m32722();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashSet m52892() {
        return new HashSet(this.f76733.keySet());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52890() {
        LinkedHashMap linkedHashMap = this.f76733;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((AbstractC13213) it.next()).m32722();
        }
        linkedHashMap.clear();
    }
}
