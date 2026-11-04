package l;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import java.io.File;

/* JADX INFO: renamed from: l.᩵ۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 19BY */
/* JADX INFO: loaded from: classes5.dex */
public final class C20340 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final File f65258;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C3186 f65259;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final boolean f65260;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static long f65261;

    static {
        f65260 = Build.VERSION.SDK_INT >= 29 && C21576.m49056().targetSdkVersion >= 29;
        f65258 = new File(C21576.m49072(), "term/bin");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C3186 m46731() {
        PackageInfo packageInfoM49057;
        C3186 c3186;
        C3186 c3187 = f65259;
        if (c3187 != null && c3187.m10402()) {
            return c3187;
        }
        if (SystemClock.uptimeMillis() - f65261 >= 5000) {
            f65261 = SystemClock.uptimeMillis();
            if (!f65260) {
                AbstractC22044 abstractC22044M49876 = C6382.f21568.m49876("term/version");
                File file = f65258;
                if (file.isDirectory() && abstractC22044M49876.mo4304()) {
                    try {
                        C20348 c20348M49835 = abstractC22044M49876.m49835();
                        c3186 = new C3186(c20348M49835.readInt(), c20348M49835.m46758(), null, file);
                    } catch (Exception unused) {
                        c3186 = null;
                    }
                } else {
                    c3186 = null;
                }
            } else {
                try {
                    packageInfoM49057 = C21576.m49057("bin.mt.termex");
                } catch (PackageManager.NameNotFoundException unused2) {
                    packageInfoM49057 = null;
                }
                if (packageInfoM49057 != null) {
                    c3186 = new C3186(packageInfoM49057.versionCode, packageInfoM49057.versionName, packageInfoM49057.applicationInfo.sourceDir, new File(packageInfoM49057.applicationInfo.nativeLibraryDir));
                } else {
                    c3186 = null;
                }
            }
            if (c3186 != null && c3186.m10402()) {
                f65259 = c3186;
                return c3186;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m46730() {
        f65261 = 0L;
        f65259 = null;
    }
}
