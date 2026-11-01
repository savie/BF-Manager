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

/* JADX INFO: renamed from: l.ܶܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 651C */
/* JADX INFO: loaded from: classes4.dex */
public final class C15265 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Interpolator f49737 = new InterpolatorC3974();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int[] f49738;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f49739;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int[] f49740;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f49742;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float[] f49743;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final ViewGroup f49745;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f49746;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public OverScroller f49747;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public View f49748;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f49749;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC23026 f49750;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float[] f49751;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f49752;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f49753;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f49754;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f49755;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public VelocityTracker f49756;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f49757;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float[] f49758;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int[] f49759;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float[] f49760;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f49741 = -1;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Runnable f49744 = new RunnableC6797(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15265 m36542(ViewGroup viewGroup, AbstractC23026 abstractC23026) {
        return new C15265(viewGroup.getContext(), viewGroup, abstractC23026);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15265 m36541(ViewGroup viewGroup, float f, AbstractC23026 abstractC23026) {
        C15265 c15265M36542 = m36542(viewGroup, abstractC23026);
        c15265M36542.f49757 = (int) ((1.0f / f) * c15265M36542.f49757);
        return c15265M36542;
    }

    public C15265(Context context, ViewGroup viewGroup, AbstractC23026 abstractC23026) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC23026 == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f49745 = viewGroup;
        this.f49750 = abstractC23026;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f49739 = i;
        this.f49749 = i;
        this.f49757 = viewConfiguration.getScaledTouchSlop();
        this.f49753 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f49754 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f49747 = new OverScroller(context, f49737);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36556(float f) {
        this.f49754 = f;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m36553() {
        return this.f49742;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m36562(int i) {
        this.f49752 = i;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m36551() {
        return this.f49749;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36566(int i) {
        this.f49749 = i;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m36570() {
        return this.f49739;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36558(int i, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f49745;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f49748 = view;
        this.f49741 = i;
        this.f49750.onViewCaptured(view, i);
        m36557(1);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final View m36561() {
        return this.f49748;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m36564() {
        return this.f49757;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36565() {
        this.f49741 = -1;
        float[] fArr = this.f49743;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f49760, 0.0f);
            Arrays.fill(this.f49751, 0.0f);
            Arrays.fill(this.f49758, 0.0f);
            Arrays.fill(this.f49740, 0);
            Arrays.fill(this.f49759, 0);
            Arrays.fill(this.f49738, 0);
            this.f49755 = 0;
        }
        VelocityTracker velocityTracker = this.f49756;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f49756 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36555() {
        m36565();
        if (this.f49742 == 2) {
            OverScroller overScroller = this.f49747;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            overScroller.abortAnimation();
            int currX2 = overScroller.getCurrX();
            int currY2 = overScroller.getCurrY();
            this.f49750.onViewPositionChanged(this.f49748, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        m36557(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36560(View view, int i, int i2) {
        this.f49748 = view;
        this.f49741 = -1;
        boolean zM36546 = m36546(i, i2, 0, 0);
        if (!zM36546 && this.f49742 == 0 && this.f49748 != null) {
            this.f49748 = null;
        }
        return zM36546;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m36567(int i, int i2) {
        if (!this.f49746) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        return m36546(i, i2, (int) this.f49756.getXVelocity(this.f49741), (int) this.f49756.getYVelocity(this.f49741));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m36546(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f49748.getLeft();
        int top = this.f49748.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.f49747;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            m36557(0);
            return false;
        }
        View view = this.f49748;
        int i7 = (int) this.f49754;
        int i8 = (int) this.f49753;
        int iAbs = Math.abs(i3);
        if (iAbs < i7) {
            i3 = 0;
        } else if (iAbs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int i9 = (int) this.f49754;
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
        AbstractC23026 abstractC23026 = this.f49750;
        overScroller.startScroll(left, top, i5, i6, (int) ((m36540(i6, i4, abstractC23026.getViewVerticalDragRange(view)) * f6) + (m36540(i5, i3, abstractC23026.getViewHorizontalDragRange(view)) * f5)));
        m36557(2);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m36540(int i, int i2, int i3) {
        int iAbs;
        if (i == 0) {
            return 0;
        }
        int width = this.f49745.getWidth();
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m36552() {
        if (this.f49742 == 2) {
            OverScroller overScroller = this.f49747;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f49748.getLeft();
            int top = currY - this.f49748.getTop();
            if (left != 0) {
                C5031.m14009(left, this.f49748);
            }
            if (top != 0) {
                C5031.m14004(top, this.f49748);
            }
            if (left != 0 || top != 0) {
                this.f49750.onViewPositionChanged(this.f49748, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f49745.post(this.f49744);
            }
        }
        return this.f49742 == 2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m36539(int i) {
        float[] fArr = this.f49743;
        if (fArr != null) {
            int i2 = this.f49755;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.f49760[i] = 0.0f;
                this.f49751[i] = 0.0f;
                this.f49758[i] = 0.0f;
                this.f49740[i] = 0;
                this.f49759[i] = 0;
                this.f49738[i] = 0;
                this.f49755 = (~i3) & i2;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m36549(float f, float f2, int i) {
        float[] fArr = this.f49743;
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
                float[] fArr6 = this.f49760;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f49751;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f49758;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f49740;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f49759;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f49738;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f49743 = fArr2;
            this.f49760 = fArr3;
            this.f49751 = fArr4;
            this.f49758 = fArr5;
            this.f49740 = iArr;
            this.f49759 = iArr2;
            this.f49738 = iArr3;
        }
        float[] fArr9 = this.f49743;
        this.f49751[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f49760;
        this.f49758[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f49740;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.f49745;
        int i5 = i3 < viewGroup.getLeft() + this.f49749 ? 1 : 0;
        if (i4 < viewGroup.getTop() + this.f49749) {
            i5 |= 4;
        }
        if (i3 > viewGroup.getRight() - this.f49749) {
            i5 |= 2;
        }
        if (i4 > viewGroup.getBottom() - this.f49749) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.f49755 |= 1 << i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m36548(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if ((this.f49755 & (1 << pointerId)) != 0) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f49751[pointerId] = x;
                this.f49758[pointerId] = y;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36557(int i) {
        this.f49745.removeCallbacks(this.f49744);
        if (this.f49742 != i) {
            this.f49742 = i;
            this.f49750.onViewDragStateChanged(i);
            if (this.f49742 == 0) {
                this.f49748 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m36568(int i, View view) {
        if (view == this.f49748 && this.f49741 == i) {
            return true;
        }
        if (view == null || !this.f49750.tryCaptureView(view, i)) {
            return false;
        }
        this.f49741 = i;
        m36558(i, view);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00de  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m36569(MotionEvent motionEvent) {
        View viewM36554;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m36565();
        }
        if (this.f49756 == null) {
            this.f49756 = VelocityTracker.obtain();
        }
        this.f49756.addMovement(motionEvent);
        AbstractC23026 abstractC23026 = this.f49750;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m36549(x, y, pointerId);
            View viewM36555 = m36554((int) x, (int) y);
            if (viewM36555 == this.f49748 && this.f49742 == 2) {
                m36568(pointerId, viewM36555);
            }
            int i = this.f49740[pointerId] & this.f49752;
            if (i != 0) {
                abstractC23026.onEdgeTouched(i, pointerId);
            }
        } else if (actionMasked == 1) {
            m36565();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                m36565();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m36549(x2, y2, pointerId2);
                int i2 = this.f49742;
                if (i2 == 0) {
                    int i3 = this.f49740[pointerId2] & this.f49752;
                    if (i3 != 0) {
                        abstractC23026.onEdgeTouched(i3, pointerId2);
                    }
                } else if (i2 == 2 && (viewM36554 = m36554((int) x2, (int) y2)) == this.f49748) {
                    m36568(pointerId2, viewM36554);
                }
            } else if (actionMasked == 6) {
                m36539(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f49743 != null && this.f49760 != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i4 = 0; i4 < pointerCount; i4++) {
                int pointerId3 = motionEvent.getPointerId(i4);
                if ((this.f49755 & (1 << pointerId3)) != 0) {
                    float x3 = motionEvent.getX(i4);
                    float y3 = motionEvent.getY(i4);
                    float f = x3 - this.f49743[pointerId3];
                    float f2 = y3 - this.f49760[pointerId3];
                    View viewM36556 = m36554((int) x3, (int) y3);
                    boolean z = viewM36556 != null && m36545(f, f2, viewM36556);
                    if (z) {
                        int left = viewM36556.getLeft();
                        int i5 = (int) f;
                        int iClampViewPositionHorizontal = abstractC23026.clampViewPositionHorizontal(viewM36556, left + i5, i5);
                        int top = viewM36556.getTop();
                        int i6 = (int) f2;
                        int iClampViewPositionVertical = abstractC23026.clampViewPositionVertical(viewM36556, top + i6, i6);
                        int viewHorizontalDragRange = abstractC23026.getViewHorizontalDragRange(viewM36556);
                        int viewVerticalDragRange = abstractC23026.getViewVerticalDragRange(viewM36556);
                        if ((viewHorizontalDragRange == 0 || (viewHorizontalDragRange > 0 && iClampViewPositionHorizontal == left)) && (viewVerticalDragRange == 0 || (viewVerticalDragRange > 0 && iClampViewPositionVertical == top))) {
                            break;
                        }
                        m36543(f, f2, pointerId3);
                        if (this.f49742 != 1 || (z && m36568(pointerId3, viewM36556))) {
                            break;
                        }
                    } else {
                        m36543(f, f2, pointerId3);
                        if (this.f49742 != 1) {
                            break;
                        }
                    }
                }
            }
            m36548(motionEvent);
        }
        return this.f49742 == 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36559(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m36565();
        }
        if (this.f49756 == null) {
            this.f49756 = VelocityTracker.obtain();
        }
        this.f49756.addMovement(motionEvent);
        AbstractC23026 abstractC23026 = this.f49750;
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM36554 = m36554((int) x, (int) y);
            m36549(x, y, pointerId);
            m36568(pointerId, viewM36554);
            int i3 = this.f49740[pointerId] & this.f49752;
            if (i3 != 0) {
                abstractC23026.onEdgeTouched(i3, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f49742 == 1) {
                m36547();
            }
            m36565();
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f49742 == 1) {
                    this.f49746 = true;
                    abstractC23026.onViewReleased(this.f49748, 0.0f, 0.0f);
                    this.f49746 = false;
                    if (this.f49742 == 1) {
                        m36557(0);
                    }
                }
                m36565();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m36549(x2, y2, pointerId2);
                if (this.f49742 != 0) {
                    if (m36550(this.f49748, (int) x2, (int) y2)) {
                        m36568(pointerId2, this.f49748);
                        return;
                    }
                    return;
                } else {
                    m36568(pointerId2, m36554((int) x2, (int) y2));
                    int i4 = this.f49740[pointerId2] & this.f49752;
                    if (i4 != 0) {
                        abstractC23026.onEdgeTouched(i4, pointerId2);
                        return;
                    }
                    return;
                }
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f49742 == 1 && pointerId3 == this.f49741) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.f49741) {
                        View viewM36555 = m36554((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view = this.f49748;
                        if (viewM36555 == view && m36568(pointerId4, view)) {
                            i = this.f49741;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    m36547();
                }
            }
            m36539(pointerId3);
            return;
        }
        if (this.f49742 == 1) {
            int i5 = this.f49741;
            if (((this.f49755 & (1 << i5)) != 0 ? 1 : 0) == 0) {
                return;
            }
            int iFindPointerIndex = motionEvent.findPointerIndex(i5);
            float x3 = motionEvent.getX(iFindPointerIndex);
            float y3 = motionEvent.getY(iFindPointerIndex);
            float[] fArr = this.f49751;
            int i6 = this.f49741;
            int i7 = (int) (x3 - fArr[i6]);
            int i8 = (int) (y3 - this.f49758[i6]);
            int left = this.f49748.getLeft() + i7;
            int top = this.f49748.getTop() + i8;
            int left2 = this.f49748.getLeft();
            int top2 = this.f49748.getTop();
            if (i7 != 0) {
                left = abstractC23026.clampViewPositionHorizontal(this.f49748, left, i7);
                C5031.m14009(left - left2, this.f49748);
            }
            int i9 = left;
            if (i8 != 0) {
                top = abstractC23026.clampViewPositionVertical(this.f49748, top, i8);
                C5031.m14004(top - top2, this.f49748);
            }
            int i10 = top;
            if (i7 != 0 || i8 != 0) {
                this.f49750.onViewPositionChanged(this.f49748, i9, i10, i9 - left2, i10 - top2);
            }
            m36548(motionEvent);
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount2; i11++) {
            int pointerId5 = motionEvent.getPointerId(i11);
            if ((this.f49755 & (1 << pointerId5)) != 0) {
                float x4 = motionEvent.getX(i11);
                float y4 = motionEvent.getY(i11);
                float f = x4 - this.f49743[pointerId5];
                float f2 = y4 - this.f49760[pointerId5];
                m36543(f, f2, pointerId5);
                if (this.f49742 == 1) {
                    break;
                }
                View viewM36556 = m36554((int) x4, (int) y4);
                if (m36545(f, f2, viewM36556) && m36568(pointerId5, viewM36556)) {
                    break;
                }
            }
        }
        m36548(motionEvent);
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
    /* JADX WARN: Type inference failed for: r3v3, types: [l.᩺ܰۙ] */
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
    private void m36543(float f, float f2, int i) {
        int i2;
        boolean zM36544 = m36544(f, f2, i, 1);
        ?? r0 = zM36544;
        if (m36544(f2, f, i, 4)) {
            r0 = (zM36544 ? 1 : 0) | 4;
        }
        ?? r1 = r0;
        if (m36544(f, f2, i, 2)) {
            r1 = (r0 == true ? 1 : 0) | 2;
        }
        ?? r2 = r1;
        if (m36544(f2, f, i, 8)) {
            i2 = (r1 == true ? 1 : 0) | 8;
        }
        if (r2 == 0) {
            r2 = i2;
            return;
        }
        r2 = i2;
        int[] iArr = this.f49759;
        iArr[i] = (iArr[i] | r2) == true ? 1 : 0;
        this.f49750.onEdgeDragStarted(r2, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m36544(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.f49740[i] & i2) == i2 && (this.f49752 & i2) != 0 && (this.f49738[i] & i2) != i2 && (this.f49759[i] & i2) != i2) {
            float f3 = this.f49757;
            if (fAbs > f3 || fAbs2 > f3) {
                if (fAbs < fAbs2 * 0.5f && this.f49750.onEdgeLock(i2)) {
                    int[] iArr = this.f49738;
                    iArr[i] = iArr[i] | i2;
                    return false;
                }
                if ((this.f49759[i] & i2) == 0 && fAbs > this.f49757) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m36545(float f, float f2, View view) {
        if (view == null) {
            return false;
        }
        AbstractC23026 abstractC23026 = this.f49750;
        boolean z = abstractC23026.getViewHorizontalDragRange(view) > 0;
        boolean z2 = abstractC23026.getViewVerticalDragRange(view) > 0;
        if (z && z2) {
            float f3 = (f2 * f2) + (f * f);
            int i = this.f49757;
            return f3 > ((float) (i * i));
        }
        if (z) {
            return Math.abs(f) > ((float) this.f49757);
        }
        return z2 && Math.abs(f2) > ((float) this.f49757);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m36563() {
        int length = this.f49743.length;
        for (int i = 0; i < length; i++) {
            if ((this.f49755 & (1 << i)) != 0) {
                float f = this.f49751[i] - this.f49743[i];
                float f2 = this.f49758[i] - this.f49760[i];
                float f3 = (f2 * f2) + (f * f);
                int i2 = this.f49757;
                if (f3 > i2 * i2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m36547() {
        VelocityTracker velocityTracker = this.f49756;
        float f = this.f49753;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f49756.getXVelocity(this.f49741);
        float f2 = this.f49754;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f49756.getYVelocity(this.f49741);
        float f3 = this.f49754;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f3) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.f49746 = true;
        this.f49750.onViewReleased(this.f49748, xVelocity, f);
        this.f49746 = false;
        if (this.f49742 == 1) {
            m36557(0);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m36550(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View m36554(int i, int i2) {
        ViewGroup viewGroup = this.f49745;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = viewGroup.getChildAt(this.f49750.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
    }
}
