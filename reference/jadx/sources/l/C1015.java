package l;

import android.content.res.Resources;
import android.os.Build;

/* JADX INFO: renamed from: l.֨۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4TG */
/* JADX INFO: loaded from: classes2.dex */
public final class C1015 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3912(Resources.Theme theme) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            C9963.m25794(theme);
        } else if (i >= 23) {
            C18914.m43919(theme);
        }
    }
}
