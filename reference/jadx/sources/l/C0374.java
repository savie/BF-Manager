package l;

import bin.mt.plus.R;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: l.֡ۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: L1W7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0374 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f1903;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C13680 f1904;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C19967 f1905;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2170(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045, InterfaceC8161 interfaceC8161) {
        C22941 c22941 = new C22941(abstractC22044);
        try {
            if (c22941.m51741()) {
                throw new C4866(R.string.MT_Protector);
            }
            ArrayList<C8002> arrayList = new ArrayList();
            boolean z = false;
            long jM21838 = 0;
            for (C8002 c8002 : c22941.m51742()) {
                if (m2172(c8002.m21848())) {
                    jM21838 += c8002.m21838();
                    arrayList.add(c8002);
                } else {
                    z = true;
                }
            }
            if (z) {
                C25179 c25179 = new C25179(abstractC22045);
                try {
                    c25179.m56130();
                    C15289 c15289 = new C15289(jM21838, interfaceC8161);
                    byte[] bArr = new byte[UMModuleRegister.PUSH_EVENT_VALUE_HIGH];
                    for (C8002 c8003 : arrayList) {
                        if (c25179.m56131(c8003)) {
                            c15289.m36691(c8003.m21838());
                        } else {
                            c25179.m56137(c8003);
                            C10260 c10260M51748 = c22941.m51748(c8003);
                            while (true) {
                                int i = c10260M51748.read(bArr);
                                if (i <= 0) {
                                    break;
                                }
                                c25179.m56122(i, bArr);
                                c15289.m36690(i);
                                if (interfaceC8161 != null && interfaceC8161.mo924()) {
                                    c25179.close();
                                    c22941.close();
                                    return;
                                }
                            }
                        }
                    }
                    c25179.close();
                } catch (Throwable th) {
                    try {
                        c25179.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                OutputStream outputStreamMo4289 = abstractC22045.mo4289(false);
                try {
                    InterfaceC17713 interfaceC17713M51735 = c22941.m51735();
                    interfaceC17713M51735.seek(0L);
                    C15289 c152810 = new C15289(interfaceC17713M51735.length(), interfaceC8161);
                    byte[] bArr2 = new byte[UMModuleRegister.PUSH_EVENT_VALUE_HIGH];
                    while (true) {
                        int i2 = interfaceC17713M51735.read(bArr2);
                        if (i2 != -1) {
                            outputStreamMo4289.write(bArr2, 0, i2);
                            c152810.m36690(i2);
                            if (interfaceC8161 != null && interfaceC8161.mo924()) {
                                outputStreamMo4289.close();
                                c22941.close();
                                return;
                            }
                        } else {
                            if (outputStreamMo4289 == null) {
                                break;
                            }
                            outputStreamMo4289.close();
                            break;
                        }
                        try {
                            c22941.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    if (outputStreamMo4289 != null) {
                        try {
                            outputStreamMo4289.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                    }
                    throw th4;
                }
            }
            c22941.close();
        } catch (Throwable th6) {
            c22941.close();
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
    public static void m2171(l.AbstractC22044 r22, l.AbstractC22044 r23, l.AbstractC14806 r24, java.lang.String r25, boolean r26, boolean r27, final l.InterfaceC8161 r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0374.m2171(l.᩷ۨᩴ, l.᩷ۨᩴ, l.ܰᩴ᩸, java.lang.String, boolean, boolean, l.۟᩷᩸):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m2172(String str) {
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
    public static String m2169(EnumC8906 enumC8906) {
        int i = C21257.f67819[enumC8906.ordinal()];
        if (i == 1) {
            return "SHA1-Digest";
        }
        if (i == 2) {
            return "SHA-256-Digest";
        }
        throw new IllegalArgumentException("Unexpected content digest algorithm: " + enumC8906);
    }
}
