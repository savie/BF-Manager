package l;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽܿܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC16787 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f53773;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17492 f53774;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public OverScroller f53775;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f53776;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f53777;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f53778;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Interpolator f53779;

    public RunnableC16787(C17492 c17492) {
        this.f53774 = c17492;
        Interpolator interpolator = C17492.sQuinticInterpolator;
        this.f53779 = interpolator;
        this.f53776 = false;
        this.f53778 = false;
        this.f53775 = new OverScroller(c17492.getContext(), interpolator);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C17492 c17492 = this.f53774;
        if (c17492.mLayout != null) {
            this.f53778 = false;
            this.f53776 = true;
            c17492.consumePendingUpdateOperations();
            OverScroller overScroller = this.f53775;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i6 = currX - this.f53773;
                int i7 = currY - this.f53777;
                this.f53773 = currX;
                this.f53777 = currY;
                int iConsumeFlingInHorizontalStretch = c17492.consumeFlingInHorizontalStretch(i6);
                int iConsumeFlingInVerticalStretch = c17492.consumeFlingInVerticalStretch(i7);
                int[] iArr = c17492.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (c17492.dispatchNestedPreScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr, null, 1)) {
                    int[] iArr2 = c17492.mReusableIntPair;
                    iConsumeFlingInHorizontalStretch -= iArr2[0];
                    iConsumeFlingInVerticalStretch -= iArr2[1];
                }
                if (c17492.getOverScrollMode() != 2) {
                    c17492.considerReleasingGlowsOnScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch);
                }
                if (c17492.mAdapter != null) {
                    int[] iArr3 = c17492.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    c17492.scrollStep(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr3);
                    int[] iArr4 = c17492.mReusableIntPair;
                    int i8 = iArr4[0];
                    int i9 = iArr4[1];
                    int i10 = iConsumeFlingInHorizontalStretch - i8;
                    int i11 = iConsumeFlingInVerticalStretch - i9;
                    AbstractC21020 abstractC21020 = c17492.mLayout.mSmoothScroller;
                    if (abstractC21020 != null && !abstractC21020.isPendingInitialRun() && abstractC21020.isRunning()) {
                        int iM38108 = c17492.mState.m38108();
                        if (iM38108 == 0) {
                            abstractC21020.stop();
                        } else if (abstractC21020.getTargetPosition() >= iM38108) {
                            abstractC21020.setTargetPosition(iM38108 - 1);
                            abstractC21020.onAnimation(i8, i9);
                        } else {
                            abstractC21020.onAnimation(i8, i9);
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
                if (!c17492.mItemDecorations.isEmpty()) {
                    c17492.invalidate();
                }
                int[] iArr5 = c17492.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                c17492.dispatchNestedScroll(i4, i3, i, i2, null, 1, iArr5);
                int[] iArr6 = c17492.mReusableIntPair;
                int i12 = i - iArr6[0];
                int i13 = i2 - iArr6[1];
                if (i4 != 0 || i3 != 0) {
                    c17492.dispatchOnScrolled(i4, i3);
                }
                if (!c17492.awakenScrollBars()) {
                    c17492.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
                AbstractC21020 abstractC21021 = c17492.mLayout.mSmoothScroller;
                if ((abstractC21021 == null || !abstractC21021.isPendingInitialRun()) && z) {
                    if (c17492.getOverScrollMode() != 2) {
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
                        c17492.absorbGlows(i5, currVelocity);
                    }
                    if (C17492.ALLOW_THREAD_GAP_WORK) {
                        C8301 c8301 = c17492.mPrefetchRegistry;
                        int[] iArr7 = c8301.f28824;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        c8301.f28822 = 0;
                    }
                } else {
                    m39437();
                    RunnableC9007 runnableC9007 = c17492.mGapWorker;
                    if (runnableC9007 != null) {
                        runnableC9007.m23323(c17492, i4, i3);
                    }
                }
            }
            AbstractC21020 abstractC21022 = c17492.mLayout.mSmoothScroller;
            if (abstractC21022 != null && abstractC21022.isPendingInitialRun()) {
                abstractC21022.onAnimation(0, 0);
            }
            this.f53776 = false;
            if (!this.f53778) {
                c17492.setScrollState(0);
                c17492.stopNestedScroll(1);
                return;
            } else {
                c17492.removeCallbacks(this);
                int i14 = C5031.f17539;
                c17492.postOnAnimation(this);
                return;
            }
        }
        c17492.removeCallbacks(this);
        this.f53775.abortAnimation();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39437() {
        if (this.f53776) {
            this.f53778 = true;
            return;
        }
        C17492 c17492 = this.f53774;
        c17492.removeCallbacks(this);
        int i = C5031.f17539;
        c17492.postOnAnimation(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39438(int i, int i2) {
        C17492 c17492 = this.f53774;
        c17492.setScrollState(2);
        this.f53777 = 0;
        this.f53773 = 0;
        Interpolator interpolator = this.f53779;
        Interpolator interpolator2 = C17492.sQuinticInterpolator;
        if (interpolator != interpolator2) {
            this.f53779 = interpolator2;
            this.f53775 = new OverScroller(c17492.getContext(), interpolator2);
        }
        this.f53775.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        m39437();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39439(int i, int i2, Interpolator interpolator, int i3) {
        C17492 c17492 = this.f53774;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? c17492.getWidth() : c17492.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = C17492.sQuinticInterpolator;
        }
        if (this.f53779 != interpolator) {
            this.f53779 = interpolator;
            this.f53775 = new OverScroller(c17492.getContext(), interpolator);
        }
        this.f53777 = 0;
        this.f53773 = 0;
        c17492.setScrollState(2);
        this.f53775.startScroll(0, 0, i, i2, i4);
        if (Build.VERSION.SDK_INT < 23) {
            this.f53775.computeScrollOffset();
        }
        m39437();
    }
}
