package l;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import java.io.File;

/* JADX INFO: renamed from: l.ۧۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1X2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10823 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Configuration f36854;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final PackageInfo f36855;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final DisplayMetrics f36856;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Configuration m27135(C10823 c10823) {
        c10823.getClass();
        return new Configuration(c10823.f36854);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static DisplayMetrics m27138(C10823 c10823) {
        c10823.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.setTo(c10823.f36856);
        return displayMetrics;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10823 m27136(Context context, File file) throws PackageManager.NameNotFoundException {
        PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getPath(), 4239);
        if (packageArchiveInfo == null || packageArchiveInfo.applicationInfo == null) {
            throw new PackageManager.NameNotFoundException(file.getPath());
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.setTo(context.getResources().getDisplayMetrics());
        return new C10823(C23523.m51808(packageArchiveInfo), displayMetrics, new Configuration(context.getResources().getConfiguration()));
    }

    public C10823(PackageInfo packageInfo, DisplayMetrics displayMetrics, Configuration configuration) {
        this.f36855 = packageInfo;
        this.f36856 = displayMetrics;
        this.f36854 = configuration;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static PackageInfo m27137(C10823 c10823) {
        return C23523.m51808(c10823.f36855);
    }
}
