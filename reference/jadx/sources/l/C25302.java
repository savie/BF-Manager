package l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩻᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 651C */
/* JADX INFO: loaded from: classes.dex */
public final class C25302 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Interpolator f81719 = new InterpolatorC5910();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f81720;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f81721;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f81722;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f81724;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public OverScroller f81725;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public View f81726;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float[] f81727;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f81728;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int[] f81729;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f81730;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int[] f81731;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f81732;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float[] f81733;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float[] f81734;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f81735;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f81736;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public VelocityTracker f81737;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC11875 f81738;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f81739;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f81740;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float[] f81742;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f81723 = -1;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Runnable f81741 = new RunnableC2181(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C25302 m56521(ViewGroup viewGroup, AbstractC11875 abstractC11875) {
        return new C25302(viewGroup.getContext(), viewGroup, abstractC11875);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C25302 m56520(ViewGroup viewGroup, float f, AbstractC11875 abstractC11875) {
        C25302 c25302M56521 = m56521(viewGroup, abstractC11875);
        c25302M56521.f81722 = (int) ((1.0f / f) * c25302M56521.f81722);
        return c25302M56521;
    }

    public C25302(Context context, ViewGroup viewGroup, AbstractC11875 abstractC11875) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC11875 == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f81721 = viewGroup;
        this.f81738 = abstractC11875;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f81739 = i;
        this.f81724 = i;
        this.f81722 = viewConfiguration.getScaledTouchSlop();
        this.f81732 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f81740 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f81725 = new OverScroller(context, f81719);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56534(float f) {
        this.f81740 = f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m56531() {
        return this.f81735;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m56540(int i) {
        this.f81730 = i;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m56542() {
        return this.f81724;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m56546(int i) {
        this.f81724 = i;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m56543() {
        return this.f81739;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56536(int i, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f81721;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f81726 = view;
        this.f81723 = i;
        this.f81738.onViewCaptured(view, i);
        m56535(1);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final View m56544() {
        return this.f81726;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m56539() {
        return this.f81722;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m56545() {
        this.f81723 = -1;
        float[] fArr = this.f81727;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f81742, 0.0f);
            Arrays.fill(this.f81733, 0.0f);
            Arrays.fill(this.f81734, 0.0f);
            Arrays.fill(this.f81720, 0);
            Arrays.fill(this.f81731, 0);
            Arrays.fill(this.f81729, 0);
            this.f81736 = 0;
        }
        VelocityTracker velocityTracker = this.f81737;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f81737 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56533() {
        m56545();
        if (this.f81735 == 2) {
            OverScroller overScroller = this.f81725;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            overScroller.abortAnimation();
            int currX2 = overScroller.getCurrX();
            int currY2 = overScroller.getCurrY();
            this.f81738.onViewPositionChanged(this.f81726, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        m56535(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m56538(View view, int i, int i2) {
        this.f81726 = view;
        this.f81723 = -1;
        boolean zM56525 = m56525(i, i2, 0, 0);
        if (!zM56525 && this.f81735 == 0 && this.f81726 != null) {
            this.f81726 = null;
        }
        return zM56525;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m56547(int i, int i2) {
        if (!this.f81728) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        return m56525(i, i2, (int) this.f81737.getXVelocity(this.f81723), (int) this.f81737.getYVelocity(this.f81723));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m56525(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f81726.getLeft();
        int top = this.f81726.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.f81725;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            m56535(0);
            return false;
        }
        View view = this.f81726;
        int i7 = (int) this.f81740;
        int i8 = (int) this.f81732;
        int iAbs = Math.abs(i3);
        if (iAbs < i7) {
            i3 = 0;
        } else if (iAbs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int i9 = (int) this.f81740;
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i9) {
            i4 = 0;
        } else if (iAbs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i10 = iAbs5 + iAbs6;
        int i11 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f = iAbs5;
            f2 = i10;
        } else {
            f = iAbs3;
            f2 = i11;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = iAbs6;
            f4 = i10;
        } else {
            f3 = iAbs4;
            f4 = i11;
        }
        float f6 = f3 / f4;
        AbstractC11875 abstractC11875 = this.f81738;
        overScroller.startScroll(left, top, i5, i6, (int) ((m56519(i6, i4, abstractC11875.getViewVerticalDragRange(view)) * f6) + (m56519(i5, i3, abstractC11875.getViewHorizontalDragRange(view)) * f5)));
        m56535(2);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m56519(int i, int i2, int i3) {
        int iAbs;
        if (i == 0) {
            return 0;
        }
        int width = this.f81721.getWidth();
        float f = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * f) + f;
        int iAbs2 = Math.abs(i2);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(iAbs, 600);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m56550() {
        if (this.f81735 == 2) {
            OverScroller overScroller = this.f81725;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f81726.getLeft();
            int top = currY - this.f81726.getTop();
            if (left != 0) {
                C22666.m51120(left, this.f81726);
            }
            if (top != 0) {
                C22666.m51107(top, this.f81726);
            }
            if (left != 0 || top != 0) {
                this.f81738.onViewPositionChanged(this.f81726, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f81721.post(this.f81741);
            }
        }
        return this.f81735 == 2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m56530(int i) {
        float[] fArr = this.f81727;
        if (fArr != null) {
            int i2 = this.f81736;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.f81742[i] = 0.0f;
                this.f81733[i] = 0.0f;
                this.f81734[i] = 0.0f;
                this.f81720[i] = 0;
                this.f81731[i] = 0;
                this.f81729[i] = 0;
                this.f81736 = (~i3) & i2;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m56528(float f, float f2, int i) {
        float[] fArr = this.f81727;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f81742;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f81733;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f81734;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f81720;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f81731;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f81729;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f81727 = fArr2;
            this.f81742 = fArr3;
            this.f81733 = fArr4;
            this.f81734 = fArr5;
            this.f81720 = iArr;
            this.f81731 = iArr2;
            this.f81729 = iArr3;
        }
        float[] fArr9 = this.f81727;
        this.f81733[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f81742;
        this.f81734[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f81720;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.f81721;
        int i5 = i3 < viewGroup.getLeft() + this.f81724 ? 1 : 0;
        if (i4 < viewGroup.getTop() + this.f81724) {
            i5 |= 4;
        }
        if (i3 > viewGroup.getRight() - this.f81724) {
            i5 |= 2;
        }
        if (i4 > viewGroup.getBottom() - this.f81724) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.f81736 |= 1 << i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m56526(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if ((this.f81736 & (1 << pointerId)) != 0) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f81733[pointerId] = x;
                this.f81734[pointerId] = y;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56535(int i) {
        this.f81721.removeCallbacks(this.f81741);
        if (this.f81735 != i) {
            this.f81735 = i;
            this.f81738.onViewDragStateChanged(i);
            if (this.f81735 == 0) {
                this.f81726 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m56548(int i, View view) {
        if (view == this.f81726 && this.f81723 == i) {
            return true;
        }
        if (view == null || !this.f81738.tryCaptureView(view, i)) {
            return false;
        }
        this.f81723 = i;
        m56536(i, view);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00de  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m56549(MotionEvent motionEvent) {
        View viewM56532;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m56545();
        }
        if (this.f81737 == null) {
            this.f81737 = VelocityTracker.obtain();
        }
        this.f81737.addMovement(motionEvent);
        AbstractC11875 abstractC11875 = this.f81738;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m56528(x, y, pointerId);
            View viewM56533 = m56532((int) x, (int) y);
            if (viewM56533 == this.f81726 && this.f81735 == 2) {
                m56548(pointerId, viewM56533);
            }
            int i = this.f81720[pointerId] & this.f81730;
            if (i != 0) {
                abstractC11875.onEdgeTouched(i, pointerId);
            }
        } else if (actionMasked == 1) {
            m56545();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                m56545();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m56528(x2, y2, pointerId2);
                int i2 = this.f81735;
                if (i2 == 0) {
                    int i3 = this.f81720[pointerId2] & this.f81730;
                    if (i3 != 0) {
                        abstractC11875.onEdgeTouched(i3, pointerId2);
                    }
                } else if (i2 == 2 && (viewM56532 = m56532((int) x2, (int) y2)) == this.f81726) {
                    m56548(pointerId2, viewM56532);
                }
            } else if (actionMasked == 6) {
                m56530(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f81727 != null && this.f81742 != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i4 = 0; i4 < pointerCount; i4++) {
                int pointerId3 = motionEvent.getPointerId(i4);
                if ((this.f81736 & (1 << pointerId3)) != 0) {
                    float x3 = motionEvent.getX(i4);
                    float y3 = motionEvent.getY(i4);
                    float f = x3 - this.f81727[pointerId3];
                    float f2 = y3 - this.f81742[pointerId3];
                    View viewM56534 = m56532((int) x3, (int) y3);
                    boolean z = viewM56534 != null && m56524(f, f2, viewM56534);
                    if (z) {
                        int left = viewM56534.getLeft();
                        int i5 = (int) f;
                        int iClampViewPositionHorizontal = abstractC11875.clampViewPositionHorizontal(viewM56534, left + i5, i5);
                        int top = viewM56534.getTop();
                        int i6 = (int) f2;
                        int iClampViewPositionVertical = abstractC11875.clampViewPositionVertical(viewM56534, top + i6, i6);
                        int viewHorizontalDragRange = abstractC11875.getViewHorizontalDragRange(viewM56534);
                        int viewVerticalDragRange = abstractC11875.getViewVerticalDragRange(viewM56534);
                        if ((viewHorizontalDragRange == 0 || (viewHorizontalDragRange > 0 && iClampViewPositionHorizontal == left)) && (viewVerticalDragRange == 0 || (viewVerticalDragRange > 0 && iClampViewPositionVertical == top))) {
                            break;
                        }
                        m56522(f, f2, pointerId3);
                        if (this.f81735 != 1 || (z && m56548(pointerId3, viewM56534))) {
                            break;
                        }
                    } else {
                        m56522(f, f2, pointerId3);
                        if (this.f81735 != 1) {
                            break;
                        }
                    }
                }
            }
            m56526(motionEvent);
        }
        return this.f81735 == 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56537(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m56545();
        }
        if (this.f81737 == null) {
            this.f81737 = VelocityTracker.obtain();
        }
        this.f81737.addMovement(motionEvent);
        AbstractC11875 abstractC11875 = this.f81738;
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM56532 = m56532((int) x, (int) y);
            m56528(x, y, pointerId);
            m56548(pointerId, viewM56532);
            int i3 = this.f81720[pointerId] & this.f81730;
            if (i3 != 0) {
                abstractC11875.onEdgeTouched(i3, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f81735 == 1) {
                m56527();
            }
            m56545();
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f81735 == 1) {
                    this.f81728 = true;
                    abstractC11875.onViewReleased(this.f81726, 0.0f, 0.0f);
                    this.f81728 = false;
                    if (this.f81735 == 1) {
                        m56535(0);
                    }
                }
                m56545();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m56528(x2, y2, pointerId2);
                if (this.f81735 != 0) {
                    if (m56529(this.f81726, (int) x2, (int) y2)) {
                        m56548(pointerId2, this.f81726);
                        return;
                    }
                    return;
                } else {
                    m56548(pointerId2, m56532((int) x2, (int) y2));
                    int i4 = this.f81720[pointerId2] & this.f81730;
                    if (i4 != 0) {
                        abstractC11875.onEdgeTouched(i4, pointerId2);
                        return;
                    }
                    return;
                }
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f81735 == 1 && pointerId3 == this.f81723) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.f81723) {
                        View viewM56533 = m56532((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view = this.f81726;
                        if (viewM56533 == view && m56548(pointerId4, view)) {
                            i = this.f81723;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    m56527();
                }
            }
            m56530(pointerId3);
            return;
        }
        if (this.f81735 == 1) {
            int i5 = this.f81723;
            if (((this.f81736 & (1 << i5)) != 0 ? 1 : 0) == 0) {
                return;
            }
            int iFindPointerIndex = motionEvent.findPointerIndex(i5);
            float x3 = motionEvent.getX(iFindPointerIndex);
            float y3 = motionEvent.getY(iFindPointerIndex);
            float[] fArr = this.f81733;
            int i6 = this.f81723;
            int i7 = (int) (x3 - fArr[i6]);
            int i8 = (int) (y3 - this.f81734[i6]);
            int left = this.f81726.getLeft() + i7;
            int top = this.f81726.getTop() + i8;
            int left2 = this.f81726.getLeft();
            int top2 = this.f81726.getTop();
            if (i7 != 0) {
                left = abstractC11875.clampViewPositionHorizontal(this.f81726, left, i7);
                C22666.m51120(left - left2, this.f81726);
            }
            int i9 = left;
            if (i8 != 0) {
                top = abstractC11875.clampViewPositionVertical(this.f81726, top, i8);
                C22666.m51107(top - top2, this.f81726);
            }
            int i10 = top;
            if (i7 != 0 || i8 != 0) {
                this.f81738.onViewPositionChanged(this.f81726, i9, i10, i9 - left2, i10 - top2);
            }
            m56526(motionEvent);
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount2; i11++) {
            int pointerId5 = motionEvent.getPointerId(i11);
            if ((this.f81736 & (1 << pointerId5)) != 0) {
                float x4 = motionEvent.getX(i11);
                float y4 = motionEvent.getY(i11);
                float f = x4 - this.f81727[pointerId5];
                float f2 = y4 - this.f81742[pointerId5];
                m56522(f, f2, pointerId5);
                if (this.f81735 == 1) {
                    break;
                }
                View viewM56534 = m56532((int) x4, (int) y4);
                if (m56524(f, f2, viewM56534) && m56548(pointerId5, viewM56534)) {
                    break;
                }
            }
        }
        m56526(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [l.ۧ᩷ۙ] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56522(float f, float f2, int i) {
        int i2;
        boolean zM56523 = m56523(f, f2, i, 1);
        ?? r0 = zM56523;
        if (m56523(f2, f, i, 4)) {
            r0 = (zM56523 ? 1 : 0) | 4;
        }
        ?? r1 = r0;
        if (m56523(f, f2, i, 2)) {
            r1 = (r0 == true ? 1 : 0) | 2;
        }
        ?? r2 = r1;
        if (m56523(f2, f, i, 8)) {
            i2 = (r1 == true ? 1 : 0) | 8;
        }
        if (r2 == 0) {
            r2 = i2;
            return;
        }
        r2 = i2;
        int[] iArr = this.f81731;
        iArr[i] = (iArr[i] | r2) == true ? 1 : 0;
        this.f81738.onEdgeDragStarted(r2, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m56523(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.f81720[i] & i2) == i2 && (this.f81730 & i2) != 0 && (this.f81729[i] & i2) != i2 && (this.f81731[i] & i2) != i2) {
            float f3 = this.f81722;
            if (fAbs > f3 || fAbs2 > f3) {
                if (fAbs < fAbs2 * 0.5f && this.f81738.onEdgeLock(i2)) {
                    int[] iArr = this.f81729;
                    iArr[i] = iArr[i] | i2;
                    return false;
                }
                if ((this.f81731[i] & i2) == 0 && fAbs > this.f81722) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m56524(float f, float f2, View view) {
        if (view == null) {
            return false;
        }
        AbstractC11875 abstractC11875 = this.f81738;
        boolean z = abstractC11875.getViewHorizontalDragRange(view) > 0;
        boolean z2 = abstractC11875.getViewVerticalDragRange(view) > 0;
        if (z && z2) {
            float f3 = (f2 * f2) + (f * f);
            int i = this.f81722;
            return f3 > ((float) (i * i));
        }
        if (z) {
            return Math.abs(f) > ((float) this.f81722);
        }
        return z2 && Math.abs(f2) > ((float) this.f81722);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m56541() {
        int length = this.f81727.length;
        for (int i = 0; i < length; i++) {
            if ((this.f81736 & (1 << i)) != 0) {
                float f = this.f81733[i] - this.f81727[i];
                float f2 = this.f81734[i] - this.f81742[i];
                float f3 = (f2 * f2) + (f * f);
                int i2 = this.f81722;
                if (f3 > i2 * i2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m56527() {
        VelocityTracker velocityTracker = this.f81737;
        float f = this.f81732;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f81737.getXVelocity(this.f81723);
        float f2 = this.f81740;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f81737.getYVelocity(this.f81723);
        float f3 = this.f81740;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f3) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.f81728 = true;
        this.f81738.onViewReleased(this.f81726, xVelocity, f);
        this.f81728 = false;
        if (this.f81735 == 1) {
            m56535(0);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m56529(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View m56532(int i, int i2) {
        ViewGroup viewGroup = this.f81721;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = viewGroup.getChildAt(this.f81738.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
    }
}
