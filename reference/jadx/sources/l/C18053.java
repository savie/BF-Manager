package l;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: l.ᩳ۫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 63JU */
/* JADX INFO: loaded from: classes5.dex */
public final class C18053 extends C3941 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18759 f57717;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18053(C18759 c18759, Context context) {
        super(context);
        this.f57717 = c18759;
    }

    @Override // l.C3941, l.AbstractC21020
    public final void onTargetFound(View view, C16082 c16082, C10438 c10438) {
        C18759 c18759 = this.f57717;
        int[] iArrCalculateDistanceToFinalSnap = c18759.calculateDistanceToFinalSnap(c18759.mRecyclerView.getLayoutManager(), view);
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

    @Override // l.C3941
    public final int calculateTimeForScrolling(int i) {
        return Math.min(100, super.calculateTimeForScrolling(i));
    }
}
