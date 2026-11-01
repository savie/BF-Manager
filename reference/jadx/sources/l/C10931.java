package l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۧۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9B2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10931 {
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057 A[Catch: all -> 0x0042, TRY_ENTER, TryCatch #0 {all -> 0x0042, blocks: (B:19:0x003e, B:32:0x0057, B:33:0x006a, B:36:0x0071, B:39:0x0078, B:42:0x0082, B:45:0x0093, B:23:0x0044, B:26:0x004b), top: B:52:0x003e, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:19:0x003e, B:32:0x0057, B:33:0x006a, B:36:0x0071, B:39:0x0078, B:42:0x0082, B:45:0x0093, B:23:0x0044, B:26:0x004b), top: B:52:0x003e, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0078 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:19:0x003e, B:32:0x0057, B:33:0x006a, B:36:0x0071, B:39:0x0078, B:42:0x0082, B:45:0x0093, B:23:0x0044, B:26:0x004b), top: B:52:0x003e, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0082 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:19:0x003e, B:32:0x0057, B:33:0x006a, B:36:0x0071, B:39:0x0078, B:42:0x0082, B:45:0x0093, B:23:0x0044, B:26:0x004b), top: B:52:0x003e, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0080 A[EDGE_INSN: B:59:0x0080->B:41:0x0080 BREAK  A[LOOP:0: B:33:0x006a->B:62:?], SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m27413(boolean z, C22219 c22219) {
        boolean zM27414;
        boolean z2;
        long jMax;
        long millis;
        boolean z3 = false;
        if (!C1468.m5114()) {
            if (c22219 != null && z) {
                C6696.m18087(c22219.f72661, EnumC17280.WAITING_BINDER);
            }
            if (!z) {
                zM27414 = C1468.m5093();
            } else {
                zM27414 = m27414();
            }
            if (zM27414) {
                if (c22219 != null) {
                    C6696.m18087(c22219.f72661, EnumC17280.WAITING_PERMISSION_OR_SERVICE);
                }
                if (m27412() == EnumC12342.GRANTED) {
                    return true;
                }
                C16575 c16575 = new C16575();
                C1468.m5101(c16575);
                try {
                    try {
                        C1468.m5106(21320);
                    } catch (RuntimeException unused) {
                        if (m27414()) {
                            try {
                                C1468.m5106(21320);
                            } catch (RuntimeException unused2) {
                                z2 = false;
                            }
                        }
                        z2 = false;
                        if (!z2) {
                            C1468.m5112(c16575);
                            return false;
                        }
                        jMax = Math.max(0L, 10000L) + TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
                        while (!c16575.m38987()) {
                            if (!c16575.m38985()) {
                                if (m27412() == EnumC12342.GRANTED) {
                                    break;
                                }
                                millis = jMax - TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
                                if (millis <= 0) {
                                }
                            }
                            C1468.m5112(c16575);
                            return z3;
                        }
                        z3 = true;
                        C1468.m5112(c16575);
                        return z3;
                    }
                    z2 = true;
                    if (!z2) {
                        C1468.m5112(c16575);
                        return false;
                    }
                    jMax = Math.max(0L, 10000L) + TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
                    while (!c16575.m38987()) {
                        if (!c16575.m38985()) {
                            if (m27412() == EnumC12342.GRANTED) {
                                break;
                                break;
                            }
                            millis = jMax - TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
                            if (millis <= 0 && c16575.m38986(Math.min(Math.max(1L, 200L), millis))) {
                            }
                        }
                        C1468.m5112(c16575);
                        return z3;
                    }
                    z3 = true;
                    C1468.m5112(c16575);
                    return z3;
                } catch (Throwable th) {
                    C1468.m5112(c16575);
                    throw th;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC12342 m27412() {
        try {
            if (C1468.m5109() == 0) {
                return EnumC12342.GRANTED;
            }
            return EnumC12342.REQUESTABLE;
        } catch (RuntimeException unused) {
            return C1468.m5093() ? EnumC12342.REQUESTABLE : EnumC12342.NOT_READY;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m27414() {
        long jMax = Math.max(0L, 5000L) + TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        while (!C1468.m5093()) {
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
