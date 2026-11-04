package l;

import android.content.pm.PackageInfo;
import android.graphics.drawable.ColorDrawable;

/* JADX INFO: renamed from: l.᩶᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes.dex */
public final class C21554 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f68836;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C6389 f68837 = new C6389(new ColorDrawable(0));

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f68838;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final PackageInfo f68839;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f68840;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f68841;

    public C21554(PackageInfo packageInfo) {
        this.f68839 = packageInfo;
        this.f68836 = C14364.m34796(packageInfo);
        this.f68838 = packageInfo.packageName;
        this.f68841 = packageInfo.versionName + "   " + C8311.m22390(C14584.m35193(packageInfo.applicationInfo.sourceDir, new String[0]).mo4285());
    }
}
