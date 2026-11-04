package l;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import java.io.File;

/* JADX INFO: renamed from: l.۟ۧ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: D1X2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7854 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Configuration f26165;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final PackageInfo f26166;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final DisplayMetrics f26167;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Configuration m21375(C7854 c7854) {
        c7854.getClass();
        return new Configuration(c7854.f26165);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static DisplayMetrics m21378(C7854 c7854) {
        c7854.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.setTo(c7854.f26167);
        return displayMetrics;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7854 m21376(Context context, File file) throws PackageManager.NameNotFoundException {
        PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getPath(), 4239);
        if (packageArchiveInfo == null || packageArchiveInfo.applicationInfo == null) {
            throw new PackageManager.NameNotFoundException(file.getPath());
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.setTo(context.getResources().getDisplayMetrics());
        return new C7854(C19041.m44142(packageArchiveInfo), displayMetrics, new Configuration(context.getResources().getConfiguration()));
    }

    public C7854(PackageInfo packageInfo, DisplayMetrics displayMetrics, Configuration configuration) {
        this.f26166 = packageInfo;
        this.f26167 = displayMetrics;
        this.f26165 = configuration;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static PackageInfo m21377(C7854 c7854) {
        return C19041.m44142(c7854.f26166);
    }
}
