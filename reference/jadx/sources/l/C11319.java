package l;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۧۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R697 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11319 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C15794 f35673;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Property f35674;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f35673 = new C6100();
        } else if (i >= 23) {
            f35673 = new C12065();
        } else if (i >= 22) {
            f35673 = new C3116();
        } else {
            f35673 = new C15794();
        }
        f35674 = new C5354(Float.class, "translationAlpha");
        new C1625(Rect.class, "clipBounds");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28605(View view, float f) {
        f35673.mo17606(view, f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m28603(View view) {
        return f35673.mo17605(view);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m28610() {
        f35673.getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28604() {
        f35673.getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28606(View view, int i) {
        f35673.mo17607(view, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28608(View view, Matrix matrix) {
        f35673.mo17608(view, matrix);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28609(ViewGroup viewGroup, Matrix matrix) {
        f35673.mo17609(viewGroup, matrix);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28607(View view, int i, int i2, int i3, int i4) {
        f35673.mo10194(view, i, i2, i3, i4);
    }
}
