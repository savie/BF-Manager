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

/* JADX INFO: renamed from: l.ۢ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9273 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final String f31520;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final String f31521;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C10912 f31522;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC22013 f31523;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String f31524;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f31525;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f31526;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C10912 f31527;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f31528;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f31529;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17261 f31530;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f31531;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23826(C22719 c22719, C18485 c18485) {
        if (!this.f31524.equals(c22719.f74015.toString()) || !this.f31531.equals(c22719.f74010)) {
            return false;
        }
        int i = C10070.f34404;
        for (String str : C10070.m25482(c18485.f58916)) {
            if (!C0140.m1235(this.f31527.m27349(str), c22719.f74013.m27349(str))) {
                return false;
            }
        }
        return true;
    }

    static {
        C18743.m43294().getClass();
        f31520 = "OkHttp-Sent-Millis";
        C18743.m43294().getClass();
        f31521 = "OkHttp-Received-Millis";
    }

    public C9273(InterfaceC10008 interfaceC10008) throws IOException {
        EnumC10019 enumC10019M25293;
        try {
            InterfaceC23683 interfaceC23683M3437 = C0834.m3437(interfaceC10008);
            this.f31524 = interfaceC23683M3437.mo16426();
            this.f31531 = interfaceC23683M3437.mo16426();
            C5972 c5972 = new C5972();
            int iM8746 = C2921.m8746(interfaceC23683M3437);
            for (int i = 0; i < iM8746; i++) {
                c5972.m16266(interfaceC23683M3437.mo16426());
            }
            this.f31527 = new C10912(c5972);
            C19948 c19948M45245 = C19948.m45245(interfaceC23683M3437.mo16426());
            this.f31523 = c19948M45245.f63898;
            this.f31525 = c19948M45245.f63897;
            this.f31528 = c19948M45245.f63899;
            C5972 c5973 = new C5972();
            int iM8747 = C2921.m8746(interfaceC23683M3437);
            for (int i2 = 0; i2 < iM8747; i2++) {
                c5973.m16266(interfaceC23683M3437.mo16426());
            }
            String str = f31520;
            String strM16269 = c5973.m16269(str);
            String str2 = f31521;
            String strM162610 = c5973.m16269(str2);
            c5973.m16268(str);
            c5973.m16268(str2);
            this.f31529 = strM16269 != null ? Long.parseLong(strM16269) : 0L;
            this.f31526 = strM162610 != null ? Long.parseLong(strM162610) : 0L;
            this.f31522 = new C10912(c5973);
            if (this.f31524.startsWith("https://")) {
                String strMo16426 = interfaceC23683M3437.mo16426();
                if (strMo16426.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strMo16426 + "\"");
                }
                C3854 c3854M11175 = C3854.m11175(interfaceC23683M3437.mo16426());
                List listM23822 = m23822(interfaceC23683M3437);
                List listM23823 = m23822(interfaceC23683M3437);
                if (!interfaceC23683M3437.mo16415()) {
                    enumC10019M25293 = EnumC10019.m25293(interfaceC23683M3437.mo16426());
                } else {
                    enumC10019M25293 = EnumC10019.SSL_3_0;
                }
                this.f31530 = C17261.m40227(enumC10019M25293, c3854M11175, listM23822, listM23823);
            } else {
                this.f31530 = null;
            }
            interfaceC10008.close();
        } catch (Throwable th) {
            interfaceC10008.close();
            throw th;
        }
    }

    public C9273(C18485 c18485) {
        C10912 c10912;
        C22719 c22719 = c18485.f58910;
        this.f31524 = c22719.f74015.toString();
        int i = C10070.f34404;
        C10912 c10913 = c18485.f58911.f58910.f74013;
        C10912 c10914 = c18485.f58916;
        Set setM25482 = C10070.m25482(c10914);
        if (!setM25482.isEmpty()) {
            C5972 c5972 = new C5972();
            int iM27347 = c10913.m27347();
            for (int i2 = 0; i2 < iM27347; i2++) {
                String strM27344 = c10913.m27344(i2);
                if (setM25482.contains(strM27344)) {
                    c5972.m16267(strM27344, c10913.m27348(i2));
                }
            }
            c10912 = new C10912(c5972);
        } else {
            c10912 = new C10912(new C5972());
        }
        this.f31527 = c10912;
        this.f31531 = c22719.f74010;
        this.f31523 = c18485.f58913;
        this.f31525 = c18485.f58915;
        this.f31528 = c18485.f58909;
        this.f31522 = c10914;
        this.f31530 = c18485.f58912;
        this.f31529 = c18485.f58908;
        this.f31526 = c18485.f58907;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23825(C9314 c9314) {
        InterfaceC10983 interfaceC10983M3436 = C0834.m3436(c9314.m23887(0));
        String str = this.f31524;
        interfaceC10983M3436.mo16418(str);
        interfaceC10983M3436.writeByte(10);
        interfaceC10983M3436.mo16418(this.f31531);
        interfaceC10983M3436.writeByte(10);
        C10912 c10912 = this.f31527;
        interfaceC10983M3436.mo16428(c10912.m27347());
        interfaceC10983M3436.writeByte(10);
        int iM27347 = c10912.m27347();
        for (int i = 0; i < iM27347; i++) {
            interfaceC10983M3436.mo16418(c10912.m27344(i));
            interfaceC10983M3436.mo16418(": ");
            interfaceC10983M3436.mo16418(c10912.m27348(i));
            interfaceC10983M3436.writeByte(10);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31523 == EnumC22013.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f31525);
        String str2 = this.f31528;
        if (str2 != null) {
            sb.append(' ');
            sb.append(str2);
        }
        interfaceC10983M3436.mo16418(sb.toString());
        interfaceC10983M3436.writeByte(10);
        C10912 c10913 = this.f31522;
        interfaceC10983M3436.mo16428(c10913.m27347() + 2);
        interfaceC10983M3436.writeByte(10);
        int iM27348 = c10913.m27347();
        for (int i2 = 0; i2 < iM27348; i2++) {
            interfaceC10983M3436.mo16418(c10913.m27344(i2));
            interfaceC10983M3436.mo16418(": ");
            interfaceC10983M3436.mo16418(c10913.m27348(i2));
            interfaceC10983M3436.writeByte(10);
        }
        interfaceC10983M3436.mo16418(f31520);
        interfaceC10983M3436.mo16418(": ");
        interfaceC10983M3436.mo16428(this.f31529);
        interfaceC10983M3436.writeByte(10);
        interfaceC10983M3436.mo16418(f31521);
        interfaceC10983M3436.mo16418(": ");
        interfaceC10983M3436.mo16428(this.f31526);
        interfaceC10983M3436.writeByte(10);
        if (str.startsWith("https://")) {
            interfaceC10983M3436.writeByte(10);
            C17261 c17261 = this.f31530;
            interfaceC10983M3436.mo16418(c17261.m40229().f14407);
            interfaceC10983M3436.writeByte(10);
            m23823(interfaceC10983M3436, c17261.m40230());
            m23823(interfaceC10983M3436, c17261.m40231());
            interfaceC10983M3436.mo16418(c17261.m40228().m25294());
            interfaceC10983M3436.writeByte(10);
        }
        interfaceC10983M3436.close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m23822(InterfaceC23683 interfaceC23683) throws IOException {
        int iM8746 = C2921.m8746(interfaceC23683);
        if (iM8746 == -1) {
            return Collections.EMPTY_LIST;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iM8746);
            for (int i = 0; i < iM8746; i++) {
                String strMo16426 = interfaceC23683.mo16426();
                C6043 c6043 = new C6043();
                c6043.m16412(C14511.m34932(strMo16426));
                arrayList.add(certificateFactory.generateCertificate(c6043.mo16433()));
            }
            return arrayList;
        } catch (CertificateException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23823(InterfaceC10983 interfaceC10983, List list) throws IOException {
        try {
            interfaceC10983.mo16428(list.size());
            interfaceC10983.writeByte(10);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                interfaceC10983.mo16418(C14511.m34933(((Certificate) list.get(i)).getEncoded()).mo34940());
                interfaceC10983.writeByte(10);
            }
        } catch (CertificateEncodingException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18485 m23824(C4424 c4424) {
        C10912 c10912 = this.f31522;
        String strM27345 = c10912.m27345("Content-Type");
        String strM27346 = c10912.m27345("Content-Length");
        C6490 c6490 = new C6490();
        c6490.m17686(this.f31524);
        c6490.m17681(this.f31531, (AbstractC21307) null);
        c6490.f21888 = this.f31527.m27346();
        C22719 c22719M17678 = c6490.m17678();
        C17779 c17779 = new C17779();
        c17779.f56381 = c22719M17678;
        c17779.f56372 = this.f31523;
        c17779.f56376 = this.f31525;
        c17779.f56380 = this.f31528;
        c17779.f56374 = c10912.m27346();
        c17779.f56373 = new C1510(c4424, strM27345, strM27346);
        c17779.f56371 = this.f31530;
        c17779.f56379 = this.f31529;
        c17779.f56375 = this.f31526;
        return c17779.m41340();
    }
}
