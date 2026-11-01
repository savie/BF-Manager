package l;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܺ۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: N5A8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15945 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m37906(int i) {
        return i >= 1024 && i <= 65535;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Integer m37905(String str) {
        String strTrim = str == null ? "" : str.trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        try {
            int i = Integer.parseInt(strTrim);
            if (m37906(i)) {
                return Integer.valueOf(i);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Drawable m37904(Context context, int i) {
        return C4800.m13323().m13329(context, i);
    }
}
