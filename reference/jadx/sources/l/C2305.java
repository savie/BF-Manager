package l;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: l.ۖ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 63JU */
/* JADX INFO: loaded from: classes3.dex */
public final class C2305 extends C7525 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8271 f7467;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2305(C8271 c8271, Context context) {
        super(context);
        this.f7467 = c8271;
    }

    @Override // l.C7525, l.AbstractC20005
    public final void onTargetFound(View view, C15529 c15529, C11054 c11054) {
        C8271 c8271 = this.f7467;
        int[] iArrCalculateDistanceToFinalSnap = c8271.calculateDistanceToFinalSnap(c8271.mRecyclerView.getLayoutManager(), view);
        int i = iArrCalculateDistanceToFinalSnap[0];
        int i2 = iArrCalculateDistanceToFinalSnap[1];
        int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
        if (iCalculateTimeForDeceleration > 0) {
            c11054.m27938(i, i2, this.mDecelerateInterpolator, iCalculateTimeForDeceleration);
        }
    }

    @Override // l.C7525
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // l.C7525
    public final int calculateTimeForScrolling(int i) {
        return Math.min(100, super.calculateTimeForScrolling(i));
    }
}
