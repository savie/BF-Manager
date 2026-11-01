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

/* JADX INFO: renamed from: l.ᩳܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18201 {
    public static final CopyOnWriteArrayList b;
    public static final ConcurrentMapC13783 c;
    public static volatile Set d;
    public final Set a;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        b = copyOnWriteArrayList;
        c = new ConcurrentMapC13783(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new C6996(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C15380 a(String str) {
        C13638.requireNonNull(str, "zoneId");
        ConcurrentMapC13783 concurrentMapC13783 = c;
        C18201 c18201 = (C18201) concurrentMapC13783.get(str);
        if (c18201 == null) {
            if (concurrentMapC13783.isEmpty()) {
                throw new C21729("No time-zone data files registered");
            }
            throw new C21729("Unknown time-zone ID: " + str);
        }
        if (c18201.a.contains(str)) {
            return new C15380(TimeZone.getTimeZone(str));
        }
        throw new C21729("Not a built-in time zone: " + str);
    }

    public static void b(C18201 c18201) {
        C13638.requireNonNull(c18201, d.M);
        synchronized (C18201.class) {
            for (String str : c18201.a) {
                C13638.requireNonNull(str, "zoneId");
                if (((C18201) c.putIfAbsent(str, c18201)) != null) {
                    throw new C21729("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + c18201);
                }
            }
            d = Collections.unmodifiableSet(new HashSet(c.keySet()));
        }
        b.add(c18201);
    }

    public C18201() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.a = Collections.unmodifiableSet(linkedHashSet);
    }
}
