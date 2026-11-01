package l;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import java.io.File;

/* JADX INFO: renamed from: l.ۙܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19BY */
/* JADX INFO: loaded from: classes2.dex */
public final class C4744 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static long f16691;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final File f16692;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C3478 f16693;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final boolean f16694;

    static {
        f16694 = Build.VERSION.SDK_INT >= 29 && C16737.m39261().targetSdkVersion >= 29;
        f16692 = new File(C16737.m39285(), "term/bin");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C3478 m13121() {
        PackageInfo packageInfoM39262;
        C3478 c3478;
        C3478 c3479 = f16693;
        if (c3479 != null && c3479.m10207()) {
            return c3479;
        }
        if (SystemClock.uptimeMillis() - f16691 >= 5000) {
            f16691 = SystemClock.uptimeMillis();
            if (!f16694) {
                AbstractC20745 abstractC20745M46690 = C11904.f39938.m46690("term/version");
                File file = f16692;
                if (file.isDirectory() && abstractC20745M46690.mo33971()) {
                    try {
                        C17367 c17367M46713 = abstractC20745M46690.m46713();
                        c3478 = new C3478(c17367M46713.readInt(), c17367M46713.m40458(), null, file);
                    } catch (Exception unused) {
                        c3478 = null;
                    }
                } else {
                    c3478 = null;
                }
            } else {
                try {
                    packageInfoM39262 = C16737.m39262("bin.mt.termex");
                } catch (PackageManager.NameNotFoundException unused2) {
                    packageInfoM39262 = null;
                }
                if (packageInfoM39262 != null) {
                    c3478 = new C3478(packageInfoM39262.versionCode, packageInfoM39262.versionName, packageInfoM39262.applicationInfo.sourceDir, new File(packageInfoM39262.applicationInfo.nativeLibraryDir));
                } else {
                    c3478 = null;
                }
            }
            if (c3478 != null && c3478.m10207()) {
                f16693 = c3478;
                return c3478;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m13120() {
        f16691 = 0L;
        f16693 = null;
    }
}
