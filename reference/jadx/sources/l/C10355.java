package l;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۤܳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5UQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10355 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f35500 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26251(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            C8944.m23243(viewGroup, z);
        } else if (f35500) {
            try {
                C8944.m23243(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                f35500 = false;
            }
        }
    }
}
