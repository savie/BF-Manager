package l;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֫ᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2106 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f6972;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public OverScroller f6973;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25227 f6974;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f6975;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f6976;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f6977;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Interpolator f6978;

    public RunnableC2106(C25227 c25227) {
        this.f6974 = c25227;
        Interpolator interpolator = C25227.sQuinticInterpolator;
        this.f6978 = interpolator;
        this.f6975 = false;
        this.f6977 = false;
        this.f6973 = new OverScroller(c25227.getContext(), interpolator);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C25227 c25227 = this.f6974;
        if (c25227.mLayout != null) {
            this.f6977 = false;
            this.f6975 = true;
            c25227.consumePendingUpdateOperations();
            OverScroller overScroller = this.f6973;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i6 = currX - this.f6976;
                int i7 = currY - this.f6972;
                this.f6976 = currX;
                this.f6972 = currY;
                int iConsumeFlingInHorizontalStretch = c25227.consumeFlingInHorizontalStretch(i6);
                int iConsumeFlingInVerticalStretch = c25227.consumeFlingInVerticalStretch(i7);
                int[] iArr = c25227.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (c25227.dispatchNestedPreScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr, null, 1)) {
                    int[] iArr2 = c25227.mReusableIntPair;
                    iConsumeFlingInHorizontalStretch -= iArr2[0];
                    iConsumeFlingInVerticalStretch -= iArr2[1];
                }
                if (c25227.getOverScrollMode() != 2) {
                    c25227.considerReleasingGlowsOnScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch);
                }
                if (c25227.mAdapter != null) {
                    int[] iArr3 = c25227.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    c25227.scrollStep(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr3);
                    int[] iArr4 = c25227.mReusableIntPair;
                    int i8 = iArr4[0];
                    int i9 = iArr4[1];
                    int i10 = iConsumeFlingInHorizontalStretch - i8;
                    int i11 = iConsumeFlingInVerticalStretch - i9;
                    AbstractC20005 abstractC20005 = c25227.mLayout.mSmoothScroller;
                    if (abstractC20005 != null && !abstractC20005.isPendingInitialRun() && abstractC20005.isRunning()) {
                        int iM37184 = c25227.mState.m37184();
                        if (iM37184 == 0) {
                            abstractC20005.stop();
                        } else if (abstractC20005.getTargetPosition() >= iM37184) {
                            abstractC20005.setTargetPosition(iM37184 - 1);
                            abstractC20005.onAnimation(i8, i9);
                        } else {
                            abstractC20005.onAnimation(i8, i9);
                        }
                    }
                    i3 = i9;
                    i4 = i8;
                    i = i10;
                    i2 = i11;
                } else {
                    i = iConsumeFlingInHorizontalStretch;
                    i2 = iConsumeFlingInVerticalStretch;
                    i3 = 0;
                    i4 = 0;
                }
                if (!c25227.mItemDecorations.isEmpty()) {
                    c25227.invalidate();
                }
                int[] iArr5 = c25227.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                c25227.dispatchNestedScroll(i4, i3, i, i2, null, 1, iArr5);
                int[] iArr6 = c25227.mReusableIntPair;
                int i12 = i - iArr6[0];
                int i13 = i2 - iArr6[1];
                if (i4 != 0 || i3 != 0) {
                    c25227.dispatchOnScrolled(i4, i3);
                }
                if (!c25227.awakenScrollBars()) {
                    c25227.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
                AbstractC20005 abstractC20006 = c25227.mLayout.mSmoothScroller;
                if ((abstractC20006 == null || !abstractC20006.isPendingInitialRun()) && z) {
                    if (c25227.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i12 < 0) {
                            i5 = -currVelocity;
                        } else {
                            i5 = i12 > 0 ? currVelocity : 0;
                        }
                        if (i13 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i13 <= 0) {
                            currVelocity = 0;
                        }
                        c25227.absorbGlows(i5, currVelocity);
                    }
                    if (C25227.ALLOW_THREAD_GAP_WORK) {
                        C7304 c7304 = c25227.mPrefetchRegistry;
                        int[] iArr7 = c7304.f24042;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        c7304.f24040 = 0;
                    }
                } else {
                    m7279();
                    RunnableC4542 runnableC4542 = c25227.mGapWorker;
                    if (runnableC4542 != null) {
                        runnableC4542.m14284(c25227, i4, i3);
                    }
                }
                if (Build.VERSION.SDK_INT >= 35) {
                    C11472.m28839(c25227, Math.abs(overScroller.getCurrVelocity()));
                }
            }
            AbstractC20005 abstractC20007 = c25227.mLayout.mSmoothScroller;
            if (abstractC20007 != null && abstractC20007.isPendingInitialRun()) {
                abstractC20007.onAnimation(0, 0);
            }
            this.f6975 = false;
            if (!this.f6977) {
                c25227.setScrollState(0);
                c25227.stopNestedScroll(1);
                return;
            } else {
                c25227.removeCallbacks(this);
                int i14 = C22666.f73603;
                c25227.postOnAnimation(this);
                return;
            }
        }
        c25227.removeCallbacks(this);
        this.f6973.abortAnimation();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7279() {
        if (this.f6975) {
            this.f6977 = true;
            return;
        }
        C25227 c25227 = this.f6974;
        c25227.removeCallbacks(this);
        int i = C22666.f73603;
        c25227.postOnAnimation(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7280(int i, int i2) {
        C25227 c25227 = this.f6974;
        c25227.setScrollState(2);
        this.f6972 = 0;
        this.f6976 = 0;
        Interpolator interpolator = this.f6978;
        Interpolator interpolator2 = C25227.sQuinticInterpolator;
        if (interpolator != interpolator2) {
            this.f6978 = interpolator2;
            this.f6973 = new OverScroller(c25227.getContext(), interpolator2);
        }
        this.f6973.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        m7279();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7281(int i, int i2, Interpolator interpolator, int i3) {
        C25227 c25227 = this.f6974;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? c25227.getWidth() : c25227.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = C25227.sQuinticInterpolator;
        }
        if (this.f6978 != interpolator) {
            this.f6978 = interpolator;
            this.f6973 = new OverScroller(c25227.getContext(), interpolator);
        }
        this.f6972 = 0;
        this.f6976 = 0;
        c25227.setScrollState(2);
        this.f6973.startScroll(0, 0, i, i2, i4);
        if (Build.VERSION.SDK_INT < 23) {
            this.f6973.computeScrollOffset();
        }
        m7279();
    }
}
