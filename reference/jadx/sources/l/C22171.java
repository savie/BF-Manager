package l;

import android.content.ComponentName;
import android.content.Context;
import android.os.SystemClock;
import android.os.UserHandle;
import android.os.UserManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongSupplier;

/* JADX INFO: renamed from: l.᩷ܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6G5 */
/* JADX INFO: loaded from: classes.dex */
public final class C22171 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AtomicLong f71395 = new AtomicLong();

    /* JADX WARN: Bottom block not found for handler: all -> 0x022b */
    /* JADX WARN: Code duplicated, block: B:143:0x0235  */
    /* JADX WARN: Code duplicated, block: B:144:0x0238  */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01c8, code lost:
    
        if (r4 == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d8, code lost:
    
        if (m50135(1000, r28, r17, r26, r27) != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01da, code lost:
    
        r15 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01e4, code lost:
    
        r0 = m50133(r32, r30, r2, r28, r26, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01e8, code lost:
    
        if (r0 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01ea, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01eb, code lost:
    
        r15 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01fd, code lost:
    
        return m50134(r32, r30, r8, r28, r17, r26, r27, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0201, code lost:
    
        r0 = m50133(r32, r30, r2, r28, r26, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x020f, code lost:
    
        if (r0 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0211, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0223, code lost:
    
        return m50134(r32, r30, r8, r28, r17, r26, r27, r7);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r7v1, types: [l.ۜ᩻ܳ] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.EnumC14207 m50132(android.app.Application r31, l.InterfaceC24911 r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22171.m50132(android.app.Application, l.᩻۠ۧ):l.۬᩻ܳ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50136(Context context) {
        try {
            UserManager userManager = (UserManager) context.getSystemService("user");
            List<UserHandle> userProfiles = userManager == null ? null : userManager.getUserProfiles();
            return userProfiles == null || userProfiles.size() != 1;
        } catch (RuntimeException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50137(Context context, InterfaceC24911 interfaceC24911) {
        return interfaceC24911 != null && interfaceC24911.mo6264() && interfaceC24911.mo6266() && !m50136(context);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50139(InterfaceC24911 interfaceC24911, int i, String str, C9732 c9732) {
        ComponentName componentNameUnflattenFromString;
        try {
            if (interfaceC24911.mo6264() && interfaceC24911.mo6266() && (componentNameUnflattenFromString = ComponentName.unflattenFromString(str)) != null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() + 15000;
                C7496 c7496 = new C7496();
                synchronized (interfaceC24911) {
                    C5017 c5017M50129 = m50129(interfaceC24911, i, "enabled_accessibility_services", jElapsedRealtime, c9732, c7496);
                    if (!c5017M50129.f17407) {
                        return false;
                    }
                    String str2 = (String) c5017M50129.f17406.get(0);
                    StringBuilder sb = new StringBuilder();
                    if (!"null".equals(str2)) {
                        for (String str3 : str2.split(":", -1)) {
                            if (!str3.isEmpty() && !componentNameUnflattenFromString.equals(ComponentName.unflattenFromString(str3))) {
                                if (sb.length() != 0) {
                                    sb.append(':');
                                }
                                sb.append(str3);
                            }
                        }
                    }
                    if (m50138(str2, str) && !m50130(interfaceC24911, i, "enabled_accessibility_services", sb.toString(), jElapsedRealtime, c9732, c7496).f17407) {
                        return false;
                    }
                    C5017 c5017M501210 = m50129(interfaceC24911, i, "enabled_accessibility_services", jElapsedRealtime, c9732, c7496);
                    if (c5017M501210.f17407 && !m50138((String) c5017M501210.f17406.get(0), str)) {
                        String str4 = (String) c5017M501210.f17406.get(0);
                        boolean z = true;
                        if (!str4.isEmpty() && !"null".equals(str4)) {
                            return true;
                        }
                        if (!m50130(interfaceC24911, i, "accessibility_enabled", "0", jElapsedRealtime, c9732, c7496).f17407) {
                            return false;
                        }
                        C5017 c5017M501211 = m50129(interfaceC24911, i, "accessibility_enabled", jElapsedRealtime, c9732, c7496);
                        if (!c5017M501211.f17407 || !"0".equals(((String) c5017M501211.f17406.get(0)).trim())) {
                            z = false;
                        }
                        return z;
                    }
                    return false;
                }
            }
        } catch (RuntimeException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC14207 m50133(InterfaceC24911 interfaceC24911, int i, int i2, long j, C9732 c9732, C7496 c7496) {
        if (i2 >= 24) {
            return null;
        }
        C5017 c5017M50129 = m50129(interfaceC24911, i, "accessibility_enabled", j, c9732, c7496);
        if (c5017M50129.f17407) {
            if ("1".equals(((String) c5017M50129.f17406.get(0)).trim())) {
                return null;
            }
            if (m50130(interfaceC24911, i, "accessibility_enabled", "1", j, c9732, c7496).f17407) {
                C5017 c5017M501210 = m50129(interfaceC24911, i, "accessibility_enabled", j, c9732, c7496);
                if (c5017M501210.f17407 && "1".equals(((String) c5017M501210.f17406.get(0)).trim())) {
                    return null;
                }
                if (c7496.f24797) {
                    return EnumC14207.STATE_UNKNOWN;
                }
                return EnumC14207.COMMAND_FAILED;
            }
            if (c7496.f24797) {
                return EnumC14207.STATE_UNKNOWN;
            }
            return EnumC14207.COMMAND_FAILED;
        }
        if (c7496.f24797) {
            return EnumC14207.STATE_UNKNOWN;
        }
        return EnumC14207.COMMAND_FAILED;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC14207 m50134(InterfaceC24911 interfaceC24911, int i, String str, long j, C3021 c3021, C9732 c9732, C8987 c8987, C7496 c7496) {
        m50135(Math.min(8000L, Math.max(0L, (j - SystemClock.elapsedRealtime()) - 2500)), j, c3021, c9732, c8987);
        C5017 c5017M50129 = m50129(interfaceC24911, i, "enabled_accessibility_services", j, c9732, c7496);
        if (c5017M50129.f17407) {
            if (m50138((String) c5017M50129.f17406.get(0), str)) {
                return !c3021.getAsBoolean() ? EnumC14207.BIND_TIMEOUT : EnumC14207.STARTED;
            }
            return EnumC14207.ENTRY_MISSING;
        }
        if (c7496.f24797) {
            return EnumC14207.STATE_UNKNOWN;
        }
        return EnumC14207.COMMAND_FAILED;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50135(long j, long j2, C3021 c3021, C9732 c9732, C8987 c8987) {
        if (c3021.getAsBoolean()) {
            return true;
        }
        long jMin = Math.min(j2, Math.max(0L, j) + SystemClock.elapsedRealtime());
        while (SystemClock.elapsedRealtime() < jMin) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMin2 = Math.min(200L, jMin - jElapsedRealtime);
            if (jMin2 <= 0) {
                return false;
            }
            SystemClock.sleep(jMin2);
            if (c3021.getAsBoolean()) {
                return true;
            }
            if (SystemClock.elapsedRealtime() <= jElapsedRealtime) {
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5017 m50129(InterfaceC24911 interfaceC24911, int i, String str, long j, LongSupplier longSupplier, C7496 c7496) {
        return m50131(interfaceC24911, "settings get --user " + i + " secure " + str, 1, false, j, longSupplier, c7496);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5017 m50130(InterfaceC24911 interfaceC24911, int i, String str, String str2, long j, LongSupplier longSupplier, C7496 c7496) {
        StringBuilder sb = new StringBuilder("settings put --user ");
        sb.append(i);
        sb.append(" secure ");
        sb.append(str);
        sb.append(" ");
        sb.append("'" + str2.replace("'", "'\\''") + "'");
        return m50131(interfaceC24911, sb.toString(), 0, true, j, longSupplier, c7496);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5017 m50131(InterfaceC24911 interfaceC24911, String str, int i, boolean z, long j, LongSupplier longSupplier, C7496 c7496) {
        boolean z2;
        boolean z3;
        synchronized (interfaceC24911) {
            long asLong = j - longSupplier.getAsLong();
            if (asLong <= 0) {
                return new C5017(Collections.EMPTY_LIST, false);
            }
            long jMin = Math.min(2500L, asLong);
            if (z) {
                c7496.f24797 = true;
            }
            String str2 = "MT_AR_DONE:" + Long.toHexString(f71395.incrementAndGet());
            try {
                try {
                    C11484 c11484Mo6261 = interfaceC24911.mo6261(jMin, "{ " + str + "; } | while IFS= read -r mt_ar_line || [ -n \"$mt_ar_line\" ]; do print -r -- \"MT_AR_OUT:$mt_ar_line\"; done; print -r -- '" + str2 + "'");
                    String[] strArrSplit = c11484Mo6261.f36124.split("\\n", -1);
                    int length = strArrSplit.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z2 = false;
                            break;
                        }
                        if ("Read shell timeout.".equals(strArrSplit[i2].trim())) {
                            z2 = true;
                            break;
                        }
                        i2++;
                    }
                    boolean zMo6264 = interfaceC24911.mo6264();
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = c11484Mo6261.f36125;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i3 >= strArr.length) {
                            if (i4 == 1) {
                                z3 = true;
                                break;
                            }
                        } else {
                            String str3 = strArr[i3];
                            if (str2.equals(str3)) {
                                i4++;
                                if (i3 == strArr.length - 1) {
                                    i3++;
                                }
                            } else if (str3.startsWith("MT_AR_OUT:")) {
                                arrayList.add(str3.substring(10));
                                i3++;
                            }
                        }
                        z3 = false;
                        break;
                    }
                    if (z2 || !zMo6264 || (!z3 && (interfaceC24911 instanceof C1790))) {
                        try {
                            interfaceC24911.close();
                        } catch (RuntimeException unused) {
                        }
                    }
                    if (!c11484Mo6261.m28855() && z3 && arrayList.size() == i) {
                        return new C5017(arrayList, true);
                    }
                    return new C5017(Collections.EMPTY_LIST, false);
                } catch (RuntimeException unused2) {
                    return new C5017(Collections.EMPTY_LIST, false);
                }
            } catch (RuntimeException unused3) {
                interfaceC24911.close();
                return new C5017(Collections.EMPTY_LIST, false);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50138(String str, String str2) {
        ComponentName componentNameUnflattenFromString;
        if (str == null || str.isEmpty() || "null".equals(str) || (componentNameUnflattenFromString = ComponentName.unflattenFromString(str2)) == null) {
            return false;
        }
        for (String str3 : str.split(":", -1)) {
            if (!str3.isEmpty() && componentNameUnflattenFromString.equals(ComponentName.unflattenFromString(str3))) {
                return true;
            }
        }
        return false;
    }
}
