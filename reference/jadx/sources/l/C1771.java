package l;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.֫۟۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 67G0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1771 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5500 m6224(Exception exc) {
        if (m6226(exc, Collections.newSetFromMap(new IdentityHashMap()))) {
            return new C5500(EnumC16686.SMB1_ONLY, null, false);
        }
        return new C5500(EnumC16686.UNKNOWN, exc, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m6225(Throwable th) {
        return m6227(th, Collections.newSetFromMap(new IdentityHashMap()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m6226(Throwable th, Set set) {
        if (th == null || !set.add(th)) {
            return false;
        }
        if (th instanceof C9338) {
            return true;
        }
        for (Throwable th2 : th.getSuppressed()) {
            if (m6226(th2, set)) {
                return true;
            }
        }
        return m6226(th.getCause(), set);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m6227(Throwable th, Set set) {
        if (th == null || !set.add(th)) {
            return false;
        }
        if (th instanceof C22172) {
            C22172 c22172 = (C22172) th;
            EnumC23906 enumC23906M50140 = c22172.m50140();
            if (enumC23906M50140 == EnumC23906.SMB2_SESSION_SETUP && c22172.m50141() == EnumC20243.STATUS_ACCESS_DENIED.getValue()) {
                return true;
            }
            if (enumC23906M50140 == EnumC23906.SMB2_NEGOTIATE) {
                long jM50141 = c22172.m50141();
                if (jM50141 == EnumC20243.STATUS_NOT_SUPPORTED.getValue() || jM50141 == EnumC20243.STATUS_INVALID_PARAMETER.getValue() || jM50141 == EnumC20243.STATUS_NOT_IMPLEMENTED.getValue()) {
                    return true;
                }
            }
        }
        for (Throwable th2 : th.getSuppressed()) {
            if (m6227(th2, set)) {
                return true;
            }
        }
        return m6227(th.getCause(), set);
    }
}
