package l;

import android.content.pm.ApplicationInfo;
import dalvik.system.DexClassLoader;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۢۧ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: A1X2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10090 extends DexClassLoader {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ApplicationInfo f32334;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26049(ApplicationInfo applicationInfo) {
        this.f32334 = applicationInfo;
    }

    @Override // dalvik.system.BaseDexClassLoader
    public final String toString() {
        ApplicationInfo applicationInfo = this.f32334;
        if (applicationInfo == null) {
            return super.toString();
        }
        Locale locale = Locale.ENGLISH;
        return C3188.m10404("dalvik.system.DexClassLoader[DexPathList[[zip file \"", applicationInfo.sourceDir, "\"],nativeLibraryDirectories=[", applicationInfo.nativeLibraryDir, ", /system/lib, /system/product/lib]]]");
    }
}
