package l;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܺܳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: R697 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16000 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C12472 f51806;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Property f51807;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f51806 = new C14589();
        } else if (i >= 23) {
            f51806 = new C23761();
        } else if (i >= 22) {
            f51806 = new C6121();
        } else {
            f51806 = new C12472();
        }
        f51807 = new C7532(Float.class, "translationAlpha");
        new C20938(Rect.class, "clipBounds");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37977(View view, float f) {
        f51806.mo2345(view, f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m37975(View view) {
        return f51806.mo2344(view);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m37982() {
        f51806.getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37976() {
        f51806.getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37978(View view, int i) {
        f51806.mo2346(view, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37980(View view, Matrix matrix) {
        f51806.mo30975(view, matrix);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37981(ViewGroup viewGroup, Matrix matrix) {
        f51806.mo30976(viewGroup, matrix);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37979(View view, int i, int i2, int i3, int i4) {
        f51806.mo2347(view, i, i2, i3, i4);
    }
}
