package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.֨ᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54GG */
/* JADX INFO: loaded from: classes2.dex */
public final class C1374 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C1374 f4899;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C1374 f4900;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C1374 f4901;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String[] f4902;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f4903;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f4904;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String[] f4905;

    static {
        C0628 c0628 = C0628.f2463;
        C0628 c0629 = C0628.f2458;
        C0628 c06210 = C0628.f2453;
        C0628 c06211 = C0628.f2466;
        C0628 c06212 = C0628.f2459;
        C0628 c06213 = C0628.f2450;
        C0628 c06214 = C0628.f2462;
        C0628 c06215 = C0628.f2456;
        C0628 c06216 = C0628.f2467;
        C0628 c06217 = C0628.f2469;
        C0628 c06218 = C0628.f2451;
        C0628[] c0628Arr = {c0628, c0629, c06210, c06211, c06212, c06213, c06214, c06215, c06216, c06217, c06218};
        C0628[] c0628Arr2 = {c0628, c0629, c06210, c06211, c06212, c06213, c06214, c06215, c06216, c06217, c06218, C0628.f2461, C0628.f2460, C0628.f2454, C0628.f2452, C0628.f2457, C0628.f2468, C0628.f2464};
        C10322 c10322 = new C10322(true);
        c10322.m26594(c0628Arr);
        EnumC13919 enumC13919 = EnumC13919.TLS_1_3;
        EnumC13919 enumC139110 = EnumC13919.TLS_1_2;
        c10322.m26595(enumC13919, enumC139110);
        c10322.f32925 = true;
        C10322 c10323 = new C10322(true);
        c10323.m26594(c0628Arr2);
        EnumC13919 enumC139111 = EnumC13919.TLS_1_0;
        c10323.m26595(enumC13919, enumC139110, EnumC13919.TLS_1_1, enumC139111);
        c10323.f32925 = true;
        f4899 = new C1374(c10323);
        C10322 c10324 = new C10322(true);
        c10324.m26594(c0628Arr2);
        c10324.m26595(enumC139111);
        c10324.f32925 = true;
        f4900 = new C1374(c10324);
        f4901 = new C1374(new C10322(false));
    }

    public C1374(C10322 c10322) {
        this.f4903 = c10322.f32924;
        this.f4902 = c10322.f32923;
        this.f4905 = c10322.f32926;
        this.f4904 = c10322.f32925;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m5054() {
        return this.f4904;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m5055(SSLSocket sSLSocket) {
        if (!this.f4903) {
            return false;
        }
        String[] strArr = this.f4905;
        if (strArr != null && !C19822.m45611(C19822.f63725, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f4902;
        return strArr2 == null || C19822.m45611(C0628.f2455, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1374)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C1374 c1374 = (C1374) obj;
        boolean z = c1374.f4903;
        boolean z2 = this.f4903;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.f4902, c1374.f4902) && Arrays.equals(this.f4905, c1374.f4905) && this.f4904 == c1374.f4904;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f4903) {
            return ((((Arrays.hashCode(this.f4902) + 527) * 31) + Arrays.hashCode(this.f4905)) * 31) + (!this.f4904 ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String string;
        if (!this.f4903) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f4902;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(C0628.m2776(str));
            }
            string = C4681.unmodifiableList(arrayList).toString();
        } else {
            string = "[all enabled]";
        }
        String[] strArr2 = this.f4905;
        StringBuilder sbM10406 = C3188.m10406("ConnectionSpec(cipherSuites=", string, ", tlsVersions=", strArr2 != null ? EnumC13919.m33898(strArr2).toString() : "[all enabled]", ", supportsTlsExtensions=");
        sbM10406.append(this.f4904);
        sbM10406.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sbM10406.toString();
    }
}
