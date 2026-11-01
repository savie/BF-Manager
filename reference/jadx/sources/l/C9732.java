package l;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: l.ۢܿܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 92WK */
/* JADX INFO: loaded from: classes4.dex */
public final class C9732 extends C3941 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3380 f32758;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9732(AbstractC3380 abstractC3380, Context context) {
        super(context);
        this.f32758 = abstractC3380;
    }

    @Override // l.C3941, l.AbstractC21020
    public final void onTargetFound(View view, C16082 c16082, C10438 c10438) {
        AbstractC3380 abstractC3380 = this.f32758;
        C17492 c17492 = abstractC3380.mRecyclerView;
        if (c17492 == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = abstractC3380.calculateDistanceToFinalSnap(c17492.getLayoutManager(), view);
        int i = iArrCalculateDistanceToFinalSnap[0];
        int i2 = iArrCalculateDistanceToFinalSnap[1];
        int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
        if (iCalculateTimeForDeceleration > 0) {
            c10438.m26352(i, i2, this.mDecelerateInterpolator, iCalculateTimeForDeceleration);
        }
    }

    @Override // l.C3941
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
