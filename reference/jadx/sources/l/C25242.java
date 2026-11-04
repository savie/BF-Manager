package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.᩻ᩴ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes.dex */
public final class C25242 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f81559 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f81560;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile long f81561;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public synchronized void m56379(AbstractC22044 abstractC22044) {
        String strMo4294 = abstractC22044.mo4294();
        if (this.f81559.containsKey(strMo4294)) {
            return;
        }
        this.f81559.put(strMo4294, new C11815(abstractC22044, abstractC22044.mo4304(), abstractC22044.mo4285(), abstractC22044.mo4286()));
        this.f81561 = this.f81560.incrementAndGet();
    }

    public C25242(AbstractC22044 abstractC22044, Collection collection, AtomicLong atomicLong) {
        this.f81560 = atomicLong;
        m56379(abstractC22044);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC22044 abstractC22045 = (AbstractC22044) it.next();
            if (abstractC22045 != null) {
                m56379(abstractC22045);
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static long m56381(C25242 c25242) {
        return c25242.f81561;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static List m56382(C25242 c25242) {
        List listUnmodifiableList;
        synchronized (c25242) {
            ArrayList arrayList = new ArrayList(c25242.f81559.size());
            Iterator it = c25242.f81559.values().iterator();
            while (it.hasNext()) {
                arrayList.add(((C11815) it.next()).m29659());
            }
            listUnmodifiableList = C4681.unmodifiableList(arrayList);
        }
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m56378(C25242 c25242) {
        List listUnmodifiableList;
        synchronized (c25242) {
            Collection collectionValues = c25242.f81559.values();
            ArrayList arrayList = new ArrayList(collectionValues.size());
            for (Object obj : collectionValues) {
                C17359.requireNonNull(obj);
                arrayList.add(obj);
            }
            listUnmodifiableList = C4681.unmodifiableList(arrayList);
        }
        return listUnmodifiableList;
    }
}
