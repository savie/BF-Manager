package l;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: l.ۗۡܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18GG */
/* JADX INFO: loaded from: classes2.dex */
public class C3134 extends View implements InterfaceC7326 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Paint f11793;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f11794;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public boolean[] f11795;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f11796;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f11797;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f11798;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final Paint f11799;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final Formatter f11800;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public Rect f11801;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Rect f11802;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final Paint f11803;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public long f11804;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final Paint f11805;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f11806;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final int f11807;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f11808;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f11809;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Paint f11810;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public long f11811;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f11812;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final Point f11813;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final Paint f11814;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f11815;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float f11816;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public long f11817;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f11818;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public ValueAnimator f11819;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f11820;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final RunnableC16260 f11821;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f11822;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final int f11823;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final int f11824;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final int f11825;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final int f11826;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long[] f11827;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public boolean f11828;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public float f11829;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f11830;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArraySet f11831;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f11832;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f11833;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m9491(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    @Override // l.InterfaceC7326
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9502(InterfaceC10149 interfaceC10149) {
        interfaceC10149.getClass();
        this.f11831.add(interfaceC10149);
    }

    public C3134(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3134(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet, 0);
    }

    public C3134(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.f11794 = new Rect();
        this.f11832 = new Rect();
        this.f11802 = new Rect();
        this.f11830 = new Rect();
        Paint paint = new Paint();
        this.f11799 = paint;
        Paint paint2 = new Paint();
        this.f11810 = paint2;
        Paint paint3 = new Paint();
        this.f11803 = paint3;
        Paint paint4 = new Paint();
        this.f11793 = paint4;
        Paint paint5 = new Paint();
        this.f11814 = paint5;
        Paint paint6 = new Paint();
        this.f11805 = paint6;
        paint6.setAntiAlias(true);
        this.f11831 = new CopyOnWriteArraySet();
        this.f11813 = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f11816 = f;
        this.f11808 = m9491(f, -50);
        int iM9491 = m9491(f, 4);
        int iM9492 = m9491(f, 26);
        int iM9493 = m9491(f, 4);
        int iM9494 = m9491(f, 12);
        int iM9495 = m9491(f, 0);
        int iM9496 = m9491(f, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C1981.f7431, i, i2);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.f11806 = drawable;
                if (drawable != null) {
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i3 >= 23) {
                            drawable.setLayoutDirection(layoutDirection);
                        }
                    }
                    iM9492 = Math.max(drawable.getMinimumHeight(), iM9492);
                }
                this.f11822 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iM9491);
                this.f11823 = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iM9492);
                this.f11812 = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.f11820 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iM9493);
                this.f11826 = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iM9494);
                this.f11824 = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iM9495);
                this.f11825 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iM9496);
                int i4 = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i5 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i6 = typedArrayObtainStyledAttributes.getInt(4, -855638017);
                int i7 = typedArrayObtainStyledAttributes.getInt(13, 872415231);
                int i8 = typedArrayObtainStyledAttributes.getInt(0, -1291845888);
                int i9 = typedArrayObtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i4);
                paint6.setColor(i5);
                paint2.setColor(i6);
                paint3.setColor(i7);
                paint4.setColor(i8);
                paint5.setColor(i9);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.f11822 = iM9491;
            this.f11823 = iM9492;
            this.f11812 = 0;
            this.f11820 = iM9493;
            this.f11826 = iM9494;
            this.f11824 = iM9495;
            this.f11825 = iM9496;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f11806 = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f11798 = sb;
        this.f11800 = new Formatter(sb, Locale.getDefault());
        this.f11821 = new RunnableC16260(1, this);
        Drawable drawable2 = this.f11806;
        if (drawable2 != null) {
            this.f11807 = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f11807 = (Math.max(this.f11824, Math.max(this.f11826, this.f11825)) + 1) / 2;
        }
        this.f11829 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f11819 = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۢۡܰ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C3134.m9493(this.f32085, valueAnimator2);
            }
        });
        this.f11796 = -9223372036854775807L;
        this.f11811 = -9223372036854775807L;
        this.f11815 = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9493(C3134 c3134, ValueAnimator valueAnimator) {
        c3134.f11829 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c3134.invalidate(c3134.f11794);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m9505() {
        ValueAnimator valueAnimator = this.f11819;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        this.f11809 = false;
        this.f11829 = 1.0f;
        invalidate(this.f11794);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m9499() {
        ValueAnimator valueAnimator = this.f11819;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        this.f11809 = false;
        valueAnimator.setFloatValues(this.f11829, 1.0f);
        valueAnimator.setDuration(250L);
        valueAnimator.start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9503(boolean z) {
        ValueAnimator valueAnimator = this.f11819;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        this.f11809 = z;
        this.f11829 = 0.0f;
        invalidate(this.f11794);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m9507() {
        ValueAnimator valueAnimator = this.f11819;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        valueAnimator.setFloatValues(this.f11829, 0.0f);
        valueAnimator.setDuration(250L);
        valueAnimator.start();
    }

    @Override // l.InterfaceC7326
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9501(long j) {
        if (this.f11804 == j) {
            return;
        }
        this.f11804 = j;
        setContentDescription(C17983.m41833(this.f11798, this.f11800, j));
        m9489();
    }

    @Override // l.InterfaceC7326
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo9506(long j) {
        if (this.f11833 == j) {
            return;
        }
        this.f11833 = j;
        m9489();
    }

    @Override // l.InterfaceC7326
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo9508(long j) {
        if (this.f11796 == j) {
            return;
        }
        this.f11796 = j;
        if (this.f11828 && j == -9223372036854775807L) {
            m9496(true);
        }
        m9489();
    }

    @Override // l.InterfaceC7326
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo9500() {
        int iWidth = (int) (this.f11832.width() / this.f11816);
        if (iWidth == 0) {
            return C17492.FOREVER_NS;
        }
        long j = this.f11796;
        return (j == 0 || j == -9223372036854775807L) ? C17492.FOREVER_NS : j / ((long) iWidth);
    }

    @Override // l.InterfaceC7326
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9504(long[] jArr, boolean[] zArr, int i) {
        C2023.m6507(i == 0 || !(jArr == null || zArr == null));
        this.f11818 = i;
        this.f11827 = jArr;
        this.f11795 = zArr;
        m9489();
    }

    @Override // android.view.View, l.InterfaceC7326
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.f11828 || z) {
            return;
        }
        m9496(true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        canvas.save();
        Rect rect = this.f11832;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i2 = iCenterY + iHeight;
        long j = this.f11796;
        Paint paint = this.f11803;
        Rect rect2 = this.f11830;
        if (j <= 0) {
            canvas.drawRect(rect.left, iCenterY, rect.right, i2, paint);
        } else {
            Rect rect3 = this.f11802;
            int i3 = rect3.left;
            int i4 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i4), rect2.right);
            int i5 = rect.right;
            if (iMax < i5) {
                canvas.drawRect(iMax, iCenterY, i5, i2, paint);
            }
            int iMax2 = Math.max(i3, rect2.right);
            if (i4 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i4, i2, this.f11810);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i2, this.f11799);
            }
            if (this.f11818 != 0) {
                long[] jArr = this.f11827;
                jArr.getClass();
                boolean[] zArr = this.f11795;
                zArr.getClass();
                int i6 = this.f11820;
                int i7 = i6 / 2;
                int i8 = 0;
                int i9 = 0;
                while (i9 < this.f11818) {
                    int iMin = Math.min(rect.width() - i6, Math.max(i8, ((int) ((((long) rect.width()) * C17983.m41829(jArr[i9], 0L, this.f11796)) / this.f11796)) - i7)) + rect.left;
                    canvas.drawRect(iMin, iCenterY, iMin + i6, i2, zArr[i9] ? this.f11814 : this.f11793);
                    i9++;
                    i8 = 0;
                    i6 = i6;
                }
            }
        }
        if (this.f11796 > 0) {
            int iM41813 = C17983.m41813(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.f11806;
            if (drawable == null) {
                if (this.f11828 || isFocused()) {
                    i = this.f11825;
                } else {
                    i = isEnabled() ? this.f11826 : this.f11824;
                }
                canvas.drawCircle(iM41813, iCenterY2, (int) ((i * this.f11829) / 2.0f), this.f11805);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f11829)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f11829)) / 2;
                drawable.setBounds(iM41813 - intrinsicWidth, iCenterY2 - intrinsicHeight, iM41813 + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float fM9602;
        if (isEnabled() && this.f11796 > 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            Point point = this.f11813;
            point.set(x, y);
            int i = point.x;
            int i2 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.f11832;
            Rect rect2 = this.f11830;
            if (action == 0) {
                int i3 = i;
                if (this.f11794.contains(i3, i2)) {
                    rect2.right = C17983.m41813(i3, rect.left, rect.right);
                    m9495(m9497());
                    m9489();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.f11828) {
                    m9496(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.f11828) {
                        m9496(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.f11828) {
                if (i2 < this.f11808) {
                    int i4 = this.f11797;
                    fM9602 = C3184.m9602(i, i4, 3, i4);
                } else {
                    this.f11797 = i;
                    fM9602 = i;
                }
                rect2.right = C17983.m41813((int) fM9602, rect.left, rect.right);
                m9498(m9497());
                m9489();
                invalidate();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            long jM9494 = m9494();
            if (i != 66) {
                switch (i) {
                    case 21:
                        jM9494 = -jM9494;
                        if (m9490(jM9494)) {
                            RunnableC16260 runnableC16260 = this.f11821;
                            removeCallbacks(runnableC16260);
                            postDelayed(runnableC16260, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (m9490(jM9494)) {
                            RunnableC16260 runnableC16261 = this.f11821;
                            removeCallbacks(runnableC16261);
                            postDelayed(runnableC16261, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.f11828) {
                            m9496(false);
                            return true;
                        }
                        break;
                }
            } else if (this.f11828) {
                m9496(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.f11828 || z) {
            return;
        }
        m9496(false);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f11806;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f11806;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.f11823;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.f11806;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.f11809 ? 0 : this.f11807;
        int i8 = this.f11812;
        int i9 = this.f11822;
        int i10 = this.f11823;
        if (i8 == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - i10;
            paddingBottom2 = ((i6 - getPaddingBottom()) - i9) - Math.max(i7 - (i9 / 2), 0);
        } else {
            paddingBottom = (i6 - i10) / 2;
            paddingBottom2 = (i6 - i9) / 2;
        }
        Rect rect2 = this.f11794;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i10 + paddingBottom);
        this.f11832.set(rect2.left + i7, paddingBottom2, rect2.right - i7, i9 + paddingBottom2);
        if (Build.VERSION.SDK_INT >= 29 && ((rect = this.f11801) == null || rect.width() != i5 || this.f11801.height() != i6)) {
            Rect rect3 = new Rect(0, 0, i5, i6);
            this.f11801 = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        m9489();
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f11806;
        if (drawable == null || Build.VERSION.SDK_INT < 23 || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(C17983.m41833(this.f11798, this.f11800, this.f11804));
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(C17983.m41833(this.f11798, this.f11800, this.f11804));
        if (this.f11796 <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.f11796 <= 0) {
            return false;
        }
        if (i == 8192) {
            if (m9490(-m9494())) {
                m9496(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (m9490(m9494())) {
                m9496(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m9495(long j) {
        this.f11817 = j;
        this.f11828 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f11831.iterator();
        while (it.hasNext()) {
            ((InterfaceC10149) it.next()).mo4003(j);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m9498(long j) {
        if (this.f11817 == j) {
            return;
        }
        this.f11817 = j;
        Iterator it = this.f11831.iterator();
        while (it.hasNext()) {
            ((InterfaceC10149) it.next()).mo4002(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m9496(boolean z) {
        removeCallbacks(this.f11821);
        this.f11828 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f11831.iterator();
        while (it.hasNext()) {
            ((InterfaceC10149) it.next()).mo4001(this.f11817, z);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m9490(long j) {
        long j2 = this.f11796;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.f11828 ? this.f11817 : this.f11804;
        long jM41829 = C17983.m41829(j3 + j, 0L, j2);
        if (jM41829 == j3) {
            return false;
        }
        if (!this.f11828) {
            m9495(jM41829);
        } else {
            m9498(jM41829);
        }
        m9489();
        return true;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m9489() {
        Rect rect = this.f11802;
        Rect rect2 = this.f11832;
        rect.set(rect2);
        Rect rect3 = this.f11830;
        rect3.set(rect2);
        long j = this.f11828 ? this.f11817 : this.f11804;
        if (this.f11796 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.f11833) / this.f11796)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j) / this.f11796)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.f11794);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private long m9497() {
        Rect rect = this.f11832;
        if (rect.width() <= 0 || this.f11796 == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f11830.width()) * this.f11796) / ((long) rect.width());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private long m9494() {
        long j = this.f11811;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f11796;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / ((long) this.f11815);
    }
}
