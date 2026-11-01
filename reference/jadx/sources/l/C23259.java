package l;

import java.util.Map;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩺᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 09WV */
/* JADX INFO: loaded from: classes.dex */
public final class C23259 implements InterfaceC15498 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f75457 = C13488.m32997(C23259.class);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C23259 f75458 = this;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f75459;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f75460;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f75461;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f75462;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f75463;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f75464;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f75465;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f75466;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f75467;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f75468;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Map f75469;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f75470;

    @Override // l.InterfaceC15498
    /* JADX INFO: renamed from: ܰ */
    public final C23259 mo37104() {
        if (InterfaceC15498.class.isAssignableFrom(C23259.class)) {
            return this;
        }
        throw new ClassCastException();
    }

    @Override // l.InterfaceC15498
    /* JADX INFO: renamed from: ۖ */
    public final long mo37096() {
        return this.f75466;
    }

    @Override // l.InterfaceC15498
    /* JADX INFO: renamed from: ᩺ */
    public final int mo37106() {
        return this.f75460;
    }

    @Override // l.InterfaceC15498
    /* JADX INFO: renamed from: ۨ */
    public final String mo37102() {
        return this.f75461;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51331(String str) {
        this.f75461 = str;
    }

    @Override // l.InterfaceC15498
    /* JADX INFO: renamed from: ۜ */
    public final String mo37101() {
        return this.f75462;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m51335(String str) {
        this.f75462 = str;
    }

    @Override // l.InterfaceC15498
    /* JADX INFO: renamed from: ۬ */
    public final void mo37103() {
        this.f75459 = "\\";
    }

    @Override // l.InterfaceC15498
    /* JADX INFO: renamed from: ۙ */
    public final String mo37098() {
        return this.f75470;
    }

    @Override // l.InterfaceC15498
    /* JADX INFO: renamed from: ᩹ */
    public final String mo37105() {
        return this.f75467;
    }

    @Override // l.InterfaceC15498
    public final String getPath() {
        return this.f75465;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m51336() {
        return this.f75463;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51332(Map map) {
        this.f75469 = map;
    }

    @Override // l.InterfaceC15498
    /* JADX INFO: renamed from: ۘ */
    public final void mo37097() {
        String str;
        Map map = this.f75469;
        if (map == null || (str = this.f75459) == null) {
            return;
        }
        map.put(str, this);
    }

    @Override // l.InterfaceC15498
    public final C23259 next() {
        return this.f75458;
    }

    @Override // l.InterfaceC15498
    /* JADX INFO: renamed from: ֨ */
    public final C23259 mo37095() {
        return this.f75458;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51333(InterfaceC15498 interfaceC15498) {
        C23259 c23259 = (C23259) interfaceC15498;
        c23259.f75458 = this.f75458;
        this.f75458 = c23259;
    }

    @Override // l.InterfaceC15498
    /* JADX INFO: renamed from: ۙ */
    public final void mo37099(int i) {
        int i2 = this.f75460;
        if (i > i2) {
            throw new IllegalArgumentException("Stripping more than consumed");
        }
        this.f75460 = i2 - i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m51337() {
        this.f75464 = true;
    }

    @Override // l.InterfaceC15498
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo37100() {
        return this.f75464;
    }

    public final String toString() {
        return "DfsReferralData[pathConsumed=" + this.f75460 + ",server=" + this.f75470 + ",share=" + this.f75467 + ",link=" + this.f75462 + ",path=" + this.f75465 + ",ttl=" + this.f75468 + ",expiration=" + this.f75466 + ",remain=" + (this.f75466 - System.currentTimeMillis()) + "]";
    }

    public final int hashCode() {
        return C13638.hash(this.f75470, this.f75467, this.f75465, Integer.valueOf(this.f75460));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC15498)) {
            return false;
        }
        InterfaceC15498 interfaceC15498 = (InterfaceC15498) obj;
        return C13638.equals(this.f75470, interfaceC15498.mo37098()) && C13638.equals(this.f75467, interfaceC15498.mo37105()) && C13638.equals(this.f75465, interfaceC15498.getPath()) && Integer.valueOf(this.f75460).equals(Integer.valueOf(interfaceC15498.mo37106()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23259 m51330(C18319 c18319, String str, long j, int i) {
        C23259 c23259 = new C23259();
        String[] strArr = new String[4];
        c23259.f75468 = c18319.f58444;
        int i2 = c18319.f58443;
        c23259.f75463 = i2;
        c23259.f75466 = j;
        int i3 = i2 & 2;
        InterfaceC4314 interfaceC4314 = f75457;
        if (i3 == 2) {
            String[] strArr2 = c18319.f58448;
            if (strArr2.length > 0) {
                c23259.f75470 = strArr2[0].substring(1).toLowerCase();
            } else {
                c23259.f75470 = c18319.f58449.substring(1).toLowerCase();
            }
            if (interfaceC4314.mo12125()) {
                StringBuilder sb = new StringBuilder("Server ");
                ASN1BMPString$$ExternalSyntheticOutline0.m(sb, c23259.f75470, " path ", str, " remain ");
                sb.append(str.substring(i));
                sb.append(" path consumed ");
                sb.append(i);
                interfaceC4314.mo12135(sb.toString());
            }
            c23259.f75460 = i;
            return c23259;
        }
        if (interfaceC4314.mo12125()) {
            StringBuilder sb2 = new StringBuilder("Node ");
            ASN1BMPString$$ExternalSyntheticOutline0.m(sb2, c18319.f58439, " path ", str, " remain ");
            sb2.append(str.substring(i));
            sb2.append(" path consumed ");
            sb2.append(i);
            interfaceC4314.mo12135(sb2.toString());
        }
        String str2 = c18319.f58439;
        int length = str2.length();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i4 == 3) {
                strArr[3] = str2.substring(i6);
                strArr[3] = str2.substring(i6);
                break;
            }
            if (i5 == length || str2.charAt(i5) == '\\') {
                strArr[i4] = str2.substring(i6, i5);
                i6 = i5 + 1;
                i4++;
            }
            int i7 = i5 + 1;
            if (i5 >= length) {
                while (i4 < 4) {
                    strArr[i4] = "";
                    i4++;
                }
                break;
            }
            i5 = i7;
        }
        c23259.f75470 = strArr[1];
        c23259.f75467 = strArr[2];
        c23259.f75465 = strArr[3];
        c23259.f75460 = i;
        if (str.charAt(i - 1) == '\\') {
            if (interfaceC4314.mo12125()) {
                interfaceC4314.mo12135("Server consumed trailing slash of request path, adjusting");
            }
            c23259.f75460--;
        }
        if (interfaceC4314.mo12125()) {
            String strSubstring = str.substring(0, i);
            StringBuilder sbM30914 = C12441.m30914("Request ", str, " ref path ");
            sbM30914.append(c23259.f75465);
            sbM30914.append(" consumed ");
            sbM30914.append(c23259.f75460);
            sbM30914.append(": ");
            sbM30914.append(strSubstring);
            interfaceC4314.mo12135(sbM30914.toString());
        }
        return c23259;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23259 m51334(InterfaceC15498 interfaceC15498) {
        C23259 c23259 = new C23259();
        c23259.f75470 = interfaceC15498.mo37098();
        c23259.f75467 = interfaceC15498.mo37105();
        c23259.f75466 = interfaceC15498.mo37096();
        c23259.f75465 = interfaceC15498.getPath();
        int iMo37106 = interfaceC15498.mo37106() + this.f75460;
        c23259.f75460 = iMo37106;
        String str = this.f75465;
        if (str != null) {
            c23259.f75460 = iMo37106 - (str.length() + 1);
        }
        c23259.f75461 = interfaceC15498.mo37102();
        return c23259;
    }
}
