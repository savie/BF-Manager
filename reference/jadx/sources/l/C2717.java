package l;

import android.content.pm.PackageInfo;
import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۖܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TA2U */
/* JADX INFO: loaded from: classes3.dex */
public final class C2717 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f9072;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f9073;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f9074;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f9075;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f9076;

    public C2717(String str, boolean z, boolean z2, boolean z3, long j) {
        this.f9075 = str;
        this.f9074 = z;
        this.f9076 = z2;
        this.f9073 = z3;
        this.f9072 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2717)) {
            return false;
        }
        C2717 c2717 = (C2717) obj;
        return this.f9074 == c2717.f9074 && this.f9076 == c2717.f9076 && this.f9073 == c2717.f9073 && this.f9072 == c2717.f9072 && C17359.equals(this.f9075, c2717.f9075);
    }

    public final int hashCode() {
        int i = (((this.f9074 ? 1231 : 1237) * 31) + (this.f9076 ? 1231 : 1237)) * 31;
        int i2 = this.f9073 ? 1231 : 1237;
        long j = this.f9072;
        return C17359.hashCode(this.f9075) + ((((i + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f9075, Boolean.valueOf(this.f9074), Boolean.valueOf(this.f9076), Boolean.valueOf(this.f9073), Long.valueOf(this.f9072)};
        String[] strArrSplit = "packageName;supportUninstallUpdate;supportGrantingDataRoot;supportGrantingDataChild;apkInstallTime".length() == 0 ? new String[0] : "packageName;supportUninstallUpdate;supportGrantingDataRoot;supportGrantingDataChild;apkInstallTime".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C2717.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m9056() {
        return this.f9073;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m9058() {
        return this.f9074;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2717 m9054(PackageInfo packageInfo) {
        long j = packageInfo.lastUpdateTime;
        C7192 c7192 = new C7192();
        c7192.f23746 = true;
        c7192.f23744 = true;
        c7192.f23745 = true;
        InterfaceC9428 interfaceC9428 = C13903.f44083;
        C17359.requireNonNull(interfaceC9428);
        try {
            interfaceC9428.mo24804(packageInfo.applicationInfo.sourceDir, c7192);
        } catch (Throwable unused) {
        }
        return new C2717(packageInfo.packageName, c7192.f23745 && !packageInfo.applicationInfo.sourceDir.startsWith("/system"), c7192.f23746, c7192.f23744, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m9055(C2717 c2717, PackageInfo packageInfo) {
        return c2717.f9075.equals(packageInfo.packageName) && c2717.f9072 == packageInfo.lastUpdateTime;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m9057(boolean z) {
        return z ? this.f9076 : this.f9073;
    }
}
