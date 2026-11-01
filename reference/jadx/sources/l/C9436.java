package l;

import android.content.pm.PackageInfo;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۢ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: TA2U */
/* JADX INFO: loaded from: classes3.dex */
public final class C9436 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f31942;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f31943;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f31944;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f31945;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f31946;

    public C9436(String str, boolean z, boolean z2, boolean z3, long j) {
        this.f31946 = str;
        this.f31944 = z;
        this.f31942 = z2;
        this.f31945 = z3;
        this.f31943 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9436)) {
            return false;
        }
        C9436 c9436 = (C9436) obj;
        return this.f31944 == c9436.f31944 && this.f31942 == c9436.f31942 && this.f31945 == c9436.f31945 && this.f31943 == c9436.f31943 && C13638.equals(this.f31946, c9436.f31946);
    }

    public final int hashCode() {
        int i = (((this.f31944 ? 1231 : 1237) * 31) + (this.f31942 ? 1231 : 1237)) * 31;
        int i2 = this.f31945 ? 1231 : 1237;
        long j = this.f31943;
        return C13638.hashCode(this.f31946) + ((((i + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f31946, Boolean.valueOf(this.f31944), Boolean.valueOf(this.f31942), Boolean.valueOf(this.f31945), Long.valueOf(this.f31943)};
        String[] strArrSplit = "packageName;supportUninstallUpdate;supportGrantingDataRoot;supportGrantingDataChild;apkInstallTime".length() == 0 ? new String[0] : "packageName;supportUninstallUpdate;supportGrantingDataRoot;supportGrantingDataChild;apkInstallTime".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C9436.class, sb, "[");
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
    public final boolean m24194() {
        return this.f31945;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m24196() {
        return this.f31944;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9436 m24192(PackageInfo packageInfo) {
        long j = packageInfo.lastUpdateTime;
        C4889 c4889 = new C4889();
        c4889.f17174 = true;
        c4889.f17172 = true;
        c4889.f17173 = true;
        InterfaceC1673 interfaceC1673 = C14063.f46206;
        C13638.requireNonNull(interfaceC1673);
        try {
            interfaceC1673.mo5587(packageInfo.applicationInfo.sourceDir, c4889);
        } catch (Throwable unused) {
        }
        return new C9436(packageInfo.packageName, c4889.f17173 && !packageInfo.applicationInfo.sourceDir.startsWith("/system"), c4889.f17174, c4889.f17172, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m24193(C9436 c9436, PackageInfo packageInfo) {
        return c9436.f31946.equals(packageInfo.packageName) && c9436.f31943 == packageInfo.lastUpdateTime;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24195(boolean z) {
        return z ? this.f31942 : this.f31945;
    }
}
