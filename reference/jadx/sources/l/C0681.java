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

/* JADX INFO: renamed from: l.֡᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 9B2H */
/* JADX INFO: loaded from: classes.dex */
public final class C0681 {

    /* JADX INFO: renamed from: ᩺ܶ۫, reason: not valid java name and contains not printable characters */
    private static final short[] f2577;

    static {
        ApplicationC23172.m52091(8);
        f2577 = new short[]{6487, -21333, -21328, -21317, -21328};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native void m2964(AbstractC2720 abstractC2720, CharSequence charSequence, String str, C23056 c23056, C7239 c7239);

    /* JADX WARN: Code duplicated, block: B:143:0x0582 A[PHI: r17 r20 r21 r22
      0x0582: PHI (r17v53 int) = (r17v10 int), (r17v11 int), (r17v13 int), (r17v56 int) binds: [B:142:0x0580, B:138:0x0558, B:130:0x0507, B:11:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0582: PHI (r20v48 l.᩷ۨᩴ) = (r20v5 l.᩷ۨᩴ), (r20v6 l.᩷ۨᩴ), (r20v8 l.᩷ۨᩴ), (r20v51 l.᩷ۨᩴ) binds: [B:142:0x0580, B:138:0x0558, B:130:0x0507, B:11:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0582: PHI (r21v44 l.᩷ۨᩴ) = (r21v3 l.᩷ۨᩴ), (r21v4 l.᩷ۨᩴ), (r21v6 l.᩷ۨᩴ), (r21v47 l.᩷ۨᩴ) binds: [B:142:0x0580, B:138:0x0558, B:130:0x0507, B:11:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0582: PHI (r22v37 java.lang.Throwable) = (r22v3 java.lang.Throwable), (r22v4 java.lang.Throwable), (r22v6 java.lang.Throwable), (r22v40 java.lang.Throwable) binds: [B:142:0x0580, B:138:0x0558, B:130:0x0507, B:11:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:147:0x05be A[PHI: r17 r20 r21 r22
      0x05be: PHI (r17v51 int) = (r17v9 int), (r17v12 int), (r17v52 int) binds: [B:146:0x05bc, B:134:0x0530, B:14:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x05be: PHI (r20v46 l.᩷ۨᩴ) = (r20v4 l.᩷ۨᩴ), (r20v7 l.᩷ۨᩴ), (r20v47 l.᩷ۨᩴ) binds: [B:146:0x05bc, B:134:0x0530, B:14:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x05be: PHI (r21v42 l.᩷ۨᩴ) = (r21v2 l.᩷ۨᩴ), (r21v5 l.᩷ۨᩴ), (r21v43 l.᩷ۨᩴ) binds: [B:146:0x05bc, B:134:0x0530, B:14:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x05be: PHI (r22v35 java.lang.Throwable) = (r22v2 java.lang.Throwable), (r22v5 java.lang.Throwable), (r22v36 java.lang.Throwable) binds: [B:146:0x05bc, B:134:0x0530, B:14:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0086, code lost:
    
        if (l.C1519.f5300 < 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0088, code lost:
    
        r22 = r4;
        r21 = r5;
        r20 = r8;
        r17 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
    
        if (l.C23916.m53419() == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0117, code lost:
    
        if (l.C4238.f15451 >= 0) goto L33;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m2962(l.AbstractC2720 r25, java.lang.CharSequence r26, final java.lang.String r27, final int r28, int r29, java.util.List r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0681.m2962(l.ۖܰ᩸, java.lang.CharSequence, java.lang.String, int, int, java.util.List):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2966(C5630 c5630, CharSequence charSequence, String str, int i) throws IOException {
        m2959(c5630, charSequence, str, i, (List) null, (C7239) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2959(OutputStream outputStream, CharSequence charSequence, String str, int i, List list, C7239 c7239) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, C2448.m8272(i)));
        try {
            if (i == C2448.f7861) {
                outputStream.write(new byte[]{-17, -69, -65});
            } else if (i == C2448.f7858) {
                outputStream.write(new byte[]{-2, -1});
            } else if (i == C2448.f7859) {
                outputStream.write(new byte[]{-1, -2});
            } else if (i == C2448.f7857) {
                outputStream.write(new byte[]{0, 0, -2, -1});
            } else if (i == C2448.f7864) {
                outputStream.write(new byte[]{-1, -2, 0, 0});
            }
            C21564 c21564 = new C21564(bufferedWriter, str);
            if (c7239 != null) {
                c7239.m19855(c21564);
            } else if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(((AbstractC22044) it.next()).mo4290());
                    try {
                        C5125.m15497(gZIPInputStream, c21564, StandardCharsets.UTF_8);
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
                    c21564.write(charSequence.charAt(i2));
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
    public static void m2961(String str, int i, List list, AbstractC22044 abstractC22044) throws IOException {
        C18580 c18580 = new C18580(abstractC22044.mo4289(false));
        C9982 c9982 = c18580.f60359;
        m2959(c18580, (CharSequence) null, str, i, list, (C7239) null);
        if (c9982.f32081 != 0) {
            MessageDigest messageDigestM36174 = C15022.m36174();
            messageDigestM36174.update(c9982.f32079, 0, c9982.f32081);
            C5002.m15230(C15022.m36182(messageDigestM36174.digest()), C2448.m8274(i));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2963(AbstractC2720 abstractC2720, CharSequence charSequence, String str, C23056 c23056) {
        m2964(abstractC2720, charSequence, str, c23056, (C7239) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2965(AbstractC2720 abstractC2720, String str, C23056 c23056, C7239 c7239) {
        m2964(abstractC2720, (CharSequence) null, str, c23056, c7239);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2960(CharSequence charSequence, String str, C23056 c23056, C7239 c7239, AbstractC22044 abstractC22044) throws IOException {
        C18580 c18580 = new C18580(abstractC22044.mo4289(false));
        C9982 c9982 = c18580.f60359;
        m2959(c18580, charSequence, str, c23056.f74803, (List) null, c7239);
        if (c9982.f32081 != 0) {
            MessageDigest messageDigestM36174 = C15022.m36174();
            messageDigestM36174.update(c9982.f32079, 0, c9982.f32081);
            C5002.m15230(C15022.m36182(messageDigestM36174.digest()), C2448.m8274(c23056.f74803));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2967(AbstractC22044 abstractC22044, CharSequence charSequence, String str, int i) {
        C15508 c15508Mo15337 = charSequence instanceof InterfaceC9629 ? ((InterfaceC9629) charSequence).mo15337() : null;
        CharSequence charSequence2 = c15508Mo15337 == null ? charSequence : c15508Mo15337;
        try {
            abstractC22044.mo49834();
            abstractC22044.mo2938(new C14850(charSequence2, str, i, C14584.m35212(abstractC22044) && !abstractC22044.mo2934(), abstractC22044)).m43134();
            if (c15508Mo15337 != null) {
                c15508Mo15337.close();
            }
        } catch (Throwable th) {
            if (c15508Mo15337 != null) {
                try {
                    c15508Mo15337.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m2969(AbstractC22044 abstractC22044, CharSequence charSequence, String str, int i) {
        C15508 c15508Mo15337 = charSequence instanceof InterfaceC9629 ? ((InterfaceC9629) charSequence).mo15337() : null;
        try {
            m2959(abstractC22044.mo4289(false), c15508Mo15337 == null ? charSequence : c15508Mo15337, str, i, (List) null, (C7239) null);
            if (c15508Mo15337 != null) {
                c15508Mo15337.close();
            }
        } catch (Throwable th) {
            if (c15508Mo15337 != null) {
                try {
                    c15508Mo15337.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m2958(CharSequence charSequence) {
        if (!(charSequence instanceof C15508)) {
            return charSequence.toString();
        }
        C15508 c15508 = (C15508) charSequence;
        return c15508.subSequence(0, c15508.length());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2968(AbstractC22044 abstractC22044, String str, int i, C7239 c7239) {
        m2959(abstractC22044.mo4289(false), (CharSequence) null, str, i, (List) null, c7239);
    }
}
