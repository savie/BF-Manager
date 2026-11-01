package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.᩸ۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 54GG */
/* JADX INFO: loaded from: classes4.dex */
public final class C21494 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C21494 f69843;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C21494 f69844;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C21494 f69845;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String[] f69846;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String[] f69847;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f69848;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f69849;

    static {
        C3854 c3854 = C3854.f14390;
        C3854 c3855 = C3854.f14387;
        C3854 c3856 = C3854.f14397;
        C3854 c3857 = C3854.f14388;
        C3854 c3858 = C3854.f14405;
        C3854 c3859 = C3854.f14389;
        C3854 c38510 = C3854.f14404;
        C3854 c38511 = C3854.f14391;
        C3854 c38512 = C3854.f14401;
        C3854 c38513 = C3854.f14406;
        C3854 c38514 = C3854.f14393;
        C3854[] c3854Arr = {c3854, c3855, c3856, c3857, c3858, c3859, c38510, c38511, c38512, c38513, c38514};
        C3854[] c3854Arr2 = {c3854, c3855, c3856, c3857, c3858, c3859, c38510, c38511, c38512, c38513, c38514, C3854.f14399, C3854.f14400, C3854.f14395, C3854.f14403, C3854.f14394, C3854.f14392, C3854.f14402};
        C15145 c15145 = new C15145(true);
        c15145.m36312(c3854Arr);
        EnumC10019 enumC10019 = EnumC10019.TLS_1_3;
        EnumC10019 enumC100110 = EnumC10019.TLS_1_2;
        c15145.m36313(enumC10019, enumC100110);
        c15145.f49481 = true;
        C15145 c15146 = new C15145(true);
        c15146.m36312(c3854Arr2);
        EnumC10019 enumC100111 = EnumC10019.TLS_1_0;
        c15146.m36313(enumC10019, enumC100110, EnumC10019.TLS_1_1, enumC100111);
        c15146.f49481 = true;
        f69843 = new C21494(c15146);
        C15145 c15147 = new C15145(true);
        c15147.m36312(c3854Arr2);
        c15147.m36313(enumC100111);
        c15147.f49481 = true;
        f69845 = new C21494(c15147);
        f69844 = new C21494(new C15145(false));
    }

    public C21494(C15145 c15145) {
        this.f69848 = c15145.f49480;
        this.f69847 = c15145.f49479;
        this.f69846 = c15145.f49478;
        this.f69849 = c15145.f49481;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48132() {
        return this.f69849;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48133(SSLSocket sSLSocket) {
        if (!this.f69848) {
            return false;
        }
        String[] strArr = this.f69846;
        if (strArr != null && !C0140.m1241(C0140.f1169, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f69847;
        return strArr2 == null || C0140.m1241(C3854.f14396, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21494)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C21494 c21494 = (C21494) obj;
        boolean z = c21494.f69848;
        boolean z2 = this.f69848;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.f69847, c21494.f69847) && Arrays.equals(this.f69846, c21494.f69846) && this.f69849 == c21494.f69849;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f69848) {
            return ((((Arrays.hashCode(this.f69847) + 527) * 31) + Arrays.hashCode(this.f69846)) * 31) + (!this.f69849 ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String string;
        if (!this.f69848) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f69847;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(C3854.m11175(str));
            }
            string = C0561.unmodifiableList(arrayList).toString();
        } else {
            string = "[all enabled]";
        }
        String[] strArr2 = this.f69846;
        StringBuilder sbM30515 = C12278.m30515("ConnectionSpec(cipherSuites=", string, ", tlsVersions=", strArr2 != null ? EnumC10019.m25292(strArr2).toString() : "[all enabled]", ", supportsTlsExtensions=");
        sbM30515.append(this.f69849);
        sbM30515.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sbM30515.toString();
    }
}
