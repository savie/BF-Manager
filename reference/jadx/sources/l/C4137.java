package l;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.ۘ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 67G0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4137 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13311 m11765(Exception exc) {
        if (m11767(exc, Collections.newSetFromMap(new IdentityHashMap()))) {
            return new C13311(EnumC15428.SMB1_ONLY, null, false);
        }
        return new C13311(EnumC15428.UNKNOWN, exc, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m11766(Throwable th) {
        return m11768(th, Collections.newSetFromMap(new IdentityHashMap()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m11767(Throwable th, Set set) {
        if (th == null || !set.add(th)) {
            return false;
        }
        if (th instanceof C21919) {
            return true;
        }
        for (Throwable th2 : th.getSuppressed()) {
            if (m11767(th2, set)) {
                return true;
            }
        }
        return m11767(th.getCause(), set);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m11768(Throwable th, Set set) {
        if (th == null || !set.add(th)) {
            return false;
        }
        if (th instanceof C10360) {
            C10360 c10360 = (C10360) th;
            EnumC2162 enumC2162M26257 = c10360.m26257();
            if (enumC2162M26257 == EnumC2162.SMB2_SESSION_SETUP && c10360.m26258() == EnumC3055.STATUS_ACCESS_DENIED.getValue()) {
                return true;
            }
            if (enumC2162M26257 == EnumC2162.SMB2_NEGOTIATE) {
                long jM26258 = c10360.m26258();
                if (jM26258 == EnumC3055.STATUS_NOT_SUPPORTED.getValue() || jM26258 == EnumC3055.STATUS_INVALID_PARAMETER.getValue() || jM26258 == EnumC3055.STATUS_NOT_IMPLEMENTED.getValue()) {
                    return true;
                }
            }
        }
        for (Throwable th2 : th.getSuppressed()) {
            if (m11768(th2, set)) {
                return true;
            }
        }
        return m11768(th.getCause(), set);
    }
}
