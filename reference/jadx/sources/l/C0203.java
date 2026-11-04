package l;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: l.֡ۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0203 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f1362;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f1363 = false;

    public C0203() {
        PackageInfo packageInfoM49057;
        boolean z = C20340.f65260;
        try {
            packageInfoM49057 = C21576.m49057("bin.mt.termex");
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfoM49057 = null;
        }
        this.f1362 = packageInfoM49057 != null ? packageInfoM49057.lastUpdateTime : 0L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m1604() {
        PackageInfo packageInfoM49057;
        boolean z = C20340.f65260;
        try {
            packageInfoM49057 = C21576.m49057("bin.mt.termex");
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfoM49057 = null;
        }
        return (packageInfoM49057 == null || packageInfoM49057.lastUpdateTime == this.f1362) ? false : true;
    }
}
