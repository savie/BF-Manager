package l;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.۫ۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: W5UQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C12811 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f41045 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31773(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            C15048.m36204(viewGroup, z);
        } else if (f41045) {
            try {
                C15048.m36204(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                f41045 = false;
            }
        }
    }
}
