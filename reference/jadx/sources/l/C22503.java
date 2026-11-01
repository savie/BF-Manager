package l;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: renamed from: l.᩹᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: W5UQ */
/* JADX INFO: loaded from: classes.dex */
public final class C22503 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f73464 = new ThreadLocal();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f73465 = new ThreadLocal();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50023(C2746 c2746, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal = f73464;
        Matrix matrix = (Matrix) threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        m50022(c2746, view, matrix);
        ThreadLocal threadLocal2 = f73465;
        RectF rectF = (RectF) threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50022(C2746 c2746, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != c2746) {
            View view2 = (View) parent;
            m50022(c2746, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
