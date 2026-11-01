package l;

import android.content.pm.PackageInfo;
import android.graphics.drawable.ColorDrawable;

/* JADX INFO: renamed from: l.ۖۜۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes2.dex */
public final class C2358 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f8320;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f8321;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final PackageInfo f8322;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C19122 f8323 = new C19122(new ColorDrawable(0));

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f8324;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f8325;

    public C2358(PackageInfo packageInfo) {
        this.f8322 = packageInfo;
        this.f8321 = C16899.m39576(packageInfo);
        this.f8325 = packageInfo.packageName;
        this.f8320 = packageInfo.versionName + "   " + C1791.m5863(C5553.m15313(packageInfo.applicationInfo.sourceDir, new String[0]).mo33964());
    }
}
