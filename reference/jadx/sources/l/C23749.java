package l;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩹ᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23749 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final String f76960;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final String f76961;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f76962;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f76963;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f76964;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f76965;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11682 f76966;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C11682 f76967;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f76968;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f76969;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5717 f76970;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC4225 f76971;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m53035(C7954 c7954, C9444 c9444) {
        if (!this.f76962.equals(c7954.f26430.toString()) || !this.f76968.equals(c7954.f26433)) {
            return false;
        }
        int i = C13854.f43953;
        for (String str : C13854.m33801(c9444.f30634)) {
            if (!C19822.m45605(this.f76966.m29365(str), c7954.f26429.m29365(str))) {
                return false;
            }
        }
        return true;
    }

    static {
        C9052.m24178().getClass();
        f76960 = "OkHttp-Sent-Millis";
        C9052.m24178().getClass();
        f76961 = "OkHttp-Received-Millis";
    }

    public C23749(InterfaceC13810 interfaceC13810) throws IOException {
        EnumC13919 enumC13919M33899;
        try {
            InterfaceC25000 interfaceC25000M35108 = C14556.m35108(interfaceC13810);
            this.f76962 = interfaceC25000M35108.mo4185();
            this.f76968 = interfaceC25000M35108.mo4185();
            C1988 c1988 = new C1988();
            int iM11716 = C3611.m11716(interfaceC25000M35108);
            for (int i = 0; i < iM11716; i++) {
                c1988.m6810(interfaceC25000M35108.mo4185());
            }
            this.f76966 = new C11682(c1988);
            C22588 c22588M50912 = C22588.m50912(interfaceC25000M35108.mo4185());
            this.f76971 = c22588M50912.f73025;
            this.f76963 = c22588M50912.f73024;
            this.f76965 = c22588M50912.f73026;
            C1988 c1989 = new C1988();
            int iM11717 = C3611.m11716(interfaceC25000M35108);
            for (int i2 = 0; i2 < iM11717; i2++) {
                c1989.m6810(interfaceC25000M35108.mo4185());
            }
            String str = f76960;
            String strM6813 = c1989.m6813(str);
            String str2 = f76961;
            String strM6814 = c1989.m6813(str2);
            c1989.m6812(str);
            c1989.m6812(str2);
            this.f76964 = strM6813 != null ? Long.parseLong(strM6813) : 0L;
            this.f76969 = strM6814 != null ? Long.parseLong(strM6814) : 0L;
            this.f76967 = new C11682(c1989);
            if (this.f76962.startsWith("https://")) {
                String strMo4185 = interfaceC25000M35108.mo4185();
                if (strMo4185.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strMo4185 + "\"");
                }
                C0628 c0628M2776 = C0628.m2776(interfaceC25000M35108.mo4185());
                List listM53031 = m53031(interfaceC25000M35108);
                List listM53032 = m53031(interfaceC25000M35108);
                if (!interfaceC25000M35108.mo4182()) {
                    enumC13919M33899 = EnumC13919.m33899(interfaceC25000M35108.mo4185());
                } else {
                    enumC13919M33899 = EnumC13919.SSL_3_0;
                }
                this.f76970 = C5717.m16750(enumC13919M33899, c0628M2776, listM53031, listM53032);
            } else {
                this.f76970 = null;
            }
            interfaceC13810.close();
        } catch (Throwable th) {
            interfaceC13810.close();
            throw th;
        }
    }

    public C23749(C9444 c9444) {
        C11682 c11682;
        C7954 c7954 = c9444.f30626;
        this.f76962 = c7954.f26430.toString();
        int i = C13854.f43953;
        C11682 c11683 = c9444.f30624.f30626.f26429;
        C11682 c11684 = c9444.f30634;
        Set setM33801 = C13854.m33801(c11684);
        if (!setM33801.isEmpty()) {
            C1988 c1988 = new C1988();
            int iM29363 = c11683.m29363();
            for (int i2 = 0; i2 < iM29363; i2++) {
                String strM29360 = c11683.m29360(i2);
                if (setM33801.contains(strM29360)) {
                    c1988.m6811(strM29360, c11683.m29364(i2));
                }
            }
            c11682 = new C11682(c1988);
        } else {
            c11682 = new C11682(new C1988());
        }
        this.f76966 = c11682;
        this.f76968 = c7954.f26433;
        this.f76971 = c9444.f30625;
        this.f76963 = c9444.f30623;
        this.f76965 = c9444.f30630;
        this.f76967 = c11684;
        this.f76970 = c9444.f30627;
        this.f76964 = c9444.f30631;
        this.f76969 = c9444.f30628;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53034(C16092 c16092) {
        InterfaceC11573 interfaceC11573M35106 = C14556.m35106(c16092.m38246(0));
        String str = this.f76962;
        interfaceC11573M35106.mo6442(str);
        interfaceC11573M35106.writeByte(10);
        interfaceC11573M35106.mo6442(this.f76968);
        interfaceC11573M35106.writeByte(10);
        C11682 c11682 = this.f76966;
        interfaceC11573M35106.mo6447(c11682.m29363());
        interfaceC11573M35106.writeByte(10);
        int iM29363 = c11682.m29363();
        for (int i = 0; i < iM29363; i++) {
            interfaceC11573M35106.mo6442(c11682.m29360(i));
            interfaceC11573M35106.mo6442(": ");
            interfaceC11573M35106.mo6442(c11682.m29364(i));
            interfaceC11573M35106.writeByte(10);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f76971 == EnumC4225.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f76963);
        String str2 = this.f76965;
        if (str2 != null) {
            sb.append(' ');
            sb.append(str2);
        }
        interfaceC11573M35106.mo6442(sb.toString());
        interfaceC11573M35106.writeByte(10);
        C11682 c11683 = this.f76967;
        interfaceC11573M35106.mo6447(c11683.m29363() + 2);
        interfaceC11573M35106.writeByte(10);
        int iM29364 = c11683.m29363();
        for (int i2 = 0; i2 < iM29364; i2++) {
            interfaceC11573M35106.mo6442(c11683.m29360(i2));
            interfaceC11573M35106.mo6442(": ");
            interfaceC11573M35106.mo6442(c11683.m29364(i2));
            interfaceC11573M35106.writeByte(10);
        }
        interfaceC11573M35106.mo6442(f76960);
        interfaceC11573M35106.mo6442(": ");
        interfaceC11573M35106.mo6447(this.f76964);
        interfaceC11573M35106.writeByte(10);
        interfaceC11573M35106.mo6442(f76961);
        interfaceC11573M35106.mo6442(": ");
        interfaceC11573M35106.mo6447(this.f76969);
        interfaceC11573M35106.writeByte(10);
        if (str.startsWith("https://")) {
            interfaceC11573M35106.writeByte(10);
            C5717 c5717 = this.f76970;
            interfaceC11573M35106.mo6442(c5717.m16751().f2470);
            interfaceC11573M35106.writeByte(10);
            m53032(interfaceC11573M35106, c5717.m16752());
            m53032(interfaceC11573M35106, c5717.m16753());
            interfaceC11573M35106.mo6442(c5717.m16754().m33900());
            interfaceC11573M35106.writeByte(10);
        }
        interfaceC11573M35106.close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m53031(InterfaceC25000 interfaceC25000) throws IOException {
        int iM11716 = C3611.m11716(interfaceC25000);
        if (iM11716 == -1) {
            return Collections.EMPTY_LIST;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iM11716);
            for (int i = 0; i < iM11716; i++) {
                String strMo4185 = interfaceC25000.mo4185();
                C1879 c1879 = new C1879();
                c1879.m6441(C16794.m39648(strMo4185));
                arrayList.add(certificateFactory.generateCertificate(c1879.mo4183()));
            }
            return arrayList;
        } catch (CertificateException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m53032(InterfaceC11573 interfaceC11573, List list) throws IOException {
        try {
            interfaceC11573.mo6447(list.size());
            interfaceC11573.writeByte(10);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                interfaceC11573.mo6442(C16794.m39649(((Certificate) list.get(i)).getEncoded()).mo23083());
                interfaceC11573.writeByte(10);
            }
        } catch (CertificateEncodingException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9444 m53033(C3414 c3414) {
        C11682 c11682 = this.f76967;
        String strM29361 = c11682.m29361("Content-Type");
        String strM29362 = c11682.m29361("Content-Length");
        C0496 c0496 = new C0496();
        c0496.m2397(this.f76962);
        c0496.m2392(this.f76968, (AbstractC10190) null);
        c0496.f2146 = this.f76966.m29362();
        C7954 c7954M2389 = c0496.m2389();
        C1242 c1242 = new C1242();
        c1242.f4502 = c7954M2389;
        c1242.f4491 = this.f76971;
        c1242.f4494 = this.f76963;
        c1242.f4497 = this.f76965;
        c1242.f4499 = c11682.m29362();
        c1242.f4492 = new C16289(c3414, strM29361, strM29362);
        c1242.f4501 = this.f76970;
        c1242.f4498 = this.f76964;
        c1242.f4495 = this.f76969;
        return c1242.m4479();
    }
}
