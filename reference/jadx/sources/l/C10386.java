package l;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۤܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9B2H */
/* JADX INFO: loaded from: classes.dex */
public final class C10386 {

    /* JADX INFO: renamed from: ᩻᩹֡, reason: not valid java name and contains not printable characters */
    private static final short[] f35564;

    static {
        ApplicationC6132.m17119(IShizukuService.Stub.TRANSACTION_updateFlagsForUid);
        f35564 = new short[]{6011, 7873, 7898, 7889, 7898};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native void m26281(AbstractC12648 abstractC12648, CharSequence charSequence, String str, C2063 c2063, C1979 c1979);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26278(C2141 c2141, CharSequence charSequence, String str, int i) throws IOException {
        m26275(c2141, charSequence, str, i, (List) null, (C1979) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26275(OutputStream outputStream, CharSequence charSequence, String str, int i, List list, C1979 c1979) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, C22037.m48953(i)));
        try {
            if (i == C22037.f71431) {
                outputStream.write(new byte[]{-17, -69, -65});
            } else if (i == C22037.f71428) {
                outputStream.write(new byte[]{-2, -1});
            } else if (i == C22037.f71432) {
                outputStream.write(new byte[]{-1, -2});
            } else if (i == C22037.f71429) {
                outputStream.write(new byte[]{0, 0, -2, -1});
            } else if (i == C22037.f71430) {
                outputStream.write(new byte[]{-1, -2, 0, 0});
            }
            C19558 c19558 = new C19558(bufferedWriter, str);
            if (c1979 != null) {
                c1979.m6392(c19558);
            } else if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(((AbstractC20745) it.next()).mo33970());
                    try {
                        C20010.m45302(gZIPInputStream, c19558, StandardCharsets.UTF_8);
                        gZIPInputStream.close();
                    } catch (Throwable th) {
                        try {
                            gZIPInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            } else {
                int length = charSequence.length();
                for (int i2 = 0; i2 < length; i2++) {
                    c19558.write(charSequence.charAt(i2));
                }
            }
            bufferedWriter.close();
        } catch (Throwable th3) {
            try {
                bufferedWriter.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26277(String str, int i, List list, AbstractC20745 abstractC20745) throws IOException {
        C8975 c8975 = new C8975(abstractC20745.mo33976(false));
        C19551 c19551 = c8975.f30732;
        m26275(c8975, (CharSequence) null, str, i, list, (C1979) null);
        if (c19551.f62830 != 0) {
            MessageDigest messageDigestM49416 = C22253.m49416();
            messageDigestM49416.update(c19551.f62829, 0, c19551.f62830);
            C11859.m29554(C22253.m49424(messageDigestM49416.digest()), C22037.m48955(i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:139:0x054a A[PHI: r17 r20 r21 r22
      0x054a: PHI (r17v55 int) = (r17v18 int), (r17v21 int), (r17v56 int) binds: [B:138:0x0548, B:130:0x04e6, B:20:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x054a: PHI (r20v49 l.᩷۠ۚ) = (r20v10 l.᩷۠ۚ), (r20v13 l.᩷۠ۚ), (r20v50 l.᩷۠ۚ) binds: [B:138:0x0548, B:130:0x04e6, B:20:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x054a: PHI (r21v44 l.᩷۠ۚ) = (r21v8 l.᩷۠ۚ), (r21v11 l.᩷۠ۚ), (r21v45 l.᩷۠ۚ) binds: [B:138:0x0548, B:130:0x04e6, B:20:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x054a: PHI (r22v37 java.lang.Throwable) = (r22v8 java.lang.Throwable), (r22v11 java.lang.Throwable), (r22v38 java.lang.Throwable) binds: [B:138:0x0548, B:130:0x04e6, B:20:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:143:0x0587 A[PHI: r11 r17 r20 r21 r22
      0x0587: PHI (r11v2 short) = (r11v1 short), (r11v3 short) binds: [B:142:0x0585, B:122:0x0480] A[DONT_GENERATE, DONT_INLINE]
      0x0587: PHI (r17v23 int) = (r17v17 int), (r17v24 int) binds: [B:142:0x0585, B:122:0x0480] A[DONT_GENERATE, DONT_INLINE]
      0x0587: PHI (r20v15 l.᩷۠ۚ) = (r20v9 l.᩷۠ۚ), (r20v16 l.᩷۠ۚ) binds: [B:142:0x0585, B:122:0x0480] A[DONT_GENERATE, DONT_INLINE]
      0x0587: PHI (r21v13 l.᩷۠ۚ) = (r21v7 l.᩷۠ۚ), (r21v14 l.᩷۠ۚ) binds: [B:142:0x0585, B:122:0x0480] A[DONT_GENERATE, DONT_INLINE]
      0x0587: PHI (r22v13 java.lang.Throwable) = (r22v7 java.lang.Throwable), (r22v14 java.lang.Throwable) binds: [B:142:0x0585, B:122:0x0480] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:155:0x063b A[PHI: r12 r17 r20 r21 r22
      0x063b: PHI (r12v2 int) = (r12v1 int), (r12v1 int), (r12v3 int) binds: [B:28:0x00e9, B:154:0x0639, B:118:0x0454] A[DONT_GENERATE, DONT_INLINE]
      0x063b: PHI (r17v25 int) = (r17v7 int), (r17v13 int), (r17v26 int) binds: [B:28:0x00e9, B:154:0x0639, B:118:0x0454] A[DONT_GENERATE, DONT_INLINE]
      0x063b: PHI (r20v17 l.᩷۠ۚ) = (r20v0 l.᩷۠ۚ), (r20v5 l.᩷۠ۚ), (r20v18 l.᩷۠ۚ) binds: [B:28:0x00e9, B:154:0x0639, B:118:0x0454] A[DONT_GENERATE, DONT_INLINE]
      0x063b: PHI (r21v15 l.᩷۠ۚ) = (r21v0 l.᩷۠ۚ), (r21v3 l.᩷۠ۚ), (r21v16 l.᩷۠ۚ) binds: [B:28:0x00e9, B:154:0x0639, B:118:0x0454] A[DONT_GENERATE, DONT_INLINE]
      0x063b: PHI (r22v15 java.lang.Throwable) = (r22v0 java.lang.Throwable), (r22v3 java.lang.Throwable), (r22v16 java.lang.Throwable) binds: [B:28:0x00e9, B:154:0x0639, B:118:0x0454] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d1, code lost:
    
        if (l.C1066.f4915 <= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d3, code lost:
    
        r22 = r4;
        r21 = r5;
        r20 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fc, code lost:
    
        if (l.C1148.f5161 > 0) goto L31;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m26279(l.AbstractC12648 r25, java.lang.CharSequence r26, final java.lang.String r27, final int r28, int r29, java.util.List r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10386.m26279(l.۫᩷ۖ, java.lang.CharSequence, java.lang.String, int, int, java.util.List):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26280(AbstractC12648 abstractC12648, CharSequence charSequence, String str, C2063 c2063) {
        m26281(abstractC12648, charSequence, str, c2063, (C1979) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26282(AbstractC12648 abstractC12648, String str, C2063 c2063, C1979 c1979) {
        m26281(abstractC12648, (CharSequence) null, str, c2063, c1979);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26276(CharSequence charSequence, String str, C2063 c2063, C1979 c1979, AbstractC20745 abstractC20745) throws IOException {
        C8975 c8975 = new C8975(abstractC20745.mo33976(false));
        C19551 c19551 = c8975.f30732;
        m26275(c8975, charSequence, str, c2063.f7652, (List) null, c1979);
        if (c19551.f62830 != 0) {
            MessageDigest messageDigestM49416 = C22253.m49416();
            messageDigestM49416.update(c19551.f62829, 0, c19551.f62830);
            C11859.m29554(C22253.m49424(messageDigestM49416.digest()), C22037.m48955(c2063.f7652));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26283(AbstractC20745 abstractC20745, CharSequence charSequence, String str, int i) {
        C3329 c3329Mo2398 = charSequence instanceof InterfaceC0507 ? ((InterfaceC0507) charSequence).mo2398() : null;
        CharSequence charSequence2 = c3329Mo2398 == null ? charSequence : c3329Mo2398;
        try {
            abstractC20745.mo46720();
            abstractC20745.mo8444(new C8269(charSequence2, str, i, C5553.m15331(abstractC20745) && !abstractC20745.mo33975(), abstractC20745)).m11099();
            if (c3329Mo2398 != null) {
                c3329Mo2398.close();
            }
        } catch (Throwable th) {
            if (c3329Mo2398 != null) {
                try {
                    c3329Mo2398.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m26285(AbstractC20745 abstractC20745, CharSequence charSequence, String str, int i) {
        C3329 c3329Mo2398 = charSequence instanceof InterfaceC0507 ? ((InterfaceC0507) charSequence).mo2398() : null;
        try {
            m26275(abstractC20745.mo33976(false), c3329Mo2398 == null ? charSequence : c3329Mo2398, str, i, (List) null, (C1979) null);
            if (c3329Mo2398 != null) {
                c3329Mo2398.close();
            }
        } catch (Throwable th) {
            if (c3329Mo2398 != null) {
                try {
                    c3329Mo2398.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m26274(CharSequence charSequence) {
        if (!(charSequence instanceof C3329)) {
            return charSequence.toString();
        }
        C3329 c3329 = (C3329) charSequence;
        return c3329.subSequence(0, c3329.length());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26284(AbstractC20745 abstractC20745, String str, int i, C1979 c1979) {
        m26275(abstractC20745.mo33976(false), (CharSequence) null, str, i, (List) null, c1979);
    }
}
