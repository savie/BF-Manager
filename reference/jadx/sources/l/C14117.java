package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.۬᩷ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes4.dex */
public final class C14117 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C7406 f44639 = new C7406("UNDEFINED");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C7406 f44638 = new C7406("REUSABLE_CLAIMED");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String m34276(String str) {
        int i = C4840.f16902;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int m34279() {
        return C4840.m14869();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m34274(int i, int i2, String str) {
        return (int) m34275(str, i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064 A[PHI: r14
      0x0064: PHI (r14v2 long) = (r14v1 long), (r14v7 long) binds: [B:27:0x0056, B:31:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0072 A[LOOP:0: B:22:0x003e->B:36:0x0072, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x007c A[EDGE_INSN: B:38:0x007c->B:40:0x0086 BREAK  A[LOOP:0: B:22:0x003e->B:36:0x0072]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0081 A[EDGE_INSN: B:39:0x0081->B:40:0x0086 BREAK  A[LOOP:0: B:22:0x003e->B:36:0x0072]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0070 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final long m34275(String str, long j, long j2, long j3) {
        Long lValueOf;
        int i;
        boolean z;
        long j4;
        long j5;
        int i2;
        int iDigit;
        long j6;
        long j7;
        long j8;
        String strM34276 = m34276(str);
        if (strM34276 == null) {
            return j;
        }
        int length = strM34276.length();
        if (length != 0) {
            int i3 = 0;
            char cCharAt = strM34276.charAt(0);
            long j9 = -9223372036854775807L;
            if (cCharAt >= '0') {
                i = i3;
                z = false;
                j4 = 0;
                j5 = -256204778801521550L;
                while (true) {
                    if (i >= length) {
                        if (!z) {
                            lValueOf = Long.valueOf(-j4);
                            break;
                        }
                        lValueOf = Long.valueOf(j4);
                        break;
                    }
                    i2 = length;
                    iDigit = Character.digit((int) strM34276.charAt(i), 10);
                    if (iDigit >= 0) {
                        if (j4 >= j5) {
                            j6 = j5;
                            j7 = j4 * ((long) 10);
                            j8 = iDigit;
                            if (j7 < j9 + j8) {
                                j4 = j7 - j8;
                                i++;
                                length = i2;
                                j5 = j6;
                            }
                        } else if (j5 == -256204778801521550L) {
                            j5 = j9 / ((long) 10);
                            if (j4 >= j5) {
                                j6 = j5;
                                j7 = j4 * ((long) 10);
                                j8 = iDigit;
                                if (j7 < j9 + j8) {
                                    j4 = j7 - j8;
                                    i++;
                                    length = i2;
                                    j5 = j6;
                                }
                            }
                        }
                    }
                }
            } else {
                z = true;
                if (length != 1) {
                    if (cCharAt == '+') {
                        i3 = 1;
                        i = i3;
                        z = false;
                        j4 = 0;
                        j5 = -256204778801521550L;
                        while (true) {
                            if (i >= length) {
                                if (!z) {
                                    lValueOf = Long.valueOf(-j4);
                                    break;
                                }
                                lValueOf = Long.valueOf(j4);
                                break;
                            }
                            i2 = length;
                            iDigit = Character.digit((int) strM34276.charAt(i), 10);
                            if (iDigit >= 0) {
                                if (j4 >= j5) {
                                    j6 = j5;
                                    j7 = j4 * ((long) 10);
                                    j8 = iDigit;
                                    if (j7 < j9 + j8) {
                                        j4 = j7 - j8;
                                        i++;
                                        length = i2;
                                        j5 = j6;
                                    }
                                } else if (j5 == -256204778801521550L) {
                                    j5 = j9 / ((long) 10);
                                    if (j4 >= j5) {
                                        j6 = j5;
                                        j7 = j4 * ((long) 10);
                                        j8 = iDigit;
                                        if (j7 < j9 + j8) {
                                            j4 = j7 - j8;
                                            i++;
                                            length = i2;
                                            j5 = j6;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (cCharAt == '-') {
                        j9 = Long.MIN_VALUE;
                        i = 1;
                        j4 = 0;
                        j5 = -256204778801521550L;
                        while (true) {
                            if (i >= length) {
                                if (!z) {
                                    lValueOf = Long.valueOf(-j4);
                                    break;
                                }
                                lValueOf = Long.valueOf(j4);
                                break;
                            }
                            i2 = length;
                            iDigit = Character.digit((int) strM34276.charAt(i), 10);
                            if (iDigit >= 0) {
                                if (j4 >= j5) {
                                    j6 = j5;
                                    j7 = j4 * ((long) 10);
                                    j8 = iDigit;
                                    if (j7 < j9 + j8) {
                                        j4 = j7 - j8;
                                        i++;
                                        length = i2;
                                        j5 = j6;
                                    }
                                } else if (j5 == -256204778801521550L) {
                                    j5 = j9 / ((long) 10);
                                    if (j4 >= j5) {
                                        j6 = j5;
                                        j7 = j4 * ((long) 10);
                                        j8 = iDigit;
                                        if (j7 < j9 + j8) {
                                            j4 = j7 - j8;
                                            i++;
                                            length = i2;
                                            j5 = j6;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            lValueOf = null;
            break;
        } else {
            lValueOf = null;
            break;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (j2 <= jLongValue && jLongValue <= j3) {
                return jLongValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strM34276 + '\'').toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m34278(Object obj, InterfaceC4825 interfaceC4825) {
        if (!(interfaceC4825 instanceof C25307)) {
            interfaceC4825.mo8188(obj);
            return;
        }
        C25307 c25307 = (C25307) interfaceC4825;
        AbstractC18951 abstractC18951 = c25307.f81754;
        AbstractC6317 abstractC6317 = c25307.f81753;
        Throwable thM51055 = C22660.m51055(obj);
        Object c12238 = thM51055 == null ? obj : new C12238(thM51055, false);
        abstractC6317.getContext();
        if (abstractC18951.mo42813()) {
            c25307.f81752 = c12238;
            c25307.f41495 = 1;
            abstractC18951.mo11210(abstractC6317.getContext(), c25307);
            return;
        }
        AbstractC16670 abstractC16670M52769 = C23580.m52769();
        if (abstractC16670M52769.m39382()) {
            c25307.f81752 = c12238;
            c25307.f41495 = 1;
            abstractC16670M52769.m39383((AbstractC12941) c25307);
            return;
        }
        abstractC16670M52769.m39384(true);
        try {
            InterfaceC9211 interfaceC9211 = (InterfaceC9211) abstractC6317.getContext().mo5005(InterfaceC9211.f30029);
            if (interfaceC9211 == null || interfaceC9211.mo24383()) {
                Object obj2 = c25307.f81755;
                InterfaceC11536 context = abstractC6317.getContext();
                Object objM45511 = C19756.m45511(context, obj2);
                C20596 c20596M42354 = objM45511 != C19756.f63579 ? C18205.m42354(abstractC6317, context) : null;
                try {
                    abstractC6317.mo8188(obj);
                    C11471 c11471 = C11471.f36082;
                    if (c20596M42354 != null) {
                        c20596M42354.m47185();
                        throw null;
                    }
                    C19756.m45510(context, objM45511);
                } catch (Throwable th) {
                    if (c20596M42354 != null) {
                        c20596M42354.m47185();
                        throw null;
                    }
                    C19756.m45510(context, objM45511);
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionMo24384 = interfaceC9211.mo24384();
                c25307.mo32327(c12238, cancellationExceptionMo24384);
                c25307.mo8188(C19676.m45347((Throwable) cancellationExceptionMo24384));
            }
            while (abstractC16670M52769.m39387()) {
            }
        } catch (Throwable th2) {
            try {
                c25307.m32328(th2, (Throwable) null);
            } finally {
                abstractC16670M52769.m39386();
            }
        }
    }
}
