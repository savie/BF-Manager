package l;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: l.ᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: N518 */
/* JADX INFO: loaded from: classes4.dex */
public class C18829 extends FrameLayout {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TypedValue f61010;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public TypedValue f61011;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public TypedValue f61012;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public TypedValue f61013;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC18123 f61014;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public TypedValue f61015;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TypedValue f61016;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Rect f61017;

    public C18829(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C18829(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f61017 = new Rect();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43462(InterfaceC18123 interfaceC18123) {
        this.f61014 = interfaceC18123;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43461(int i, int i2, int i3, int i4) {
        this.f61017.set(i, i2, i3, i4);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d6  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        float fraction;
        int i5;
        int i6;
        float fraction2;
        int i7;
        int i8;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z2 = true;
        boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Rect rect = this.f61017;
        if (mode != Integer.MIN_VALUE) {
            z = false;
        } else {
            TypedValue typedValue = z3 ? this.f61016 : this.f61013;
            if (typedValue == null || (i7 = typedValue.type) == 0) {
                z = false;
            } else {
                if (i7 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i7 == 6) {
                        int i9 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i9, i9);
                    } else {
                        i8 = 0;
                    }
                    if (i8 > 0) {
                        i = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z = true;
                    } else {
                        z = false;
                    }
                }
                i8 = (int) fraction3;
                if (i8 > 0) {
                    i = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z3 ? this.f61010 : this.f61015;
            if (typedValue2 != null && (i5 = typedValue2.type) != 0) {
                if (i5 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i5 == 6) {
                        int i10 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i10, i10);
                    } else {
                        i6 = 0;
                    }
                    if (i6 > 0) {
                        i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                    }
                }
                i6 = (int) fraction2;
                if (i6 > 0) {
                    i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                }
            }
        }
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z || mode != Integer.MIN_VALUE) {
            z2 = false;
        } else {
            TypedValue typedValue3 = z3 ? this.f61012 : this.f61011;
            if (typedValue3 == null || (i3 = typedValue3.type) == 0) {
                z2 = false;
            } else {
                if (i3 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i3 == 6) {
                        int i11 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i11, i11);
                    } else {
                        i4 = 0;
                    }
                    if (i4 > 0) {
                        i4 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i4) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    } else {
                        z2 = false;
                    }
                }
                i4 = (int) fraction;
                if (i4 > 0) {
                    i4 -= rect.left + rect.right;
                }
                if (measuredWidth < i4) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                } else {
                    z2 = false;
                }
            }
        }
        if (z2) {
            super.onMeasure(iMakeMeasureSpec, i2);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final TypedValue m43463() {
        if (this.f61011 == null) {
            this.f61011 = new TypedValue();
        }
        return this.f61011;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TypedValue m43466() {
        if (this.f61012 == null) {
            this.f61012 = new TypedValue();
        }
        return this.f61012;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final TypedValue m43464() {
        if (this.f61013 == null) {
            this.f61013 = new TypedValue();
        }
        return this.f61013;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final TypedValue m43459() {
        if (this.f61016 == null) {
            this.f61016 = new TypedValue();
        }
        return this.f61016;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TypedValue m43460() {
        if (this.f61010 == null) {
            this.f61010 = new TypedValue();
        }
        return this.f61010;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TypedValue m43465() {
        if (this.f61015 == null) {
            this.f61015 = new TypedValue();
        }
        return this.f61015;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC18123 interfaceC18123 = this.f61014;
        if (interfaceC18123 != null) {
            interfaceC18123.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC18123 interfaceC18123 = this.f61014;
        if (interfaceC18123 != null) {
            interfaceC18123.onDetachedFromWindow();
        }
    }
}
