package l;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: l.ۜܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C6861 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f23141;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f23142 = false;

    public C6861() {
        PackageInfo packageInfoM39262;
        boolean z = C4744.f16694;
        try {
            packageInfoM39262 = C16737.m39262("bin.mt.termex");
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfoM39262 = null;
        }
        this.f23141 = packageInfoM39262 != null ? packageInfoM39262.lastUpdateTime : 0L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18483() {
        PackageInfo packageInfoM39262;
        boolean z = C4744.f16694;
        try {
            packageInfoM39262 = C16737.m39262("bin.mt.termex");
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfoM39262 = null;
        }
        return (packageInfoM39262 == null || packageInfoM39262.lastUpdateTime == this.f23141) ? false : true;
    }
}
