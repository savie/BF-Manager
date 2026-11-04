package l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۚۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9B2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5476 {
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057 A[Catch: all -> 0x0042, TRY_ENTER, TryCatch #0 {all -> 0x0042, blocks: (B:19:0x003e, B:32:0x0057, B:33:0x006a, B:36:0x0071, B:39:0x0078, B:42:0x0082, B:45:0x0093, B:23:0x0044, B:26:0x004b), top: B:52:0x003e, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:19:0x003e, B:32:0x0057, B:33:0x006a, B:36:0x0071, B:39:0x0078, B:42:0x0082, B:45:0x0093, B:23:0x0044, B:26:0x004b), top: B:52:0x003e, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0078 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:19:0x003e, B:32:0x0057, B:33:0x006a, B:36:0x0071, B:39:0x0078, B:42:0x0082, B:45:0x0093, B:23:0x0044, B:26:0x004b), top: B:52:0x003e, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0082 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:19:0x003e, B:32:0x0057, B:33:0x006a, B:36:0x0071, B:39:0x0078, B:42:0x0082, B:45:0x0093, B:23:0x0044, B:26:0x004b), top: B:52:0x003e, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0080 A[EDGE_INSN: B:59:0x0080->B:41:0x0080 BREAK  A[LOOP:0: B:33:0x006a->B:62:?], SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m16301(boolean z, C14467 c14467) {
        boolean zM16302;
        boolean z2;
        long jMax;
        long millis;
        boolean z3 = false;
        if (!C12797.m31698()) {
            if (c14467 != null && z) {
                C7756.m21100(c14467.f45526, EnumC15170.WAITING_BINDER);
            }
            if (!z) {
                zM16302 = C12797.m31697();
            } else {
                zM16302 = m16302();
            }
            if (zM16302) {
                if (c14467 != null) {
                    C7756.m21100(c14467.f45526, EnumC15170.WAITING_PERMISSION_OR_SERVICE);
                }
                if (m16300() == EnumC19646.GRANTED) {
                    return true;
                }
                C22630 c22630 = new C22630();
                C12797.m31690(c22630);
                try {
                    try {
                        C12797.m31695(21320);
                    } catch (RuntimeException unused) {
                        if (m16302()) {
                            try {
                                C12797.m31695(21320);
                            } catch (RuntimeException unused2) {
                                z2 = false;
                            }
                        }
                        z2 = false;
                        if (!z2) {
                            C12797.m31703(c22630);
                            return false;
                        }
                        jMax = Math.max(0L, 10000L) + TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
                        while (!c22630.m50986()) {
                            if (!c22630.m50984()) {
                                if (m16300() == EnumC19646.GRANTED) {
                                    break;
                                }
                                millis = jMax - TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
                                if (millis <= 0) {
                                }
                            }
                            C12797.m31703(c22630);
                            return z3;
                        }
                        z3 = true;
                        C12797.m31703(c22630);
                        return z3;
                    }
                    z2 = true;
                    if (!z2) {
                        C12797.m31703(c22630);
                        return false;
                    }
                    jMax = Math.max(0L, 10000L) + TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
                    while (!c22630.m50986()) {
                        if (!c22630.m50984()) {
                            if (m16300() == EnumC19646.GRANTED) {
                                break;
                                break;
                            }
                            millis = jMax - TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
                            if (millis <= 0 && c22630.m50985(Math.min(Math.max(1L, 200L), millis))) {
                            }
                        }
                        C12797.m31703(c22630);
                        return z3;
                    }
                    z3 = true;
                    C12797.m31703(c22630);
                    return z3;
                } catch (Throwable th) {
                    C12797.m31703(c22630);
                    throw th;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC19646 m16300() {
        try {
            if (C12797.m31700() == 0) {
                return EnumC19646.GRANTED;
            }
            return EnumC19646.REQUESTABLE;
        } catch (RuntimeException unused) {
            return C12797.m31697() ? EnumC19646.REQUESTABLE : EnumC19646.NOT_READY;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m16302() {
        long jMax = Math.max(0L, 5000L) + TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        while (!C12797.m31697()) {
            long millis = jMax - TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
            if (millis <= 0) {
                return false;
            }
            try {
                Thread.sleep(Math.min(Math.max(1L, 200L), millis));
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        return true;
    }
}
