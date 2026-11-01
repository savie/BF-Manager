package l;

import bin.mt.plus.R;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: l.۫ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1W7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12379 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f41373;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C14164 f41374;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C8479 f41375;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30795(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746, InterfaceC17379 interfaceC17379) {
        C2455 c2455 = new C2455(abstractC20745);
        try {
            if (c2455.m7465()) {
                throw new C4987(R.string.MT_Protector);
            }
            ArrayList<C12107> arrayList = new ArrayList();
            boolean z = false;
            long jM30138 = 0;
            for (C12107 c12107 : c2455.m7466()) {
                if (m30796(c12107.m30135())) {
                    jM30138 += c12107.m30138();
                    arrayList.add(c12107);
                } else {
                    z = true;
                }
            }
            if (z) {
                C22918 c22918 = new C22918(abstractC20746);
                try {
                    c22918.m50718();
                    C1088 c1088 = new C1088(jM30138, interfaceC17379);
                    byte[] bArr = new byte[UMModuleRegister.PUSH_EVENT_VALUE_HIGH];
                    for (C12107 c12108 : arrayList) {
                        if (c22918.m50731(c12108)) {
                            c1088.m4090(c12108.m30138());
                        } else {
                            c22918.m50735(c12108);
                            C5984 c5984M7469 = c2455.m7469(c12108);
                            while (true) {
                                int i = c5984M7469.read(bArr);
                                if (i <= 0) {
                                    break;
                                }
                                c22918.m50723(i, bArr);
                                c1088.m4089(i);
                                if (interfaceC17379 != null && interfaceC17379.mo2357()) {
                                    c22918.close();
                                    c2455.close();
                                    return;
                                }
                            }
                        }
                    }
                    c22918.close();
                } catch (Throwable th) {
                    try {
                        c22918.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                OutputStream outputStreamMo33976 = abstractC20746.mo33976(false);
                try {
                    InterfaceC7739 interfaceC7739M7467 = c2455.m7467();
                    interfaceC7739M7467.seek(0L);
                    C1088 c1089 = new C1088(interfaceC7739M7467.length(), interfaceC17379);
                    byte[] bArr2 = new byte[UMModuleRegister.PUSH_EVENT_VALUE_HIGH];
                    while (true) {
                        int i2 = interfaceC7739M7467.read(bArr2);
                        if (i2 != -1) {
                            outputStreamMo33976.write(bArr2, 0, i2);
                            c1089.m4089(i2);
                            if (interfaceC17379 != null && interfaceC17379.mo2357()) {
                                outputStreamMo33976.close();
                                c2455.close();
                                return;
                            }
                        } else {
                            if (outputStreamMo33976 == null) {
                                break;
                            }
                            outputStreamMo33976.close();
                            break;
                        }
                        try {
                            c2455.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    if (outputStreamMo33976 != null) {
                        try {
                            outputStreamMo33976.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                    }
                    throw th4;
                }
            }
            c2455.close();
        } catch (Throwable th6) {
            c2455.close();
            throw th6;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x020e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x021d */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m30794(l.AbstractC20745 r22, l.AbstractC20745 r23, l.AbstractC17131 r24, java.lang.String r25, boolean r26, boolean r27, final l.InterfaceC17379 r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12379.m30794(l.᩷۠ۚ, l.᩷۠ۚ, l.ܿۚۖ, java.lang.String, boolean, boolean, l.ܿܰۖ):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30796(String str) {
        if (str.endsWith("/")) {
            return false;
        }
        if (!str.startsWith("META-INF/")) {
            return true;
        }
        boolean z = str.indexOf(47, 9) != -1;
        String lowerCase = str.substring(9).toLowerCase(Locale.US);
        return ("manifest.mf".equals(lowerCase) || lowerCase.endsWith(".sf") || lowerCase.endsWith(".rsa") || lowerCase.endsWith(".dsa") || lowerCase.endsWith(".ec") || (lowerCase.startsWith("sig-") && !z)) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30793(EnumC9619 enumC9619) {
        int i = C0383.f1862[enumC9619.ordinal()];
        if (i == 1) {
            return "SHA1-Digest";
        }
        if (i == 2) {
            return "SHA-256-Digest";
        }
        throw new IllegalArgumentException("Unexpected content digest algorithm: " + enumC9619);
    }
}
