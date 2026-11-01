package l;

import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 819Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C16674 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] f53442;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f53443;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] f53444;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] f53445;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f53446;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C20202 f53447;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C20202 m39139(InterfaceC5614 interfaceC5614) {
        C20202 c20202 = this.f53447;
        if (c20202 != null) {
            return c20202;
        }
        try {
            C20202 c20202M39135 = m39135(C11965.m29777(interfaceC5614));
            this.f53447 = c20202M39135;
            return c20202M39135;
        } catch (IOException e) {
            this.f53447 = new C20202();
            throw e;
        }
    }

    public C16674(AbstractC20745 abstractC20745, boolean z) throws IOException {
        byte[] bArr;
        this.f53443 = abstractC20745;
        byte[] bArrM3416 = null;
        if (z) {
            C1388 c1388M46710 = abstractC20745.m46710("r");
            try {
                C18459 c18459 = new C18459(c1388M46710);
                byte[] bArrM10744 = C3641.m10744(c18459, (byte[]) null);
                this.f53445 = bArrM10744;
                byte[] bArrM39134 = bArrM10744 != null ? null : m39134(C14932.m35679(c18459, false, (byte[]) null));
                this.f53444 = bArrM39134;
                byte[] bArrM39135 = (bArrM10744 == null && bArrM39134 == null) ? m39134(C14932.m35679(c18459, true, (byte[]) null)) : null;
                this.f53442 = bArrM39135;
                c1388M46710.close();
                if (bArrM10744 == null && bArrM39134 == null && bArrM39135 == null) {
                    bArrM3416 = C0819.m3416(abstractC20745);
                }
                this.f53446 = bArrM3416;
                return;
            } catch (Throwable th) {
                try {
                    c1388M46710.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] bArrM3417 = C0819.m3416(abstractC20745);
        this.f53446 = bArrM3417;
        C1388 c1388M46711 = abstractC20745.m46710("r");
        try {
            C18459 c184510 = new C18459(c1388M46711);
            byte[] bArrM10745 = C3641.m10744(c184510, bArrM3417);
            this.f53445 = bArrM10745;
            byte[][] bArr2 = {bArrM10745, bArrM3417};
            int i = 0;
            while (true) {
                if (i >= 2) {
                    bArr = null;
                    break;
                }
                bArr = bArr2[i];
                if (bArr != null) {
                    break;
                } else {
                    i++;
                }
            }
            byte[] bArrM39136 = m39134(C14932.m35679(c184510, false, bArr));
            this.f53444 = bArrM39136;
            byte[][] bArr3 = {bArrM39136, bArrM10745, bArrM3417};
            for (int i2 = 0; i2 < 3; i2++) {
                byte[] bArr4 = bArr3[i2];
                if (bArr4 != null) {
                    bArrM3416 = bArr4;
                    break;
                }
            }
            this.f53442 = m39134(C14932.m35679(c184510, true, bArrM3416));
            c1388M46711.close();
        } catch (Throwable th3) {
            try {
                c1388M46711.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private byte[] m39134(C10946 c10946) {
        if (c10946 == null) {
            return null;
        }
        Object obj = c10946.f37217;
        byte[] bArr = this.f53446;
        if (bArr == null) {
            bArr = this.f53445;
        }
        if (bArr == null) {
            return (byte[]) obj;
        }
        try {
            C15907 c15907 = (C15907) c10946.f37218;
            if (c15907 == null) {
                return (byte[]) obj;
            }
            if (c15907.m37817((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).m37816() == 1) {
                return bArr;
            }
            return (byte[]) obj;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m39138() {
        return (this.f53446 == null && this.f53445 == null && this.f53444 == null && this.f53442 == null) ? false : true;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m39144() {
        byte[] bArr = this.f53442;
        byte[] bArr2 = this.f53444;
        byte[] bArr3 = this.f53445;
        byte[] bArr4 = this.f53446;
        if (bArr4 != null) {
            if (bArr3 != null && !Arrays.equals(bArr4, bArr3)) {
                return true;
            }
            if (bArr2 != null && !Arrays.equals(bArr4, bArr2)) {
                return true;
            }
            if (bArr != null && !Arrays.equals(bArr4, bArr)) {
                return true;
            }
        }
        if (bArr3 != null) {
            if (bArr2 != null && !Arrays.equals(bArr3, bArr2)) {
                return true;
            }
            if (bArr != null && !Arrays.equals(bArr3, bArr)) {
                return true;
            }
        }
        return (bArr2 == null || bArr == null || Arrays.equals(bArr2, bArr)) ? false : true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] m39145() {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && (bArr3 = this.f53442) != null) {
            return bArr3;
        }
        if (i >= 28 && (bArr2 = this.f53444) != null) {
            return bArr2;
        }
        if (i >= 24 && (bArr = this.f53445) != null) {
            return bArr;
        }
        byte[] bArr4 = this.f53446;
        if (bArr4 != null) {
            return bArr4;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m39140() {
        byte[] bArr = this.f53442;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = this.f53444;
        if (bArr2 != null) {
            return bArr2;
        }
        byte[] bArr3 = this.f53445;
        if (bArr3 != null) {
            return bArr3;
        }
        byte[] bArr4 = this.f53446;
        if (bArr4 != null) {
            return bArr4;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] m39146() {
        return this.f53442;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final byte[] m39136() {
        return this.f53444;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] m39141() {
        return this.f53445;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] m39137() {
        return this.f53446;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m39143() {
        boolean z = this.f53446 != null;
        boolean z2 = this.f53445 != null;
        boolean z3 = this.f53444 != null;
        boolean z4 = this.f53442 != null;
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add("V1");
        }
        if (z2) {
            arrayList.add("V2");
        }
        if (z3) {
            arrayList.add("V3");
        }
        if (z4) {
            arrayList.add("V3.1");
        }
        return arrayList.isEmpty() ? "NULL" : C6851.m18456(arrayList, " + ");
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m39147() {
        return this.f53447 != null;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m39142() {
        return m39147() && this.f53447.f65553;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00cd  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C20202 m39135(InterfaceC5614 interfaceC5614) throws IOException {
        EnumC0445 enumC0445;
        C20202 c20202 = new C20202();
        byte[] bArr = this.f53442;
        byte[] bArr2 = this.f53444;
        byte[] bArr3 = this.f53445;
        byte[] bArr4 = this.f53446;
        if (bArr4 == null && bArr3 == null && bArr2 == null && bArr == null) {
            return c20202;
        }
        AbstractC20745 abstractC20745 = this.f53443;
        C1388 c1388M46710 = abstractC20745.m46710("r");
        try {
            C18459 c18459 = new C18459(c1388M46710);
            C20907 c20907 = c20202.f65552;
            if (bArr3 != null) {
                if (C3641.m10741(c18459, interfaceC5614)) {
                    c20907.f67938 = EnumC15969.SUCCESS;
                } else {
                    c20907.f67938 = EnumC15969.FAIL;
                }
            }
            Boolean bool = null;
            if (!interfaceC5614.mo2357()) {
                C20907 c20908 = c20202.f65554;
                if (bArr2 != null) {
                    if (C14932.m35680(c18459, false, interfaceC5614)) {
                        c20908.f67938 = EnumC15969.SUCCESS;
                    } else {
                        c20908.f67938 = EnumC15969.FAIL;
                    }
                }
                if (!interfaceC5614.mo2357()) {
                    C20907 c20909 = c20202.f65557;
                    if (bArr != null) {
                        if (C14932.m35680(c18459, true, interfaceC5614)) {
                            c20909.f67938 = EnumC15969.SUCCESS;
                        } else {
                            c20909.f67938 = EnumC15969.FAIL;
                        }
                    }
                    if (interfaceC5614.mo2357()) {
                        c1388M46710.close();
                        return null;
                    }
                    c1388M46710.close();
                    C20907 c209010 = c20202.f65555;
                    if (bArr4 != null) {
                        if (C0819.m3414(abstractC20745, c20202, interfaceC5614)) {
                            c209010.f67938 = EnumC15969.SUCCESS;
                        } else {
                            c209010.f67938 = EnumC15969.FAIL;
                        }
                    }
                    if (interfaceC5614.mo2357()) {
                        return null;
                    }
                    if (!c20909.f67937) {
                        enumC0445 = null;
                    } else if (c20909.f67938.m37951()) {
                        bool = Boolean.TRUE;
                        enumC0445 = null;
                    } else if (c20909.f67938.m37952()) {
                        bool = Boolean.FALSE;
                        if (c20202.m45658()) {
                            enumC0445 = EnumC0445.FAIL;
                        } else if (c20909.f67938.m37950()) {
                            enumC0445 = EnumC0445.FAIL_MISSING_V31;
                        } else {
                            enumC0445 = EnumC0445.FAIL_V31;
                        }
                    } else {
                        enumC0445 = null;
                    }
                    if (bool == null && c20908.f67937) {
                        if (c20908.f67938.m37951()) {
                            bool = Boolean.TRUE;
                        } else if (c20908.f67938.m37952()) {
                            bool = Boolean.FALSE;
                            if (c20202.m45658()) {
                                enumC0445 = EnumC0445.FAIL;
                            } else if (c20908.f67938.m37950()) {
                                enumC0445 = EnumC0445.FAIL_MISSING_V3;
                            } else {
                                enumC0445 = EnumC0445.FAIL_V3;
                            }
                        }
                    }
                    if (bool == null && c20907.f67937) {
                        if (c20907.f67938.m37951()) {
                            bool = Boolean.TRUE;
                        } else if (c20907.f67938.m37952()) {
                            bool = Boolean.FALSE;
                            if (c20202.m45658()) {
                                enumC0445 = EnumC0445.FAIL;
                            } else if (c20907.f67938.m37950()) {
                                enumC0445 = EnumC0445.FAIL_MISSING_V2;
                            } else {
                                enumC0445 = EnumC0445.FAIL_V2;
                            }
                        }
                    }
                    if (bool == null) {
                        if (c209010.f67938.m37951()) {
                            if (c20909.f67937 && c20909.f67938.m37953()) {
                                enumC0445 = EnumC0445.FAIL_MISSING_V31;
                                bool = Boolean.FALSE;
                            } else if (c20908.f67937 && c20908.f67938.m37953()) {
                                enumC0445 = EnumC0445.FAIL_MISSING_V3;
                                bool = Boolean.FALSE;
                            } else if (c20907.f67937 && c20907.f67938.m37953()) {
                                enumC0445 = EnumC0445.FAIL_MISSING_V2;
                                bool = Boolean.FALSE;
                            } else {
                                bool = Boolean.TRUE;
                            }
                        } else {
                            bool = Boolean.FALSE;
                            if (c20202.m45658()) {
                                enumC0445 = EnumC0445.FAIL;
                            } else if (c209010.f67938.m37950()) {
                                enumC0445 = EnumC0445.FAIL_MISSING_V1;
                            } else {
                                enumC0445 = EnumC0445.FAIL_V1;
                            }
                        }
                    }
                    if (enumC0445 == null) {
                        if (c209010.f67938.m37952()) {
                            enumC0445 = EnumC0445.FAIL_V1;
                        } else if (c20907.f67938.m37952()) {
                            enumC0445 = EnumC0445.FAIL_V2;
                        } else if (c20908.f67938.m37952()) {
                            enumC0445 = EnumC0445.FAIL_V3;
                        } else if (c20909.f67938.m37952()) {
                            enumC0445 = EnumC0445.FAIL_V31;
                        } else if (c20907.f67938.m37953()) {
                            enumC0445 = EnumC0445.FAIL_MISSING_V2;
                        } else if (c20908.f67938.m37953()) {
                            enumC0445 = EnumC0445.FAIL_MISSING_V3;
                        } else if (c20909.f67938.m37953()) {
                            enumC0445 = EnumC0445.FAIL_MISSING_V31;
                        } else if (m39133(bArr4, bArr3)) {
                            enumC0445 = EnumC0445.FAIL_DIFFERENT_V1_V2;
                        } else if (m39133(bArr4, bArr2)) {
                            enumC0445 = EnumC0445.FAIL_DIFFERENT_V1_V3;
                        } else if (m39133(bArr4, bArr)) {
                            enumC0445 = EnumC0445.FAIL_DIFFERENT_V1_V31;
                        } else if (m39133(bArr3, bArr2)) {
                            enumC0445 = EnumC0445.FAIL_DIFFERENT_V2_V3;
                        } else if (m39133(bArr3, bArr)) {
                            enumC0445 = EnumC0445.FAIL_DIFFERENT_V2_V31;
                        } else if (m39133(bArr2, bArr)) {
                            enumC0445 = EnumC0445.FAIL_DIFFERENT_V3_V31;
                        } else if (bool.booleanValue()) {
                            enumC0445 = EnumC0445.SUCCESS;
                        } else {
                            throw new RuntimeException();
                        }
                    }
                    c20202.f65553 = bool.booleanValue();
                    c20202.f65556 = enumC0445;
                    return c20202;
                }
                c1388M46710.close();
                return null;
            }
            c1388M46710.close();
            return null;
        } catch (Throwable th) {
            try {
                c1388M46710.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m39133(byte[] bArr, byte[] bArr2) {
        return (bArr == null || bArr2 == null || Arrays.equals(bArr, bArr2)) ? false : true;
    }
}
