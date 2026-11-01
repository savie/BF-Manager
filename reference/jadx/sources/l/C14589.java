package l;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: l.ܳܳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1N9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14589 extends C23761 {
    @Override // l.C0476
    /* JADX INFO: renamed from: ۙ */
    public final void mo2345(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // l.C0476
    /* JADX INFO: renamed from: ۙ */
    public final float mo2344(View view) {
        return view.getTransitionAlpha();
    }

    @Override // l.C23761, l.C0476
    /* JADX INFO: renamed from: ۙ */
    public final void mo2346(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // l.C6121, l.C0476
    /* JADX INFO: renamed from: ۙ */
    public final void mo2347(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // l.C12472
    /* JADX INFO: renamed from: ۙ */
    public final void mo30975(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // l.C12472
    /* JADX INFO: renamed from: ܰ */
    public final void mo30976(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
