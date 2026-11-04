package l;

import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿ᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 819Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C18602 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f60444;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] f60445;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C14872 f60446;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] f60447;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f60448;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f60449;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C14872 m43218(InterfaceC7509 interfaceC7509) {
        C14872 c14872 = this.f60446;
        if (c14872 != null) {
            return c14872;
        }
        try {
            C14872 c14872M43216 = m43216(C17950.m41888(interfaceC7509));
            this.f60446 = c14872M43216;
            return c14872M43216;
        } catch (IOException e) {
            this.f60446 = new C14872();
            throw e;
        }
    }

    public C18602(AbstractC22044 abstractC22044, boolean z) {
        byte[] bArr;
        this.f60444 = abstractC22044;
        byte[] bArrM50422 = null;
        if (z) {
            C13961 c13961M49855 = abstractC22044.m49855("r");
            try {
                C11911 c11911 = new C11911(c13961M49855);
                byte[] bArrM52008 = C23100.m52008(c11911, (byte[]) null);
                this.f60445 = bArrM52008;
                byte[] bArrM43215 = bArrM52008 != null ? null : m43215(C13403.m33043(c11911, false, (byte[]) null));
                this.f60447 = bArrM43215;
                byte[] bArrM43216 = (bArrM52008 == null && bArrM43215 == null) ? m43215(C13403.m33043(c11911, true, (byte[]) null)) : null;
                this.f60449 = bArrM43216;
                c13961M49855.close();
                if (bArrM52008 == null && bArrM43215 == null && bArrM43216 == null) {
                    bArrM50422 = C22354.m50422(abstractC22044);
                }
                this.f60448 = bArrM50422;
                return;
            } catch (Throwable th) {
                try {
                    c13961M49855.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] bArrM50423 = C22354.m50422(abstractC22044);
        this.f60448 = bArrM50423;
        C13961 c13961M49856 = abstractC22044.m49855("r");
        try {
            C11911 c11912 = new C11911(c13961M49856);
            byte[] bArrM52009 = C23100.m52008(c11912, bArrM50423);
            this.f60445 = bArrM52009;
            byte[][] bArr2 = {bArrM52009, bArrM50423};
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
            byte[] bArrM43217 = m43215(C13403.m33043(c11912, false, bArr));
            this.f60447 = bArrM43217;
            byte[][] bArr3 = {bArrM43217, bArrM52009, bArrM50423};
            for (int i2 = 0; i2 < 3; i2++) {
                byte[] bArr4 = bArr3[i2];
                if (bArr4 != null) {
                    bArrM50422 = bArr4;
                    break;
                }
            }
            this.f60449 = m43215(C13403.m33043(c11912, true, bArrM50422));
            c13961M49856.close();
        } catch (Throwable th3) {
            try {
                c13961M49856.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private byte[] m43215(C2310 c2310) {
        if (c2310 == null) {
            return null;
        }
        Object obj = c2310.f7473;
        byte[] bArr = this.f60448;
        if (bArr == null) {
            bArr = this.f60445;
        }
        if (bArr == null) {
            return (byte[]) obj;
        }
        try {
            C4103 c4103 = (C4103) c2310.f7474;
            if (c4103 == null) {
                return (byte[]) obj;
            }
            if (c4103.m13199((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).m13198() == 1) {
                return bArr;
            }
            return (byte[]) obj;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m43217() {
        return (this.f60448 == null && this.f60445 == null && this.f60447 == null && this.f60449 == null) ? false : true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m43220() {
        byte[] bArr = this.f60449;
        byte[] bArr2 = this.f60447;
        byte[] bArr3 = this.f60445;
        byte[] bArr4 = this.f60448;
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m43226() {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && (bArr3 = this.f60449) != null) {
            return bArr3;
        }
        if (i >= 28 && (bArr2 = this.f60447) != null) {
            return bArr2;
        }
        if (i >= 24 && (bArr = this.f60445) != null) {
            return bArr;
        }
        byte[] bArr4 = this.f60448;
        if (bArr4 != null) {
            return bArr4;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m43219() {
        byte[] bArr = this.f60449;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = this.f60447;
        if (bArr2 != null) {
            return bArr2;
        }
        byte[] bArr3 = this.f60445;
        if (bArr3 != null) {
            return bArr3;
        }
        byte[] bArr4 = this.f60448;
        if (bArr4 != null) {
            return bArr4;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m43224() {
        return this.f60449;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final byte[] m43223() {
        return this.f60447;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] m43225() {
        return this.f60445;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] m43227() {
        return this.f60448;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m43221() {
        boolean z = this.f60448 != null;
        boolean z2 = this.f60445 != null;
        boolean z3 = this.f60447 != null;
        boolean z4 = this.f60449 != null;
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
        return arrayList.isEmpty() ? "NULL" : C24276.m54283(arrayList, " + ");
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m43228() {
        return this.f60446 != null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m43222() {
        return m43228() && this.f60446.f48599;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00cd  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C14872 m43216(InterfaceC7509 interfaceC7509) {
        EnumC21586 enumC21586;
        C14872 c14872 = new C14872();
        byte[] bArr = this.f60449;
        byte[] bArr2 = this.f60447;
        byte[] bArr3 = this.f60445;
        byte[] bArr4 = this.f60448;
        if (bArr4 == null && bArr3 == null && bArr2 == null && bArr == null) {
            return c14872;
        }
        AbstractC22044 abstractC22044 = this.f60444;
        C13961 c13961M49855 = abstractC22044.m49855("r");
        try {
            C11911 c11911 = new C11911(c13961M49855);
            C24570 c24570 = c14872.f48604;
            if (bArr3 != null) {
                if (C23100.m52005(c11911, interfaceC7509)) {
                    c24570.f79639 = EnumC4432.SUCCESS;
                } else {
                    c24570.f79639 = EnumC4432.FAIL;
                }
            }
            Boolean bool = null;
            if (!interfaceC7509.mo924()) {
                C24570 c24571 = c14872.f48602;
                if (bArr2 != null) {
                    if (C13403.m33044(c11911, false, interfaceC7509)) {
                        c24571.f79639 = EnumC4432.SUCCESS;
                    } else {
                        c24571.f79639 = EnumC4432.FAIL;
                    }
                }
                if (!interfaceC7509.mo924()) {
                    C24570 c24572 = c14872.f48601;
                    if (bArr != null) {
                        if (C13403.m33044(c11911, true, interfaceC7509)) {
                            c24572.f79639 = EnumC4432.SUCCESS;
                        } else {
                            c24572.f79639 = EnumC4432.FAIL;
                        }
                    }
                    if (interfaceC7509.mo924()) {
                        c13961M49855.close();
                        return null;
                    }
                    c13961M49855.close();
                    C24570 c24573 = c14872.f48600;
                    if (bArr4 != null) {
                        if (C22354.m50420(abstractC22044, c14872, interfaceC7509)) {
                            c24573.f79639 = EnumC4432.SUCCESS;
                        } else {
                            c24573.f79639 = EnumC4432.FAIL;
                        }
                    }
                    if (interfaceC7509.mo924()) {
                        return null;
                    }
                    if (!c24572.f79638) {
                        enumC21586 = null;
                    } else if (c24572.f79639.m14094()) {
                        bool = Boolean.TRUE;
                        enumC21586 = null;
                    } else if (c24572.f79639.m14095()) {
                        bool = Boolean.FALSE;
                        if (c14872.m35811()) {
                            enumC21586 = EnumC21586.FAIL;
                        } else if (c24572.f79639.m14096()) {
                            enumC21586 = EnumC21586.FAIL_MISSING_V31;
                        } else {
                            enumC21586 = EnumC21586.FAIL_V31;
                        }
                    } else {
                        enumC21586 = null;
                    }
                    if (bool == null && c24571.f79638) {
                        if (c24571.f79639.m14094()) {
                            bool = Boolean.TRUE;
                        } else if (c24571.f79639.m14095()) {
                            bool = Boolean.FALSE;
                            if (c14872.m35811()) {
                                enumC21586 = EnumC21586.FAIL;
                            } else if (c24571.f79639.m14096()) {
                                enumC21586 = EnumC21586.FAIL_MISSING_V3;
                            } else {
                                enumC21586 = EnumC21586.FAIL_V3;
                            }
                        }
                    }
                    if (bool == null && c24570.f79638) {
                        if (c24570.f79639.m14094()) {
                            bool = Boolean.TRUE;
                        } else if (c24570.f79639.m14095()) {
                            bool = Boolean.FALSE;
                            if (c14872.m35811()) {
                                enumC21586 = EnumC21586.FAIL;
                            } else if (c24570.f79639.m14096()) {
                                enumC21586 = EnumC21586.FAIL_MISSING_V2;
                            } else {
                                enumC21586 = EnumC21586.FAIL_V2;
                            }
                        }
                    }
                    if (bool == null) {
                        if (c24573.f79639.m14094()) {
                            if (c24572.f79638 && c24572.f79639.m14097()) {
                                enumC21586 = EnumC21586.FAIL_MISSING_V31;
                                bool = Boolean.FALSE;
                            } else if (c24571.f79638 && c24571.f79639.m14097()) {
                                enumC21586 = EnumC21586.FAIL_MISSING_V3;
                                bool = Boolean.FALSE;
                            } else if (c24570.f79638 && c24570.f79639.m14097()) {
                                enumC21586 = EnumC21586.FAIL_MISSING_V2;
                                bool = Boolean.FALSE;
                            } else {
                                bool = Boolean.TRUE;
                            }
                        } else {
                            bool = Boolean.FALSE;
                            if (c14872.m35811()) {
                                enumC21586 = EnumC21586.FAIL;
                            } else if (c24573.f79639.m14096()) {
                                enumC21586 = EnumC21586.FAIL_MISSING_V1;
                            } else {
                                enumC21586 = EnumC21586.FAIL_V1;
                            }
                        }
                    }
                    if (enumC21586 == null) {
                        if (c24573.f79639.m14095()) {
                            enumC21586 = EnumC21586.FAIL_V1;
                        } else if (c24570.f79639.m14095()) {
                            enumC21586 = EnumC21586.FAIL_V2;
                        } else if (c24571.f79639.m14095()) {
                            enumC21586 = EnumC21586.FAIL_V3;
                        } else if (c24572.f79639.m14095()) {
                            enumC21586 = EnumC21586.FAIL_V31;
                        } else if (c24570.f79639.m14097()) {
                            enumC21586 = EnumC21586.FAIL_MISSING_V2;
                        } else if (c24571.f79639.m14097()) {
                            enumC21586 = EnumC21586.FAIL_MISSING_V3;
                        } else if (c24572.f79639.m14097()) {
                            enumC21586 = EnumC21586.FAIL_MISSING_V31;
                        } else if (m43214(bArr4, bArr3)) {
                            enumC21586 = EnumC21586.FAIL_DIFFERENT_V1_V2;
                        } else if (m43214(bArr4, bArr2)) {
                            enumC21586 = EnumC21586.FAIL_DIFFERENT_V1_V3;
                        } else if (m43214(bArr4, bArr)) {
                            enumC21586 = EnumC21586.FAIL_DIFFERENT_V1_V31;
                        } else if (m43214(bArr3, bArr2)) {
                            enumC21586 = EnumC21586.FAIL_DIFFERENT_V2_V3;
                        } else if (m43214(bArr3, bArr)) {
                            enumC21586 = EnumC21586.FAIL_DIFFERENT_V2_V31;
                        } else if (m43214(bArr2, bArr)) {
                            enumC21586 = EnumC21586.FAIL_DIFFERENT_V3_V31;
                        } else if (bool.booleanValue()) {
                            enumC21586 = EnumC21586.SUCCESS;
                        } else {
                            throw new RuntimeException();
                        }
                    }
                    c14872.f48599 = bool.booleanValue();
                    c14872.f48603 = enumC21586;
                    return c14872;
                }
                c13961M49855.close();
                return null;
            }
            c13961M49855.close();
            return null;
        } catch (Throwable th) {
            try {
                c13961M49855.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43214(byte[] bArr, byte[] bArr2) {
        return (bArr == null || bArr2 == null || Arrays.equals(bArr, bArr2)) ? false : true;
    }
}
