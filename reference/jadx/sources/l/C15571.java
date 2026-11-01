package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ܶ᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes4.dex */
public final class C15571 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f50635 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f50636;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile long f50637;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public synchronized void m37208(AbstractC20745 abstractC20745) {
        String strMo33986 = abstractC20745.mo33986();
        if (this.f50635.containsKey(strMo33986)) {
            return;
        }
        this.f50635.put(strMo33986, new C23332(abstractC20745, abstractC20745.mo33971(), abstractC20745.mo33964(), abstractC20745.mo33991()));
        this.f50637 = this.f50636.incrementAndGet();
    }

    public C15571(AbstractC20745 abstractC20745, Collection collection, AtomicLong atomicLong) {
        this.f50636 = atomicLong;
        m37208(abstractC20745);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC20745 abstractC20746 = (AbstractC20745) it.next();
            if (abstractC20746 != null) {
                m37208(abstractC20746);
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static long m37209(C15571 c15571) {
        return c15571.f50637;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static List m37210(C15571 c15571) {
        List listUnmodifiableList;
        synchronized (c15571) {
            ArrayList arrayList = new ArrayList(c15571.f50635.size());
            Iterator it = c15571.f50635.values().iterator();
            while (it.hasNext()) {
                arrayList.add(((C23332) it.next()).m51411());
            }
            listUnmodifiableList = C0561.unmodifiableList(arrayList);
        }
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m37206(C15571 c15571) {
        List listUnmodifiableList;
        synchronized (c15571) {
            Collection collectionValues = c15571.f50635.values();
            ArrayList arrayList = new ArrayList(collectionValues.size());
            for (Object obj : collectionValues) {
                C13638.requireNonNull(obj);
                arrayList.add(obj);
            }
            listUnmodifiableList = C0561.unmodifiableList(arrayList);
        }
        return listUnmodifiableList;
    }
}
