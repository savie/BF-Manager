package l;

import com.umeng.analytics.pro.d;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.֡۫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0424 {
    public static final CopyOnWriteArrayList b;
    public static final ConcurrentMapC17249 c;
    public static volatile Set d;
    public final Set a;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        b = copyOnWriteArrayList;
        c = new ConcurrentMapC17249(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new C4087(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C21307 a(String str) {
        C17359.requireNonNull(str, "zoneId");
        ConcurrentMapC17249 concurrentMapC17249 = c;
        C0424 c0424 = (C0424) concurrentMapC17249.get(str);
        if (c0424 == null) {
            if (concurrentMapC17249.isEmpty()) {
                throw new C18323("No time-zone data files registered");
            }
            throw new C18323("Unknown time-zone ID: " + str);
        }
        if (c0424.a.contains(str)) {
            return new C21307(TimeZone.getTimeZone(str));
        }
        throw new C18323("Not a built-in time zone: " + str);
    }

    public static void b(C0424 c0424) {
        C17359.requireNonNull(c0424, d.M);
        synchronized (C0424.class) {
            for (String str : c0424.a) {
                C17359.requireNonNull(str, "zoneId");
                if (((C0424) c.putIfAbsent(str, c0424)) != null) {
                    throw new C18323("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + c0424);
                }
            }
            d = Collections.unmodifiableSet(new HashSet(c.keySet()));
        }
        b.add(c0424);
    }

    public C0424() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.a = Collections.unmodifiableSet(linkedHashSet);
    }
}
