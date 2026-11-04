package l;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: l.ۛۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: N1N9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6100 extends C12065 {
    @Override // l.C16540
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17606(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // l.C16540
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float mo17605(View view) {
        return view.getTransitionAlpha();
    }

    @Override // l.C12065, l.C16540
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17607(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // l.C3116, l.C16540
    /* JADX INFO: renamed from: ۙ */
    public final void mo10194(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // l.C15794
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17608(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // l.C15794
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo17609(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
