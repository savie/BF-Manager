package l;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: l.᩵ᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 92WK */
/* JADX INFO: loaded from: classes5.dex */
public final class C20751 extends C7525 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12546 f66496;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20751(AbstractC12546 abstractC12546, Context context) {
        super(context);
        this.f66496 = abstractC12546;
    }

    @Override // l.C7525, l.AbstractC20005
    public final void onTargetFound(View view, C15529 c15529, C11054 c11054) {
        AbstractC12546 abstractC12546 = this.f66496;
        C25227 c25227 = abstractC12546.mRecyclerView;
        if (c25227 == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = abstractC12546.calculateDistanceToFinalSnap(c25227.getLayoutManager(), view);
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
}
