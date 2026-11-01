package l;

import android.content.res.Resources;
import android.os.Build;

/* JADX INFO: renamed from: l.֡۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4TG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0402 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2136(Resources.Theme theme) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            C20159.m45581(theme);
        } else if (i >= 23) {
            C15926.m37889(theme);
        }
    }
}
