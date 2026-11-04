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

/* JADX INFO: renamed from: l.ۘۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 18GG */
/* JADX INFO: loaded from: classes3.dex */
public class C4146 extends View implements InterfaceC15683 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f14050;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final RunnableC7909 f14051;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Paint f14052;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final Paint f14053;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float f14054;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f14055;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public float f14056;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final Formatter f14057;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final Paint f14058;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public boolean f14059;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f14060;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f14061;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final Point f14062;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f14063;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f14064;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Rect f14065;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final Paint f14066;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public long f14067;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public long f14068;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final int f14069;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean[] f14070;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final StringBuilder f14071;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f14072;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public ValueAnimator f14073;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArraySet f14074;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final int f14075;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public long f14076;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final Rect f14077;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Paint f14078;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final Rect f14079;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f14080;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final int f14081;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public Rect f14082;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final int f14083;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long[] f14084;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public boolean f14085;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f14086;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f14087;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final int f14088;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final Paint f14089;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f14090;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m13273(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    @Override // l.InterfaceC15683
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13285(InterfaceC20159 interfaceC20159) {
        interfaceC20159.getClass();
        this.f14074.add(interfaceC20159);
    }

    public C4146(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C4146(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet, 0);
    }

    public C4146(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.f14079 = new Rect();
        this.f14090 = new Rect();
        this.f14065 = new Rect();
        this.f14077 = new Rect();
        Paint paint = new Paint();
        this.f14053 = paint;
        Paint paint2 = new Paint();
        this.f14052 = paint2;
        Paint paint3 = new Paint();
        this.f14066 = paint3;
        Paint paint4 = new Paint();
        this.f14078 = paint4;
        Paint paint5 = new Paint();
        this.f14058 = paint5;
        Paint paint6 = new Paint();
        this.f14089 = paint6;
        paint6.setAntiAlias(true);
        this.f14074 = new CopyOnWriteArraySet();
        this.f14062 = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f14054 = f;
        this.f14060 = m13273(f, -50);
        int iM13273 = m13273(f, 4);
        int iM13274 = m13273(f, 26);
        int iM13275 = m13273(f, 4);
        int iM13276 = m13273(f, 12);
        int iM13277 = m13273(f, 0);
        int iM13278 = m13273(f, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C12445.f40000, i, i2);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.f14055 = drawable;
                if (drawable != null) {
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i3 >= 23) {
                            drawable.setLayoutDirection(layoutDirection);
                        }
                    }
                    iM13274 = Math.max(drawable.getMinimumHeight(), iM13274);
                }
                this.f14080 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iM13273);
                this.f14081 = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iM13274);
                this.f14061 = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.f14050 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iM13275);
                this.f14083 = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iM13276);
                this.f14075 = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iM13277);
                this.f14088 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iM13278);
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
            this.f14080 = iM13273;
            this.f14081 = iM13274;
            this.f14061 = 0;
            this.f14050 = iM13275;
            this.f14083 = iM13276;
            this.f14075 = iM13277;
            this.f14088 = iM13278;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f14055 = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f14071 = sb;
        this.f14057 = new Formatter(sb, Locale.getDefault());
        this.f14051 = new RunnableC7909(2, this);
        Drawable drawable2 = this.f14055;
        if (drawable2 != null) {
            this.f14069 = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f14069 = (Math.max(this.f14075, Math.max(this.f14083, this.f14088)) + 1) / 2;
        }
        this.f14056 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f14073 = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.᩺ۨ᩷
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C4146.m13275(this.f78602, valueAnimator2);
            }
        });
        this.f14063 = -9223372036854775807L;
        this.f14067 = -9223372036854775807L;
        this.f14086 = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13275(C4146 c4146, ValueAnimator valueAnimator) {
        c4146.f14056 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c4146.invalidate(c4146.f14079);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m13288() {
        ValueAnimator valueAnimator = this.f14073;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        this.f14059 = false;
        this.f14056 = 1.0f;
        invalidate(this.f14079);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m13292() {
        ValueAnimator valueAnimator = this.f14073;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        this.f14059 = false;
        valueAnimator.setFloatValues(this.f14056, 1.0f);
        valueAnimator.setDuration(250L);
        valueAnimator.start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13286(boolean z) {
        ValueAnimator valueAnimator = this.f14073;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        this.f14059 = z;
        this.f14056 = 0.0f;
        invalidate(this.f14079);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m13290() {
        ValueAnimator valueAnimator = this.f14073;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        valueAnimator.setFloatValues(this.f14056, 0.0f);
        valueAnimator.setDuration(250L);
        valueAnimator.start();
    }

    @Override // l.InterfaceC15683
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13284(long j) {
        if (this.f14068 == j) {
            return;
        }
        this.f14068 = j;
        setContentDescription(C7116.m19480(this.f14071, this.f14057, j));
        m13276();
    }

    @Override // l.InterfaceC15683
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo13289(long j) {
        if (this.f14064 == j) {
            return;
        }
        this.f14064 = j;
        m13276();
    }

    @Override // l.InterfaceC15683
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo13291(long j) {
        if (this.f14063 == j) {
            return;
        }
        this.f14063 = j;
        if (this.f14085 && j == -9223372036854775807L) {
            m13281(true);
        }
        m13276();
    }

    @Override // l.InterfaceC15683
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo13283() {
        int iWidth = (int) (this.f14090.width() / this.f14054);
        if (iWidth == 0) {
            return C25227.FOREVER_NS;
        }
        long j = this.f14063;
        return (j == 0 || j == -9223372036854775807L) ? C25227.FOREVER_NS : j / ((long) iWidth);
    }

    @Override // l.InterfaceC15683
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13287(long[] jArr, boolean[] zArr, int i) {
        C20782.m47565(i == 0 || !(jArr == null || zArr == null));
        this.f14072 = i;
        this.f14084 = jArr;
        this.f14070 = zArr;
        m13276();
    }

    @Override // android.view.View, l.InterfaceC15683
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.f14085 || z) {
            return;
        }
        m13281(true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        canvas.save();
        Rect rect = this.f14090;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i2 = iCenterY + iHeight;
        long j = this.f14063;
        Paint paint = this.f14066;
        Rect rect2 = this.f14077;
        if (j <= 0) {
            canvas.drawRect(rect.left, iCenterY, rect.right, i2, paint);
        } else {
            Rect rect3 = this.f14065;
            int i3 = rect3.left;
            int i4 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i4), rect2.right);
            int i5 = rect.right;
            if (iMax < i5) {
                canvas.drawRect(iMax, iCenterY, i5, i2, paint);
            }
            int iMax2 = Math.max(i3, rect2.right);
            if (i4 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i4, i2, this.f14052);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i2, this.f14053);
            }
            if (this.f14072 != 0) {
                long[] jArr = this.f14084;
                jArr.getClass();
                boolean[] zArr = this.f14070;
                zArr.getClass();
                int i6 = this.f14050;
                int i7 = i6 / 2;
                int i8 = 0;
                int i9 = 0;
                while (i9 < this.f14072) {
                    int iMin = Math.min(rect.width() - i6, Math.max(i8, ((int) ((((long) rect.width()) * C7116.m19476(jArr[i9], 0L, this.f14063)) / this.f14063)) - i7)) + rect.left;
                    canvas.drawRect(iMin, iCenterY, iMin + i6, i2, zArr[i9] ? this.f14058 : this.f14078);
                    i9++;
                    i8 = 0;
                    i6 = i6;
                }
            }
        }
        if (this.f14063 > 0) {
            int iM19460 = C7116.m19460(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.f14055;
            if (drawable == null) {
                if (this.f14085 || isFocused()) {
                    i = this.f14088;
                } else {
                    i = isEnabled() ? this.f14083 : this.f14075;
                }
                canvas.drawCircle(iM19460, iCenterY2, (int) ((i * this.f14056) / 2.0f), this.f14089);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f14056)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f14056)) / 2;
                drawable.setBounds(iM19460 - intrinsicWidth, iCenterY2 - intrinsicHeight, iM19460 + intrinsicWidth, iCenterY2 + intrinsicHeight);
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
        float fM18182;
        if (isEnabled() && this.f14063 > 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            Point point = this.f14062;
            point.set(x, y);
            int i = point.x;
            int i2 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.f14090;
            Rect rect2 = this.f14077;
            if (action == 0) {
                int i3 = i;
                if (this.f14079.contains(i3, i2)) {
                    rect2.right = C7116.m19460(i3, rect.left, rect.right);
                    m13280(m13277());
                    m13276();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.f14085) {
                    m13281(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.f14085) {
                        m13281(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.f14085) {
                if (i2 < this.f14060) {
                    int i4 = this.f14087;
                    fM18182 = C6421.m18182(i, i4, 3, i4);
                } else {
                    this.f14087 = i;
                    fM18182 = i;
                }
                rect2.right = C7116.m19460((int) fM18182, rect.left, rect.right);
                m13278(m13277());
                m13276();
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
            long jM13279 = m13279();
            if (i != 66) {
                switch (i) {
                    case 21:
                        jM13279 = -jM13279;
                        if (m13282(jM13279)) {
                            RunnableC7909 runnableC7909 = this.f14051;
                            removeCallbacks(runnableC7909);
                            postDelayed(runnableC7909, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (m13282(jM13279)) {
                            RunnableC7909 runnableC79010 = this.f14051;
                            removeCallbacks(runnableC79010);
                            postDelayed(runnableC79010, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.f14085) {
                            m13281(false);
                            return true;
                        }
                        break;
                }
            } else if (this.f14085) {
                m13281(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.f14085 || z) {
            return;
        }
        m13281(false);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f14055;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f14055;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.f14081;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.f14055;
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
        int i7 = this.f14059 ? 0 : this.f14069;
        int i8 = this.f14061;
        int i9 = this.f14080;
        int i10 = this.f14081;
        if (i8 == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - i10;
            paddingBottom2 = ((i6 - getPaddingBottom()) - i9) - Math.max(i7 - (i9 / 2), 0);
        } else {
            paddingBottom = (i6 - i10) / 2;
            paddingBottom2 = (i6 - i9) / 2;
        }
        Rect rect2 = this.f14079;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i10 + paddingBottom);
        this.f14090.set(rect2.left + i7, paddingBottom2, rect2.right - i7, i9 + paddingBottom2);
        if (Build.VERSION.SDK_INT >= 29 && ((rect = this.f14082) == null || rect.width() != i5 || this.f14082.height() != i6)) {
            Rect rect3 = new Rect(0, 0, i5, i6);
            this.f14082 = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        m13276();
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f14055;
        if (drawable == null || Build.VERSION.SDK_INT < 23 || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(C7116.m19480(this.f14071, this.f14057, this.f14068));
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(C7116.m19480(this.f14071, this.f14057, this.f14068));
        if (this.f14063 <= 0) {
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
        if (this.f14063 <= 0) {
            return false;
        }
        if (i == 8192) {
            if (m13282(-m13279())) {
                m13281(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (m13282(m13279())) {
                m13281(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m13280(long j) {
        this.f14076 = j;
        this.f14085 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f14074.iterator();
        while (it.hasNext()) {
            ((InterfaceC20159) it.next()).mo26069(j);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m13278(long j) {
        if (this.f14076 == j) {
            return;
        }
        this.f14076 = j;
        Iterator it = this.f14074.iterator();
        while (it.hasNext()) {
            ((InterfaceC20159) it.next()).mo26068(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m13281(boolean z) {
        removeCallbacks(this.f14051);
        this.f14085 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f14074.iterator();
        while (it.hasNext()) {
            ((InterfaceC20159) it.next()).mo26067(this.f14076, z);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m13282(long j) {
        long j2 = this.f14063;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.f14085 ? this.f14076 : this.f14068;
        long jM19476 = C7116.m19476(j3 + j, 0L, j2);
        if (jM19476 == j3) {
            return false;
        }
        if (!this.f14085) {
            m13280(jM19476);
        } else {
            m13278(jM19476);
        }
        m13276();
        return true;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m13276() {
        Rect rect = this.f14065;
        Rect rect2 = this.f14090;
        rect.set(rect2);
        Rect rect3 = this.f14077;
        rect3.set(rect2);
        long j = this.f14085 ? this.f14076 : this.f14068;
        if (this.f14063 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.f14064) / this.f14063)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j) / this.f14063)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.f14079);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private long m13277() {
        Rect rect = this.f14090;
        if (rect.width() <= 0 || this.f14063 == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f14077.width()) * this.f14063) / ((long) rect.width());
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private long m13279() {
        long j = this.f14067;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f14063;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / ((long) this.f14086);
    }
}
